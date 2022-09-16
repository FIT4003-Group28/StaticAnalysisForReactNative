package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buuu  reason: default package */
/* loaded from: classes4.dex */
public final class buuu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buuu(buut buutVar) {
        this.b = buutVar.a;
        this.c = buutVar.b;
        this.a = buutVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwsn dwsnVar = (dwsn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwsnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwsn dwsnVar, btzi<dwsn, dwsr> btziVar, Executor executor) {
        return this.b.a().a(dwsnVar, this.a, btziVar, executor);
    }
}
