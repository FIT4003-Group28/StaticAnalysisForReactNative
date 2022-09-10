package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: jib  reason: default package */
/* loaded from: classes7.dex */
public final class jib {
    public static final cqss a = irg.a();
    @dzsi
    public final jia A;
    public final boolean B;
    public final boolean C;
    @dzsi
    public final View.OnClickListener D;
    @dzsi
    public final View.OnClickListener E;
    @dzsi
    public final CharSequence F;
    @dzsi
    public final View.OnClickListener G;
    @dzsi
    public final CharSequence H;
    public final int I;
    public final int J;
    @dzsi
    public final CharSequence b;
    @dzsi
    public final jic c;
    @dzsi
    public final cqtd d;
    @dzsi
    public final cqtd e;
    @dzsi
    public final cqss f;
    @dzsi
    public final cqss g;
    public final boolean h;
    @dzsi
    public final cqtd i;
    @dzsi
    public final cqsn j;
    @dzsi
    public final cjtd k;
    @dzsi
    public final cjtd l;
    @dzsi
    public final cqss m;
    public final List<jho> n;
    public final Integer o;
    public final Integer p;
    public final Integer q;
    public final int r;
    public final int s;
    public final boolean t;
    @dzsi
    public final CharSequence u;
    @dzsi
    public final Integer v;
    @dzsi
    public final cqss w;
    public final int x;
    public final int y;
    @dzsi
    public final cqss z;

    public jib() {
        this.u = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = null;
        this.A = null;
        this.G = null;
        this.H = null;
        this.D = null;
        this.E = null;
        this.F = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.y = -1;
        this.x = 255;
        this.v = null;
        this.w = null;
        this.z = null;
        this.B = false;
        this.C = false;
        this.n = dcdc.e();
        this.s = 1;
        this.t = false;
        this.o = 1;
        this.p = 1;
        this.q = 1;
        this.r = 0;
        this.I = 0;
        this.J = 0;
    }

    @Deprecated
    public static jib f(final Activity activity, CharSequence charSequence) {
        jhz jhzVar = new jhz();
        jhzVar.a = charSequence;
        jhzVar.f(new View.OnClickListener(activity) { // from class: jhw
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = this.a;
                cqss cqssVar = jib.a;
                activity2.onBackPressed();
            }
        });
        return jhzVar.b();
    }

    public static jib g(final Activity activity, CharSequence charSequence) {
        jhz a2 = jhz.a();
        a2.f(new View.OnClickListener(activity) { // from class: jhx
            private final Activity a;

            {
                this.a = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Activity activity2 = this.a;
                cqss cqssVar = jib.a;
                activity2.onBackPressed();
            }
        });
        a2.a = charSequence;
        return a2.b();
    }

    private static boolean h(@dzsi CharSequence charSequence, @dzsi CharSequence charSequence2) {
        String str = null;
        String charSequence3 = charSequence == null ? null : charSequence.toString();
        if (charSequence2 != null) {
            str = charSequence2.toString();
        }
        return dbsd.a(charSequence3, str);
    }

    public final int a(Context context) {
        return this.f.b(context);
    }

    public final Boolean b() {
        return Boolean.valueOf(this.t);
    }

    public final int c(Context context) {
        int b = this.m.b(context);
        return (((Color.alpha(b) * d()) / 255) << 24) | (16777215 & b);
    }

    public final int d() {
        int i = this.y;
        return i != -1 ? i : this.x;
    }

    public final jhz e() {
        return new jhz(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jib jibVar = (jib) obj;
            if (this.h == jibVar.h && this.s == jibVar.s && this.t == jibVar.t && this.x == jibVar.x && this.y == jibVar.y && this.C == jibVar.C && h(this.u, jibVar.u) && h(this.b, jibVar.b) && dbsd.a(this.c, jibVar.c) && dbsd.a(this.d, jibVar.d) && dbsd.a(this.e, jibVar.e) && dbsd.a(this.f, jibVar.f) && dbsd.a(this.g, jibVar.g) && dbsd.a(this.i, jibVar.i) && dbsd.a(this.j, jibVar.j) && dbsd.a(this.k, jibVar.k) && dbsd.a(this.l, jibVar.l) && dbsd.a(this.m, jibVar.m) && dbsd.a(this.n, jibVar.n) && dbsd.a(this.o, jibVar.o) && dbsd.a(this.p, jibVar.p) && dbsd.a(this.q, jibVar.q) && this.r == jibVar.r && dbsd.a(this.v, jibVar.v) && dbsd.a(this.w, jibVar.w) && dbsd.a(this.z, jibVar.z) && dbsd.a(this.A, jibVar.A) && dbsd.a(this.D, jibVar.D) && dbsd.a(null, null) && h(this.F, jibVar.F) && dbsd.a(null, null) && h(this.H, jibVar.H) && this.I == jibVar.I && this.J == jibVar.J) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.u, this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Integer.valueOf(this.r), Integer.valueOf(this.s), Boolean.valueOf(this.t), Integer.valueOf(this.x), Integer.valueOf(this.y), this.v, this.w, this.z, this.A, Boolean.valueOf(this.C), this.D, null, this.F, null, this.H, Integer.valueOf(this.I), Integer.valueOf(this.J)});
    }

    public jib(jhz jhzVar) {
        this.u = jhzVar.a;
        this.b = jhzVar.b;
        this.c = jhzVar.c;
        this.d = jhzVar.d;
        this.e = jhzVar.e;
        this.f = jhzVar.f;
        this.g = jhzVar.g;
        this.h = jhzVar.h;
        this.i = jhzVar.i;
        this.j = jhzVar.j;
        this.A = jhzVar.k;
        this.G = null;
        this.H = jhzVar.l;
        this.D = jhzVar.m;
        this.E = null;
        this.F = jhzVar.n;
        this.k = jhzVar.o;
        this.l = jhzVar.p;
        this.m = jhzVar.q;
        this.y = jhzVar.r;
        this.x = jhzVar.s;
        this.v = jhzVar.t;
        this.w = jhzVar.u;
        this.z = jhzVar.v;
        this.B = jhzVar.w;
        this.C = jhzVar.x;
        this.n = dcdc.r(jhzVar.y);
        this.s = jhzVar.z;
        this.t = jhzVar.A;
        this.o = Integer.valueOf(jhzVar.B);
        this.p = Integer.valueOf(jhzVar.C);
        this.q = Integer.valueOf(jhzVar.D);
        this.r = jhzVar.E;
        this.I = jhzVar.F;
        this.J = jhzVar.G;
    }
}
