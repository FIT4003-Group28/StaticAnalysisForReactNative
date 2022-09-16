package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buov  reason: default package */
/* loaded from: classes4.dex */
public final class buov implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buov(buou buouVar) {
        this.b = buouVar.a;
        this.c = buouVar.b;
        this.a = buouVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dics dicsVar = (dics) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dicsVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dics dicsVar, btzi<dics, dicu> btziVar, Executor executor) {
        return this.b.a().a(dicsVar, this.a, btziVar, executor);
    }
}
