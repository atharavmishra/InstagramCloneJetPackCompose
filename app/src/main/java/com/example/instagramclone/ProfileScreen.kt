package com.example.instagramclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(name = "Atharv Mishra")
        Spacer(modifier = Modifier.height(4.dp))

        ProfileSection()

    }
}

@Composable
fun TopBar(
    name: String, modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back Arrow",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Text(
            text = name,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_bell),
            contentDescription = "Back Arrow",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_dotmenu),
            contentDescription = "Back Arrow",
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun ProfileSection(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            RoundImage(
                image = painterResource(id = R.drawable.progfile_image),
                modifier = Modifier
                    .size(80.dp)
                    .weight(3f)
            )
            StatSection(modifier = modifier.weight(2f), statText = "20", textFields = "Posts")
            StatSection(modifier = modifier.weight(2f), statText = "69K", textFields = "Followers")
            StatSection(modifier = modifier.weight(2f), statText = "5", textFields = "Following")
        }

    }
}

@Composable
fun RoundImage(modifier: Modifier = Modifier, image: Painter) {
    Image(
        painter = image,
        contentDescription = "This is a Profile Image",
        modifier = modifier
            .fillMaxSize()
            .aspectRatio(1f, matchHeightConstraintsFirst = true)
            .border(
                width = 1.dp, color = Color.LightGray, shape = CircleShape
            )
            .padding(3.dp)
            .clip(RoundedCornerShape(50))

    )
}

@Composable
fun StatSection(
    modifier: Modifier = Modifier,
    statText: String,
    textFields: String
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = statText, fontWeight = FontWeight.Bold, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(2.dp))
        Text(text = textFields)
    }
}

@Composable
fun BioStat(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(text = "display Name")
    }
}