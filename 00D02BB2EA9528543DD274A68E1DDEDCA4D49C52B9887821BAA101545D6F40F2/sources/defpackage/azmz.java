package defpackage;
/* compiled from: PG */
/* renamed from: azmz  reason: default package */
/* loaded from: classes3.dex */
public final class azmz {
    public static final dcdc<dohf> a;
    public static final dcdc<dohh> b;
    public final azof c;

    static {
        dohe bZ = dohf.c.bZ();
        dppw bZ2 = dppz.c.bZ();
        dppy dppyVar = dppy.EXPERIENCE_ENTITY_LIST_ITEM;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dppz dppzVar = (dppz) bZ2.b;
        dppzVar.b = dppyVar.e;
        dppzVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dohf dohfVar = (dohf) bZ.b;
        dppz bK = bZ2.bK();
        bK.getClass();
        dohfVar.b = bK;
        dohfVar.a |= 1;
        dohf bK2 = bZ.bK();
        dohe bZ3 = dohf.c.bZ();
        dppw bZ4 = dppz.c.bZ();
        dppy dppyVar2 = dppy.PLACE_ENTITY_LIST_ITEM;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dppz dppzVar2 = (dppz) bZ4.b;
        dppzVar2.b = dppyVar2.e;
        dppzVar2.a |= 1;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dohf dohfVar2 = (dohf) bZ3.b;
        dppz bK3 = bZ4.bK();
        bK3.getClass();
        dohfVar2.b = bK3;
        dohfVar2.a |= 1;
        dohf bK4 = bZ3.bK();
        dohe bZ5 = dohf.c.bZ();
        dppw bZ6 = dppz.c.bZ();
        dppy dppyVar3 = dppy.DEAL_ENTITY_LIST_ITEM;
        if (bZ6.c) {
            bZ6.bF();
            bZ6.c = false;
        }
        dppz dppzVar3 = (dppz) bZ6.b;
        dppzVar3.b = dppyVar3.e;
        dppzVar3.a |= 1;
        if (bZ5.c) {
            bZ5.bF();
            bZ5.c = false;
        }
        dohf dohfVar3 = (dohf) bZ5.b;
        dppz bK5 = bZ6.bK();
        bK5.getClass();
        dohfVar3.b = bK5;
        dohfVar3.a |= 1;
        a = dcdc.h(bK2, bK4, bZ5.bK());
        dohg bZ7 = dohh.c.bZ();
        dpqj dpqjVar = dpqj.UNIVERSAL_ENTITY_LIST;
        if (bZ7.c) {
            bZ7.bF();
            bZ7.c = false;
        }
        dohh dohhVar = (dohh) bZ7.b;
        dohhVar.b = dpqjVar.j;
        dohhVar.a |= 1;
        dohh bK6 = bZ7.bK();
        dohg bZ8 = dohh.c.bZ();
        dpqj dpqjVar2 = dpqj.LOCAL_FOLLOWING;
        if (bZ8.c) {
            bZ8.bF();
            bZ8.c = false;
        }
        dohh dohhVar2 = (dohh) bZ8.b;
        dohhVar2.b = dpqjVar2.j;
        dohhVar2.a |= 1;
        b = dcdc.g(bK6, bZ8.bK());
    }

    public azmz(azof azofVar) {
        this.c = azofVar;
    }

    public final void a(dogy dogyVar) {
        dcdc.e();
        try {
            dcdc s = azof.s(azxm.j);
            int size = s.size();
            for (int i = 0; i < size; i++) {
                azkt azktVar = (azkt) s.get(i);
                azxi azxiVar = (azxi) azktVar.a;
                dojn bZ = dojp.e.bZ();
                int ordinal = azktVar.b.ordinal();
                int i2 = 3;
                if (ordinal == 1) {
                    i2 = 2;
                } else if (ordinal == 2) {
                    i2 = 4;
                } else if (ordinal != 3) {
                    i2 = 1;
                }
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dojp dojpVar = (dojp) bZ.b;
                dojpVar.b = i2 - 1;
                dojpVar.a |= 1;
                dolo j = azxiVar.j();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dojp dojpVar2 = (dojp) bZ.b;
                j.getClass();
                dojpVar2.c = j;
                dojpVar2.a |= 2;
                if (!((azxi) azktVar.a).n().a()) {
                    azwl azwlVar = ((azxi) azktVar.a).j;
                    dbsk.s(azwlVar);
                    String str = azwlVar.a;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dojp dojpVar3 = (dojp) bZ.b;
                    str.getClass();
                    dojpVar3.a = 4 | dojpVar3.a;
                    dojpVar3.d = str;
                }
                dojc bZ2 = dojt.f.bZ();
                long j2 = azxiVar.k;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dojt dojtVar = (dojt) bZ2.b;
                dojtVar.a |= 1;
                dojtVar.d = j2;
                long q = azxiVar.q();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dojt dojtVar2 = (dojt) bZ2.b;
                dojtVar2.a |= 131072;
                dojtVar2.e = q;
                dojp bK = bZ.bK();
                bK.getClass();
                dojtVar2.c = bK;
                dojtVar2.b = 15;
                dogyVar.a(bZ2);
            }
        } catch (axxc unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
        if (r13 != defpackage.dprc.CUSTOM_ENTITY_LIST) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dogy r16) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azmz.b(dogy):void");
    }
}
