package defpackage;

import android.util.SparseArray;
/* compiled from: PG */
/* renamed from: dab  reason: default package */
/* loaded from: classes3.dex */
public final class dab {
    public CharSequence a;
    public Object b;
    public SparseArray c;
    public daq h;
    public daq i;
    public daq j;
    public daq k;
    public daq l;
    public String m;
    public daq n;
    public int t;
    public boolean d = true;
    public float e = 1.0f;
    public float f = 1.0f;
    public float g = 0.0f;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;

    public final void A(dab dabVar) {
        if ((this.t & 8) != 0) {
            dabVar.d(this.h);
        }
        if ((this.t & 16) != 0) {
            dabVar.l(this.j);
        }
        if ((this.t & 131072) != 0) {
            dabVar.j(this.i);
        }
        if ((this.t & 32) != 0) {
            dabVar.p(this.k);
        }
        if ((this.t & 134217728) != 0) {
            dabVar.h(this.l);
        }
        if ((this.t & 262144) != 0) {
            dabVar.t |= 262144;
        }
        if ((this.t & 4194304) != 0) {
            dabVar.b(this.m);
        }
        if ((this.t & 16777216) != 0) {
            dabVar.t |= 16777216;
        }
        if ((this.t & 64) != 0) {
            dabVar.t |= 64;
        }
        if ((this.t & 128) != 0) {
            dabVar.t |= 128;
        }
        if ((this.t & 256) != 0) {
            dabVar.m(this.n);
        }
        if ((this.t & 512) != 0) {
            dabVar.t |= 512;
        }
        if ((this.t & 1024) != 0) {
            dabVar.t |= 1024;
        }
        if ((this.t & 2048) != 0) {
            dabVar.t |= 2048;
        }
        if ((this.t & 4096) != 0) {
            dabVar.t |= 4096;
        }
        if ((this.t & 8192) != 0) {
            dabVar.t |= 8192;
        }
        boolean z = true;
        if ((this.t & 1) != 0) {
            dabVar.g(this.a);
        }
        if ((this.t & 16384) != 0) {
            dabVar.t |= 16384;
        }
        if ((this.t & 32768) != 0) {
            dabVar.t |= 32768;
        }
        if ((this.t & 65536) != 0) {
            dabVar.t |= 65536;
        }
        if ((this.t & 8388608) != 0) {
            dabVar.f(this.d);
        }
        Object obj = this.b;
        if (obj != null) {
            dabVar.q(obj);
        }
        SparseArray sparseArray = this.c;
        if (sparseArray != null) {
            dabVar.r(sparseArray);
        }
        int i = this.o;
        if (i != 0) {
            dabVar.k(i == 1);
        }
        int i2 = this.p;
        if (i2 != 0) {
            dabVar.e(i2 == 1);
        }
        int i3 = this.q;
        if (i3 != 0) {
            dabVar.i(i3 == 1);
        }
        int i4 = this.r;
        if (i4 != 0) {
            if (i4 == 1) {
                dabVar.r = 1;
            } else {
                dabVar.r = 2;
            }
        }
        int i5 = this.s;
        if (i5 != 0) {
            if (i5 != 1) {
                z = false;
            }
            dabVar.a(z);
        }
        if ((this.t & 524288) != 0) {
            dabVar.o(this.e);
        }
        if ((this.t & 1048576) != 0) {
            dabVar.c(this.f);
        }
        if ((this.t & 2097152) != 0) {
            dabVar.n(this.g);
        }
        if ((this.t & 33554432) != 0) {
            dabVar.t |= 33554432;
        }
        if ((this.t & 67108864) != 0) {
            dabVar.t |= 67108864;
        }
    }

    public final void a(boolean z) {
        this.s = z ? 1 : 2;
    }

    public final void b(String str) {
        this.t |= 4194304;
        this.m = str;
    }

    public final void c(float f) {
        this.f = f;
        this.t = f == 1.0f ? this.t & (-1048577) : this.t | 1048576;
    }

    public final void d(daq daqVar) {
        this.t |= 8;
        this.h = daqVar;
    }

    public final void e(boolean z) {
        this.p = z ? 1 : 2;
    }

    public final void f(boolean z) {
        this.t |= 8388608;
        this.d = z;
    }

    public final void g(CharSequence charSequence) {
        this.t |= 1;
        this.a = charSequence;
    }

    public final void h(daq daqVar) {
        this.t |= 134217728;
        this.l = daqVar;
    }

    public final void i(boolean z) {
        this.q = z ? 1 : 2;
    }

    public final void j(daq daqVar) {
        this.t |= 131072;
        this.i = daqVar;
    }

    public final void k(boolean z) {
        this.o = z ? 1 : 2;
    }

    public final void l(daq daqVar) {
        this.t |= 16;
        this.j = daqVar;
    }

    public final void m(daq daqVar) {
        this.t |= 256;
        this.n = daqVar;
    }

    public final void n(float f) {
        this.g = f;
        this.t = f == 0.0f ? this.t & (-2097153) : this.t | 2097152;
    }

    public final void o(float f) {
        this.e = f;
        this.t = f == 1.0f ? this.t & (-524289) : this.t | 524288;
    }

    public final void p(daq daqVar) {
        this.t |= 32;
        this.k = daqVar;
    }

    public final void q(Object obj) {
        this.t |= 2;
        this.b = obj;
    }

    public final void r(SparseArray sparseArray) {
        this.t |= 4;
        this.c = sparseArray;
    }

    public final boolean s() {
        return (this.h == null && this.j == null && this.k == null && this.l == null) ? false : true;
    }

    public final boolean t() {
        return (this.t & 1048576) != 0;
    }

    public final boolean u() {
        return (this.t & 8388608) != 0;
    }

    public final boolean v() {
        return (this.t & 2097152) != 0;
    }

    public final boolean w() {
        return (this.t & 33554432) != 0;
    }

    public final boolean x() {
        return (this.t & 67108864) != 0;
    }

    public final boolean y() {
        return (this.t & 524288) != 0;
    }

    public final boolean z() {
        return (this.n == null && this.m == null) ? false : true;
    }
}
