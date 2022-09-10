package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busi  reason: default package */
/* loaded from: classes4.dex */
public final class busi implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busi(bush bushVar) {
        this.b = bushVar.a;
        this.c = bushVar.b;
        this.a = bushVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwvn dwvnVar = (dwvn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwvnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwvn dwvnVar, btzi<dwvn, dwvp> btziVar, Executor executor) {
        return this.b.a().a(dwvnVar, this.a, btziVar, executor);
    }
}
