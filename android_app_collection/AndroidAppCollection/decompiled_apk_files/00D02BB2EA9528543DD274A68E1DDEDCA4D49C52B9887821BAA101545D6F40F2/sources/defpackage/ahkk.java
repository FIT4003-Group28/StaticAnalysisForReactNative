package defpackage;
/* compiled from: PG */
/* renamed from: ahkk  reason: default package */
/* loaded from: classes2.dex */
public final class ahkk {
    public static int a(int i) {
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        if (i < 0) {
            return 0;
        }
        if (i <= 15) {
            return 4;
        }
        if (i <= 30) {
            return 3;
        }
        if (i <= 45) {
            return 2;
        }
        return i <= 60 ? 1 : 0;
    }
}
