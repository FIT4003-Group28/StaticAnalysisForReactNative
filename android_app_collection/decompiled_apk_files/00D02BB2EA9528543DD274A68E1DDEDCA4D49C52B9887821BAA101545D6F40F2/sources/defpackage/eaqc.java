package defpackage;
/* compiled from: PG */
/* renamed from: eaqc  reason: default package */
/* loaded from: classes.dex */
public abstract class eaqc implements eapr {
    public final int F(eaop eaopVar) {
        return eaopVar.c(Tg()).d(Tf());
    }

    public final eapm G() {
        return new eapm(Tf(), v());
    }

    @Override // java.lang.Comparable
    /* renamed from: H */
    public final int compareTo(eapr eaprVar) {
        if (this == eaprVar) {
            return 0;
        }
        long Tf = eaprVar.Tf();
        long Tf2 = Tf();
        if (Tf2 == Tf) {
            return 0;
        }
        return Tf2 < Tf ? -1 : 1;
    }

    public final boolean I(long j) {
        return Tf() > j;
    }

    public final boolean J(long j) {
        return Tf() < j;
    }

    public final boolean K() {
        return J(eaor.a());
    }

    public final boolean L(eapr eaprVar) {
        return Tf() == eaor.b(eaprVar);
    }

    @Override // defpackage.eapr
    public eapd Ti() {
        return new eapd(Tf());
    }

    public eaol c() {
        return new eaol(Tf(), v());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eapr)) {
            return false;
        }
        eapr eaprVar = (eapr) obj;
        return Tf() == eaprVar.Tf() && easy.g(Tg(), eaprVar.Tg());
    }

    public final int hashCode() {
        return ((int) (Tf() ^ (Tf() >>> 32))) + Tg().hashCode();
    }

    public String toString() {
        return eaul.g.f(this);
    }

    @Override // defpackage.eapr
    public final eaou v() {
        return Tg().a();
    }

    @Override // defpackage.eapr
    public final boolean w(eapr eaprVar) {
        return I(eaor.b(eaprVar));
    }

    @Override // defpackage.eapr
    public final boolean x(eapr eaprVar) {
        return J(eaor.b(eaprVar));
    }
}
