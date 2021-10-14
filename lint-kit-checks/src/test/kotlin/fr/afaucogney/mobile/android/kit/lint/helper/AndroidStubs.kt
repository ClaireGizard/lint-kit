package fr.afaucogney.mobile.android.kit.lint.helper

import com.android.tools.lint.checks.infrastructure.TestFiles.kt

val appCompatActivitySupportStub = kt(
    """
        package android.support.v7.app

        class AppCompatActivity : Activity()

    """
).indented()

val activitySupportStub = kt(
    """
        package android.support.v7.app

        class Activity

    """
).indented()


val fragmentSupportStub = kt(
    """
        package android.support.v4.app

        class Fragment

    """
).indented()

val fragmentAndroidXStub = kt(
    """
        package androidx.fragment.app

        class Fragment

    """
).indented()

