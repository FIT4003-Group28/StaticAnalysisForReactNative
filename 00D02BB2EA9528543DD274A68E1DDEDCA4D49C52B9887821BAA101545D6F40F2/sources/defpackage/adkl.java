package defpackage;
/* compiled from: PG */
/* renamed from: adkl  reason: default package */
/* loaded from: classes.dex */
public class adkl extends aczs implements adkk {
    @dzsi
    private String a;
    private final abrd b;
    private final absg c;

    public adkl(abwh abwhVar, acwt acwtVar, absg absgVar) {
        abwh.a(abwhVar.a.a(), 1);
        abuo a = abwhVar.b.a();
        abwh.a(a, 2);
        dxio a2 = ((dxjh) abwhVar.c).a();
        abwh.a(a2, 3);
        abwf a3 = abwhVar.d.a();
        abwh.a(a3, 4);
        abwh.a(absgVar, 7);
        this.b = new abwg(a, a2, a3, acwtVar, absgVar);
        this.c = absgVar;
    }

    @Override // defpackage.adkk
    public abrd a() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(@defpackage.dzsi defpackage.dviz r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L27
            int r1 = r4.a
            r1 = r1 & 4
            if (r1 == 0) goto L27
            djrs r1 = r4.d
            if (r1 != 0) goto Lf
            djrs r1 = defpackage.djrs.g
        Lf:
            dsrj<djrm> r1 = r1.a
            int r1 = r1.size()
            if (r1 <= 0) goto L27
            djrs r1 = r4.d
            if (r1 != 0) goto L1d
            djrs r1 = defpackage.djrs.g
        L1d:
            dsrj<djrm> r1 = r1.a
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            djrm r1 = (defpackage.djrm) r1
            goto L28
        L27:
            r1 = r0
        L28:
            abrd r2 = r3.b
            java.lang.Boolean r1 = r2.a(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L40
            if (r4 == 0) goto L3e
            int r1 = r4.a
            r1 = r1 & 1
            if (r1 == 0) goto L3e
            java.lang.String r0 = r4.b
        L3e:
            r3.a = r0
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adkl.b(dviz):void");
    }

    public boolean c() {
        return !this.b.c().isEmpty();
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a);
        b.d = this.c == absg.AREA_EXPLORE ? dtxj.cU : dtxr.aR;
        return b.a();
    }
}
