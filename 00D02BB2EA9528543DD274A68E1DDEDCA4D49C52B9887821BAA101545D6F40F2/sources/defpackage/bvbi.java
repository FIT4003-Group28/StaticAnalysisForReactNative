package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbi  reason: default package */
/* loaded from: classes4.dex */
public final class bvbi implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbi(bvbh bvbhVar) {
        this.b = bvbhVar.a;
        this.c = bvbhVar.b;
        this.a = bvbhVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwxn dwxnVar = (dwxn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwxnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwxn dwxnVar, btzi<dwxn, dwxp> btziVar, Executor executor) {
        return this.b.a().a(dwxnVar, this.a, btziVar, executor);
    }
}
