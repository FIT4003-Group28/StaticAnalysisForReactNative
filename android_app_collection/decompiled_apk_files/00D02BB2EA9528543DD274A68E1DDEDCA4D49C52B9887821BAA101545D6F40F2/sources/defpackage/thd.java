package defpackage;
/* compiled from: PG */
/* renamed from: thd  reason: default package */
/* loaded from: classes7.dex */
public final class thd {
    public final tgf a;

    public thd(tgf tgfVar) {
        this.a = tgfVar;
    }

    public static tgs a(tgf tgfVar, btlu btluVar, final dbsg<dqvj> dbsgVar, final dbsg<dwao> dbsgVar2) {
        tgp tgpVar = new tgp();
        tgpVar.b = dbpy.a;
        tgpVar.c = dbpy.a;
        tgpVar.b(dbpy.a);
        tgpVar.b(dbsgVar);
        if (btluVar != null) {
            tgpVar.a = btluVar;
            tgpVar.d = new tgu(dbsgVar2, dbsgVar) { // from class: thb
                private final dbsg a;
                private final dbsg b;

                {
                    this.a = dbsgVar2;
                    this.b = dbsgVar;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
                    if (r9 != 5) goto L20;
                 */
                @Override // defpackage.tgu
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final defpackage.dwao a(defpackage.dwao r9) {
                    /*
                        Method dump skipped, instructions count: 427
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.thb.a(dwao):dwao");
                }
            };
            tgpVar.f = new thc(tgfVar);
            return tgpVar;
        }
        throw new NullPointerException("Null gmmAccount");
    }

    public final tgv b(btlu btluVar, dbsg<dqvj> dbsgVar, dbsg<dwao> dbsgVar2) {
        tgs a = a(this.a, btluVar, dbsgVar, dbsgVar2);
        ((tgp) a).e = 1;
        return a.a();
    }
}
