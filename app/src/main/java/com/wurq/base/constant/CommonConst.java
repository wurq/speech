package com.wurq.base.constant;

/**
 * Created by wurongqiu on 2017/6/19.
 */

public class CommonConst {

    /**
     * 前后台通讯常量
     */
    public static final String StartPlayer = "start_player";
    public static final String VIDEO_URL = "video_url";
    public static final String StartPlayerDone = "start_player_done";

    public static class NetWorkParams {

        public static final int NETWORK_ONLINE = 1;//线上
        public static final int NETWORK_DEV_03 = 2;//dev03
        public static final String DATA_CAN_WATCH = "DATA_CAN_WATCH";
        public static final String MOCK_URL = "http://rap.ikuko.com/mockjsdata/73/";
        public static String video_url;

        public static final boolean isMock = false;
        public static int netWorkType = 2;//网络类型
        public static String kapi_url;
        private static final String DEV03_KAPI_URL = "http://10.0.0.142:8003/";
        private static final String ONLINE_KAPI_URL = "http://kapi.kaike.la/";

        static {
            switch (netWorkType) {
                case NETWORK_ONLINE:
                    kapi_url = ONLINE_KAPI_URL;
                    video_url = "http://stream.kaike.la/";
                    break;
                case NETWORK_DEV_03:
                    kapi_url = DEV03_KAPI_URL;
                    video_url = "http://stream.stable.ikuko.com/";
                    break;
                default:
                    kapi_url = "";
                    video_url = "";
                    break;
            }
        }
    }

    public static class HttpCode {

        public static final int NETWORK_REQUEST_ERROR = -100;       //
        public static final int NETWORK_CACHE_PARSER_ERROR = -101;       //
        public static final int NETWORK_CACHE_NOT_SURPPORT = -102;       //

        public static final int NETWORK_RETURN_SUCCESS = 200;       //

        public static final int NO_NETWORK = -200;//无网络服务
        public static final int DATA_ERROR = -201;//数据错误
        public static final int DATA_LOST = -202;//数据缺失
        public static final int KAPI_ERROR = -203;//网关错误
        public static final int BUSINESS_ERROR = -300;//业务错误
        public static final int VIDEO_SERVER_ERROR = -300;//视频服务器异常

        //网关错误码
        public static final int NETWORK_REQUEST_UNKNOWN_ERROR = -1;       //未知错误
        public static final int NETWORK_ERROR_TOKEN_INVALID = 1002001;//token失效
        public static final int NETWORK_ERROR_NO_TOKEN = 1001010;//无token
    }

    /*
     * 进程名字
     */
    public final class AppProcess {
        /**
         * 前台进程
         */
        public static final String FOREGROUND_PROCESS = "com.mistong.kklonline.kklonline:fore";
        /**
         * 后台进程
         */
        public static final String BACKGROUND_PROCESS = "com.mistong.kklonline.kklonline";
    }

    /*
     * 各种入口的action
     */
    public final class HostAction {
        public static final String BACK_ENGINE = "com.mistong.ipccenter.back.BackEngine";
        public static final String DESKTOP_ACTIVITY = "com.mistong.kklonline.fore.DeskTopActivity";
    }

    /*
   * 进程名字
   */
    public final class AppConstants {
        public static final int TIME_OUT_NUM = 15;
    }

    public static class AppPlatform {
        public static final String MSGID = "msgId";
        public static final String PLATFORM = "platform";
        public static final String ANDROID = "Android";

        public static final String SOURCE = "source";
        public static final String REQUEST = "request";
//        public static final String APP_NAME          = "com.mistong.kklonline.kklonline";
//        public static final String EXTRA_BUNDLE      = "extra_bundle";
//        public static final String UMENTG_KEY        = "59546233a40fa36def001077";

        public static final int NUMBER_ONE = 1;

        public static final String IN_BUNDLE = "inBundle";
        public static final String PRODUCT_ID = "productId";
        public static final String LIVE_ID = "liveId";
        public static final String CLASS_ID = "classId";
        public static final String COURSE_ID = "courseId";
        public static final String LESSON_ID = "lessonId";
        public static final String INTERACTION_ID = "interactionId";
        public static final String RESOURCE_ID = "resourceId";
    }

    public static class HttpContentType {
        public static final String CONTENT_TYPE_JSON = "application/json; charset=utf-8";
        public static final String CONTENT_TYPE_FILE = "multipart/form-data";
    }

    public static class LoginInfo {
        public static final String TEL_NUM = "TEL_NUM";
        public static final String TOKEN = "token";
        public static final String KKL_ONLINE_ACCOUNT = "100010001";
        public static final String BAR_HEIGHT = "status_bar_height";
        public static final String DIMEN = "dimen";
        public static final String ANDROID = "android";
        public static final int PASSWORD_MAX_LENGTH = 16;
        public static final int PASSWORD_MIN_LENGTH = 6;
        public static final int CONFIRM_LENGTH = 4;
        public static final int CONFIRM_LENGTH_NUM = 120;
        public static final int GRADE_SEVEN = 7;
        public static final int GRADE_EGITE = 8;
        public static final int GRADE_NINE = 9;
        public static final int GRADE_ZERO = 0;
        public static final String GRADE_SEVEN_STR = "七年级";
        public static final String GRADE_EGITE_STR = "八年级";
        public static final String GRADE_NINE_STR = "九年级";

        public static final String PHONE_ERROR_1 = "1";
        public static final String PHONE_ERROR_10 = "10";
        public static final String PHONE_ERROR_11 = "11";
        public static final String PHONE_ERROR_16 = "16";
        public static final String PHONE_ERROR_12 = "12";
        public static final String PHONE_ERROR_19 = "19";

        public static final String LOGININFO = "loginInfo";
        public static final String REGISTERINFO = "registerInfo";
        public static final String FINDPWDINFO = "findPwdInfo";
        public static final String REGISTER_TYPE = "mode";
        public static final String MOBILENO = "mobileNo";
        public static final String DTO = "dto";
        public static final String TITLE = "title";
        public static final String ISSHOWBACK = "isShowBack";
        public static final String URL = "url";
        public static final String ISTOKENLOSE = "isTokenLose";
        public static final String TYPE = "type";
        public static final int TYPE_1 = 1;
        public static final String DEVICE_TOKEN = "imei";
    }

    public static class LearnInfo {
        //作业状态
        public static final String HOMEWORK_STATUS = "homework_status";
        // fragment name
        public static final String FRAGMENT_NAME = "fragment_name";
        //任务状态
        public static final String TASK_STATUS = "task_status";
        //课程直播状态
        public static final String COURSE_LIVE_TYPE = "course_live_type";

        //课堂小结
        public static final String CLASS_SUMMARY_LESSON_NAME = "class_summary_lesson_name";
        public static final String CLASS_SUMMARY_URL = "class_summary_url";
        public static final String WRONG_BOOK_URL = "wrong_book_url";
        public static final String WEEKLY_REPORT_URL = "weekly_report_url";
    }

    public static class LiveStatus {
        public static final int LIVE_STATUS_WAIT = 1;//等待直播
        public static final int LIVE_STATUS_PREPARE = 2;//直播准备中
        public static final int LIVE_STATUS_ING = 3;//直播中
        public static final int LIVE_STATUS_END = 4;//直播结束
    }

    public static class TaskStatus {
        public static final int TASK_UNDONE_STATUS = 1;
        public static final int TASK_DONE_STATUS = 2;
    }

    public static class CourseLiveType {
        public static final int COURSE_LIVE_RECENTLY_TYPE = 1;
        public static final int COURSE_LIVE_DONE_TYPE = 2;
    }

    public static class HomeworkStatus {
        //作业未完成
        public static final int HOMEWORK_STATUS_UNDONE = 1;
        //作业批改中
        public static final int HOMEWORK_STATUS_CORRECTING = 2;
        //作业已批改
        public static final int HOMEWORK_STATUS_CORRECTED = 3;
    }

    public static class PageInfo {
        //单个页面请求数量
        public static final int FIRST_PAGE = 1;
        public static final int PAGE_SIZE = 10;
        public static final String PAGE = "page";
        public static final String SIZE = "size";
    }

    public static class MainPageInfo {
        public static final String MAIN_PAGE_INDEX = "main_page_index";
        public static final int SELECT_COURSE_INDEX = 0;//选课页索引
        public static final int LEARN_PAGE_INDEX = 1;//学习页索引
        public static final int PERSONAL_CENTER_PAGE_INDEX = 2;//我的索引

    }

    public static class ChooseCourse {
        public static final String PAGEINDEX = "pageIndex";
        public static final int PAGEFIRST = 1;
        public static final String PAGESIZE = "pageSize";
        public static final String MORNING = "早上好";
        public static final String NOON = "中午好";
        public static final String AFTER_NOON = "下午好";
        public static final String EVENING = "晚上好";
        public static final String SLEEPING = "该休息啦";
        public static final String LEARN_TIME = "learn_time";
    }

    public static class UserInfo {
        public static final String NAME = "name";
        public static final String NICK_NAME = "nick_name";
        public static final String MOBILE_NO = "mobile_no";
        public static final String GRADE_NAME = "grade_name";
        public static final String SCHOOL = "school";
        public static final String BIRTHDAY = "birthday";
        public static final String QQ = "qq";
        public static final String SEX = "sex";
        public static final String MEMBER_ID = "member_id";

        //provinceCode cityCode districtCode schoolCode
        public static final String PROVINCECODE = "provinceCode";
        public static final String CITYCODE = "cityCode";
        public static final String DISTRICTCODE = "districtCode";
        public static final String SCHOOLCODE = "schoolCode";

        //provinceName cityName districtName schoolName
        public static final String PROVINCENAME = "provinceName";
        public static final String CITYNAME = "cityName";
        public static final String DISTRICTNAME = "districtName";
        public static final String SCHOOLNAME = "schoolName";

    }

    public static class ApplicationInfo {
        public static final String APP_NAME = "com.mistong.kklonline.kklonline";
        public static final String EXTRA_BUNDLE = "extra_bundle";
        public static final String UMENTG_KEY = "596c19ca677baa529c0003ec";

        public static final int NUMBER_ONE = 1;
        public static final String HAS_BEEN_OPENED = "hasBeenOpened";
    }

    public static class KKlPlayer {
        public static final int ERROR_100401 = 100401;
        public static final int ERROR_100403 = 100403;
        public static final int ERROR_100404 = 100404;

        public static final int ERROR_100400 = 100400;
        public static final int ERROR_100599 = 100599;
        public static final int ERROR_200001 = 200001;
        public static final int ERROR_200007 = 200007;
        public static final int ERROR_TIME = 5000;

        public static final int PLAY_ERROR = 0;
        public static final int PLAY_ERROR_NET = 1;
        public static final int MAX_PRINTNESS = 255;
        public static final int LEARN_TYPE_1 = 1;
        public static final int LEARN_TYPE_2 = 2;


        public static final String VIDEO_ID = "video_id";
        public static final String VIDEO_NAME = "video_name";
        public static final String IS_TEST_VIDEO = "is_test_video";
        public static final String IS_4G = "is_4g";
        public static final String TEST_URL = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";

        public static final String LEARN = "LESSON";
        public static final String COURSEID = "courseId";
        public static final String LESSONID = "lessonId";
        public static final String ORIGINTYPE = "originType";
        public static final String ORIGINID = "originId";
        public static final String BEFORE_COURSE = "BEFORE_COURSE";
        public static final String AFTER_COURSE = "AFTER_COURSE";
        public static final String LIVE_COURSE = "LIVE_COURSE";
        public static final String KKLMEDIAMESSAGEVOS = "kklMediaMessageVOS";
        public static final String CONNECTIVITY_CHANGE = "android.net.conn.CONNECTIVITY_CHANGE";

    }

}
