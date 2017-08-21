package com.wurq.base.util;

/**
 * Created by wurongqiu on 2017/4/26.
 */

import android.content.ContentResolver;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.ArrayRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;

import com.wurq.isv.application.AppProfile;

public class ResourcesUtil {
//    private static float scale = AppProfile.getContext().getResources().getDisplayMetrics().density;
//    private static float fontScale = AppProfile.getContext().getResources().getDisplayMetrics().scaledDensity;

    public static String getString(@StringRes int stringId) {
        return AppProfile.getContext().getResources().getString(stringId);
    }

    public static String[] getStringArray(@ArrayRes int arrayId) {
        return AppProfile.getContext().getResources().getStringArray(arrayId);
    }

    public static String stringFormat(@StringRes int stringId, Object... objects) {
        String formatString = getString(stringId);
        return String.format(formatString, objects);
    }

    public static int getColor(@ColorRes int colorId) {
        return AppProfile.getContext().getResources().getColor(colorId);
    }

    public static float getDimen(@DimenRes int dimenId) {
        return AppProfile.getContext().getResources().getDimension(dimenId);
    }

    public static int getDimenPxSize(@DimenRes int dimenId) {
        return AppProfile.getContext().getResources().getDimensionPixelSize(dimenId);
    }

//    public static float getDimenDpSize(@DimenRes int dimenId) {
//        return getDimen(dimenId) / scale;
//    }

//    public static float getDimenSpSize(@DimenRes int dimenId) {
//        return getDimen(dimenId) / fontScale;
//    }

    public static Drawable getDrawable(@DrawableRes int drawableID) {
        return AppProfile.getContext().getResources().getDrawable(drawableID);
    }


    public static Uri getUri(int resourceId) {
        Resources r = AppProfile.getContext().getResources();
        String url = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                + r.getResourcePackageName(resourceId) + "/"
                + r.getResourceTypeName(resourceId) + "/"
                + r.getResourceEntryName(resourceId);
        return Uri.parse(url);
    }

    public static Resources getResources() {
        return AppProfile.getContext().getResources();
    }
}
