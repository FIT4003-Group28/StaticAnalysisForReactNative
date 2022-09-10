package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buus  reason: default package */
/* loaded from: classes4.dex */
public final class buus implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buus(buur buurVar) {
        this.b = buurVar.a;
        this.c = buurVar.b;
        this.a = buurVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkzf dkzfVar = (dkzf) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkzfVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkzf dkzfVar, btzi<dkzf, dkzh> btziVar, Executor executor) {
        return this.b.a().a(dkzfVar, this.a, btziVar, executor);
    }
}
