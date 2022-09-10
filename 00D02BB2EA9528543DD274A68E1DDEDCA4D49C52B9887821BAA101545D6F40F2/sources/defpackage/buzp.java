package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzp  reason: default package */
/* loaded from: classes4.dex */
public final class buzp implements buzn {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzp(buzo buzoVar) {
        this.b = buzoVar.a;
        this.c = buzoVar.b;
        this.a = buzoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dwdk dwdkVar, btzi<dwdk, dwdm> btziVar, bvrj bvrjVar) {
        dwdk dwdkVar2 = dwdkVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwdkVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dwdk, dwdm>> c(dwdk dwdkVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwdk dwdkVar, btzi<dwdk, dwdm> btziVar, Executor executor) {
        return this.b.a().a(dwdkVar, this.a, btziVar, executor);
    }
}
