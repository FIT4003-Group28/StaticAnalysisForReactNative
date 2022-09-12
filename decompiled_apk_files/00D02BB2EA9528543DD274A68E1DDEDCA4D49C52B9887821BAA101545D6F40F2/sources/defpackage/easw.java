package defpackage;

import java.io.Serializable;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: easw  reason: default package */
/* loaded from: classes6.dex */
public class easw extends eaon implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;
    public final eaop a;
    private final eaon b;

    public easw(eaon eaonVar) {
        this(eaonVar, null);
    }

    @Override // defpackage.eaon
    public final int A() {
        return this.b.A();
    }

    @Override // defpackage.eaon
    public final int B(long j) {
        return this.b.B(j);
    }

    @Override // defpackage.eaon
    public final int C(eapt eaptVar) {
        return this.b.C(eaptVar);
    }

    @Override // defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        return this.b.D(eaptVar, iArr);
    }

    @Override // defpackage.eaon
    public final int E(Locale locale) {
        return this.b.E(locale);
    }

    @Override // defpackage.eaon
    public final long F(long j) {
        return this.b.F(j);
    }

    @Override // defpackage.eaon
    public final long G(long j) {
        return this.b.G(j);
    }

    @Override // defpackage.eaon
    public final long H(long j) {
        return this.b.H(j);
    }

    @Override // defpackage.eaon
    public final String I(eapt eaptVar, int i) {
        return this.b.I(eaptVar, i);
    }

    @Override // defpackage.eaon
    public final String J(eapt eaptVar, int i) {
        return this.b.J(eaptVar, i);
    }

    @Override // defpackage.eaon
    public final eaop a() {
        return this.a;
    }

    @Override // defpackage.eaon
    public final String b() {
        return this.a.z;
    }

    @Override // defpackage.eaon
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.eaon
    public int d(long j) {
        return this.b.d(j);
    }

    @Override // defpackage.eaon
    public final String e(long j, Locale locale) {
        return this.b.e(j, locale);
    }

    @Override // defpackage.eaon
    public final String f(eapt eaptVar, Locale locale) {
        return this.b.f(eaptVar, locale);
    }

    @Override // defpackage.eaon
    public final String g(int i, Locale locale) {
        return this.b.g(i, locale);
    }

    @Override // defpackage.eaon
    public final String h(long j, Locale locale) {
        return this.b.h(j, locale);
    }

    @Override // defpackage.eaon
    public final String i(eapt eaptVar, Locale locale) {
        return this.b.i(eaptVar, locale);
    }

    @Override // defpackage.eaon
    public final String j(int i, Locale locale) {
        return this.b.j(i, locale);
    }

    @Override // defpackage.eaon
    public final long k(long j, int i) {
        return this.b.k(j, i);
    }

    @Override // defpackage.eaon
    public final long l(long j, long j2) {
        return this.b.l(j, j2);
    }

    @Override // defpackage.eaon
    public final int[] m(eapt eaptVar, int i, int[] iArr, int i2) {
        return this.b.m(eaptVar, i, iArr, i2);
    }

    @Override // defpackage.eaon
    public final int n(long j, long j2) {
        return this.b.n(j, j2);
    }

    @Override // defpackage.eaon
    public final long o(long j, long j2) {
        return this.b.o(j, j2);
    }

    @Override // defpackage.eaon
    public long p(long j, int i) {
        return this.b.p(j, i);
    }

    @Override // defpackage.eaon
    public final int[] q(eapt eaptVar, int i, int[] iArr, int i2) {
        return this.b.q(eaptVar, i, iArr, i2);
    }

    @Override // defpackage.eaon
    public final long r(long j, String str, Locale locale) {
        return this.b.r(j, str, locale);
    }

    @Override // defpackage.eaon
    public final eaox s() {
        return this.b.s();
    }

    @Override // defpackage.eaon
    public final eaox t() {
        return this.b.t();
    }

    public final String toString() {
        String b = b();
        StringBuilder sb = new StringBuilder(b.length() + 15);
        sb.append("DateTimeField[");
        sb.append(b);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.eaon
    public final boolean u(long j) {
        return this.b.u(j);
    }

    @Override // defpackage.eaon
    public final eaox v() {
        return this.b.v();
    }

    @Override // defpackage.eaon
    public int w() {
        return this.b.w();
    }

    @Override // defpackage.eaon
    public final int x(long j) {
        return this.b.x(j);
    }

    @Override // defpackage.eaon
    public final int y(eapt eaptVar) {
        return this.b.y(eaptVar);
    }

    @Override // defpackage.eaon
    public final int z(eapt eaptVar, int[] iArr) {
        return this.b.z(eaptVar, iArr);
    }

    public easw(eaon eaonVar, eaop eaopVar) {
        if (eaonVar != null) {
            this.b = eaonVar;
            this.a = eaopVar == null ? eaonVar.a() : eaopVar;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }
}
