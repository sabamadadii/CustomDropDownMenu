# Compose UI Components - CustomDropdownMenu

A reusable Jetpack Compose dropdown menu component for selection with customizable options. This component allows users to select from a list of options, and the selected option can be retrieved via a callback function.

## Table of Contents

- [About](#about)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)

## About

`CustomDropdownMenu` is a reusable UI component built with Jetpack Compose for Android. It provides a dropdown menu with customizable options that users can select from. The selected option is then passed back to the caller through a callback function, making it easy to integrate into various UI screens.

This component is especially useful for forms, settings screens, or any scenario where you need a dropdown selection UI element.

## Features

- **Customizable options**: You can easily specify the list of options that the dropdown will display.
- **User-friendly interaction**: Easy to integrate into Jetpack Compose UIs with smooth interaction.
- **Reusable component**: This component can be reused across multiple projects.
- **Responsive design**: The dropdown menu is designed to work well on different screen sizes and orientations.
- **Minimal dependencies**: It uses only core Jetpack Compose libraries.

## Installation

To use the `CustomDropdownMenu` component in your project, follow these steps:

1. **Clone the repository**:

      Clone this repository to your local machine using the following command:

   ```bash
   git clone https://github.com/sabamadadii/CustomDropdownMenu

2. **Add the component to your project**:

copy the CustomDropdownMenu.kt file into your project directory under an appropriate folder, for example:

    src/main/kotlin/com/sabamadadii/composecomponents.


3. **Ensure you have Jetpack Compose set up**:

Make sure that you have Jetpack Compose set up in your project by following the Jetpack Compose setup guide.

4.**Optional - Add dependencies**:

If you haven't already, make sure that your project includes the necessary Compose dependencies in your build.gradle file:

dependencies {
    implementation "androidx.compose.ui:ui:1.0.0"
    implementation "androidx.compose.material3:material3:1.0.0"
}

## Usage

To use the CustomDropdownMenu component in your project, follow these steps:

Import the component in your Kotlin file:

    import com.sabamadadii.composecomponents.CustomDropdownMenu



Use the component inside your Composable function:

@Composable
fun Profile() {
    var status by remember { mutableStateOf("female") }

    CustomDropdownMenu(
        getTitle = { selectedOption -> status = selectedOption },
        options = listOf("female", "male"),
        label = "Gender"
    )
}


## Parameters:
label: The label text displayed above the dropdown menu.

options: A list of strings that will be shown as selectable options in the dropdown.

getTitle: A callback function that will receive the selected option when the user makes a selection.

