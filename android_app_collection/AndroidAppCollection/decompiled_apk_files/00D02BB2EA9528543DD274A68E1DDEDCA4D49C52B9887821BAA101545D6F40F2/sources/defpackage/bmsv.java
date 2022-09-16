package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bmsv  reason: default package */
/* loaded from: classes3.dex */
final class bmsv implements degu<bmsl> {
    final /* synthetic */ bmsw a;

    public bmsv(bmsw bmswVar) {
        this.a = bmswVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            bmsw bmswVar = this.a;
            bmswVar.e.b(bmswVar.a, bmswVar.b, bmswVar.c, bmswVar.d);
            return;
        }
        bmsw bmswVar2 = this.a;
        bmswVar2.e.a(bmswVar2.a, bmswVar2.b, bmswVar2.c, bmswVar2.d);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(bmsl bmslVar) {
        dbsg<bmsk> a = bmslVar.a();
        if (!a.a() || !bmsk.RPC_FAILED.equals(a.b())) {
            bmsw bmswVar = this.a;
            bmswVar.e.a(bmswVar.a, bmswVar.b, bmswVar.c, bmswVar.d);
            return;
        }
        bmsw bmswVar2 = this.a;
        bmswVar2.e.b(bmswVar2.a, bmswVar2.b, bmswVar2.c, bmswVar2.d);
    }
}
