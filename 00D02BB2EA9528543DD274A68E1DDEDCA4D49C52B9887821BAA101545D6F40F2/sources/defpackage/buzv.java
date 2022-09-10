package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzv  reason: default package */
/* loaded from: classes4.dex */
public final class buzv implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzv(buzu buzuVar) {
        this.b = buzuVar.a;
        this.c = buzuVar.b;
        this.a = buzuVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dlxy dlxyVar = (dlxy) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dlxyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dlxy dlxyVar, btzi<dlxy, dlya> btziVar, Executor executor) {
        return this.b.a().a(dlxyVar, this.a, btziVar, executor);
    }
}
