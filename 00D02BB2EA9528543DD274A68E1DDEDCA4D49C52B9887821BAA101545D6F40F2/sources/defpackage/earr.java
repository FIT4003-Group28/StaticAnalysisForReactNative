package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: earr  reason: default package */
/* loaded from: classes6.dex */
public final class earr extends eaqw {
    private static final long serialVersionUID = -8731039522547897247L;
    private static final ConcurrentHashMap<eaou, earr[]> I = new ConcurrentHashMap<>();
    private static final earr H = aB(eaou.b);

    public earr(eaok eaokVar, int i) {
        super(eaokVar, i);
    }

    public static earr aB(eaou eaouVar) {
        return aC(eaouVar, 4);
    }

    public static earr aC(eaou eaouVar, int i) {
        earr earrVar;
        earr[] putIfAbsent;
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        ConcurrentHashMap<eaou, earr[]> concurrentHashMap = I;
        earr[] earrVarArr = concurrentHashMap.get(eaouVar);
        if (earrVarArr == null && (putIfAbsent = concurrentHashMap.putIfAbsent(eaouVar, (earrVarArr = new earr[7]))) != null) {
            earrVarArr = putIfAbsent;
        }
        int i2 = i - 1;
        try {
            earr earrVar2 = earrVarArr[i2];
            if (earrVar2 == null) {
                synchronized (earrVarArr) {
                    earrVar2 = earrVarArr[i2];
                    if (earrVar2 == null) {
                        if (eaouVar == eaou.b) {
                            earrVar = new earr(null, i);
                        } else {
                            earrVar = new earr(eary.W(aC(eaou.b, i), eaouVar), i);
                        }
                        earrVarArr[i2] = earrVar;
                        earrVar2 = earrVar;
                    }
                }
            }
            return earrVar2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("Invalid min days in first week: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private Object readResolve() {
        eaok eaokVar = this.a;
        int i = ((eaqt) this).G;
        if (i == 0) {
            i = 4;
        }
        if (eaokVar == null) {
            return aC(eaou.b, i);
        }
        return aC(eaokVar.a(), i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eaqt, defpackage.eaqp
    public final void V(eaqo eaqoVar) {
        if (this.a == null) {
            super.V(eaqoVar);
            eaqoVar.E = new eati(this, eaqoVar.E);
            eaqoVar.B = new eati(this, eaqoVar.B);
        }
    }

    @Override // defpackage.eaqt
    public final long an(int i, int i2, int i3) {
        if (i <= 0) {
            if (i == 0) {
                throw new eapb(eaop.g, 0, null, null);
            }
            i++;
        }
        return super.an(i, i2, i3);
    }

    @Override // defpackage.eaqt
    public final boolean ap(int i) {
        return (i & 3) == 0;
    }

    @Override // defpackage.eaqt
    public final long at(int i) {
        int i2;
        int i3 = i - 1968;
        if (i3 <= 0) {
            i2 = (i3 + 3) >> 2;
        } else {
            int i4 = i3 >> 2;
            i2 = !ap(i) ? i4 + 1 : i4;
        }
        return (((i3 * 365) + i2) * 86400000) - 62035200000L;
    }

    @Override // defpackage.eaqt
    public final int au() {
        return -292269054;
    }

    @Override // defpackage.eaqt
    public final int av() {
        return 292272992;
    }

    @Override // defpackage.eaqt
    public final long aw() {
        return 31557600000L;
    }

    @Override // defpackage.eaqt
    public final long ax() {
        return 15778800000L;
    }

    @Override // defpackage.eaqt
    public final long ay() {
        return 2629800000L;
    }

    @Override // defpackage.eaqt
    public final long az() {
        return 31083663600000L;
    }

    @Override // defpackage.eaok
    public final eaok b() {
        return H;
    }

    @Override // defpackage.eaok
    public final eaok c(eaou eaouVar) {
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        return eaouVar == a() ? this : aB(eaouVar);
    }
}
