package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burd  reason: default package */
/* loaded from: classes4.dex */
public final class burd implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burd(burc burcVar) {
        this.b = burcVar.a;
        this.c = burcVar.b;
        this.a = burcVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dibk dibkVar = (dibk) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dibkVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dibk dibkVar, btzi<dibk, dibm> btziVar, Executor executor) {
        return this.b.a().a(dibkVar, this.a, btziVar, executor);
    }
}
