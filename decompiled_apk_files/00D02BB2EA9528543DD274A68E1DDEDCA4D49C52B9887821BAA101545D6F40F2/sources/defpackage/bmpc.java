package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bmpc  reason: default package */
/* loaded from: classes3.dex */
final class bmpc implements degu<bmoa> {
    final /* synthetic */ dmjz a;
    final /* synthetic */ bmph b;

    public bmpc(bmph bmphVar, dmjz dmjzVar) {
        this.b = bmphVar;
        this.a = dmjzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.c(true != (th instanceof TimeoutException) ? 4 : 14, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi bmoa bmoaVar) {
        bmoa bmoaVar2 = bmoaVar;
        bmph bmphVar = this.b;
        dbsk.s(bmoaVar2);
        dmjz dmjzVar = this.a;
        if (dtcc.d.equals(bmoaVar2.a())) {
            ((ckcn) bmphVar.d.a().a(ckgo.C)).a();
        }
        dbsg<bmnz> b = bmoaVar2.b();
        if (!b.a()) {
            ((ckcn) bmphVar.d.a().a(ckgo.G)).a();
            return;
        }
        b.b();
        bmphVar.c(5, dmjzVar);
    }
}
