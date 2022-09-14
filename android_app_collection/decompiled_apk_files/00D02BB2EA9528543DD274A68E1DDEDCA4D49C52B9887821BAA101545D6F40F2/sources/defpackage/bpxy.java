package defpackage;

import android.app.ProgressDialog;
/* compiled from: PG */
/* renamed from: bpxy  reason: default package */
/* loaded from: classes4.dex */
public final class bpxy {
    @dzsi
    public bwrs<ilo> a;
    private final gga b;
    private final bwqv c;
    private final befw d;
    @dzsi
    private ProgressDialog e;

    public bpxy(gga ggaVar, bwqv bwqvVar, befw befwVar, @dzsi bwrs<ilo> bwrsVar) {
        this.b = ggaVar;
        this.c = bwqvVar;
        this.d = befwVar;
        this.a = bwrsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0.ai().equals(r5) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.akqi r5, final defpackage.bpxx r6) {
        /*
            r4 = this;
            bvrj r0 = defpackage.bvrj.UI_THREAD
            r0.c()
            r4.b()
            bwrs<ilo> r0 = r4.a
            if (r0 == 0) goto L1f
            java.io.Serializable r0 = r0.c()
            ilo r0 = (defpackage.ilo) r0
            defpackage.dbsk.s(r0)
            akqi r0 = r0.ai()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L31
        L1f:
            ily r0 = new ily
            r0.<init>()
            r0.j(r5)
            ilo r5 = r0.d()
            bwrs r5 = defpackage.bwrs.a(r5)
            r4.a = r5
        L31:
            bwrs<ilo> r5 = r4.a
            if (r5 == 0) goto L46
            java.io.Serializable r5 = r5.c()
            ilo r5 = (defpackage.ilo) r5
            defpackage.dbsk.s(r5)
            boolean r0 = r5.f
            if (r0 == 0) goto L46
            r6.a(r5)
            return
        L46:
            android.app.ProgressDialog r5 = new android.app.ProgressDialog
            gga r0 = r4.b
            r1 = 0
            r5.<init>(r0, r1)
            r4.e = r5
            gga r0 = r4.b
            r2 = 2131958838(0x7f131c36, float:1.95543E38)
            java.lang.String r0 = r0.getString(r2)
            r5.setMessage(r0)
            android.app.ProgressDialog r5 = r4.e
            bpxw r0 = new bpxw
            r0.<init>(r4)
            r5.setOnCancelListener(r0)
            android.app.ProgressDialog r5 = r4.e
            r5.show()
            befu r5 = defpackage.befv.p()
            bwrs<ilo> r0 = r4.a
            defpackage.dbsk.s(r0)
            r5.j(r0)
            r0 = 1
            r5.g(r0)
            r5.k(r0)
            befv r5 = r5.m()
            bwqv r0 = r4.c
            bwrs<ilo> r2 = r4.a
            defpackage.dbsk.s(r2)
            bpxv r3 = new bpxv
            r3.<init>(r4, r6)
            r0.f(r2, r3, r1)
            befw r6 = r4.d
            r6.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpxy.a(akqi, bpxx):void");
    }

    public final void b() {
        c();
        this.d.c();
    }

    public final void c() {
        ProgressDialog progressDialog;
        if (this.b.isFinishing() || (progressDialog = this.e) == null || !progressDialog.isShowing()) {
            return;
        }
        this.e.dismiss();
    }
}
