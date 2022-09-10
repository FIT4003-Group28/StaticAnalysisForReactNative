package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: clfr  reason: default package */
/* loaded from: classes5.dex */
public final class clfr implements Factory<clfq> {
    private final dzsj<Executor> a;
    private final dzsj<clfm> b;
    private final dzsj<clgq> c;
    private final dzsj<clgu> d;
    private final dzsj<clif> e;

    public clfr(dzsj<Executor> dzsjVar, dzsj<clfm> dzsjVar2, dzsj<clgq> dzsjVar3, dzsj<clgu> dzsjVar4, dzsj<clif> dzsjVar5) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final clfq a() {
        this.a.a();
        this.b.a();
        ((clft) this.c).a();
        this.d.a();
        this.e.a();
        return new clfq();
    }
}
