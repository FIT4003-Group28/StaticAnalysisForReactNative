package defpackage;
/* compiled from: PG */
/* renamed from: axag  reason: default package */
/* loaded from: classes3.dex */
final class axag implements awze<dvhw> {
    static final axag a = new axag();

    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    @Override // defpackage.awze
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.dvhw a(defpackage.dvhw r18, defpackage.awyw r19, defpackage.dmlb r20) {
        /*
            Method dump skipped, instructions count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axag.a(dssj, awyw, dmlb):dssj");
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvhw dvhwVar, awza awzaVar, dmlb dmlbVar) {
        dvhw dvhwVar2 = dvhwVar;
        dqpe dqpeVar = dvhwVar2.c;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awzaVar.a(dqpeVar, dmlbVar)) {
            if ((dvhwVar2.a & 4) == 0) {
                return false;
            }
            djrm djrmVar = dvhwVar2.d;
            if (djrmVar == null) {
                djrmVar = djrm.v;
            }
            String format = String.format("%s.%s", "NEARBY_HOTELS", "set");
            for (dvyw dvywVar : djrmVar.e) {
                String.format("%s.%s", format, "place");
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
            return false;
        }
        return true;
    }
}
