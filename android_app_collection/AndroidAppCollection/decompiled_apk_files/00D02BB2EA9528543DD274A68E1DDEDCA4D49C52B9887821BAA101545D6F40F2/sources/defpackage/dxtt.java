package defpackage;
/* compiled from: PG */
/* renamed from: dxtt  reason: default package */
/* loaded from: classes6.dex */
public final class dxtt {
    public static int a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        if (i != 0) {
            switch (i) {
                case 5:
                    return 7;
                case 6:
                    return 8;
                case 7:
                    return 9;
                case 8:
                    return 10;
                case 9:
                    return 11;
                default:
                    return 0;
            }
        }
        return 2;
    }
}
