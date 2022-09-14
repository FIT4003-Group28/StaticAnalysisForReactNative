package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eaqn  reason: default package */
/* loaded from: classes6.dex */
public abstract class eaqn implements Comparable<eaqn>, Serializable, eapu {
    private static final long serialVersionUID = 9386874258972L;
    public volatile int p;

    /* JADX INFO: Access modifiers changed from: protected */
    public eaqn(int i) {
        this.p = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int k(eapt eaptVar, eapt eaptVar2, eapu eapuVar) {
        if (eaptVar == null || eaptVar2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (eaptVar.e() == eaptVar2.e()) {
            int e = eaptVar.e();
            for (int i = 0; i < e; i++) {
                if (eaptVar.x(i) != eaptVar2.x(i)) {
                    throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
                }
            }
            if (!eaor.g(eaptVar)) {
                throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
            }
            eaok b = eaor.d(eaptVar.j()).b();
            return b.i(eapuVar, b.h(eaptVar, 63072000000L), b.h(eaptVar2, 63072000000L))[0];
        }
        throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eaqn eaqnVar) {
        eaqn eaqnVar2 = eaqnVar;
        if (eaqnVar2.getClass() == getClass()) {
            int i = eaqnVar2.p;
            int i2 = this.p;
            if (i2 > i) {
                return 1;
            }
            return i2 < i ? -1 : 0;
        }
        String valueOf = String.valueOf(getClass());
        String valueOf2 = String.valueOf(eaqnVar2.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" cannot be compared to ");
        sb.append(valueOf2);
        throw new ClassCastException(sb.toString());
    }

    public abstract eaoz d();

    public abstract eapo e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eapu)) {
            return false;
        }
        eapu eapuVar = (eapu) obj;
        return eapuVar.e() == e() && eapuVar.h(0) == this.p;
    }

    @Override // defpackage.eapu
    public final int f() {
        return 1;
    }

    @Override // defpackage.eapu
    public final eaoz g(int i) {
        if (i == 0) {
            return d();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    @Override // defpackage.eapu
    public final int h(int i) {
        if (i == 0) {
            return this.p;
        }
        throw new IndexOutOfBoundsException(String.valueOf(i));
    }

    public final int hashCode() {
        return ((this.p + 459) * 27) + d().hashCode();
    }

    @Override // defpackage.eapu
    public final int i(eaoz eaozVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int j(eapr eaprVar, eapr eaprVar2, eaoz eaozVar) {
        if (eaprVar == null) {
            throw new IllegalArgumentException("ReadableInstant objects must not be null");
        }
        return eaozVar.a(eaor.c(eaprVar)).h(eaprVar2.Tf(), eaprVar.Tf());
    }
}
