package defpackage;
/* compiled from: PG */
/* renamed from: azxf  reason: default package */
/* loaded from: classes3.dex */
public final class azxf extends azwh<azxg> {
    public dolm a;

    public azxf(azxg azxgVar) {
        super(azxgVar);
        this.a = azxgVar.g();
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azxg b() {
        if (!dbsj.d(this.h)) {
            dppl dpplVar = this.a.b;
            if (dpplVar == null) {
                dpplVar = dppl.m;
            }
            dppt dpptVar = dpplVar.d;
            if (dpptVar == null) {
                dpptVar = dppt.e;
            }
            String str = this.h;
            dbsk.s(str);
            this.d = azxg.l(dpptVar, str);
        }
        return new azxg(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public azxf(defpackage.dolm r12) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxf.<init>(dolm):void");
    }
}
