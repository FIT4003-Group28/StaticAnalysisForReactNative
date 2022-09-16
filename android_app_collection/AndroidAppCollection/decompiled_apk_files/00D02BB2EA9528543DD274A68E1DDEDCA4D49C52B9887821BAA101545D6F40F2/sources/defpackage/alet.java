package defpackage;
/* compiled from: PG */
/* renamed from: alet  reason: default package */
/* loaded from: classes2.dex */
public final class alet implements aldl {
    public final akqq a;
    public final int b;
    public final int c;

    public alet(akqq akqqVar, int i, int i2) {
        this.a = akqqVar;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.aldl
    public final <K, T extends aldk<K>> K a(T t, int i) {
        int i2 = i;
        akqq akqqVar = this.a;
        int i3 = this.b;
        int i4 = this.c;
        alcm alcmVar = new alcm(i3, i2, i4);
        alec alecVar = (alec) t;
        if (!alecVar.d.containsKey(alcmVar)) {
            aleu aleuVar = alecVar.g;
            akvz a = alecVar.a.a();
            dcdc<dbsi<Integer, Float>> dcdcVar = i4 == 2 ? aleuVar.a : aleuVar.b;
            dmqt dmqtVar = (dmqt) dmqx.e.bZ();
            int size = dcdcVar.size();
            boolean z = false;
            int i5 = 0;
            while (i5 < size) {
                dbsi<Integer, Float> dbsiVar = dcdcVar.get(i5);
                dmoo dmooVar = (dmoo) dmop.h.bZ();
                int intValue = dbsiVar.a.intValue();
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = z;
                }
                dmop dmopVar = (dmop) dmooVar.b;
                dmopVar.a |= 1;
                dmopVar.b = intValue;
                float floatValue = dbsiVar.b.floatValue();
                dmmx bZ = dmne.l.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmne dmneVar = (dmne) bZ.b;
                dmneVar.a |= 4;
                dmneVar.d = i2;
                dmsk bZ2 = dmsl.l.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmsl dmslVar = (dmsl) bZ2.b;
                dmslVar.a |= 1;
                dmslVar.b = i3;
                int a2 = aleu.a(floatValue);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmsl dmslVar2 = (dmsl) bZ2.b;
                dmslVar2.a |= 4;
                dmslVar2.d = a2;
                bZ.a(bZ2);
                dmsk bZ3 = dmsl.l.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dmsl dmslVar3 = (dmsl) bZ3.b;
                dmslVar3.a |= 1;
                dmslVar3.b = -1;
                int a3 = aleu.a(floatValue - 3.0f);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dmsl dmslVar4 = (dmsl) bZ3.b;
                dmslVar4.a |= 4;
                dmslVar4.d = a3;
                bZ.a(bZ3);
                dmne bK = bZ.bK();
                if (dmooVar.c) {
                    dmooVar.bF();
                    dmooVar.c = false;
                }
                dmop dmopVar2 = (dmop) dmooVar.b;
                bK.getClass();
                dmopVar2.c = bK;
                dmopVar2.a |= 2;
                dmqtVar.a(dmooVar);
                i5++;
                i2 = i;
                z = false;
            }
            alecVar.d.put(alcmVar, a.c((dmqx) dmqtVar.bK()));
        }
        return (K) alecVar.b.a().e(akqqVar.a, akqqVar.b, 16, 1.0f, false, alecVar.d.get(alcmVar), true);
    }
}
