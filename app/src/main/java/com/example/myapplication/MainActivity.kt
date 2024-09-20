package com.example.myapplication

import android.graphics.Picture
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.screens.HomeScreen
import com.example.myapplication.ui.screens.MenuScreen

//import androidx.navigation.compose.NavHostController
//Prueba de rama
/*class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            //ComposeMultiScreenApp()
        }
    }//
}//
            Column(
                //La columna pasa a tener el tamaño maximo de la pantalla
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
            ) {
                CustomText()
                Picture()
                Content1()
                Content2()
                //Text(text = "Simple text")
                //ModifierExample()
                //ModifierExample2()
                //ModifierExample3()
            }
            //Layout
            /*Column {
               Text(text= "First Row")
                Text(text= "Second Row")
                Text(text= "Third Row")
                Row {
                    Text(text= "Among OS")
                    Text(text= " Among OS 2")
                    Text(text= " Among OS 3: The revenge")
                    Text(text= " Among OS 4: The end game")
                }
                Box {
                    Text(text= "Label 1")
                    Text(text= "Label 2")
                }
                Greeting(name = "World")
            }
            Column {
                Row {
                    Text(text= "Among OS")
                }
            }*/
            /*Project1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }*/
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Gerardo")
    }
}

//@Preview(showBackground = true)
@Composable
fun ModifierExample() {
    Column(
        modifier = Modifier
            .padding(24.dp)
    ) {
        Text(text = "Hello world")
    }
}

//@Preview(showBackground = true)
/*@Composable //Comopasble es de diseño solamente
fun ModifierExample2() {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxWidth()
            .clickable(onClick = { clickAction() })
    ) {
        Text(text = "Hello world")
    }
}*/

//@Preview(showBackground = true)
@Composable //Composable es de diseño solamente
fun ModifierExample3() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .padding(16.dp)
            .background(Color.Magenta)
            .border(width = 2.dp, color = Color.Blue)
            .width(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Item 1")
        Text(text = "Item 2")
        Text(text = "Item 3")
        Text(text = "Item 4")
        Text(text = "Item 5")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomText() {
    Column {
        Text(
            stringResource(R.string.hello_world_text),
            color = colorResource(R.color.teal_700),
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Thin
        )
        val gradientColors = listOf(Cyan, Blue)
        Text(
            stringResource(R.string.hello_world_text),
            style = TextStyle(brush = Brush.linearGradient(colors = gradientColors))
        )
    }
}

//@Preview(showBackground = true)
@Composable
fun Picture() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .background(Color.Black)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "Android logo",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Content1(){
    Card(modifier = Modifier
        .background(Color.LightGray)
        .fillMaxWidth()
        .padding(5.dp)
    ){
        Text(text = "This is a title",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(10.dp)
        )
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Android Logo",
            contentScale = ContentScale.Crop
        )
        Text(
            stringResource(R.string.text_card),
            textAlign = TextAlign.Justify,
            lineHeight = 10.sp,
            modifier = Modifier
                .padding(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Content2(){
    Card(modifier = Modifier
        .background(Color.LightGray)
        .fillMaxWidth()
        .padding(5.dp)) {

        Column {

            Row {
                Image(modifier = Modifier
                    //.fillMaxWidth()
                    .height(150.dp),
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = "Android Logo",
                    contentScale = ContentScale.Crop)
                Column {
                    Text(text = "This is a title",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(10.dp)
                    )
                    Text(stringResource(R.string.text_card),
                        textAlign = TextAlign.Justify,
                        lineHeight = 10.sp,
                        modifier = Modifier
                            .padding(10.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BoxExample1() {
    Box(
        modifier = Modifier
            .background(Color.DarkGray)
            .fillMaxWidth()
            .padding(5.dp)
    ){
        Image(painterResource(R.drawable.android_logo),
            contentDescription = "Android Logo",
            contentScale = ContentScale.FillBounds
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 150.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Icon(
                Icons.Filled.AccountCircle,
                contentDescription = "Icon Account"
            )
            Text(text = "Text",

                )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BoxExample2(){
    Box(modifier = Modifier
        .background(Color.Magenta)
        .padding(5.dp)
        .size(250.dp)
    ){
        Text(text = "TopStart", Modifier.align(Alignment.TopStart))
        Text(text = "TopEnd", Modifier.align(Alignment.TopEnd))
        Text(text = "CenterStart", Modifier.align(Alignment.CenterStart))
        Text(text = "Center", Modifier.align(Alignment.Center))
        Text(text = "CenterEnd", Modifier.align(Alignment.CenterEnd))
        Text(text = "BottomStart", Modifier.align(Alignment.BottomStart))
        Text(text = "BottomEnd", Modifier.align(Alignment.BottomEnd))
    }
}

fun clickAction() {
    println("Column clicked")
}

@Composable
fun ComposeMultiScreenApp(){
    val navController = rememberNavController()
    Surface(color = Color.White) {
        SetupNavGraph(navController = navController)
    }
}

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "menu"){
        composable("menu") { MenuScreen(navController) }
        composable("home") { HomeScreen(navController) }
    }
}*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Content() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = colorResource(R.color.BottomAppBar_color),
                contentColor = Color.White
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(
                            painterResource(id = R.drawable.baseline_home_filled_24),
                            contentDescription = "Home",
                            tint = colorResource(R.color.TopAppBar_icons_color),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(
                            painterResource(id = R.drawable.baseline_subscriptions_24),
                            contentDescription = "Friends",
                            tint = colorResource(R.color.TopAppBar_icons_color),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            tint = colorResource(R.color.TopAppBar_icons_color),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(
                            painterResource(id = R.drawable.baseline_library_music_24),
                            contentDescription = "Library",
                            tint = colorResource(R.color.TopAppBar_icons_color),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(
                            painterResource(id = R.drawable.baseline_cloud_24),
                            contentDescription = "Library",
                            tint = colorResource(R.color.TopAppBar_icons_color),
                            modifier = Modifier
                                .size(30.dp)
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(innerPadding)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "Inicio",
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(horizontalArrangement = Arrangement.spacedBy(6.dp)) {
                    Text(
                        text = "HAZTE PRO",
                        color = colorResource(R.color.orange),
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Icon(
                        painterResource(id = R.drawable.baseline_cast_24),
                        contentDescription = "Perfil",
                        tint = colorResource(R.color.TopAppBar_icons_color),
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Icon(
                        painterResource(id = R.drawable.baseline_arrow_circle_up_24),
                        contentDescription = "Perfil",
                        tint = colorResource(R.color.TopAppBar_icons_color),
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Icon(
                        painterResource(id = R.drawable.outline_email_24),
                        contentDescription = "Perfil",
                        tint = colorResource(R.color.TopAppBar_icons_color),
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Icon(
                        painterResource(id = R.drawable.outline_notifications_24),
                        contentDescription = "Notifications",
                        tint = colorResource(R.color.TopAppBar_icons_color),
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
            }
            Text(
                text = "Nuevas pistas",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaciado de 16dp entre los elementos
            ) {
                item {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.san_holo),
                            contentDescription = "Artist Avatar",
                            modifier = Modifier
                                .size(90.dp)
                                .clip(CircleShape)
                                .border(
                                    BorderStroke(
                                        4.dp,
                                        colorResource(R.color.orange)
                                    ), // Aro naranja solo en la imagen
                                    CircleShape
                                ),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "San Holo",
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
                item {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.deadmau5),
                            contentDescription = "Friend Avatar",
                            modifier = Modifier
                                .size(90.dp)
                                .clip(CircleShape)
                                .border(
                                    BorderStroke(
                                        4.dp,
                                        colorResource(R.color.orange)
                                    ), // Aro naranja solo en la imagen
                                    CircleShape
                                ),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "deadmau5",
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
                item {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.german_hardstyle_uploadz),
                            contentDescription = "Friend Avatar",
                            modifier = Modifier
                                .size(90.dp)
                                .clip(CircleShape)
                                .border(
                                    BorderStroke(
                                        4.dp,
                                        colorResource(R.color.orange)
                                    ), // Aro naranja solo en la imagen
                                    CircleShape
                                ),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "German Hard",
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
                item {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.zomboy),
                            contentDescription = "Friend Avatar",
                            modifier = Modifier
                                .size(90.dp)
                                .clip(CircleShape)
                                .border(
                                    BorderStroke(
                                        4.dp,
                                        colorResource(R.color.orange)
                                    ), // Aro naranja solo en la imagen
                                    CircleShape
                                ),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Zomboy",
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
                item {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.crankdat),
                            contentDescription = "Friend Avatar",
                            modifier = Modifier
                                .size(90.dp)
                                .clip(CircleShape)
                                .border(
                                    BorderStroke(
                                        4.dp,
                                        colorResource(R.color.orange)
                                    ), // Aro naranja solo en la imagen
                                    CircleShape
                                ),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Crankdat",
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
                item {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.doctor_p),
                            contentDescription = "Friend Avatar",
                            modifier = Modifier
                                .size(90.dp)
                                .clip(CircleShape)
                                .border(
                                    BorderStroke(
                                        4.dp,
                                        colorResource(R.color.orange)
                                    ), // Aro naranja solo en la imagen
                                    CircleShape
                                ),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Doctor P",
                            color = Color.White,
                            fontSize = 15.sp
                        )
                    }
                }
            }
            Text(
                text = "Escuchadas recientemente",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp)
            )
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                item {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(16.dp) // Espaciado entre elementos
                    ) {
                        // Primer elemento "Pistas que me gustan"
                        item {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Imagen
                                Image(
                                    painter = painterResource(id = R.drawable.me_gusta), // Cambia por el recurso correspondiente
                                    contentDescription = "Pistas que me gustan",
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(RoundedCornerShape(2.dp)) // Esquina redondeada
                                )
                                Spacer(modifier = Modifier.width(16.dp))

                                // Texto
                                Column {
                                    Text(
                                        text = "Pistas que me gustan",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "gerardoelcrack2",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                        }

                        // Segundo elemento "Marshmello X Ray Volpe"
                        item {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Imagen
                                Image(
                                    painter = painterResource(id = R.drawable.marshmello_icon), // Cambia por el recurso correspondiente
                                    contentDescription = "Marshmello X Ray Volpe",
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(RoundedCornerShape(2.dp)) // Esquina redondeada
                                )
                                Spacer(modifier = Modifier.width(16.dp))

                                // Texto
                                Column {
                                    Text(
                                        text = "MARSHMELLO X RAY VOLPE",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "RAY VOLPE \uD83E\uDD16 - Lista",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                        }
                    }
                }
                item {
                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(16.dp) // Espaciado entre elementos
                    ) {
                        item {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Imagen
                                Image(
                                    painter = painterResource(id = R.drawable.your_mix_1), // Cambia por el recurso correspondiente
                                    contentDescription = "Your Mix 1",
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(RoundedCornerShape(2.dp)) // Esquina redondeada
                                )
                                Spacer(modifier = Modifier.width(16.dp))

                                // Texto
                                Column {
                                    Text(
                                        text = "Your Mix 1",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "Diseñado para gerardoelcrack2",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                        }

                        item {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Imagen
                                Image(
                                    painter = painterResource(id = R.drawable.ray_volpe_volpetron_ascends_ep), // Cambia por el recurso correspondiente
                                    contentDescription = "RAY VOLPE - VOLPETRON ASCENDS EP",
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(RoundedCornerShape(2.dp)) // Esquina redondeada
                                )
                                Spacer(modifier = Modifier.width(16.dp))

                                // Texto
                                Column {
                                    Text(
                                        text = "RAY VOLPE - VOLPETRON ASCENDS EP",
                                        color = Color.White,
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "RAY VOLPE \uD83E\uDD16",
                                        color = Color.Gray,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                        }
                    }
                }
            }

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp) // Espaciado entre secciones
            ) {
                // Texto de título de la sección
                item {
                    Text(
                        text = "Más música de la que te gusta",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                    )
                }

                // Sección de "Más música de la que te gusta"
                item {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaciado entre elementos
                    ) {
                        // Primer tarjeta
                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp) // Tamaño de la tarjeta
                                    .clip(RoundedCornerShape(8.dp)) // Esquinas redondeadas
                                    .padding(8.dp)
                            ) {
                                // Imagen de la canción
                                Image(
                                    painter = painterResource(id = R.drawable.ray_volpe), // Cambia por el recurso de la imagen
                                    contentDescription = "RAY VOLPE - SEE YOU DROP",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp)) // Imagen con esquinas redondeadas
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                // Título de la canción
                                Text(
                                    text = "RAY VOLPE - SEE YOU DROP",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis // Maneja desbordamiento del texto
                                )

                                // Nombre del artista
                                Text(
                                    text = "RAY VOLPE \uD83E\uDD16, Monstercat, PhaseOne, Zomboy",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // Segunda tarjeta
                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.eptic_cyberhell), // Imagen del recurso correspondiente
                                    contentDescription = "EPTIC - CYBERHELL",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "EPTIC - CYBERHELL",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "EPTIC, SPACE LACES, Monstercat, Herobust",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // Tercera tarjeta
                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    //.background(Color(0xFF1C1C1E))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.kayzo_riot), // Imagen del recurso correspondiente
                                    contentDescription = "KAYZO x RIOT - Wake Up",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "KAYZO x RIOT - Wake Up",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "RIOT, Zomboy, Bear Grillz, KAYZO",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp) // Tamaño de la tarjeta
                                    .clip(RoundedCornerShape(8.dp)) // Esquinas redondeadas
                                    .padding(8.dp)
                            ) {
                                // Imagen de la canción
                                Image(
                                    painter = painterResource(id = R.drawable.soda_city_funk), // Cambia por el recurso de la imagen
                                    contentDescription = "soda city funk",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp)) // Imagen con esquinas redondeadas
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                // Título de la canción
                                Text(
                                    text = "soda city funk",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis // Maneja desbordamiento del texto
                                )

                                // Nombre del artista
                                Text(
                                    text = "Tim Legend, saway, Moe Shop, tsukojis",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.kayzo_slander_holy_ft_micah_martin), // Imagen del recurso correspondiente
                                    contentDescription = "KAYZO & SLANDER - HOLY FT. MICAH MARTIN",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "KAYZO & SLANDER - HOLY FT. MICAH MARTIN",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "KAYZO, Gammer, Zomboy, Crankdat",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    //.background(Color(0xFF1C1C1E))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.disciple_we_dont_play), // Imagen del recurso correspondiente
                                    contentDescription = "Disciple - We Don't Play",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Disciple - We Don't Play",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "Disciple ♛ ♜ ♞, Virtual Riot, Stabby, MUST DIE!",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }

                item{
                    Text(
                        text = "Introducing Buzzing",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                    )
                }

                // Sección de "Introducing Buzzing"
                item {
                    LazyRow(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp) // Espaciado entre elementos
                    ) {
                        // Primer tarjeta
                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp) // Tamaño de la tarjeta
                                    .clip(RoundedCornerShape(8.dp)) // Esquinas redondeadas
                                    .padding(8.dp)
                            ) {
                                // Imagen de la canción
                                Image(
                                    painter = painterResource(id = R.drawable.buzzing_indie), // Cambia por el recurso de la imagen
                                    contentDescription = "Buzzing Indie",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp)) // Imagen con esquinas redondeadas
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                // Título de la canción
                                Text(
                                    text = "Buzzing Indie",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis // Maneja desbordamiento del texto
                                )

                                // Nombre del artista
                                Text(
                                    text = "New!",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // Segunda tarjeta
                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.buzzing_rb), // Imagen del recurso correspondiente
                                    contentDescription = "Buzzing R&B",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Buzzing R&B",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "New!",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        // Tercera tarjeta
                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    //.background(Color(0xFF1C1C1E))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.buzzing_hip_hop_rap), // Imagen del recurso correspondiente
                                    contentDescription = "Buzzing Hip Hop & Rap",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Buzzing Hip Hop & Rap",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "New!",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp) // Tamaño de la tarjeta
                                    .clip(RoundedCornerShape(8.dp)) // Esquinas redondeadas
                                    .padding(8.dp)
                            ) {
                                // Imagen de la canción
                                Image(
                                    painter = painterResource(id = R.drawable.buzzing_metal), // Cambia por el recurso de la imagen
                                    contentDescription = "Buzzing Metal",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp)) // Imagen con esquinas redondeadas
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                // Título de la canción
                                Text(
                                    text = "Buzzing Metal",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis // Maneja desbordamiento del texto
                                )

                                // Nombre del artista
                                Text(
                                    text = "New!",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.buzzing_rock), // Imagen del recurso correspondiente
                                    contentDescription = "Buzzing Rock",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Buzzing Rock",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "New!",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }

                        item {
                            Column(
                                modifier = Modifier
                                    .width(160.dp)
                                    .clip(RoundedCornerShape(8.dp))
                                    //.background(Color(0xFF1C1C1E))
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.buzzing_pop), // Imagen del recurso correspondiente
                                    contentDescription = "Buzzing Pop",
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(120.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                )
                                Spacer(modifier = Modifier.height(8.dp))

                                Text(
                                    text = "Buzzing Pop",
                                    color = Color.White,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )

                                Text(
                                    text = "New!",
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                                    color = Color.Gray,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}