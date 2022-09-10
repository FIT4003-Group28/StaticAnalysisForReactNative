package defpackage;
/* compiled from: PG */
/* renamed from: eaqf  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqf implements eapu {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eapu)) {
            return false;
        }
        eapu eapuVar = (eapu) obj;
        if (f() != eapuVar.f()) {
            return false;
        }
        int f = f();
        for (int i = 0; i < f; i++) {
            if (h(i) != eapuVar.h(i) || g(i) != eapuVar.g(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eapu
    public final int f() {
        return e().i();
    }

    @Override // defpackage.eapu
    public final eaoz g(int i) {
        return e().d[i];
    }

    public final int hashCode() {
        int f = f();
        int i = 17;
        for (int i2 = 0; i2 < f; i2++) {
            i = (((i * 27) + h(i2)) * 27) + g(i2).hashCode();
        }
        return i;
    }

    @Override // defpackage.eapu
    public final int i(eaoz eaozVar) {
        int k = e().k(eaozVar);
        if (k == -1) {
            return 0;
        }
        return h(k);
    }

    public final String toString() {
        eaux eauxVar = eaum.a().a;
        if (eauxVar != null) {
            StringBuffer stringBuffer = new StringBuffer(eauxVar.a(this));
            eauxVar.c(stringBuffer, this);
            return stringBuffer.toString();
        }
        throw new UnsupportedOperationException("Printing not supported");
    }
}
