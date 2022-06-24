package com.example.permessionhandlingcompose

import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState

@ExperimentalPermissionsApi
fun PermissionState.isPermanentlyDenied(): Boolean {
    // permission declined at least for the 2nd time
    return !hasPermission && !shouldShowRationale
}