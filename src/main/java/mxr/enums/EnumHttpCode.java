package mxr.enums;

import lombok.Getter;

/**
 * @description:
 * @Title: HttpCodeEnum
 * @Package com.vector.common.constants
 * @Author 芝士汉堡
 * @Date 2023/3/28 9:31
 */
@Getter
public enum EnumHttpCode {
    // 请求成功
    SUCCESS(200, "操作成功"),
    CREATED(200, "对象创建成功"),
    SUCCESS_ADD(200, "添加成功"),
    SUCCESS_DELETE(200, "删除成功"),
    SUCCESS_UPDATE(200, "修改成功"),
    ACCEPTED(200, "请求已经被接受"),
    SUCCESS_CAPTCHA(200, "验证码发送成功"),
    SUCCESS_CAPTCHA_CHECK(200, "验证码校验成功"),

    // vector-member
    USERNAME_NOT_EXIST(1401001, "用户不存在"),
    MEMBER_NOT_EXIST(1401002, "会员信息不存在"),
    LOGIN_ERROR(1401003, "用户名或密码错误"),
    ACHIEVEMENT_NOT_EXIST(1401004, "成就信息不存在"),
    USERNAME_EXIST(1401005, "用户名已存在"),
    PASSWORD_NOT_EXIST(1401006, "密码未设定,请重置密码"),
    GROUP_NOT_EXIST(1401007, "群组信息不存在"),
    NOT_LOGIN(1401008, "请先登录"),
    REPEAT_CLICK(140109, "请勿重复点击"),
    USERNAME_GROUP_EXIST(1401010, "用户不能重复添加"),
    // vector-security
    EXCEPTION_CAPTCHA(1407001, "验证码发送失败"),
    FAIL_CAPTCHA_CHECK(1407002, "验证码校验失败"),
    FAIL_MSGCODE_CHECK(2407003, "短信验证码校验失败"),
    UNAUTHORIZED(1407004, "未授权"),
    NO_OPERATOR_AUTH(1407005, "访问受限，授权过期"),
    TOKEN_EXPIRED(1407006, "token过期"),
    TOKEN_ERROR(1407007, "token错误"),
    TOO_MANY_REQUESTS(1407008, "请求过于频繁，请稍后再试"),
    PHONE_UNREGISTER(1407009, "手机号未注册"),
    PWD_SET_FAIL(1407010, "密码设置失败"),
    PWD_OLD_FAIL(1407011, "旧密码错误"),


    // vector-music-score
    SCORE_NOT_EXIST(1402001, "曲谱不存在"),
    INSTRUMENT_EXIST(1402002, "当前乐器已存在"),
    SCORE_EXIST(1402003, "当前曲谱已存在"),
    INS_NOT_EXIST(1402005, "当前乐器(声乐)不存在"),
    GAOKAO_MUSIC_NOT_EXIST(1402006, "高考音乐信息不存在"),
    GAOKAO_MUSIC_EXIST(1402007, "高考音乐已存在"),
    SCORE_COLLECTION_EXIST(1402008, "当前曲谱合集已存在"),
    SCORE_COLLECTION_NOT_EXIST(1402009, "曲谱合集不存在"),
    SCORE_COLLECTION_AND_SCORE_EXIST(1402010, "曲谱合集中已经有当前曲谱"),
    SCORE_COLLECTION_NOT_EXIST_SCORE(1402011, "曲谱合集中不存在当前曲谱"),
    INS_ID_NOT_NULL(14020012, "乐器(声乐)主键不能为空"),
    SCORE_ID_NOT_NULL(14020013, "曲谱主键不能为空"),
    SCORE_AUTHOR_NOT_EXIST(14020014, "曲谱作者不存在"),
    ARTIST_COLLECTION_NOT_EXIST(1402015, "音乐人合集不存在"),
    ARTIST_COLLECTION_NAME_NOT_NULL(1402016, "音乐人合集名称不能为空"),
    ARTIST_COLLECTION_EXIST(1402017, "音乐人合集已存在"),
    SCORE_RESOURCE_NOT_EXIST(1402018, "曲谱资源不存在"),
    GAOKAO_MUSIC_ID_NOT_NULL(1402019, "高考音乐主键不能为空"),
    SCORE_COLLECTION_ID_NOT_NULL(1402019, "曲谱合集主键不能为空"),
    SCORE_RESOURCE_NOT_EXIST_FILE(1402020, "该曲谱暂无资源文件"),
    SCORE_COLLECTION_NOT_EXIST_SCORE_COLLECTION(1402021, "含有不存在的曲谱合集"),
    FILE_NOT_EXIST(1402022, "含有不存在的资源文件"),
    VIP_STATUS_ERROR(1402023, "vip状态错误"),
    VOCAL_ONLY_ONE(1402024, "只能添加一个声乐"),
    RESOURCE_NOT_EXIST(1402025, "资源文件不存在"),
    ARTIST_NOT_EXIST(1402023, "音乐人不存在"),
    ARTIST_COLLECTION_ARTIST_EXIST(1402024, "音乐人合集中已经有当前音乐人"),
    ARTIST_COLLECTION_NOT_EXIST_ARTIST(1402025, "含有不存在的音乐人"),
    ARTIST_COLLECTION_NOT_EXIST_ARTIST_COLLECTION(1402026, "音乐人合集中不存在当前音乐人"),
    PROVINCE_NOT_NULL(1402027, "省份不能为空"),
    SCORE_EXIST_STAFF(1402028, "该曲谱中已存在五线谱"),
    SCORE_EXIST_SIMPLE(1402029, "该曲谱中已存在简谱"),
    EXAM_TYPE_ERROR1(1402030, "考试形式必须为统考"),
    EXAM_TYPE_ERROR2(1402031, "考试形式必须为校考"),
    INS_NOT_EXIST_SCORE(1402032, "含有不存在的乐器（声乐）"),
    COMMENT_INVALID_REQUEST(1402033, "只能选择曲谱、曲谱合集、高考音乐以及音乐圈动态其中的一个"),
    COMMENT_OBJECT_ID_NOT_NULL(1402034, "评论对象主键不能为空"),
    TEMPORARILY_NOT_COMMENT(1402035, "暂无评论"),
    COMMENT_SUCCESS(1402036, "评论成功"),
    COMMENT_FAIL(1402037, "评论失败"),
    COMMENT_OBJECT_NOT_EXIST(1402038, "评论对象类型错误"),
    COMMENT_NOT_EXIST(1402039, "评论不存在"),
    COMMENT_NOT_PARENT(1402040, "该评论不是父级评论"),
    EXIST_SENSITIVE_WORDS(1402041, "存在敏感词汇"),
    ARTIST_ID_NOT_EMPTY(1402042, "音乐人主键不能为空"),
    ARTIST_NAME_NOT_EMPTY(1402043, "音乐人名称不能为空"),
    PROVINCE_NOT_EMPTY(1402044, "省份不能为空"),

    //    系统错误
    SEE_OTHER(1500001, "重定向"),
    BAD_REQUEST(1500002, "参数列表错误（缺少，格式不匹配）"),
    MOVED_PERM(1500003, "资源已被移除"),
    NOT_MODIFIED(1500004, "资源没有被修改"),
    NOT_FOUND(1500005, "资源，服务未找到"),
    CONFLICT(1500006, "资源冲突，或者资源被锁"),
    BAD_METHOD(1500007, "不允许的http方法"),
    UNSUPPORTED_TYPE(1500009, "不支持的数据，媒体类型"),
    AVATAR_TYPE(15000010, "请传递默认头像地址"),
    GATEWAY_ERROR(-1, "网关异常处理"),
    SYSTEM_ERROR(-1, "系统内部错误"),
    NOT_IMPLEMENTED(-1, "接口未实现"),
    FAIL(-1, "操作失败"),
    FAIL_ADD(-1, "添加失败"),
    FAIL_DELETE(-1, "删除失败"),
    FAIL_UPDATE(-1, "修改失败"),
    NOT_REPEAT_DELETE(-1, "不能重复删除"),
    BATCH_DELETE_FAIL(-1, "含有不存在的对象"),
    UPDATE_NOT_EXIST(-1, "当前修改的对象不存在"),
    EXIST(-1, "当前对象已存在"),
    NOT_EMPTY(-1, "当前数据不能为空"),
    JSON_FORMAT_ERROR(-1, "JSON转化错误"),
    IO_ERROR(-1, "IO错误"),

    KEYWORD_NOT_EMPTY(-1, "搜索内容不能为空"),
    FILE_LIMIT(-1, "上传资源不符合要求"),

    // 邮件服务错误
    SEND_MAIL_ERROR(-1, "邮件发送失败"),
    MAIL_RECEIVE_ADDR_NOT_EMPTY(-1,"邮件收件地址不能为空"),
    MAIL_SUBJECT_NOT_EMPTY(-1,"邮件主题不能为空"),
    MAIL_TYPE_NOT_EMPTY(-1,"邮件类型不能为空"),

    //  远程服务错误
    RPC_CONNECT_FAIL(1300008, "远程调用失败"),
    RPC_CONNECT_TIMEOUT(1300009, "远程调用超时"),
    RPC_NOT_FOUND(1300010, "远程调用资源未找到");

    final int code;
    final String msg;

    EnumHttpCode(int code, String errorMessage) {
        this.code = code;
        this.msg = errorMessage;
    }

}
