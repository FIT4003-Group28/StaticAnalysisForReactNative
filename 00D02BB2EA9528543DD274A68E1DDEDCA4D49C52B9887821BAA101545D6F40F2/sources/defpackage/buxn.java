package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxn  reason: default package */
/* loaded from: classes4.dex */
public final class buxn implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxn(buxm buxmVar) {
        this.b = buxmVar.a;
        this.c = buxmVar.b;
        this.a = buxmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwir dwirVar = (dwir) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwirVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwir dwirVar, btzi<dwir, dwiv> btziVar, Executor executor) {
        return this.b.a().a(dwirVar, this.a, btziVar, executor);
    }
}
