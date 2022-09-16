package defpackage;
/* compiled from: PG */
/* renamed from: amoy  reason: default package */
/* loaded from: classes.dex */
public abstract class amoy implements ampt {
    public static String d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    public static void f(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                charSequence.charAt(0);
            } else if (length == 2) {
                new amou(charSequence.charAt(0), charSequence.charAt(1));
            } else {
                new amop(charSequence);
            }
        }
    }

    public static void g(char c, char c2) {
        new amos(c, c2);
    }

    @Override // defpackage.ampt
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);

    public final int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        aqxo.H(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (b(charSequence.charAt(length)));
        return false;
    }
}
