package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burp  reason: default package */
/* loaded from: classes4.dex */
public final class burp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burp(buro buroVar) {
        this.b = buroVar.a;
        this.c = buroVar.b;
        this.a = buroVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dign dignVar = (dign) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dignVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dign dignVar, btzi<dign, digr> btziVar, Executor executor) {
        return this.b.a().a(dignVar, this.a, btziVar, executor);
    }
}
