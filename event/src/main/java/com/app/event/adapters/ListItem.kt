package com.app.event.adapters

abstract class ListItem {
    companion object {
        const val TYPE_DATE = 0;
        const val TYPE_GENERAL = 1;
    }

    abstract fun getType(): Int
}