package defpackage;

import android.accounts.Account;
/* compiled from: PG */
/* renamed from: bcop  reason: default package */
/* loaded from: classes3.dex */
public class bcop extends bcmu {
    public final dxio<afha> s;
    private final akfa t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bcop(defpackage.bcms r13, android.app.Activity r14, defpackage.akfa r15, defpackage.dxio<defpackage.afha> r16, defpackage.dweu r17, defpackage.bbuq r18, @defpackage.dzsi defpackage.dwfl r19, @defpackage.dzsi defpackage.ilo r20, boolean r21) {
        /*
            r12 = this;
            r11 = r12
            r0 = r14
            if (r20 == 0) goto L12
            boolean r1 = r20.bH()
            if (r1 == 0) goto L12
            r1 = 2131953999(0x7f13094f, float:1.9544485E38)
            java.lang.String r0 = r14.getString(r1)
            goto L19
        L12:
            r1 = 2131953988(0x7f130944, float:1.9544463E38)
            java.lang.String r0 = r14.getString(r1)
        L19:
            r2 = r0
            cjta r0 = defpackage.cjtd.b()
            ddho r1 = defpackage.dtxy.bI
            r0.d = r1
            if (r20 == 0) goto L2b
            cjtd r1 = r20.a()
            java.lang.String r1 = r1.e
            goto L2c
        L2b:
            r1 = 0
        L2c:
            r0.b = r1
            cjtd r6 = r0.a()
            if (r20 == 0) goto L41
            boolean r0 = r20.bH()
            if (r0 == 0) goto L41
            ddho r0 = defpackage.dtxy.bU
            cjtd r0 = defpackage.cjtd.a(r0)
            goto L47
        L41:
            ddho r0 = defpackage.dtxy.bQ
            cjtd r0 = defpackage.cjtd.a(r0)
        L47:
            r7 = r0
            r9 = 0
            r0 = r12
            r1 = r13
            r3 = r17
            r4 = r18
            r5 = r19
            r8 = r20
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r15
            r11.t = r0
            r0 = r16
            r11.s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcop.<init>(bcms, android.app.Activity, akfa, dxio, dweu, bbuq, dwfl, ilo, boolean):void");
    }

    @Override // defpackage.bcmu, defpackage.bclv
    public cqkl A() {
        ilo iloVar = this.m;
        if (iloVar != null && (iloVar.bf().a & 16777216) != 0) {
            dvwi dvwiVar = this.m.bf().v;
            if (dvwiVar == null) {
                dvwiVar = dvwi.m;
            }
            if ((dvwiVar.a & 1) != 0) {
                dvwi dvwiVar2 = this.m.bf().v;
                if (dvwiVar2 == null) {
                    dvwiVar2 = dvwi.m;
                }
                dnpq dnpqVar = dvwiVar2.b;
                if (dnpqVar == null) {
                    dnpqVar = dnpq.g;
                }
                String str = dnpqVar.c;
                Account m = this.t.m();
                if (m == null) {
                    M(str);
                } else {
                    this.d.b(new bcoo(this, m, str), bvrj.BACKGROUND_THREADPOOL);
                }
            }
        }
        return cqkl.a;
    }

    public final void M(final String str) {
        this.d.b(new Runnable(this, str) { // from class: bcom
            private final bcop a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bcop bcopVar = this.a;
                bcopVar.s.a().H(bcopVar.c, this.b, 1);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.bcmu, defpackage.bclv
    public bcmg u() {
        if (this.n == null) {
            this.n = new bcon(this);
        }
        return this.n;
    }

    @Override // defpackage.bcmu, defpackage.bclv
    public Boolean w() {
        ilo iloVar = this.m;
        boolean z = false;
        if (iloVar != null && iloVar.bf().r && !u().a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
