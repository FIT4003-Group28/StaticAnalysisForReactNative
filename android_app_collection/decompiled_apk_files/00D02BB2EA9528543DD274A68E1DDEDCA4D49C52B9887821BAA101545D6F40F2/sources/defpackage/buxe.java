package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxe  reason: default package */
/* loaded from: classes.dex */
public final class buxe implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxe(buxd buxdVar) {
        this.b = buxdVar.a;
        this.c = buxdVar.b;
        this.a = buxdVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dxai dxaiVar = (dxai) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dxaiVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dxai dxaiVar, btzi<dxai, dxam> btziVar, Executor executor) {
        return this.b.a().a(dxaiVar, this.a, btziVar, executor);
    }
}
