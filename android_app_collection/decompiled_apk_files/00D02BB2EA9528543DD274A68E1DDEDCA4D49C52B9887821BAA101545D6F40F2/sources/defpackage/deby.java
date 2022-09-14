package defpackage;
/* compiled from: PG */
/* renamed from: deby  reason: default package */
/* loaded from: classes.dex */
public final class deby {
    public static int a(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    public static int b(boolean... zArr) {
        int i = 0;
        for (boolean z : zArr) {
            if (z) {
                i++;
            }
        }
        return i;
    }
}
