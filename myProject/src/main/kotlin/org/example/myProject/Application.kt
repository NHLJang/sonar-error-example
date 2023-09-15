package org.example.myProject

import org.example.myModule.TestClass // This line is not detected.
import javax.management.ImmutableDescriptor //This line is.

class Application

fun main(args: Array<String>) {
}
