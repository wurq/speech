package com.wurq.base.util;

import android.content.Context;
import android.util.TypedValue;

/**
 * 常用单位转换的辅助类
 * 
 * 
 * 
 */
public class DensityUtils {
	private DensityUtils() {
		/** cannot be instantiated **/
		throw new UnsupportedOperationException("cannot be instantiated");
	}

	/**
	 * dp转px
	 * 
	 * @param context
	 * @param dpVal
	 * @return
	 */
	public static final int dp2px(Context context, float dpVal) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
				dpVal, context.getResources().getDisplayMetrics());
	}

	/**
	 * sp转px
	 * 
	 * @param context
	 * @param spVal
	 * @return
	 */
	public static final int sp2px(Context context, float spVal) {
		return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
				spVal, context.getResources().getDisplayMetrics());
	}

	/**
	 * px转dp
	 * 
	 * @param context
	 * @param pxVal
	 * @return
	 */
	public static final float px2dp(Context context, float pxVal) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (pxVal / scale);
	}

	/**
	 * px转sp
	 * 
	 * @param pxVal
	 * @return
	 */
	public static final float px2sp(Context context, float pxVal) {
		return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
	}

	public static final int getHeightInPx(Context context) {
		return context.getResources().getDisplayMetrics().heightPixels;
	}

	public static final int getWidthInPx(Context context) {
		return context.getResources().getDisplayMetrics().widthPixels;
	}
}
