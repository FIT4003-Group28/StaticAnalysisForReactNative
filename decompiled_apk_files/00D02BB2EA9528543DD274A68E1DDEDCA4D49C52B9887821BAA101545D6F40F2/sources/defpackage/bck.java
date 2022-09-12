package defpackage;
/* compiled from: PG */
/* renamed from: bck  reason: default package */
/* loaded from: classes3.dex */
public final class bck {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static boolean b(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ void c(int i) {
        if (i != 0) {
            return;
        }
        throw null;
    }
}
