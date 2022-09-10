package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bukc  reason: default package */
/* loaded from: classes4.dex */
public final class bukc implements buka {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bukc(bukb bukbVar) {
        this.b = bukbVar.a;
        this.c = bukbVar.b;
        this.a = bukbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dunb dunbVar, btzi<dunb, dund> btziVar, bvrj bvrjVar) {
        dunb dunbVar2 = dunbVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dunbVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dunb, dund>> c(dunb dunbVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dunb dunbVar, btzi<dunb, dund> btziVar, Executor executor) {
        return this.b.a().a(dunbVar, this.a, btziVar, executor);
    }
}
