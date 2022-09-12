package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzx  reason: default package */
/* loaded from: classes4.dex */
public final class buzx implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzx(buzw buzwVar) {
        this.b = buzwVar.a;
        this.c = buzwVar.b;
        this.a = buzwVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkck dkckVar = (dkck) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkckVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkck dkckVar, btzi<dkck, dkcm> btziVar, Executor executor) {
        return this.b.a().a(dkckVar, this.a, btziVar, executor);
    }
}
