package defpackage;
/* compiled from: PG */
/* renamed from: dpfj  reason: default package */
/* loaded from: classes6.dex */
public final class dpfj {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DOWN_PULSE_ANIMATION" : "UP_PULSE_ANIMATION" : "NO_BAR_ANIMATION" : "UNKNOWN_BAR_ANIMATION_STYLE";
    }

    public static int[] b() {
        return new int[]{1, 2, 3, 4};
    }

    public static int c(int i) {
        if (i != 0) {
            if (i == 1) {
                return 2;
            }
            if (i == 2) {
                return 3;
            }
            return i != 3 ? 0 : 4;
        }
        return 1;
    }
}
