package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzr  reason: default package */
/* loaded from: classes4.dex */
public final class buzr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzr(buzq buzqVar) {
        this.b = buzqVar.a;
        this.c = buzqVar.b;
        this.a = buzqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwvf dwvfVar = (dwvf) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwvfVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwvf dwvfVar, btzi<dwvf, dwvj> btziVar, Executor executor) {
        return this.b.a().a(dwvfVar, this.a, btziVar, executor);
    }
}
