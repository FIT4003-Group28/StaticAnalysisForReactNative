package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bmpb  reason: default package */
/* loaded from: classes3.dex */
final class bmpb implements degu<bmnp> {
    final /* synthetic */ dmjz a;
    final /* synthetic */ bmph b;

    public bmpb(bmph bmphVar, dmjz dmjzVar) {
        this.b = bmphVar;
        this.a = dmjzVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.c(true != (th instanceof TimeoutException) ? 10 : 13, this.a);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi bmnp bmnpVar) {
        bmnp bmnpVar2 = bmnpVar;
        bmph bmphVar = this.b;
        dbsk.s(bmnpVar2);
        dmjz dmjzVar = this.a;
        dbsg<bmno> b = bmnpVar2.b();
        if (!b.a()) {
            deha.q(bmnpVar2.a().b().a(), new bmpc(bmphVar, dmjzVar), dege.a);
            return;
        }
        bmphVar.c(10, dmjzVar);
        b.b();
    }
}
