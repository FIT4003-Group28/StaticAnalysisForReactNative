package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eard  reason: default package */
/* loaded from: classes6.dex */
public final class eard {
    private final eaou a;
    private final eapd b;
    private final int c;

    public eard(eaou eaouVar, eapd eapdVar, int i) {
        this.a = eaouVar;
        this.b = eapdVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eard)) {
            return false;
        }
        eard eardVar = (eard) obj;
        eapd eapdVar = this.b;
        if (eapdVar == null) {
            if (eardVar.b != null) {
                return false;
            }
        } else if (!eapdVar.equals(eardVar.b)) {
            return false;
        }
        if (this.c != eardVar.c) {
            return false;
        }
        eaou eaouVar = this.a;
        eaou eaouVar2 = eardVar.a;
        if (eaouVar == null) {
            if (eaouVar2 != null) {
                return false;
            }
        } else if (!eaouVar.equals(eaouVar2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        eapd eapdVar = this.b;
        int i = 0;
        int hashCode = ((((eapdVar == null ? 0 : eapdVar.hashCode()) + 31) * 31) + this.c) * 31;
        eaou eaouVar = this.a;
        if (eaouVar != null) {
            i = eaouVar.hashCode();
        }
        return hashCode + i;
    }
}
