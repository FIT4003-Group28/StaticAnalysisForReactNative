package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: wiq  reason: default package */
/* loaded from: classes7.dex */
public final class wiq extends ges {
    public cqat a;
    public cqkj b;
    public efg c;
    public wix d;
    @dzsi
    cqkf<wiu> e;
    private wiw f;

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r12) {
        /*
            r11 = this;
            android.os.Bundle r0 = r11.o
            r1 = 0
            if (r0 != 0) goto L7
        L5:
            r0 = r1
            goto L3b
        L7:
            java.lang.String r2 = "StartBusynessScreenParams.openHours"
            java.io.Serializable r2 = r0.getSerializable(r2)
            boolean r3 = r2 instanceof defpackage.byee
            if (r3 != 0) goto L12
            goto L5
        L12:
            qcf r3 = defpackage.qcg.d()
            java.lang.String r4 = "StartBusynessScreenParams.title"
            java.lang.String r5 = ""
            java.lang.String r4 = r0.getString(r4, r5)
            r3.d(r4)
            dvvo r4 = defpackage.dvvo.e
            dsqa r5 = defpackage.dsqa.c()
            java.lang.String r6 = "StartBusynessScreenParams.tactileBusyness"
            dssj r0 = defpackage.dsuv.c(r0, r6, r4, r5)
            dvvo r0 = (defpackage.dvvo) r0
            r3.b(r0)
            byee r2 = (defpackage.byee) r2
            r3.c(r2)
            qcg r0 = r3.a()
        L3b:
            if (r0 != 0) goto L3e
            return
        L3e:
            super.l(r12)
            cqkj r12 = r11.b
            wit r2 = new wit
            r2.<init>()
            cqkf r12 = r12.e(r2)
            r11.e = r12
            byee r12 = r0.c()
            cqat r2 = r11.a
            bydp r12 = r12.e(r2)
            dvvo r2 = r0.b()
            int r2 = r2.a
            r3 = 2
            r2 = r2 & r3
            if (r2 == 0) goto L72
            dvvo r1 = r0.b()
            dvvs r1 = r1.d
            if (r1 != 0) goto L6c
            dvvs r1 = defpackage.dvvs.g
        L6c:
            int r1 = r1.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L72:
            r10 = r1
            wix r1 = r11.d
            java.lang.String r7 = r0.a()
            dvvo r8 = r0.b()
            byea r12 = r12.a
            int r12 = r12.h
            dpol r9 = defpackage.bvtb.r(r12)
            wiw r12 = new wiw
            dzsj<android.app.Activity> r0 = r1.a
            dxjd r0 = (defpackage.dxjd) r0
            T r0 = r0.a
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            r0 = 1
            defpackage.wix.a(r5, r0)
            dzsj<acrq> r0 = r1.b
            java.lang.Object r0 = r0.a()
            r6 = r0
            acrq r6 = (defpackage.acrq) r6
            defpackage.wix.a(r6, r3)
            r0 = 3
            defpackage.wix.a(r7, r0)
            r0 = 4
            defpackage.wix.a(r8, r0)
            r0 = 5
            defpackage.wix.a(r9, r0)
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.f = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wiq.l(android.os.Bundle):void");
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        cqkf<wiu> cqkfVar = this.e;
        dbsk.s(cqkfVar);
        cqkfVar.e(this.f);
        efg efgVar = this.c;
        dbsk.s(efgVar);
        egj egjVar = new egj(this);
        egjVar.w(null);
        cqkf<wiu> cqkfVar2 = this.e;
        dbsk.s(cqkfVar2);
        egjVar.ag(cqkfVar2.c());
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        efgVar.a(egjVar.a());
    }
}
