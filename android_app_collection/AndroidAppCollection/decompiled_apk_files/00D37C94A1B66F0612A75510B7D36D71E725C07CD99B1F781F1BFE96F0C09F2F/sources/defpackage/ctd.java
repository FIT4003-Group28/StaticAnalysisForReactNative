package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ctd  reason: default package */
/* loaded from: classes3.dex */
public class ctd implements Cloneable {
    public Drawable d;
    public int e;
    public Drawable f;
    public int g;
    public boolean l;
    public boolean p;
    public boolean r;
    private int s;
    private Drawable u;
    private int v;
    private boolean w;
    private Resources.Theme x;
    private boolean y;
    private boolean z;
    public float a = 1.0f;
    public ckb b = ckb.c;
    public cfv c = cfv.NORMAL;
    public boolean h = true;
    public int i = -1;
    public int j = -1;
    public chy k = cuo.b;
    private boolean t = true;
    public cic m = new cic();
    public Map n = new cut();
    public Class o = Object.class;
    public boolean q = true;

    private static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public ctd A(Drawable drawable) {
        if (this.p) {
            return clone().A(drawable);
        }
        this.f = drawable;
        int i = this.s;
        this.g = 0;
        this.s = (i | 64) & (-129);
        J();
        return this;
    }

    public ctd B(cfv cfvVar) {
        if (this.p) {
            return clone().B(cfvVar);
        }
        hy.N(cfvVar);
        this.c = cfvVar;
        this.s |= 8;
        J();
        return this;
    }

    public ctd C(cib cibVar, Object obj) {
        if (this.p) {
            return clone().C(cibVar, obj);
        }
        hy.N(cibVar);
        hy.N(obj);
        this.m.d(cibVar, obj);
        J();
        return this;
    }

    public ctd D(chy chyVar) {
        if (this.p) {
            return clone().D(chyVar);
        }
        hy.N(chyVar);
        this.k = chyVar;
        this.s |= 1024;
        J();
        return this;
    }

    public final boolean E(int i) {
        return a(this.s, i);
    }

    public final boolean F() {
        return cvd.o(this.j, this.i);
    }

    public final ctd G(cig cigVar) {
        if (this.p) {
            return clone().G(cigVar);
        }
        cpo cpoVar = new cpo(cigVar);
        H(Bitmap.class, cigVar);
        H(Drawable.class, cpoVar);
        H(BitmapDrawable.class, cpoVar);
        H(cqy.class, new crb(cigVar));
        J();
        return this;
    }

    final ctd H(Class cls, cig cigVar) {
        if (this.p) {
            return clone().H(cls, cigVar);
        }
        hy.N(cls);
        hy.N(cigVar);
        this.n.put(cls, cigVar);
        int i = this.s;
        this.t = true;
        this.q = false;
        this.s = i | 198656;
        this.l = true;
        J();
        return this;
    }

    public ctd I() {
        if (this.p) {
            return clone().I();
        }
        this.r = true;
        this.s |= 1048576;
        J();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J() {
        if (!this.w) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public ctd K() {
        if (this.p) {
            return clone().K();
        }
        this.h = false;
        this.s |= 256;
        J();
        return this;
    }

    public void L() {
        this.w = true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ctd) {
            ctd ctdVar = (ctd) obj;
            if (Float.compare(ctdVar.a, this.a) == 0 && this.e == ctdVar.e && cvd.l(this.d, ctdVar.d) && this.g == ctdVar.g && cvd.l(this.f, ctdVar.f)) {
                int i = ctdVar.v;
                Drawable drawable = ctdVar.u;
                if (cvd.l(null, null) && this.h == ctdVar.h && this.i == ctdVar.i && this.j == ctdVar.j && this.l == ctdVar.l && this.t == ctdVar.t) {
                    boolean z = ctdVar.y;
                    boolean z2 = ctdVar.z;
                    if (this.b.equals(ctdVar.b) && this.c == ctdVar.c && this.m.equals(ctdVar.m) && this.n.equals(ctdVar.n) && this.o.equals(ctdVar.o) && cvd.l(this.k, ctdVar.k)) {
                        Resources.Theme theme = ctdVar.x;
                        if (cvd.l(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int c = cvd.c(this.a);
        int e = cvd.e(this.d, cvd.d(this.e, c));
        int e2 = cvd.e(null, cvd.d(0, cvd.e(this.f, cvd.d(this.g, e))));
        boolean z = this.h;
        int i = this.i;
        int i2 = this.j;
        boolean z2 = this.l;
        boolean z3 = this.t;
        return cvd.e(null, cvd.e(this.k, cvd.e(this.o, cvd.e(this.n, cvd.e(this.m, cvd.e(this.c, cvd.e(this.b, cvd.d(0, cvd.d(0, cvd.d(z3 ? 1 : 0, cvd.d(z2 ? 1 : 0, cvd.d(i2, cvd.d(i, cvd.d(z ? 1 : 0, e2))))))))))))));
    }

    public ctd l(ctd ctdVar) {
        if (this.p) {
            return clone().l(ctdVar);
        }
        if (a(ctdVar.s, 2)) {
            this.a = ctdVar.a;
        }
        if (a(ctdVar.s, 262144)) {
            boolean z = ctdVar.y;
            this.y = false;
        }
        if (a(ctdVar.s, 1048576)) {
            this.r = ctdVar.r;
        }
        if (a(ctdVar.s, 4)) {
            this.b = ctdVar.b;
        }
        if (a(ctdVar.s, 8)) {
            this.c = ctdVar.c;
        }
        if (a(ctdVar.s, 16)) {
            this.d = ctdVar.d;
            this.e = 0;
            this.s &= -33;
        }
        if (a(ctdVar.s, 32)) {
            this.e = ctdVar.e;
            this.d = null;
            this.s &= -17;
        }
        if (a(ctdVar.s, 64)) {
            this.f = ctdVar.f;
            this.g = 0;
            this.s &= -129;
        }
        if (a(ctdVar.s, 128)) {
            this.g = ctdVar.g;
            this.f = null;
            this.s &= -65;
        }
        if (a(ctdVar.s, 256)) {
            this.h = ctdVar.h;
        }
        if (a(ctdVar.s, 512)) {
            this.j = ctdVar.j;
            this.i = ctdVar.i;
        }
        if (a(ctdVar.s, 1024)) {
            this.k = ctdVar.k;
        }
        if (a(ctdVar.s, 4096)) {
            this.o = ctdVar.o;
        }
        if (a(ctdVar.s, 8192)) {
            Drawable drawable = ctdVar.u;
            this.u = null;
            this.v = 0;
            this.s &= -16385;
        }
        if (a(ctdVar.s, 16384)) {
            int i = ctdVar.v;
            this.v = 0;
            this.u = null;
            this.s &= -8193;
        }
        if (a(ctdVar.s, 32768)) {
            Resources.Theme theme = ctdVar.x;
            this.x = null;
        }
        if (a(ctdVar.s, 65536)) {
            this.t = ctdVar.t;
        }
        if (a(ctdVar.s, 131072)) {
            this.l = ctdVar.l;
        }
        if (a(ctdVar.s, 2048)) {
            this.n.putAll(ctdVar.n);
            this.q = ctdVar.q;
        }
        if (a(ctdVar.s, 524288)) {
            boolean z2 = ctdVar.z;
            this.z = false;
        }
        if (!this.t) {
            this.n.clear();
            int i2 = this.s;
            this.l = false;
            this.s = i2 & (-133121);
            this.q = true;
        }
        this.s |= ctdVar.s;
        this.m.c(ctdVar.m);
        J();
        return this;
    }

    @Override // 
    /* renamed from: m */
    public ctd clone() {
        try {
            ctd ctdVar = (ctd) super.clone();
            cic cicVar = new cic();
            ctdVar.m = cicVar;
            cicVar.c(this.m);
            cut cutVar = new cut();
            ctdVar.n = cutVar;
            cutVar.putAll(this.n);
            ctdVar.w = false;
            ctdVar.p = false;
            return ctdVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public ctd r(Class cls) {
        if (this.p) {
            return clone().r(cls);
        }
        hy.N(cls);
        this.o = cls;
        this.s |= 4096;
        J();
        return this;
    }

    public ctd s(ckb ckbVar) {
        if (this.p) {
            return clone().s(ckbVar);
        }
        hy.N(ckbVar);
        this.b = ckbVar;
        this.s |= 4;
        J();
        return this;
    }

    public ctd t() {
        if (this.p) {
            return clone().t();
        }
        this.n.clear();
        int i = this.s;
        this.l = false;
        this.t = false;
        this.s = (i & (-133121)) | 65536;
        this.q = true;
        J();
        return this;
    }

    public ctd u(cpi cpiVar) {
        cib cibVar = cpi.f;
        hy.N(cpiVar);
        return C(cibVar, cpiVar);
    }

    public ctd v(int i) {
        if (this.p) {
            return clone().v(i);
        }
        this.e = i;
        int i2 = this.s;
        this.d = null;
        this.s = (i2 | 32) & (-17);
        J();
        return this;
    }

    public ctd w(Drawable drawable) {
        if (this.p) {
            return clone().w(drawable);
        }
        this.d = drawable;
        int i = this.s;
        this.e = 0;
        this.s = (i | 16) & (-33);
        J();
        return this;
    }

    public ctd x(chm chmVar) {
        hy.N(chmVar);
        return C(cpl.a, chmVar).C(crh.a, chmVar);
    }

    public ctd y(int i, int i2) {
        if (this.p) {
            return clone().y(i, i2);
        }
        this.j = i;
        this.i = i2;
        this.s |= 512;
        J();
        return this;
    }

    public ctd z(int i) {
        if (this.p) {
            return clone().z(i);
        }
        this.g = i;
        int i2 = this.s;
        this.f = null;
        this.s = (i2 | 128) & (-65);
        J();
        return this;
    }

    public ctd q() {
        if (!this.w || this.p) {
            this.p = true;
            L();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
}
