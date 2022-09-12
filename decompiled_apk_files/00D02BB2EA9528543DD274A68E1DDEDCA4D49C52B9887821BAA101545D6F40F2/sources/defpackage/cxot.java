package defpackage;

import android.net.Uri;
/* compiled from: PG */
/* renamed from: cxot  reason: default package */
/* loaded from: classes5.dex */
public final class cxot {
    public static final /* synthetic */ int a = 0;
    private static final cxos b;

    static {
        Uri.parse("https://lh3.googleusercontent.com");
        b = new cxos();
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        return b.a(str);
    }

    public static String b(String str, int i, int i2, int i3) {
        int i4 = cxor.a;
        String b2 = b.b(str, i, i2, i3);
        if (b2 != null) {
            return b2;
        }
        if (i2 == 0) {
            if (i3 == 0) {
                return str;
            }
            i2 = 0;
        }
        return cxou.a(i2, i3, str);
    }
}
