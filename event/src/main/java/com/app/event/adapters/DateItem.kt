package com.app.event.adapters

import java.util.Date

data class DateItem(var date: Date) : ListItem() {

    override fun getType(): Int {
        return TYPE_DATE
    }
}