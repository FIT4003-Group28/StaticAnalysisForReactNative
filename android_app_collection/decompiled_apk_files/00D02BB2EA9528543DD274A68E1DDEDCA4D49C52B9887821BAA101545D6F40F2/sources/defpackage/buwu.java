package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwu  reason: default package */
/* loaded from: classes4.dex */
public final class buwu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwu(buwt buwtVar) {
        this.b = buwtVar.a;
        this.c = buwtVar.b;
        this.a = buwtVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        buff buffVar = (buff) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(buffVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(buff buffVar, btzi<buff, bufh> btziVar, Executor executor) {
        return this.b.a().a(buffVar, this.a, btziVar, executor);
    }
}
