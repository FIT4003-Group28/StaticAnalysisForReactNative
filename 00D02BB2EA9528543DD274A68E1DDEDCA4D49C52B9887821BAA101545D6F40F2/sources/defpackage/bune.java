package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bune  reason: default package */
/* loaded from: classes4.dex */
public final class bune implements bunc {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bune(bund bundVar) {
        this.b = bundVar.a;
        this.c = bundVar.b;
        this.a = bundVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dwco dwcoVar, btzi<dwco, dwcq> btziVar, bvrj bvrjVar) {
        dwco dwcoVar2 = dwcoVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwcoVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dwco, dwcq>> c(dwco dwcoVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwco dwcoVar, btzi<dwco, dwcq> btziVar, Executor executor) {
        return this.b.a().a(dwcoVar, this.a, btziVar, executor);
    }
}
