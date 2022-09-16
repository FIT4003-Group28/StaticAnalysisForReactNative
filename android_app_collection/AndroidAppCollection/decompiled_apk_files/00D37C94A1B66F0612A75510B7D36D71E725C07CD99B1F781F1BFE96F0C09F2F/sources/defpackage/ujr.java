package defpackage;
/* compiled from: PG */
/* renamed from: ujr  reason: default package */
/* loaded from: classes4.dex */
public final class ujr {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FALSE" : "TRUE" : "UNKNOWN";
    }

    public static /* synthetic */ void b(int i) {
        if (i != 0) {
            return;
        }
        throw null;
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            return i != 2 ? 0 : 3;
        }
        return 1;
    }

    public static /* synthetic */ String d(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "PRIORITY_HIGH" : "PRIORITY_NORMAL" : "PRIORITY_UNKNOWN";
    }
}
