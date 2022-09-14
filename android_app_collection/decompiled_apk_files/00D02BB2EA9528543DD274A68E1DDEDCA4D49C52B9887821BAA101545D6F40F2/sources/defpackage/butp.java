package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: butp  reason: default package */
/* loaded from: classes4.dex */
public final class butp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butp(buto butoVar) {
        this.b = butoVar.a;
        this.c = butoVar.b;
        this.a = butoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dilk dilkVar = (dilk) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dilkVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dilk dilkVar, btzi<dilk, dilm> btziVar, Executor executor) {
        return this.b.a().a(dilkVar, this.a, btziVar, executor);
    }
}
