package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: amfh  reason: default package */
/* loaded from: classes.dex */
public final class amfh {
    public static final int[] a = new int[0];
    public final String b;
    public final String[] c;
    public final float d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public boolean k = true;

    public amfh(String[] strArr, @dzsi String str, float f, int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.c = (String[]) dbsk.s(strArr);
        this.b = dbsj.e(str);
        this.d = f;
        this.e = i;
        this.j = i2;
        this.f = iArr;
        this.g = iArr2;
        this.h = iArr3;
        this.i = iArr4;
    }

    public static int[] b(String str) {
        String[] split = str.split(",");
        int length = split.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            try {
                long parseLong = Long.parseLong(split[i], 16);
                if (parseLong > 2147483647L) {
                    parseLong -= 4294967296L;
                }
                iArr[i] = (int) decn.d(parseLong, -2147483648L, 2147483647L);
            } catch (NumberFormatException unused) {
                iArr[i] = 0;
            }
        }
        return iArr;
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof amfh)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        amfh amfhVar = (amfh) obj;
        return dbsd.a(this.b, amfhVar.b) && Arrays.equals(this.c, amfhVar.c) && Float.compare(this.d, amfhVar.d) == 0 && this.e == amfhVar.e && Arrays.equals(this.f, amfhVar.f) && Arrays.equals(this.g, amfhVar.g) && this.k == amfhVar.k && this.j == amfhVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.c)), Float.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Boolean.valueOf(this.k)});
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("text", this.b);
        b.b("assetNames", Arrays.toString(this.c));
        b.e("fontSize", this.d);
        b.f("textColor", this.e);
        b.b("highlightColors", Arrays.toString(this.f));
        b.b("filterColors", Arrays.toString(this.g));
        b.f("textAttributes", this.j);
        return b.toString();
    }

    @dzsi
    public static URL a(String str) {
        int lastIndexOf;
        int indexOf = str.indexOf(61);
        try {
            if (str.contains("?") || indexOf == -1 || (lastIndexOf = str.lastIndexOf(47, indexOf)) == -1) {
                return new URL(str);
            }
            String substring = str.substring(0, lastIndexOf);
            String substring2 = str.substring(lastIndexOf + 1);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("?");
            sb.append(substring2);
            return new URL(sb.toString());
        } catch (MalformedURLException unused) {
            return null;
        }
    }
}
