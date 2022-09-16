package defpackage;
/* compiled from: PG */
/* renamed from: avkz  reason: default package */
/* loaded from: classes2.dex */
public enum avkz {
    TASK_REGISTERED,
    EVENT_NOT_SET;

    public static avkz a(int i) {
        if (i != 0) {
            if (i == 1) {
                return TASK_REGISTERED;
            }
            return null;
        }
        return EVENT_NOT_SET;
    }
}
