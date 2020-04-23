package com.charan.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class UtilsData {

    private static final boolean LOG = BuildConfig.DEBUG;
    private static final String TAG_DEBUG = "DEBUG";
    private static final String TAG_ERROR = "ERROR";
    private static final String TAG_VERBOSE = "VERBOSE";
    private static final String TAG_INFO = "INFO";
    private static final String TAG_WARN = "WARN";
    private static ProgressDialog progressDialog;

    public static void debug_print(String message) {
        if (LOG) Log.d(TAG_DEBUG, message);
    }

    public static void debug_print(String TAG, String message) {
        if (LOG) Log.d(TAG, message);
    }

    public static void debug_print(int message) {
        if (LOG) Log.d(TAG_DEBUG, String.valueOf(message));
    }

    public static void debug_print(String TAG, int message) {
        if (LOG) Log.d(TAG, String.valueOf(message));
    }

    //error
    public static void error_print(String message) {
        if (LOG) Log.e(TAG_ERROR, message);
    }

    public static void error_print(String TAG, String message) {
        if (LOG) Log.e(TAG, message);
    }

    public static void error_print(int message) {
        if (LOG) Log.e(TAG_ERROR, String.valueOf(message));
    }

    public static void error_print(String TAG, int message) {
        if (LOG) Log.e(TAG, String.valueOf(message));
    }

    //verbose
    public static void verbose_print(String message) {
        if (LOG) Log.v(TAG_VERBOSE, message);
    }

    public static void verbose_print(String TAG, String message) {
        if (LOG) Log.v(TAG, message);
    }

    public static void verbose_print(int message) {
        if (LOG) Log.v(TAG_VERBOSE, String.valueOf(message));
    }

    public static void verbose_print(String TAG, int message) {
        if (LOG) Log.v(TAG, String.valueOf(message));
    }


    // warn
    public static void warn_print(String message) {
        if (LOG) Log.w(TAG_WARN, message);
    }

    public static void warn_print(String TAG, String message) {
        if (LOG) Log.w(TAG, message);
    }

    public static void warn_print(int message) {
        if (LOG) Log.w(TAG_WARN, String.valueOf(message));
    }

    public static void warn_print(String TAG, int message) {
        if (LOG) Log.w(TAG, String.valueOf(message));
    }


    // info
    public static void info_print(String message) {
        if (LOG) Log.w(TAG_INFO, message);
    }

    public static void info_print(String TAG, String message) {
        if (LOG) Log.w(TAG, message);
    }

    public static void info_print(int message) {
        if (LOG) Log.w(TAG_INFO, String.valueOf(message));
    }

    public static void info_print(String TAG, int message) {
        if (LOG) Log.w(TAG, String.valueOf(message));
    }

    public static void print(String message) {
        if (LOG) Log.d(TAG_DEBUG, message);
    }

    public static void print(String TAG, String message) {
        if (LOG) Log.d(TAG, message);
    }

    public static void print(int message) {
        if (LOG) Log.d(TAG_DEBUG, String.valueOf(message));
    }

    public static void print(String TAG, int message) {
        if (LOG) Log.d(TAG, String.valueOf(message));
    }


    public static String getCurrentDateAndTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm", Locale.getDefault());
        return sdf.format(new Date());
    }

    public static String getCurrentDateAndTime(String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        return sdf.format(new Date());
    }

    public static String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        return sdf.format(new Date());
    }

    public static void showToast(@NonNull Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(@NonNull Context context, @StringRes int message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static String padZeroBeforeInt(int value, int noOfPad) {
        if (value < 0 || noOfPad <= 0)
            return "";
        String format = "%0" + noOfPad + "d";
        return String.format(Locale.ENGLISH, format, value);
    }

    public static void hideKeyboard(@NonNull View v) {
        InputMethodManager imm = (InputMethodManager) v.getContext().getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (imm != null)
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }

    public static void showProgressDialog(@NonNull Context context, @StringRes int message, boolean cancelable) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(message));
        progressDialog.setCancelable(cancelable);
        progressDialog.show();
    }

    public static void cancelProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing())
            progressDialog.cancel();
        progressDialog = null;
    }
}
