package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupl  reason: default package */
/* loaded from: classes4.dex */
public final class bupl implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupl(bupk bupkVar) {
        this.b = bupkVar.a;
        this.c = bupkVar.b;
        this.a = bupkVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diaw diawVar = (diaw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diawVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diaw diawVar, btzi<diaw, dibd> btziVar, Executor executor) {
        return this.b.a().a(diawVar, this.a, btziVar, executor);
    }
}
