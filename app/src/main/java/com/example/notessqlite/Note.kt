package com.example.notessqlite

import android.icu.text.CaseMap.Title
import android.security.identity.AccessControlProfileId
import androidx.activity.result.contract.ActivityResultContracts

data class Note(val id: Int, val title: String, val content: String)
