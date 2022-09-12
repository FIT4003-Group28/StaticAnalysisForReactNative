package defpackage;

import com.google.android.apps.maps.R;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: cxsq  reason: default package */
/* loaded from: classes5.dex */
public final class cxsq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;

    public cxsq(cxsp cxspVar) {
        this.a = cxspVar.a;
        this.b = cxspVar.b;
        this.c = cxspVar.c;
        this.d = cxspVar.d;
        this.e = cxspVar.e;
        this.f = cxspVar.f;
        this.g = cxspVar.g;
        this.h = cxspVar.h;
        this.i = cxspVar.i;
        this.j = cxspVar.j;
        this.k = cxspVar.k;
        this.l = cxspVar.l;
        this.n = cxspVar.m;
        this.o = cxspVar.n;
        this.p = cxspVar.o;
        this.m = cxspVar.p;
        this.q = cxspVar.q;
        this.r = cxspVar.r;
        this.s = cxspVar.s;
    }

    public static cxsp a() {
        cxsp cxspVar = new cxsp();
        cxspVar.a = R.color.google_white;
        cxspVar.b = R.color.google_white;
        cxspVar.e = R.color.google_grey900;
        cxspVar.f = R.color.google_grey700;
        cxspVar.g = R.color.google_white;
        cxspVar.h = R.color.google_grey800;
        cxspVar.i = R.color.google_black;
        cxspVar.j = R.color.google_grey700;
        cxspVar.k = R.color.google_white;
        cxspVar.p = R.color.google_grey700;
        cxspVar.c = R.color.google_grey100;
        cxspVar.d = R.color.google_white;
        cxspVar.l = R.color.google_grey300;
        cxspVar.m = R.color.google_grey600;
        cxspVar.n = R.color.google_black;
        cxspVar.o = R.color.google_grey700;
        cxspVar.q = R.color.google_blue600;
        cxspVar.r = R.color.google_white;
        cxspVar.s = R.color.google_blue50;
        return cxspVar;
    }

    public static cxsq b() {
        return a().a();
    }

    public static cxsq c() {
        cxsp cxspVar = new cxsp();
        cxspVar.a = R.color.google_grey900;
        cxspVar.b = R.color.google_grey900;
        cxspVar.e = R.color.google_grey200;
        cxspVar.f = R.color.google_grey500;
        cxspVar.g = R.color.color_surface_elevation_plus_two_dark;
        cxspVar.h = R.color.google_grey200;
        cxspVar.j = R.color.google_grey500;
        cxspVar.i = R.color.google_grey200;
        cxspVar.k = R.color.google_grey900;
        cxspVar.p = R.color.google_grey300;
        cxspVar.c = R.color.google_grey900;
        cxspVar.d = R.color.google_grey900;
        cxspVar.l = R.color.google_grey700;
        cxspVar.m = R.color.google_grey500;
        cxspVar.n = R.color.google_grey500;
        cxspVar.o = R.color.google_grey500;
        cxspVar.q = R.color.google_blue300;
        cxspVar.r = R.color.google_grey900;
        cxspVar.s = R.color.google_dark_default_color_secondary;
        return cxspVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxsq) {
            cxsq cxsqVar = (cxsq) obj;
            if (this.a == cxsqVar.a && this.b == cxsqVar.b && this.c == cxsqVar.c && this.d == cxsqVar.d && this.e == cxsqVar.e && this.f == cxsqVar.f && this.g == cxsqVar.g && this.h == cxsqVar.h && this.i == cxsqVar.i && this.j == cxsqVar.j && this.k == cxsqVar.k && this.l == cxsqVar.l && this.m == cxsqVar.m && this.n == cxsqVar.n && this.o == cxsqVar.o && this.p == cxsqVar.p && this.q == cxsqVar.q && this.r == cxsqVar.r && this.s == cxsqVar.s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s));
    }
}
