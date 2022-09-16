package defpackage;
/* compiled from: PG */
/* renamed from: azxh  reason: default package */
/* loaded from: classes3.dex */
public final class azxh extends azwh<azxi> {
    public dolo a;
    public dcdc<azxg> b;

    public azxh(azxi azxiVar) {
        super(azxiVar);
        this.b = dcdc.e();
        this.a = azxiVar.j();
        this.b = azxiVar.a;
    }

    @Override // defpackage.azwh
    /* renamed from: a */
    public final azxi b() {
        return new azxi(this);
    }

    public final void c(dpot dpotVar) {
        dolo doloVar = this.a;
        dsqp dsqpVar = (dsqp) doloVar.cu(5);
        dsqpVar.bC(doloVar);
        doln dolnVar = (doln) dsqpVar;
        if (dolnVar.c) {
            dolnVar.bF();
            dolnVar.c = false;
        }
        dolo doloVar2 = (dolo) dolnVar.b;
        dolo doloVar3 = dolo.d;
        dpotVar.getClass();
        doloVar2.b = dpotVar;
        doloVar2.a |= 1;
        this.a = dolnVar.bK();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public azxh(defpackage.dolo r6) {
        /*
            r5 = this;
            dolk r0 = defpackage.azwm.h
            dojz r1 = r6.c
            if (r1 != 0) goto L8
            dojz r1 = defpackage.dojz.c
        L8:
            r5.<init>(r0, r1)
            dcdc r0 = defpackage.dcdc.e()
            r5.b = r0
            dpot r0 = r6.b
            if (r0 != 0) goto L17
            dpot r0 = defpackage.dpot.m
        L17:
            dpov r0 = r0.b
            if (r0 != 0) goto L1d
            dpov r0 = defpackage.dpov.f
        L1d:
            java.lang.String r0 = r0.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4b
            java.util.Locale r0 = java.util.Locale.US
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            long r3 = java.lang.System.nanoTime()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "%d_%d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            r5.d = r0
        L48:
            r5.h = r0
            goto L60
        L4b:
            dpot r0 = r6.b
            if (r0 != 0) goto L51
            dpot r0 = defpackage.dpot.m
        L51:
            dpov r0 = r0.b
            if (r0 != 0) goto L57
            dpov r0 = defpackage.dpov.f
        L57:
            java.lang.String r0 = r0.b
            r5.d = r0
            java.lang.String r0 = r5.d
            r5.g = r0
            goto L48
        L60:
            r5.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxh.<init>(dolo):void");
    }
}
