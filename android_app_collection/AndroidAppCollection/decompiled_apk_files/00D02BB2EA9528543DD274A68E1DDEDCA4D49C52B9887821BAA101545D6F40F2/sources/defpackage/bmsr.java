package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bmsr  reason: default package */
/* loaded from: classes3.dex */
public final class bmsr implements degu<bmsj> {
    final /* synthetic */ bmsu a;

    public bmsr(bmsu bmsuVar) {
        this.a = bmsuVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ((ckco) this.a.b.a(ckgo.x)).a(ckgk.a(true != (th instanceof TimeoutException) ? 19 : 18));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi bmsj bmsjVar) {
        bmsj bmsjVar2 = bmsjVar;
        bmsu bmsuVar = this.a;
        dbsk.s(bmsjVar2);
        if (!bmsjVar2.a().a()) {
            deha.q(bmsjVar2.b().b().b(), new bmst(bmsuVar), dege.a);
            return;
        }
        bmsjVar2.a().b();
        bmsi bmsiVar = bmsi.a;
        ((ckco) bmsuVar.b.a(ckgo.x)).a(ckgk.a(20));
    }
}
