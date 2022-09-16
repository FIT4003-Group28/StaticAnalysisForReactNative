package defpackage;
/* compiled from: PG */
/* renamed from: baik  reason: default package */
/* loaded from: classes2.dex */
public abstract class baik implements baig {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        baig baigVar = (baig) obj;
        if (this == baigVar) {
            return 0;
        }
        long sx = baigVar.sx();
        long sx2 = sx();
        if (sx2 == sx) {
            return 0;
        }
        return sx2 < sx ? -1 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baig)) {
            return false;
        }
        baig baigVar = (baig) obj;
        return sx() == baigVar.sx() && bajw.f(sy(), baigVar.sy());
    }

    public final int hashCode() {
        return ((int) (sx() ^ (sx() >>> 32))) + sy().hashCode();
    }

    public final baht k() {
        return sy().z();
    }

    public final int l() {
        return sy().f().a(sx());
    }

    public final int m() {
        return sy().k().a(sx());
    }

    public final int n() {
        return sy().p().a(sx());
    }

    public final int o() {
        return sy().q().a(sx());
    }

    public final int p() {
        return sy().w().a(sx());
    }

    public String toString() {
        return balg.d.a(this);
    }
}
