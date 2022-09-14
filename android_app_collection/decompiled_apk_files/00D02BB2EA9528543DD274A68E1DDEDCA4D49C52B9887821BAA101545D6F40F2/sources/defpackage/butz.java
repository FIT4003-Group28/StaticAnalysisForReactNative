package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: butz  reason: default package */
/* loaded from: classes4.dex */
public final class butz implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butz(buty butyVar) {
        this.b = butyVar.a;
        this.c = butyVar.b;
        this.a = butyVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dimm dimmVar = (dimm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dimmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dimm dimmVar, btzi<dimm, dimq> btziVar, Executor executor) {
        return this.b.a().a(dimmVar, this.a, btziVar, executor);
    }
}
