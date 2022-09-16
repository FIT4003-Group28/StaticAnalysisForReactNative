package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbg  reason: default package */
/* loaded from: classes4.dex */
public final class bvbg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbg(bvbf bvbfVar) {
        this.b = bvbfVar.a;
        this.c = bvbfVar.b;
        this.a = bvbfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwvr dwvrVar = (dwvr) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwvrVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwvr dwvrVar, btzi<dwvr, dwvt> btziVar, Executor executor) {
        return this.b.a().a(dwvrVar, this.a, btziVar, executor);
    }
}
