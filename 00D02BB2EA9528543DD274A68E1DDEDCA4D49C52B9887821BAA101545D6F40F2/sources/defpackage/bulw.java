package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bulw  reason: default package */
/* loaded from: classes4.dex */
public final class bulw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bulw(bulv bulvVar) {
        this.b = bulvVar.a;
        this.c = bulvVar.b;
        this.a = bulvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhuc dhucVar = (dhuc) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhucVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhuc dhucVar, btzi<dhuc, dhue> btziVar, Executor executor) {
        return this.b.a().a(dhucVar, this.a, btziVar, executor);
    }
}
