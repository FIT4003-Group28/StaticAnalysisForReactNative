package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bajn  reason: default package */
/* loaded from: classes2.dex */
public final class bajn extends bajr {
    final bahn a;
    final baht b;
    final bahv c;
    final boolean d;
    final bahv e;
    final bahv f;

    public bajn(bahn bahnVar, baht bahtVar, bahv bahvVar, bahv bahvVar2, bahv bahvVar3) {
        super(bahnVar.o());
        if (bahnVar.t()) {
            this.a = bahnVar;
            this.b = bahtVar;
            this.c = bahvVar;
            this.d = bajp.P(bahvVar);
            this.e = bahvVar2;
            this.f = bahvVar3;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int v(long j) {
        int a = this.b.a(j);
        long j2 = a;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return a;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        return this.a.a(this.b.d(j));
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.bahn
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long e(long j, int i) {
        if (this.d) {
            long v = v(j);
            return this.a.e(j + v, i) - v;
        }
        return this.b.n(this.a.e(this.b.d(j), i), j);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long f(long j) {
        return this.a.f(this.b.d(j));
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long g(long j) {
        if (this.d) {
            long v = v(j);
            return this.a.g(j + v) - v;
        }
        return this.b.n(this.a.g(this.b.d(j)), j);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long h(long j, int i) {
        long h = this.a.h(this.b.d(j), i);
        long n = this.b.n(h, j);
        if (a(n) == i) {
            return n;
        }
        bahz bahzVar = new bahz(h, this.b.c);
        bahy bahyVar = new bahy(this.a.o(), Integer.valueOf(i), bahzVar.getMessage());
        bahyVar.initCause(bahzVar);
        throw bahyVar;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long i(long j, String str, Locale locale) {
        return this.b.n(this.a.i(this.b.d(j), str, locale), j);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String j(int i, Locale locale) {
        return this.a.j(i, locale);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String k(long j, Locale locale) {
        return this.a.k(this.b.d(j), locale);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String l(int i, Locale locale) {
        return this.a.l(i, locale);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String m(long j, Locale locale) {
        return this.a.m(this.b.d(j), locale);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv p() {
        return this.c;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv q() {
        return this.f;
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return this.e;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final boolean s(long j) {
        return this.a.s(this.b.d(j));
    }
}
