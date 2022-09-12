package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busq  reason: default package */
/* loaded from: classes4.dex */
public final class busq implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busq(busp buspVar) {
        this.b = buspVar.a;
        this.c = buspVar.b;
        this.a = buspVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkem dkemVar = (dkem) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkemVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkem dkemVar, btzi<dkem, dkeo> btziVar, Executor executor) {
        return this.b.a().a(dkemVar, this.a, btziVar, executor);
    }
}
