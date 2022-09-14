package defpackage;
/* compiled from: PG */
/* renamed from: eaqd  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqd implements eaps {
    /* JADX INFO: Access modifiers changed from: protected */
    public static final void n(long j, long j2) {
        if (j2 >= j) {
            return;
        }
        throw new IllegalArgumentException("The end instant must be greater or equal to the start");
    }

    @Override // defpackage.eaps
    public final eaol e() {
        return new eaol(d(), c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaps)) {
            return false;
        }
        eaps eapsVar = (eaps) obj;
        return d() == eapsVar.d() && f() == eapsVar.f() && easy.g(c(), eapsVar.c());
    }

    @Override // defpackage.eaps
    public final eaol g() {
        return new eaol(f(), c());
    }

    @Override // defpackage.eaps
    public final boolean h(eapr eaprVar) {
        if (eaprVar == null) {
            return i(eaor.a());
        }
        return i(eaprVar.Tf());
    }

    public final int hashCode() {
        long d = d();
        long f = f();
        return ((((((int) (d ^ (d >>> 32))) + 3007) * 31) + ((int) (f ^ (f >>> 32)))) * 31) + c().hashCode();
    }

    public final boolean i(long j) {
        return j >= d() && j < f();
    }

    public final boolean j(eaps eapsVar) {
        eaqi eaqiVar = (eaqi) eapsVar;
        return d() < eaqiVar.c && eaqiVar.b < f();
    }

    public final boolean k(long j) {
        return d() > j;
    }

    public final long l() {
        return easy.a(f(), -d());
    }

    public final eaow m() {
        long l = l();
        if (l == 0) {
            return eaow.a;
        }
        return new eaow(l);
    }

    public final String toString() {
        eatp b = eaul.g.b(c());
        StringBuffer stringBuffer = new StringBuffer(48);
        b.e(stringBuffer, d());
        stringBuffer.append('/');
        b.e(stringBuffer, f());
        return stringBuffer.toString();
    }
}
