package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: eapy  reason: default package */
/* loaded from: classes6.dex */
public final class eapy extends eaqk implements Serializable, eapt {
    private static final eaop[] b = {eaop.g, eaop.i};
    private static final long serialVersionUID = 797544782896179L;

    public eapy() {
        super(eaor.a(), (eaok) null);
    }

    public static eapy a(eaok eaokVar) {
        if (eaokVar == null) {
            throw new NullPointerException("Chronology must not be null");
        }
        return new eapy(eaokVar);
    }

    private Object readResolve() {
        return !eaou.b.equals(this.a.a()) ? new eapy(this, this.a.b()) : this;
    }

    public final eapy b(eaoz eaozVar, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                i2 = -1;
                break;
            } else if (x(i2).a() == eaozVar) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            if (i == 0) {
                return this;
            }
            return new eapy(this, y(i2).m(this, i2, p(), i));
        }
        String valueOf = String.valueOf(eaozVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Field '");
        sb.append(valueOf);
        sb.append("' is not supported");
        throw new IllegalArgumentException(sb.toString());
    }

    public final eapy c(int i) {
        return b(eaoz.e, i);
    }

    public final eapg d(int i) {
        return new eapg(l(), m(), i, this.a);
    }

    @Override // defpackage.eapt
    public final int e() {
        return 2;
    }

    @Override // defpackage.eaqe
    protected final eaon f(int i, eaok eaokVar) {
        if (i != 0) {
            if (i == 1) {
                return eaokVar.L();
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Invalid index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return eaokVar.N();
    }

    public final int l() {
        return g(0);
    }

    public final int m() {
        return g(1);
    }

    public final eapy n(int i) {
        return new eapy(this, this.a.L().q(this, 1, p(), i));
    }

    public final eapx o() {
        return new eapx(this);
    }

    public final String toString() {
        return eaul.b.h(this);
    }

    @Override // defpackage.eaqe, defpackage.eapt
    public final eaop x(int i) {
        return b[i];
    }

    public eapy(int i, int i2) {
        super(new int[]{i, i2});
    }

    public eapy(Object obj) {
        super(obj, eaul.i);
    }

    public eapy(eaok eaokVar) {
        super(eaor.a(), eaokVar);
    }

    public eapy(eapy eapyVar, eaok eaokVar) {
        super(eapyVar, eaokVar);
    }

    public eapy(eapy eapyVar, int[] iArr) {
        super(eapyVar, iArr);
    }
}
