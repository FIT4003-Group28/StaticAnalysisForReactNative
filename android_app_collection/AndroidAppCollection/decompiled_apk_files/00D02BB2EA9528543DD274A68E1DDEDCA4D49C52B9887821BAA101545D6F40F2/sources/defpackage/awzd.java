package defpackage;
/* compiled from: PG */
/* renamed from: awzd  reason: default package */
/* loaded from: classes3.dex */
final class awzd implements awze<dviz> {
    static final awzd a = new awzd();

    /* JADX WARN: Removed duplicated region for block: B:78:0x01da  */
    @Override // defpackage.awze
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.dviz a(defpackage.dviz r22, defpackage.awyw r23, defpackage.dmlb r24) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awzd.a(dssj, awyw, dmlb):dssj");
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dviz dvizVar, awza awzaVar, dmlb dmlbVar) {
        dviz dvizVar2 = dvizVar;
        dqpe dqpeVar = dvizVar2.c;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awzaVar.a(dqpeVar, dmlbVar)) {
            if ((dvizVar2.a & 4) == 0) {
                return false;
            }
            djrs djrsVar = dvizVar2.d;
            if (djrsVar == null) {
                djrsVar = djrs.g;
            }
            String format = String.format("%s.%s", "BEST_OF_LISTS", "set");
            for (djrm djrmVar : djrsVar.a) {
                String format2 = String.format("%s.%s", format, "place_set");
                for (dvyw dvywVar : djrmVar.e) {
                    String.format("%s.%s", format2, "place");
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
                }
            }
            return false;
        }
        return true;
    }
}
