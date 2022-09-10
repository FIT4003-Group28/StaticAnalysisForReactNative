package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupp  reason: default package */
/* loaded from: classes4.dex */
public final class bupp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupp(bupo bupoVar) {
        this.b = bupoVar.a;
        this.c = bupoVar.b;
        this.a = bupoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dibo diboVar = (dibo) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diboVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dibo diboVar, btzi<dibo, dibq> btziVar, Executor executor) {
        return this.b.a().a(diboVar, this.a, btziVar, executor);
    }
}
