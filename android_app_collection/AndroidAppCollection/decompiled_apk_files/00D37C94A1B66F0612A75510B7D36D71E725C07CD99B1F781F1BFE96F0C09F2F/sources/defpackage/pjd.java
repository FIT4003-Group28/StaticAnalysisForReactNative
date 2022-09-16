package defpackage;
/* compiled from: PG */
/* renamed from: pjd  reason: default package */
/* loaded from: classes4.dex */
public final class pjd {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;

    public pjd() {
    }

    public pjd(pje pjeVar) {
        this.a = pjeVar.b;
        this.b = pjeVar.c;
        this.c = pjeVar.d;
        this.d = pjeVar.e;
        this.e = pjeVar.f;
        this.f = pjeVar.g;
        this.g = pjeVar.h;
        this.h = pjeVar.i;
        this.i = pjeVar.j;
        this.j = pjeVar.k;
        this.k = pjeVar.l;
        this.l = pjeVar.m;
        this.m = pjeVar.n;
        this.n = pjeVar.o;
        this.o = pjeVar.p;
        this.p = pjeVar.q;
        this.q = pjeVar.r;
        this.r = pjeVar.s;
    }

    public final pje a() {
        return new pje(this);
    }

    public final void b(byte[] bArr, int i) {
        if (this.f == null || pxi.M(Integer.valueOf(i), 3) || !pxi.M(this.g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i);
        }
    }
}
