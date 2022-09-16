package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: pje  reason: default package */
/* loaded from: classes4.dex */
public final class pje {
    public static final pje a = new pjd().a();
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final byte[] g;
    public final Integer h;
    public final Integer i;
    public final Integer j;
    public final Integer k;
    public final Integer l;
    public final Integer m;
    public final Integer n;
    public final Integer o;
    public final Integer p;
    public final CharSequence q;
    public final CharSequence r;
    public final CharSequence s;

    public pje(pjd pjdVar) {
        this.b = pjdVar.a;
        this.c = pjdVar.b;
        this.d = pjdVar.c;
        this.e = pjdVar.d;
        this.f = pjdVar.e;
        this.g = pjdVar.f;
        this.h = pjdVar.g;
        this.i = pjdVar.h;
        this.j = pjdVar.i;
        this.k = pjdVar.j;
        this.l = pjdVar.k;
        this.m = pjdVar.l;
        this.n = pjdVar.m;
        this.o = pjdVar.n;
        this.p = pjdVar.o;
        this.q = pjdVar.p;
        this.r = pjdVar.q;
        this.s = pjdVar.r;
    }

    public final pjd a() {
        return new pjd(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pje pjeVar = (pje) obj;
            if (pxi.M(this.b, pjeVar.b) && pxi.M(this.c, pjeVar.c) && pxi.M(this.d, pjeVar.d) && pxi.M(this.e, pjeVar.e) && pxi.M(null, null) && pxi.M(null, null) && pxi.M(this.f, pjeVar.f) && pxi.M(null, null) && pxi.M(null, null) && pxi.M(null, null) && Arrays.equals(this.g, pjeVar.g) && pxi.M(this.h, pjeVar.h) && pxi.M(null, null) && pxi.M(this.i, pjeVar.i) && pxi.M(this.j, pjeVar.j) && pxi.M(null, null) && pxi.M(null, null) && pxi.M(this.k, pjeVar.k) && pxi.M(this.l, pjeVar.l) && pxi.M(this.m, pjeVar.m) && pxi.M(this.n, pjeVar.n) && pxi.M(this.o, pjeVar.o) && pxi.M(this.p, pjeVar.p) && pxi.M(this.q, pjeVar.q) && pxi.M(this.r, pjeVar.r) && pxi.M(this.s, pjeVar.s) && pxi.M(null, null) && pxi.M(null, null) && pxi.M(null, null) && pxi.M(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, null, null, this.f, null, null, null, Integer.valueOf(Arrays.hashCode(this.g)), this.h, null, this.i, this.j, null, null, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, null, null, null, null});
    }
}
