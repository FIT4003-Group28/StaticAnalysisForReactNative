package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: bmst  reason: default package */
/* loaded from: classes3.dex */
final class bmst implements degu<bmsl> {
    final /* synthetic */ bmsu a;

    public bmst(bmsu bmsuVar) {
        this.a = bmsuVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ((ckco) this.a.b.a(ckgo.x)).a(ckgk.a(true != (th instanceof TimeoutException) ? 22 : 21));
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi bmsl bmslVar) {
        bmsl bmslVar2 = bmslVar;
        bmsu bmsuVar = this.a;
        dbsk.s(bmslVar2);
        if (!bmslVar2.a().a()) {
            ((ckco) bmsuVar.b.a(ckgo.x)).a(ckgk.a(2));
            return;
        }
        ckco ckcoVar = (ckco) bmsuVar.b.a(ckgo.x);
        bmsk bmskVar = bmsk.RPC_FAILED;
        int ordinal = bmslVar2.a().b().ordinal();
        int i = 7;
        if (ordinal != 0 && ordinal == 1) {
            i = 23;
        }
        ckcoVar.a(ckgk.a(i));
    }
}
