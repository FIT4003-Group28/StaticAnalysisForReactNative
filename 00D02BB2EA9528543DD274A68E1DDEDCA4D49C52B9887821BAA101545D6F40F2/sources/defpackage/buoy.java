package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: buoy  reason: default package */
/* loaded from: classes4.dex */
public final class buoy implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buoy(buox buoxVar) {
        this.b = buoxVar.a;
        this.c = buoxVar.b;
        this.a = buoxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwaw dwawVar = (dwaw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwawVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwaw dwawVar, btzi<dwaw, dwbc> btziVar, Executor executor) {
        return this.b.a().a(dwawVar, this.a, btziVar, executor);
    }
}
