package defpackage;
/* compiled from: PG */
/* renamed from: cmhp  reason: default package */
/* loaded from: classes5.dex */
final class cmhp {
    public final String a;
    public final int b;

    public cmhp(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static int a(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        if (String.valueOf(str).length() == 0) {
            new String("Ignoring unknown alignment: ");
            return -1;
        }
        return -1;
    }
}
