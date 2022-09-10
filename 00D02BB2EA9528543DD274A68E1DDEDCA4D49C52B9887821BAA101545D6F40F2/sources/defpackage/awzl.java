package defpackage;
/* compiled from: PG */
/* renamed from: awzl  reason: default package */
/* loaded from: classes3.dex */
final class awzl implements awze<dvgw> {
    static final awzl a = new awzl();

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.awze
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.dvgw a(defpackage.dvgw r20, defpackage.awyw r21, defpackage.dmlb r22) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awzl.a(dssj, awyw, dmlb):dssj");
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvgw dvgwVar, awza awzaVar, dmlb dmlbVar) {
        dvgw dvgwVar2 = dvgwVar;
        dqpe dqpeVar = dvgwVar2.a;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awzaVar.a(dqpeVar, dmlbVar)) {
            for (dvgy dvgyVar : dvgwVar2.b) {
                String format = String.format("%s.%s", "EXPLORE_ACTIVITIES", "activity");
                for (dvhk dvhkVar : dvgyVar.a) {
                    String format2 = String.format("%s.%s", format, "place");
                    if ((dvhkVar.a & 512) != 0) {
                        dvyw dvywVar = dvhkVar.b;
                        if (dvywVar == null) {
                            dvywVar = dvyw.bv;
                        }
                        String.format("%s.%s", format2, "tactile_place");
                        for (dhxw dhxwVar : dvywVar.ag) {
                            Object[] objArr = new Object[2];
                            for (dhxz dhxzVar : dhxwVar.c) {
                                if (dhxzVar.a == 4) {
                                    diin diinVar = (diin) dhxzVar.b;
                                    if ((diinVar.a & 32) == 0) {
                                        continue;
                                    } else {
                                        dpsf dpsfVar = diinVar.g;
                                        if (dpsfVar == null) {
                                            dpsfVar = dpsf.d;
                                        }
                                        if ((dpsfVar.a & 1) == 0) {
                                            continue;
                                        } else {
                                            dqfq dqfqVar = dpsfVar.b;
                                            if (dqfqVar == null) {
                                                dqfqVar = dqfq.h;
                                            }
                                            dqpe dqpeVar2 = dqfqVar.c;
                                            if (dqpeVar2 == null) {
                                                dqpeVar2 = dqpe.f;
                                            }
                                            if (awzaVar.a(dqpeVar2, dmlbVar)) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
