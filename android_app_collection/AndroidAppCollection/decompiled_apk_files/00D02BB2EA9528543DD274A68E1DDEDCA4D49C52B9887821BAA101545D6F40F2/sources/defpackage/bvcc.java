package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvcc  reason: default package */
/* loaded from: classes4.dex */
public final class bvcc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvcc(bvcb bvcbVar) {
        this.b = bvcbVar.a;
        this.c = bvcbVar.b;
        this.a = bvcbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diae diaeVar = (diae) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diaeVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diae diaeVar, btzi<diae, diag> btziVar, Executor executor) {
        return this.b.a().a(diaeVar, this.a, btziVar, executor);
    }
}
