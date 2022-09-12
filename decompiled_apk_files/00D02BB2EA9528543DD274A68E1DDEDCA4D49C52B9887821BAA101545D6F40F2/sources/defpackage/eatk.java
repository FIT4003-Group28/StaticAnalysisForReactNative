package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: eatk  reason: default package */
/* loaded from: classes6.dex */
public final class eatk extends eaon implements Serializable {
    private static HashMap<eaop, eatk> a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final eaop b;
    private final eaox c;

    private eatk(eaop eaopVar, eaox eaoxVar) {
        if (eaoxVar != null) {
            this.b = eaopVar;
            this.c = eaoxVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static synchronized eatk K(eaop eaopVar, eaox eaoxVar) {
        synchronized (eatk.class) {
            HashMap<eaop, eatk> hashMap = a;
            eatk eatkVar = null;
            if (hashMap == null) {
                a = new HashMap<>(7);
            } else {
                eatk eatkVar2 = hashMap.get(eaopVar);
                if (eatkVar2 == null || eatkVar2.c == eaoxVar) {
                    eatkVar = eatkVar2;
                }
            }
            if (eatkVar == null) {
                eatk eatkVar3 = new eatk(eaopVar, eaoxVar);
                a.put(eaopVar, eatkVar3);
                return eatkVar3;
            }
            return eatkVar;
        }
    }

    private final UnsupportedOperationException L() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append(valueOf);
        sb.append(" field is unsupported");
        return new UnsupportedOperationException(sb.toString());
    }

    private Object readResolve() {
        return K(this.b, this.c);
    }

    @Override // defpackage.eaon
    public final int A() {
        throw L();
    }

    @Override // defpackage.eaon
    public final int B(long j) {
        throw L();
    }

    @Override // defpackage.eaon
    public final int C(eapt eaptVar) {
        throw L();
    }

    @Override // defpackage.eaon
    public final int D(eapt eaptVar, int[] iArr) {
        throw L();
    }

    @Override // defpackage.eaon
    public final int E(Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final long F(long j) {
        throw L();
    }

    @Override // defpackage.eaon
    public final long G(long j) {
        throw L();
    }

    @Override // defpackage.eaon
    public final long H(long j) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String I(eapt eaptVar, int i) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String J(eapt eaptVar, int i) {
        throw L();
    }

    @Override // defpackage.eaon
    public final eaop a() {
        return this.b;
    }

    @Override // defpackage.eaon
    public final String b() {
        return this.b.z;
    }

    @Override // defpackage.eaon
    public final boolean c() {
        return false;
    }

    @Override // defpackage.eaon
    public final int d(long j) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String e(long j, Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String f(eapt eaptVar, Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String g(int i, Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String h(long j, Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String i(eapt eaptVar, Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final String j(int i, Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final long k(long j, int i) {
        return this.c.e(j, i);
    }

    @Override // defpackage.eaon
    public final long l(long j, long j2) {
        return this.c.f(j, j2);
    }

    @Override // defpackage.eaon
    public final int[] m(eapt eaptVar, int i, int[] iArr, int i2) {
        throw L();
    }

    @Override // defpackage.eaon
    public final int n(long j, long j2) {
        return this.c.h(j, j2);
    }

    @Override // defpackage.eaon
    public final long o(long j, long j2) {
        return this.c.i(j, j2);
    }

    @Override // defpackage.eaon
    public final long p(long j, int i) {
        throw L();
    }

    @Override // defpackage.eaon
    public final int[] q(eapt eaptVar, int i, int[] iArr, int i2) {
        throw L();
    }

    @Override // defpackage.eaon
    public final long r(long j, String str, Locale locale) {
        throw L();
    }

    @Override // defpackage.eaon
    public final eaox s() {
        return this.c;
    }

    @Override // defpackage.eaon
    public final eaox t() {
        return null;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.eaon
    public final boolean u(long j) {
        throw L();
    }

    @Override // defpackage.eaon
    public final eaox v() {
        return null;
    }

    @Override // defpackage.eaon
    public final int w() {
        throw L();
    }

    @Override // defpackage.eaon
    public final int x(long j) {
        throw L();
    }

    @Override // defpackage.eaon
    public final int y(eapt eaptVar) {
        throw L();
    }

    @Override // defpackage.eaon
    public final int z(eapt eaptVar, int[] iArr) {
        throw L();
    }
}
