package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvaa  reason: default package */
/* loaded from: classes4.dex */
public final class bvaa implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvaa(buzz buzzVar) {
        this.b = buzzVar.a;
        this.c = buzzVar.b;
        this.a = buzzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwup dwupVar = (dwup) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwupVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwup dwupVar, btzi<dwup, dwur> btziVar, Executor executor) {
        return this.b.a().a(dwupVar, this.a, btziVar, executor);
    }
}
