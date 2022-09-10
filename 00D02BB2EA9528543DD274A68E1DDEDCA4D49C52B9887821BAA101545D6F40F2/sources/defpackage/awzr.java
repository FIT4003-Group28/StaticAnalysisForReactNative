package defpackage;
/* compiled from: PG */
/* renamed from: awzr  reason: default package */
/* loaded from: classes3.dex */
final class awzr implements awze<dvhg> {
    static final awzr a = new awzr();

    /* JADX WARN: Removed duplicated region for block: B:92:0x0254  */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // defpackage.awze
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.dvhg a(defpackage.dvhg r26, defpackage.awyw r27, defpackage.dmlb r28) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awzr.a(dssj, awyw, dmlb):dssj");
    }

    @Override // defpackage.awze
    public final /* bridge */ /* synthetic */ boolean b(dvhg dvhgVar, awza awzaVar, dmlb dmlbVar) {
        dvhg dvhgVar2 = dvhgVar;
        dqpe dqpeVar = dvhgVar2.b;
        if (dqpeVar == null) {
            dqpeVar = dqpe.f;
        }
        if (!awzaVar.a(dqpeVar, dmlbVar)) {
            for (dvhf dvhfVar : dvhgVar2.c) {
                String format = String.format("%s.%s", "EXPLORE_LOCAL_STREAM", "item_set");
                for (dlcv dlcvVar : dvhfVar.a) {
                    String format2 = String.format("%s.%s", format, "item");
                    if (dlcvVar.b == 2) {
                        String format3 = String.format("%s.%s", format2, "local_update");
                        for (dlcx dlcxVar : ((dlbw) dlcvVar.c).f) {
                            String format4 = String.format("%s.%s", format3, "stream_place");
                            if ((dlcxVar.a & 2) != 0) {
                                dvyw dvywVar = dlcxVar.c;
                                if (dvywVar == null) {
                                    dvywVar = dvyw.bv;
                                }
                                String.format("%s.%s", format4, "place");
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
                        continue;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
