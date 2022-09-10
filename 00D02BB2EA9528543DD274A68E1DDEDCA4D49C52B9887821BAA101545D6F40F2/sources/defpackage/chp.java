package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.ar.core.ImageMetadata;
import defpackage.chp;
import java.util.Map;
/* compiled from: PG */
/* renamed from: chp  reason: default package */
/* loaded from: classes.dex */
public class chp<T extends chp<T>> implements Cloneable {
    private Drawable a;
    private int b;
    public int c;
    public Drawable g;
    public int h;
    public boolean m;
    public boolean s;
    private Drawable t;
    private int u;
    private boolean v;
    private Resources.Theme w;
    private boolean x;
    private boolean y;
    private boolean z;
    public float d = 1.0f;
    public bwe e = bwe.c;
    public bro f = bro.NORMAL;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public btw l = cix.b;
    public boolean n = true;
    public bua o = new bua();
    public Map<Class<?>, bue<?>> p = new cjc();
    public Class<?> q = Object.class;
    public boolean r = true;

    private final void a() {
        if (!this.v) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public static boolean l(int i, int i2) {
        return (i & i2) != 0;
    }

    public final T A(cdi cdiVar, bue<Bitmap> bueVar, boolean z) {
        T x;
        if (z) {
            x = y(cdiVar, bueVar);
        } else {
            x = x(cdiVar, bueVar);
        }
        x.r = true;
        return x;
    }

    public final T B(bue<Bitmap> bueVar) {
        return C(bueVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final T C(bue<Bitmap> bueVar, boolean z) {
        if (this.x) {
            return (T) clone().C(bueVar, z);
        }
        cdo cdoVar = new cdo(bueVar, z);
        D(Bitmap.class, bueVar, z);
        D(Drawable.class, cdoVar, z);
        D(BitmapDrawable.class, cdoVar, z);
        D(cfg.class, new cfj(bueVar), z);
        a();
        return this;
    }

    final <Y> T D(Class<Y> cls, bue<Y> bueVar, boolean z) {
        if (this.x) {
            return (T) clone().D(cls, bueVar, z);
        }
        cjn.b(cls);
        cjn.b(bueVar);
        this.p.put(cls, bueVar);
        int i = this.c;
        this.n = true;
        int i2 = i | 67584;
        this.c = i2;
        this.r = false;
        if (z) {
            this.c = i2 | 131072;
            this.m = true;
        }
        a();
        return this;
    }

    public final T F() {
        if (this.x) {
            return (T) clone().F();
        }
        this.s = true;
        this.c |= ImageMetadata.SHADING_MODE;
        a();
        return this;
    }

    public final void G() {
        this.v = true;
    }

    public T e(chp<?> chpVar) {
        if (this.x) {
            return (T) clone().e(chpVar);
        }
        if (l(chpVar.c, 2)) {
            this.d = chpVar.d;
        }
        if (l(chpVar.c, 262144)) {
            boolean z = chpVar.y;
            this.y = false;
        }
        if (l(chpVar.c, ImageMetadata.SHADING_MODE)) {
            this.s = chpVar.s;
        }
        if (l(chpVar.c, 4)) {
            this.e = chpVar.e;
        }
        if (l(chpVar.c, 8)) {
            this.f = chpVar.f;
        }
        if (l(chpVar.c, 16)) {
            Drawable drawable = chpVar.a;
            this.a = null;
            this.b = 0;
            this.c &= -33;
        }
        if (l(chpVar.c, 32)) {
            int i = chpVar.b;
            this.b = 0;
            this.a = null;
            this.c &= -17;
        }
        if (l(chpVar.c, 64)) {
            this.g = chpVar.g;
            this.h = 0;
            this.c &= -129;
        }
        if (l(chpVar.c, 128)) {
            this.h = chpVar.h;
            this.g = null;
            this.c &= -65;
        }
        if (l(chpVar.c, 256)) {
            this.i = chpVar.i;
        }
        if (l(chpVar.c, 512)) {
            this.k = chpVar.k;
            this.j = chpVar.j;
        }
        if (l(chpVar.c, 1024)) {
            this.l = chpVar.l;
        }
        if (l(chpVar.c, 4096)) {
            this.q = chpVar.q;
        }
        if (l(chpVar.c, 8192)) {
            Drawable drawable2 = chpVar.t;
            this.t = null;
            this.u = 0;
            this.c &= -16385;
        }
        if (l(chpVar.c, 16384)) {
            int i2 = chpVar.u;
            this.u = 0;
            this.t = null;
            this.c &= -8193;
        }
        if (l(chpVar.c, 32768)) {
            Resources.Theme theme = chpVar.w;
            this.w = null;
        }
        if (l(chpVar.c, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE)) {
            this.n = chpVar.n;
        }
        if (l(chpVar.c, 131072)) {
            this.m = chpVar.m;
        }
        if (l(chpVar.c, 2048)) {
            this.p.putAll(chpVar.p);
            this.r = chpVar.r;
        }
        if (l(chpVar.c, ImageMetadata.LENS_APERTURE)) {
            boolean z2 = chpVar.z;
            this.z = false;
        }
        if (!this.n) {
            this.p.clear();
            int i3 = this.c;
            this.m = false;
            this.c = i3 & (-133121);
            this.r = true;
        }
        this.c |= chpVar.c;
        this.o.b(chpVar.o);
        a();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof chp) {
            chp chpVar = (chp) obj;
            if (Float.compare(chpVar.d, this.d) == 0) {
                int i = chpVar.b;
                Drawable drawable = chpVar.a;
                if (cjp.j(null, null) && this.h == chpVar.h && cjp.j(this.g, chpVar.g)) {
                    int i2 = chpVar.u;
                    Drawable drawable2 = chpVar.t;
                    if (cjp.j(null, null) && this.i == chpVar.i && this.j == chpVar.j && this.k == chpVar.k && this.m == chpVar.m && this.n == chpVar.n) {
                        boolean z = chpVar.y;
                        boolean z2 = chpVar.z;
                        if (this.e.equals(chpVar.e) && this.f == chpVar.f && this.o.equals(chpVar.o) && this.p.equals(chpVar.p) && this.q.equals(chpVar.q) && cjp.j(this.l, chpVar.l)) {
                            Resources.Theme theme = chpVar.w;
                            if (cjp.j(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // 
    /* renamed from: f */
    public T clone() {
        try {
            T t = (T) super.clone();
            bua buaVar = new bua();
            t.o = buaVar;
            buaVar.b(this.o);
            cjc cjcVar = new cjc();
            t.p = cjcVar;
            cjcVar.putAll(this.p);
            t.v = false;
            t.x = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        int l = cjp.l(null, cjp.k(0, cjp.k(Float.floatToIntBits(this.d), 17)));
        int l2 = cjp.l(null, cjp.k(0, cjp.l(this.g, cjp.k(this.h, l))));
        boolean z = this.i;
        int i = this.j;
        int i2 = this.k;
        boolean z2 = this.m;
        boolean z3 = this.n;
        return cjp.l(null, cjp.l(this.l, cjp.l(this.q, cjp.l(this.p, cjp.l(this.o, cjp.l(this.f, cjp.l(this.e, cjp.k(0, cjp.k(0, cjp.k(z3 ? 1 : 0, cjp.k(z2 ? 1 : 0, cjp.k(i2, cjp.k(i, cjp.k(z ? 1 : 0, l2))))))))))))));
    }

    public final T m(bwe bweVar) {
        if (this.x) {
            return (T) clone().m(bweVar);
        }
        cjn.b(bweVar);
        this.e = bweVar;
        this.c |= 4;
        a();
        return this;
    }

    public final T n(bro broVar) {
        if (this.x) {
            return (T) clone().n(broVar);
        }
        cjn.b(broVar);
        this.f = broVar;
        this.c |= 8;
        a();
        return this;
    }

    public final T o(Drawable drawable) {
        if (this.x) {
            return (T) clone().o(drawable);
        }
        this.g = drawable;
        int i = this.c;
        this.h = 0;
        this.c = (i | 64) & (-129);
        a();
        return this;
    }

    public final T p(int i) {
        if (this.x) {
            return (T) clone().p(i);
        }
        this.h = i;
        int i2 = this.c;
        this.g = null;
        this.c = (i2 | 128) & (-65);
        a();
        return this;
    }

    public final T q(boolean z) {
        if (this.x) {
            return (T) clone().q(true);
        }
        this.i = !z;
        this.c |= 256;
        a();
        return this;
    }

    public final T r(int i, int i2) {
        if (this.x) {
            return (T) clone().r(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.c |= 512;
        a();
        return this;
    }

    public final T s(btw btwVar) {
        if (this.x) {
            return (T) clone().s(btwVar);
        }
        cjn.b(btwVar);
        this.l = btwVar;
        this.c |= 1024;
        a();
        return this;
    }

    public final <Y> T t(btz<Y> btzVar, Y y) {
        if (this.x) {
            return (T) clone().t(btzVar, y);
        }
        cjn.b(btzVar);
        cjn.b(y);
        this.o.d(btzVar, y);
        a();
        return this;
    }

    public final T u(Class<?> cls) {
        if (this.x) {
            return (T) clone().u(cls);
        }
        cjn.b(cls);
        this.q = cls;
        this.c |= 4096;
        a();
        return this;
    }

    public final T v(cdi cdiVar) {
        btz btzVar = cdi.g;
        cjn.b(cdiVar);
        return t(btzVar, cdiVar);
    }

    public final T w() {
        return z(cdi.c, new ccv());
    }

    public final T x(cdi cdiVar, bue<Bitmap> bueVar) {
        if (this.x) {
            return (T) clone().x(cdiVar, bueVar);
        }
        v(cdiVar);
        return C(bueVar, false);
    }

    public final T y(cdi cdiVar, bue<Bitmap> bueVar) {
        if (this.x) {
            return (T) clone().y(cdiVar, bueVar);
        }
        v(cdiVar);
        return B(bueVar);
    }

    public final T z(cdi cdiVar, bue<Bitmap> bueVar) {
        return A(cdiVar, bueVar, false);
    }

    public final T E() {
        if (!this.v || this.x) {
            this.x = true;
            G();
            return this;
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }
}
