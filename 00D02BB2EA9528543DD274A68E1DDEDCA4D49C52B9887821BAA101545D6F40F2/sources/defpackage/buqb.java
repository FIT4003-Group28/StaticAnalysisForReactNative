package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqb  reason: default package */
/* loaded from: classes4.dex */
public final class buqb implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqb(buqa buqaVar) {
        this.b = buqaVar.a;
        this.c = buqaVar.b;
        this.a = buqaVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwzw dwzwVar = (dwzw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwzwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwzw dwzwVar, btzi<dwzw, dxaa> btziVar, Executor executor) {
        return this.b.a().a(dwzwVar, this.a, btziVar, executor);
    }
}
