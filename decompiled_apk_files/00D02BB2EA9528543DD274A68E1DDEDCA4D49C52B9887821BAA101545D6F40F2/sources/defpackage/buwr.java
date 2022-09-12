package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buwr  reason: default package */
/* loaded from: classes4.dex */
public final class buwr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwr(buwq buwqVar) {
        this.b = buwqVar.a;
        this.c = buwqVar.b;
        this.a = buwqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djoo djooVar = (djoo) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djooVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djoo djooVar, btzi<djoo, djoq> btziVar, Executor executor) {
        return this.b.a().a(djooVar, this.a, btziVar, executor);
    }
}
