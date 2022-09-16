package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: akhl  reason: default package */
/* loaded from: classes.dex */
public final class akhl implements Comparable {
    public static final /* synthetic */ int l = 0;
    private static final Pattern m = Pattern.compile("&nbsp;", 16);
    public final String a;
    public final String b;
    public final int c;
    public final int[] d;
    public final String e;
    public final int f;
    public final String g;
    public final Spanned h;
    public final List i;
    public final int j;
    public final int k;
    private final int n;

    public akhl(String str, int i, int[] iArr) {
        this(str, 0, i, iArr, null, 0, null, -1, null, null);
    }

    private static final String d(String str) {
        Spanned fromHtml;
        if (str == null || str.isEmpty()) {
            return str;
        }
        String replaceAll = m.matcher(str).replaceAll(" ");
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(replaceAll, 63);
        } else {
            fromHtml = Html.fromHtml(replaceAll);
        }
        return fromHtml.toString();
    }

    public final boolean a() {
        return this.k == 1;
    }

    public final boolean b() {
        return this.c == 35 && !TextUtils.isEmpty(this.e);
    }

    public final boolean c() {
        int[] iArr;
        for (int i : this.d) {
            if (i == 143 || i == 179) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        akhl akhlVar = (akhl) obj;
        if (akhlVar == null) {
            return 0;
        }
        return this.n - akhlVar.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akhl)) {
            return false;
        }
        akhl akhlVar = (akhl) obj;
        if (this.c == akhlVar.c) {
            return TextUtils.equals(this.a, akhlVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public akhl(String str, int i, int i2, int[] iArr, String str2, int i3, String str3, int i4, String str4, Spanned spanned) {
        str.getClass();
        this.b = str;
        this.c = i;
        this.k = i2;
        this.d = iArr == null ? new int[0] : iArr;
        this.e = str2;
        this.f = i3;
        this.g = str3;
        this.n = i4;
        this.h = spanned;
        if (i == 33) {
            String valueOf = String.valueOf(d(str4));
            str = valueOf.length() != 0 ? "… ".concat(valueOf) : new String("… ");
        }
        this.a = str;
        this.i = amuk.q();
        this.j = 1;
    }

    public akhl(String str, int i, int[] iArr, String str2, int i2, String str3, int i3, String str4, Spanned spanned, List list, int i4) {
        str.getClass();
        this.b = str;
        this.c = i;
        this.k = 2;
        this.d = iArr == null ? new int[0] : iArr;
        this.e = str2;
        this.f = i2;
        this.g = str3;
        this.n = i3;
        this.h = spanned;
        if (i == 33) {
            String valueOf = String.valueOf(d(str4));
            str = valueOf.length() != 0 ? "… ".concat(valueOf) : new String("… ");
        }
        this.a = str;
        this.i = list == null ? amuk.q() : list;
        this.j = i4;
    }
}
