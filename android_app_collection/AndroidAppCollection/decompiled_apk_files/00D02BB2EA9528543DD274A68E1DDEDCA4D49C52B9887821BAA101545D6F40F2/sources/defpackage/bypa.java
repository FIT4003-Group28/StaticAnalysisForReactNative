package defpackage;
/* compiled from: PG */
/* renamed from: bypa  reason: default package */
/* loaded from: classes4.dex */
public final class bypa {
    private final byqh a;

    public bypa(byqh byqhVar) {
        this.a = byqhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@defpackage.dzsi final defpackage.btlu r13, final defpackage.qjj r14, final defpackage.dlfv r15) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bypa.a(btlu, qjj, dlfv):void");
    }

    public final boolean b(qjj qjjVar, dlfv dlfvVar) {
        dljr dljrVar;
        bypk bypkVar = (bypk) this.a;
        String f = bypkVar.f(dlfvVar);
        if (dbsj.d(f)) {
            return true;
        }
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        if (dlgnVar.c == 19) {
            dljrVar = (dljr) dlgnVar.d;
        } else {
            dljrVar = dljr.k;
        }
        if (dljrVar.j && !bypkVar.c.s(dpyv.AREA_TRAFFIC.dm)) {
            return true;
        }
        qjl qjlVar = bypkVar.f;
        if (qjlVar != null) {
            int b = qjlVar.b(qjj.TRAFFIC_TO_PLACE, f);
            dljo dljoVar = dljrVar.g;
            if (dljoVar == null) {
                dljoVar = dljo.b;
            }
            if (b < dljoVar.a) {
                return true;
            }
        }
        return bypkVar.e.a(qjjVar, f);
    }
}
