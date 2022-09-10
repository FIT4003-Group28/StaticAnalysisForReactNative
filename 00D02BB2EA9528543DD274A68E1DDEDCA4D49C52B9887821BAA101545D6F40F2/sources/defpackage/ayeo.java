package defpackage;
/* compiled from: PG */
/* renamed from: ayeo  reason: default package */
/* loaded from: classes3.dex */
public final class ayeo<T> extends btrh<T> {
    private final int d;

    public ayeo(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        baad aR;
        baad baadVar;
        baad aR2;
        baad aR3;
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                ayej ayejVar = (ayej) this.a;
                azrc azrcVar = (azrc) obj;
                ayen ayenVar = ayejVar.a;
                if (ayenVar.aT || (aR = ayenVar.aR()) == null || (baadVar = azrcVar.a) == null || !aR.aa(baadVar)) {
                    return;
                }
                bwrs<baad> bwrsVar = ayejVar.a.ay;
                dbsk.s(bwrsVar);
                bwrsVar.d(baadVar);
                return;
            } else if (i != 2) {
                ayej ayejVar2 = (ayej) this.a;
                azrg azrgVar = (azrg) obj;
                ayen ayenVar2 = ayejVar2.a;
                if (ayenVar2.aT) {
                    ayenVar2.q();
                    return;
                } else if (azrgVar.b() != 1 || (aR3 = ayejVar2.a.aR()) == null || aR3.y()) {
                    return;
                } else {
                    aymt aymtVar = ayejVar2.a.az;
                    dbsk.s(aymtVar);
                    aymtVar.l();
                    aymt aymtVar2 = ayejVar2.a.az;
                    dbsk.s(aymtVar2);
                    cqkx.p(aymtVar2);
                    return;
                }
            } else {
                final ayej ayejVar3 = (ayej) this.a;
                azrh azrhVar = (azrh) obj;
                ayen ayenVar3 = ayejVar3.a;
                if (ayenVar3.aT) {
                    ayenVar3.q();
                    return;
                } else if (azrhVar.a() != 1 || (aR2 = ayejVar3.a.aR()) == null) {
                    return;
                } else {
                    deha.q(ayejVar3.a.as.h(aR2.l()), bvqj.b(new bvqg(ayejVar3) { // from class: ayei
                        private final ayej a;

                        {
                            this.a = ayejVar3;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj2) {
                            ayej ayejVar4 = this.a;
                            baad baadVar2 = (baad) obj2;
                            if (baadVar2 == null) {
                                return;
                            }
                            bwrs<baad> bwrsVar2 = ayejVar4.a.ay;
                            dbsk.s(bwrsVar2);
                            bwrsVar2.d(baadVar2);
                        }
                    }), ayejVar3.a.ax);
                    return;
                }
            }
        }
        ayej ayejVar4 = (ayej) this.a;
        azrb azrbVar = (azrb) obj;
        int i2 = 4;
        if (azrbVar.a()) {
            int i3 = azrbVar.b;
            ayen ayenVar4 = ayejVar4.a;
            if (!ayenVar4.aT || i3 != 4) {
                return;
            }
            ayenVar4.aJ();
            return;
        }
        baad baadVar2 = azrbVar.a;
        if (baadVar2 == null) {
            return;
        }
        int i4 = azrbVar.b;
        baad aR4 = ayejVar4.a.aR();
        if (aR4 == null) {
            return;
        }
        if (i4 != 4) {
            i2 = i4;
        } else if (aR4.aa(baadVar2)) {
            ayejVar4.a.aJ();
            return;
        }
        if (i2 != 1 || (!baadVar2.q() && !aR4.aa(baadVar2))) {
            if (i2 == 2) {
                if (!aR4.aa(baadVar2)) {
                    i2 = 2;
                }
            }
            int i5 = 3;
            if (i2 == 3) {
                if (!aR4.aa(baadVar2) || aR4.D()) {
                    i2 = 3;
                }
            }
            if (i2 != 3) {
                i5 = i2;
            } else if (aR4.aa(baadVar2)) {
                gga ggaVar = ayejVar4.a.aE;
                dbsk.s(ggaVar);
                ggaVar.g().f();
                return;
            }
            if (aR4.y()) {
                return;
            }
            if (i5 != 2 && i5 != 1) {
                return;
            }
            aymt aymtVar3 = ayejVar4.a.az;
            dbsk.s(aymtVar3);
            aymtVar3.l();
            aymt aymtVar4 = ayejVar4.a.az;
            dbsk.s(aymtVar4);
            cqkx.p(aymtVar4);
            return;
        }
        bwrs<baad> bwrsVar2 = ayejVar4.a.ay;
        dbsk.s(bwrsVar2);
        bwrsVar2.d(baadVar2);
    }
}
