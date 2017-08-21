package com.wurq.base.http;

import java.util.Map;


/**
 * Created by chuan.he on 2017/6/29 0029.
 */

public class BaseRequest<T extends BaseMapper> {

    private static final String TAG = "BaseRequest";
    private static final String SERVICE_NAME = "serviceName";//网关接口唯一性标识

    protected Map<String, Object> mBodyMap;//入参集合
    private String serviceName;
//    private Call<String> call;
//    private FormBody.Builder formBody;
    private boolean mIsToastShow = true;//是否提示异常吐丝

    public BaseRequest(String serviceName) {
//        formBody = new FormBody.Builder();
//        mBodyMap = new HashMap<>();
//        this.serviceName = serviceName;
//        formBody.add(SERVICE_NAME, serviceName);
    }

    public BaseRequest(String serviceName, boolean isToastShow) {
//        formBody = new FormBody.Builder();
//        mBodyMap = new HashMap<>();
//        this.serviceName = serviceName;
//        formBody.add(SERVICE_NAME, serviceName);
//        mIsToastShow = isToastShow;
    }

    /**
     * 网关请求、mock请求
     *
     * @param httpRequestListener
     * @param valueType
     */
   /* public void sendPost(HttpRequestListener httpRequestListener, Class<T> valueType) {
        //判断网络状态
        if (Utils.getNetworkState().equals(Utils.NETWORK_STATE.OFFLINE)) {
            if (mIsToastShow)
                ToastUtil.makeShortToast(ResourcesUtil.getString(R.string.no_network));
            httpRequestListener.onHttpErrorResponse(NO_NETWORK, ResourcesUtil.getString(R.string.no_network));
            return;
        }
        if (TextUtils.isEmpty(serviceName)) {
            Log.e(TAG, "serviceName is null");
            return;
        }
        //将入参map转为json体
        String queryParams = JSON.toJSONString(mBodyMap);

        Log.d(TAG, "入参：" + queryParams);
        //装入集合
        formBody.add("param", queryParams);

        if (isMock) {
            call = RetrofitUtils.getRapInstance().create(MainRequestService.class).
                    getMockData(serviceName);
        } else {
            call = RetrofitUtils.getInstance().create(MainRequestService.class).
                    netWorkPostRequest(formBody.build());
        }
        call.enqueue(new HttpRequestListenerWrap(httpRequestListener, valueType, mIsToastShow));
    }*/

    /**
     * 请求视频服务器
     *
     * @param resourceId
     * @param httpRequestListener
     */
   /* public void sendPost(String resourceId, HttpRequestListener httpRequestListener) {
        if (TextUtils.isEmpty(resourceId)) {
            ToastUtil.makeShortToast("视频ResourceId 为空");
            return;
        }
        //判断网络状态
        if (Utils.getNetworkState().equals(Utils.NETWORK_STATE.OFFLINE)) {
            httpRequestListener.onHttpErrorResponse(NO_NETWORK, ResourcesUtil.getString(R.string.no_network));
            return;
        }
        Log.d(TAG, "resourceId：" + resourceId);
        call = RetrofitUtils.getVideoInstance().create(MainRequestService.class).
                getVideoData(resourceId, "hls");
        call.enqueue(new HttpVideoRequestListenerWrap(httpRequestListener));
    }*/


    /**
     * 取消该请求
     */
//    public void cancelRequest() {
//        if (call != null)
//            call.cancel();
//    }

}
