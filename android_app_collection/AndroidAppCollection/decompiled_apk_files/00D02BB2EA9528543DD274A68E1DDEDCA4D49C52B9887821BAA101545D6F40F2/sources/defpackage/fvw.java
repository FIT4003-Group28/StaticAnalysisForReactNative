package defpackage;

import android.app.Application;
import android.os.IBinder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fvw  reason: default package */
/* loaded from: classes6.dex */
public final class fvw implements dxis {
    public volatile Object a = new dxjf();
    public volatile Object b = new dxjf();
    final /* synthetic */ fyu c;
    private volatile dzsj<avod> d;
    private volatile dzsj<IBinder> e;

    public fvw(fyu fyuVar) {
        this.c = fyuVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        avsu avsuVar = (avsu) obj;
        ckcw rU = this.c.a.rU();
        dxjg.e(rU);
        avsuVar.a = rU;
        avsuVar.b = this.c.qc();
        dcen O = dcep.O(2);
        Application a = this.c.a.a();
        dxjg.e(a);
        new avzq(a);
        if (this.d == null) {
            this.d = new fvv(this, 0);
        }
        dcmr<Object> dcmrVar = dcmr.a;
        dxjg.f(dcmrVar);
        O.i(dcmrVar);
        if (this.e == null) {
            this.e = new fvv(this, 1);
        }
        dcmr<Object> dcmrVar2 = dcmr.a;
        dxjg.f(dcmrVar2);
        O.i(dcmrVar2);
        avsuVar.c = O.f();
    }
}
