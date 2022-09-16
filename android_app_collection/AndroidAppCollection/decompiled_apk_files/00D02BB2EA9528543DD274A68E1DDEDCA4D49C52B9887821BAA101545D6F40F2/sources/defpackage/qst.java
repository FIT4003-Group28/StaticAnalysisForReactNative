package defpackage;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: qst  reason: default package */
/* loaded from: classes7.dex */
public final class qst extends dxiz implements qur {
    public qsw a;
    public qtt b;
    public Executor c;
    @dzsi
    private cryz<Runnable> d;
    private final degu<Runnable> e = new qsr(this);

    @Override // defpackage.gfr
    public final fd Ny() {
        return this;
    }

    @Override // defpackage.qur
    public final quy aJ() {
        return null;
    }

    @Override // defpackage.qur
    public final void aR() {
    }

    public final void d() {
        gn gnVar = this.A;
        if (gnVar == null || gnVar.J()) {
            return;
        }
        gz b = gnVar.b();
        b.u(this);
        b.g();
    }

    @Override // defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            qtt qttVar = this.b;
            qttVar.b = qttVar.a.e();
        }
    }

    @Override // defpackage.qur
    public final qux q() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r11 = this;
            super.s()
            dbpy<java.lang.Object> r0 = defpackage.dbpy.a
            android.os.Bundle r1 = r11.o
            r2 = 0
            if (r1 == 0) goto L7d
            java.lang.String r3 = "COMMUTE_HUB_SAVED_STATE"
            boolean r4 = r1.containsKey(r3)
            if (r4 == 0) goto L63
            android.os.Bundle r3 = r1.getBundle(r3)
            java.lang.String r4 = "hub-state"
            java.io.Serializable r4 = r3.getSerializable(r4)
            r6 = r4
            quy r6 = (defpackage.quy) r6
            java.lang.String r4 = "directive"
            android.os.Bundle r4 = r3.getBundle(r4)
            if (r4 != 0) goto L29
        L27:
            r7 = r2
            goto L48
        L29:
            java.lang.String r5 = "destination-type"
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r4.getInt(r5, r7)
            dndr r5 = defpackage.dndr.b(r5)
            java.lang.String r8 = "travel-mode"
            int r4 = r4.getInt(r8, r7)
            domy r4 = defpackage.domy.b(r4)
            if (r5 == 0) goto L27
            if (r4 == 0) goto L27
            quk r7 = new quk
            r7.<init>(r5, r4)
        L48:
            java.lang.String r4 = "fragment-state"
            android.os.Parcelable r4 = r3.getParcelable(r4)
            r8 = r4
            android.support.v4.app.Fragment$SavedState r8 = (android.support.v4.app.Fragment$SavedState) r8
            java.lang.String r4 = "save-time"
            long r9 = r3.getLong(r4)
            if (r6 == 0) goto L63
            if (r8 != 0) goto L5c
            goto L63
        L5c:
            qul r3 = new qul
            r5 = r3
            r5.<init>(r6, r7, r8, r9)
            goto L64
        L63:
            r3 = r2
        L64:
            java.lang.String r4 = "DIRECTIONS_REQUEST_LOGGING_PARAMS"
            boolean r5 = r1.containsKey(r4)
            if (r5 == 0) goto L7e
            dnqh r0 = defpackage.dnqh.p
            dsqa r5 = defpackage.dsqa.c()
            dssj r0 = defpackage.dsuv.c(r1, r4, r0, r5)
            dnqh r0 = (defpackage.dnqh) r0
            dbsg r0 = defpackage.dbsg.i(r0)
            goto L7e
        L7d:
            r3 = r2
        L7e:
            qsw r1 = r11.a
            dehn r0 = r1.b(r2, r2, r3, r0)
            cryz r1 = new cryz
            degu<java.lang.Runnable> r2 = r11.e
            r1.<init>(r2)
            r11.d = r1
            java.util.concurrent.Executor r2 = r11.c
            defpackage.deha.q(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qst.s():void");
    }

    @Override // defpackage.fd
    public final void u() {
        cryz<Runnable> cryzVar = this.d;
        if (cryzVar != null) {
            cryzVar.c();
            this.d = null;
        }
        super.u();
    }

    @Override // defpackage.qur
    public final qup w() {
        return null;
    }
}
