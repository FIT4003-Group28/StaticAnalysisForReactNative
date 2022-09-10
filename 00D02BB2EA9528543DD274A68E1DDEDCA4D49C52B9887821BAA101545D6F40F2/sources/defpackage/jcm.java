package defpackage;

import android.animation.TimeInterpolator;
import android.view.ViewTreeObserver;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: jcm  reason: default package */
/* loaded from: classes7.dex */
public final class jcm {
    public static final jcm a = new jcm(new jcl());
    public static final cqis<ViewTreeObserver.OnPreDrawListener> b = cqis.a();
    private static final cqkv q = new jcn();
    public final cqtv c;
    public final cqtv d;
    public final cqtv e;
    public final cqtv f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final TimeInterpolator m;
    public final int n;
    public final int o;
    public final boolean p;

    public jcm() {
        this(new jcl());
    }

    public static <T extends cqkp> cqnf<T> a(@dzsi jcm jcmVar) {
        return cqjv.i(iug.ANIMATION, jcmVar, q);
    }

    public static <T extends cqkp> cqnf<T> b(cqjb<T, jcm> cqjbVar) {
        return cqjv.e(iug.ANIMATION, cqjbVar, q);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof jcm)) {
            return false;
        }
        jcm jcmVar = (jcm) obj;
        if (this.c.equals(jcmVar.c) && this.d.equals(jcmVar.d) && this.e.equals(jcmVar.e) && this.f.equals(jcmVar.f) && this.g == jcmVar.g && this.h == jcmVar.h && this.i == jcmVar.i && this.j == jcmVar.j) {
            float f = jcmVar.k;
            float f2 = jcmVar.l;
            if (dbsd.a(this.m, jcmVar.m) && this.n == jcmVar.n && this.o == jcmVar.o) {
                boolean z = jcmVar.p;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Float valueOf = Float.valueOf(0.0f);
        return Arrays.hashCode(new Object[]{this.c, this.d, this.e, this.f, Float.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.j), valueOf, valueOf, this.m, Integer.valueOf(this.n), Integer.valueOf(this.o), false});
    }

    public jcm(jcl jclVar) {
        this.c = jclVar.a;
        this.d = jclVar.b;
        this.e = jclVar.c;
        this.f = jclVar.d;
        this.g = jclVar.e;
        this.h = jclVar.f;
        this.i = jclVar.g;
        this.j = jclVar.h;
        float f = jclVar.i;
        this.k = 0.0f;
        float f2 = jclVar.j;
        this.l = 0.0f;
        this.m = jclVar.k;
        this.n = jclVar.l;
        this.o = jclVar.m;
        boolean z = jclVar.n;
        this.p = false;
    }
}
