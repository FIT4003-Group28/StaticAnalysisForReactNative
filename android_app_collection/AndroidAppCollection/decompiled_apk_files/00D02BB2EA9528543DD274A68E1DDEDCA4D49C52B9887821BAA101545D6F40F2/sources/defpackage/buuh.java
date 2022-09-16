package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buuh  reason: default package */
/* loaded from: classes4.dex */
public final class buuh implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buuh(buug buugVar) {
        this.b = buugVar.a;
        this.c = buugVar.b;
        this.a = buugVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dile dileVar = (dile) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dileVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dile dileVar, btzi<dile, dilg> btziVar, Executor executor) {
        return this.b.a().a(dileVar, this.a, btziVar, executor);
    }
}
