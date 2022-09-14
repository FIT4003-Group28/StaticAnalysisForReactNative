package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvam  reason: default package */
/* loaded from: classes4.dex */
public final class bvam implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvam(bval bvalVar) {
        this.b = bvalVar.a;
        this.c = bvalVar.b;
        this.a = bvalVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwjv dwjvVar = (dwjv) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwjvVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwjv dwjvVar, btzi<dwjv, dwjx> btziVar, Executor executor) {
        return this.b.a().a(dwjvVar, this.a, btziVar, executor);
    }
}
