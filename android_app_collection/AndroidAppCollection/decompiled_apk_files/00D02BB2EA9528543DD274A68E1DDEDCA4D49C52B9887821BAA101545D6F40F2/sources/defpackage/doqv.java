package defpackage;
/* compiled from: PG */
/* renamed from: doqv  reason: default package */
/* loaded from: classes6.dex */
public enum doqv {
    REVIEW_TASK,
    RATING_TASK,
    PHOTO_TASK,
    QUESTION_TASK,
    SUGGEST_EDIT_TASK,
    FACTUAL_MODERATION_TASK,
    TRANSLATION_VALIDATION_TASK,
    STREET_NUMBER_TASK,
    SCALABLE_ATTRIBUTES_TASK,
    GENERIC_TASK,
    STREET_NUMBER_VERIFICATION_TASK,
    TASK_NOT_SET;

    public static doqv a(int i) {
        switch (i) {
            case 0:
                return TASK_NOT_SET;
            case 1:
                return REVIEW_TASK;
            case 2:
                return RATING_TASK;
            case 3:
                return PHOTO_TASK;
            case 4:
                return QUESTION_TASK;
            case 5:
                return SUGGEST_EDIT_TASK;
            case 6:
                return FACTUAL_MODERATION_TASK;
            case 7:
                return TRANSLATION_VALIDATION_TASK;
            case 8:
                return STREET_NUMBER_TASK;
            case 9:
                return SCALABLE_ATTRIBUTES_TASK;
            case 10:
                return GENERIC_TASK;
            case 11:
                return STREET_NUMBER_VERIFICATION_TASK;
            default:
                return null;
        }
    }
}
