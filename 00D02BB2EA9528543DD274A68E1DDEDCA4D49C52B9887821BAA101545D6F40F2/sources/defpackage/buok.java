package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buok  reason: default package */
/* loaded from: classes4.dex */
public final class buok implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buok(buoj buojVar) {
        this.b = buojVar.a;
        this.c = buojVar.b;
        this.a = buojVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diaa diaaVar = (diaa) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diaaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diaa diaaVar, btzi<diaa, diac> btziVar, Executor executor) {
        return this.b.a().a(diaaVar, this.a, btziVar, executor);
    }
}
