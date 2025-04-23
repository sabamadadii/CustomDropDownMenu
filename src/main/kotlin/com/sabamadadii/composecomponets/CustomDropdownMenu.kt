// src/main/kotlin/com/sabamadadii/composecomponents/CustomDropdownMenu.kt

package com.sabamadadii.composecomponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDropdownMenu(
    getTitle: (String) -> Unit,
    label: String,
    options: List<String>,
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[0]) }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded },
        modifier = Modifier.fillMaxWidth(0.9f)
    ) {
        OutlinedTextField(
            readOnly = true,
            value = selectedOptionText,
            shape = RoundedCornerShape(10.dp),
            onValueChange = {},
            label = {
                Text(
                    text = label,
                    style = FontTypography().bodyLarge,
                    color = GrayText
                )
            },
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
            },
            colors = ExposedDropdownMenuDefaults.outlinedTextFieldColors(
                unfocusedBorderColor = Color.Black,
                focusedBorderColor = Color.Black.copy(alpha = 0.5f),
                cursorColor = Color.Black,
                focusedLabelColor = Color.Black,
                unfocusedLabelColor = Color.Black,
                focusedTrailingIconColor = Color.Black,
                unfocusedTrailingIconColor = Color.Black,
            ),
            modifier = Modifier
                .menuAnchor()
                .background(Color.Transparent)
        )
        ExposedDropdownMenu(
            modifier = Modifier
                .background(Color.White)
                .exposedDropdownSize()
                .shadow(0.dp),
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = selectionOption,
                            color = Color.Black
                        )
                    },
                    colors = MenuDefaults.itemColors(
                        textColor = Color.Black,
                        disabledTextColor = Color.Gray
                    ),
                    onClick = {
                        selectedOptionText = selectionOption
                        expanded = false
                        getTitle(selectionOption)
                    }
                )
            }
        }
    }
}
