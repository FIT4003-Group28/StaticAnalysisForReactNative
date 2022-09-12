package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buoc  reason: default package */
/* loaded from: classes4.dex */
public final class buoc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buoc(buob buobVar) {
        this.b = buobVar.a;
        this.c = buobVar.b;
        this.a = buobVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhnf dhnfVar = (dhnf) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhnfVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhnf dhnfVar, btzi<dhnf, dhnl> btziVar, Executor executor) {
        return this.b.a().a(dhnfVar, this.a, btziVar, executor);
    }
}
