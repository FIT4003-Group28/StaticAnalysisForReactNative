package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvgn  reason: default package */
/* loaded from: classes4.dex */
public final class bvgn implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvgn(bvgm bvgmVar) {
        this.b = bvgmVar.a;
        this.c = bvgmVar.b;
        this.a = bvgmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkcw dkcwVar = (dkcw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkcwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkcw dkcwVar, btzi<dkcw, dkcy> btziVar, Executor executor) {
        return this.b.a().a(dkcwVar, this.a, btziVar, executor);
    }
}
