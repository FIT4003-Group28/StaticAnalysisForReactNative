package defpackage;
/* compiled from: PG */
/* renamed from: appj  reason: default package */
/* loaded from: classes2.dex */
public enum appj {
    SCREEN_EXIT,
    EVENT_NOT_SET;

    public static appj a(int i) {
        if (i != 0) {
            if (i == 1) {
                return SCREEN_EXIT;
            }
            return null;
        }
        return EVENT_NOT_SET;
    }
}
