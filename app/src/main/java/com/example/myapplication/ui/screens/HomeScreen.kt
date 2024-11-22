package com.example.myapplication.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.myapplication.R
import com.example.myapplication.data.model.ServiceModel
import com.example.myapplication.ui.components.ServiceCard
import com.example.myapplication.ui.components.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, ServiceViewModel = viewModel()) {
    var serviceDetail by remember { mutableStateOf<ServiceModel?>(null) }
    var sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false,
    )
    var showBottomSheet by remember { mutableStateOf(false) }
    Scaffold(
        topBar = { TopBar("Password Manager, navController, false") },
        bottomBar = {
            BottomBar(
                containerColor = Color.Black,
                contentColor = Color.White,
            ) {
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                containerColor = colorResource(R.color.primary_button),
                contentColor = Color.Black,
                onClick = {
                    navController.navigate("manage-service/0")
                }) {
                Icon(Icons.Filled.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        // BottomSheet Content
        var services by remember { mutableStateOf<List<ServiceModel>>(emptyList()) }
        if (services.isEmpty()) {
            CircularProgressIndicator()
        }
        LaunchedEffect(Unit) {
            viewModel.getServices { response ->
                if (response.isSuccessful) {
                    services = response.body() ?: emptyList()
                } else {
                    println("failed to load posts")
                }
            }
        }

        val listState = rememberLazyListState()
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .background(colorResource(R.color.dark86))
                .fillMaxSize(),
            state = listState
        ) {
            items(services) { service ->
                ServiceCard(
                    service.id, service.name, service.username, service.imageURL,
                    onButtonClick = {
                        viewModel.showServices(service.id) { response ->
                            if (response.isSuccessful) {
                                serviceDetail = response.body()
                            }
                        }
                        showBottomSheet = true
                    }
                )
            }
        }
    }
}