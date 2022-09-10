package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buye  reason: default package */
/* loaded from: classes4.dex */
public final class buye implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buye(buyd buydVar) {
        this.b = buydVar.a;
        this.c = buydVar.b;
        this.a = buydVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwjn dwjnVar = (dwjn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwjnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwjn dwjnVar, btzi<dwjn, dwjp> btziVar, Executor executor) {
        return this.b.a().a(dwjnVar, this.a, btziVar, executor);
    }
}
