package defpackage;
/* compiled from: PG */
/* renamed from: chxj  reason: default package */
/* loaded from: classes4.dex */
public enum chxj {
    RATING,
    REVIEW,
    BULK_PHOTO_UPLOAD,
    DEVICE_PHOTO_UPLOAD,
    TAG_PUBLISHED_PHOTOS,
    PUBLISH_LIST,
    ADD_LIST_DESCRIPTION,
    ADD_LIST_ITEM_NOTE,
    ADD_LIST_ITEM_PHOTO,
    ADD_LIST_ITEMS,
    ANSWER_QUESTION,
    PLACE_TOPIC_FEEDBACK,
    REVIEW_FEEDBACK,
    PLACE_REOPEN,
    FACTUAL_MODERATION_TASK,
    NO_OP,
    CONCRETETASK_NOT_SET;

    public static chxj a(int i) {
        switch (i) {
            case 0:
                return CONCRETETASK_NOT_SET;
            case 1:
                return RATING;
            case 2:
                return REVIEW;
            case 3:
                return BULK_PHOTO_UPLOAD;
            case 4:
                return DEVICE_PHOTO_UPLOAD;
            case 5:
                return TAG_PUBLISHED_PHOTOS;
            case 6:
            case 15:
            case 18:
            case 19:
            default:
                return null;
            case 7:
                return PUBLISH_LIST;
            case 8:
                return NO_OP;
            case 9:
                return ANSWER_QUESTION;
            case 10:
                return ADD_LIST_DESCRIPTION;
            case 11:
                return ADD_LIST_ITEM_NOTE;
            case 12:
                return ADD_LIST_ITEMS;
            case 13:
                return ADD_LIST_ITEM_PHOTO;
            case 14:
                return PLACE_TOPIC_FEEDBACK;
            case 16:
                return REVIEW_FEEDBACK;
            case 17:
                return PLACE_REOPEN;
            case 20:
                return FACTUAL_MODERATION_TASK;
        }
    }
}
