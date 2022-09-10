package defpackage;
/* compiled from: PG */
/* renamed from: dme  reason: default package */
/* loaded from: classes6.dex */
public final class dme {
    public final dfer a;
    public final dfeq<dfhp> b;
    public dfhp c;

    public dme(dfer dferVar, dfeq<dfhp> dfeqVar, dfhp dfhpVar) {
        dzvx.c(dferVar, "pin");
        dzvx.c(dfhpVar, "lastState");
        this.a = dferVar;
        this.b = dfeqVar;
        this.c = dfhpVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof dme)) {
                return false;
            }
            dme dmeVar = (dme) obj;
            return dzvx.d(this.a, dmeVar.a) && dzvx.d(this.b, dmeVar.b) && dzvx.d(this.c, dmeVar.c);
        }
        return true;
    }

    public final int hashCode() {
        dfer dferVar = this.a;
        int i = 0;
        int hashCode = (((dferVar != null ? dferVar.hashCode() : 0) * 31) + this.b.hashCode()) * 31;
        dfhp dfhpVar = this.c;
        if (dfhpVar != null && (i = dfhpVar.bC) == 0) {
            i = dsst.a.b(dfhpVar).c(dfhpVar);
            dfhpVar.bC = i;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "PinUpdateInfo(pin=" + this.a + ", observer=" + this.b + ", lastState=" + this.c + ")";
    }
}
