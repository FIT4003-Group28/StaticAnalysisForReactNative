package defpackage;
/* compiled from: PG */
/* renamed from: suv  reason: default package */
/* loaded from: classes4.dex */
final class suv {
    public final axmv a;
    private final aodt b;

    public suv(axmv axmvVar, aodt aodtVar) {
        this.a = axmvVar;
        this.b = aodtVar;
    }

    private static aodt a(aodt aodtVar) {
        aodt aodtVar2 = new aodt();
        for (int i = 0; i < aodtVar.W(); i++) {
            aodtVar.aA(aodtVar2, i);
            if (aodtVar2.T() == 224886694) {
                return aodtVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suv)) {
            return false;
        }
        suv suvVar = (suv) obj;
        if (tfy.c(this.a, suvVar.a)) {
            aodt aodtVar = this.b;
            aodt aodtVar2 = suvVar.b;
            if ((aodtVar == null && aodtVar2 == null) || (aodtVar != null && aodtVar2 != null && tfy.c(a(aodtVar), a(aodtVar2)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        aodt aodtVar = this.b;
        return hashCode ^ (aodtVar == null ? 0 : aodtVar.hashCode());
    }
}
