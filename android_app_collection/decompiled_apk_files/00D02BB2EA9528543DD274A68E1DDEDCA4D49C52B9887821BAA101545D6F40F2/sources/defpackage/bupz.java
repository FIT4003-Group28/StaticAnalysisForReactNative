package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupz  reason: default package */
/* loaded from: classes4.dex */
public final class bupz implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupz(bupy bupyVar) {
        this.b = bupyVar.a;
        this.c = bupyVar.b;
        this.a = bupyVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwcw dwcwVar = (dwcw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwcwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwcw dwcwVar, btzi<dwcw, dwcy> btziVar, Executor executor) {
        return this.b.a().a(dwcwVar, this.a, btziVar, executor);
    }
}
