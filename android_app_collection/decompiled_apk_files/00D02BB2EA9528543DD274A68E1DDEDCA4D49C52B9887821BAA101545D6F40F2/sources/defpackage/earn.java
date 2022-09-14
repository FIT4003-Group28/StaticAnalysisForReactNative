package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: earn  reason: default package */
/* loaded from: classes6.dex */
public final class earn extends eaqw {
    private static final long serialVersionUID = -861407383323710522L;
    private static final ConcurrentHashMap<eaou, earn[]> I = new ConcurrentHashMap<>();
    public static final earn H = aB(eaou.b);

    private earn(eaok eaokVar, int i) {
        super(eaokVar, i);
    }

    public static earn aB(eaou eaouVar) {
        return aC(eaouVar, 4);
    }

    public static earn aC(eaou eaouVar, int i) {
        earn earnVar;
        earn[] putIfAbsent;
        if (eaouVar == null) {
            eaouVar = eaou.i();
        }
        ConcurrentHashMap<eaou, earn[]> concurrentHashMap = I;
        earn[] earnVarArr = concurrentHashMap.get(eaouVar);
        if (earnVarArr == null && (putIfAbsent = concurrentHashMap.putIfAbsent(eaouVar, (earnVarArr = new earn[7]))) != null) {
            earnVarArr = putIfAbsent;
        }
        int i2 = i - 1;
        try {
            earn earnVar2 = earnVarArr[i2];
            if (earnVar2 == null) {
                synchronized (earnVarArr) {
                    earnVar2 = earnVarArr[i2];
                    if (earnVar2 == null) {
                        if (eaouVar == eaou.b) {
                            earnVar = new earn(null, i);
                        } else {
                            earnVar = new earn(eary.W(aC(eaou.b, i), eaouVar), i);
                        }
                        earnVarArr[i2] = earnVar;
                        earnVar2 = earnVar;
                    }
                }
            }
            return earnVar2;
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

    @Override // defpackage.eaqt, defpackage.eaqp
    protected final void V(eaqo eaqoVar) {
        if (this.a == null) {
            super.V(eaqoVar);
        }
    }

    @Override // defpackage.eaqt
    public final boolean ap(int i) {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (ap(r7) != false) goto L4;
     */
    @Override // defpackage.eaqt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long at(int r7) {
        /*
            r6 = this;
            int r0 = r7 / 100
            if (r7 >= 0) goto L11
            int r1 = r7 + 3
            int r1 = r1 >> 2
            int r1 = r1 - r0
            int r0 = r0 + 3
            int r0 = r0 >> 2
            int r1 = r1 + r0
        Le:
            int r1 = r1 + (-1)
            goto L1e
        L11:
            int r1 = r7 >> 2
            int r1 = r1 - r0
            int r0 = r0 >> 2
            int r1 = r1 + r0
            boolean r0 = r6.ap(r7)
            if (r0 == 0) goto L1e
            goto Le
        L1e:
            long r2 = (long) r7
            r4 = 365(0x16d, double:1.803E-321)
            long r2 = r2 * r4
            r7 = -719527(0xfffffffffff50559, float:NaN)
            int r1 = r1 + r7
            long r0 = (long) r1
            long r2 = r2 + r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.earn.at(int):long");
    }

    @Override // defpackage.eaqt
    public final int au() {
        return -292275054;
    }

    @Override // defpackage.eaqt
    public final int av() {
        return 292278993;
    }

    @Override // defpackage.eaqt
    public final long aw() {
        return 31556952000L;
    }

    @Override // defpackage.eaqt
    public final long ax() {
        return 15778476000L;
    }

    @Override // defpackage.eaqt
    public final long ay() {
        return 2629746000L;
    }

    @Override // defpackage.eaqt
    public final long az() {
        return 31083597720000L;
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
