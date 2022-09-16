package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buls  reason: default package */
/* loaded from: classes4.dex */
public final class buls implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buls(bulr bulrVar) {
        this.b = bulrVar.a;
        this.c = bulrVar.b;
        this.a = bulrVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhtu dhtuVar = (dhtu) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhtuVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhtu dhtuVar, btzi<dhtu, dhtw> btziVar, Executor executor) {
        return this.b.a().a(dhtuVar, this.a, btziVar, executor);
    }
}
