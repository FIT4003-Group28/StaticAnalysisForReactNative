package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bulu  reason: default package */
/* loaded from: classes4.dex */
public final class bulu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bulu(bult bultVar) {
        this.b = bultVar.a;
        this.c = bultVar.b;
        this.a = bultVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhty dhtyVar = (dhty) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhtyVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhty dhtyVar, btzi<dhty, dhua> btziVar, Executor executor) {
        return this.b.a().a(dhtyVar, this.a, btziVar, executor);
    }
}
