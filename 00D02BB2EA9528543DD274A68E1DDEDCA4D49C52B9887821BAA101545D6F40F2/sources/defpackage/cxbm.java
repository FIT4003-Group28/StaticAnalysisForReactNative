package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cxbm  reason: default package */
/* loaded from: classes5.dex */
public final class cxbm implements Factory<cxbl> {
    private final dzsj<cwwp> a;
    private final dzsj<dehq> b;
    private final dzsj<Executor> c;
    private final dzsj<cwts> d;
    private final dzsj<cxfg> e;
    private final dzsj<cxdg> f;

    public cxbm(dzsj<cwwp> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<cwts> dzsjVar4, dzsj<cxfg> dzsjVar5, dzsj<cxdg> dzsjVar6) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxbl(((cwwq) this.a).a(), this.b.a(), this.c.a(), dxjc.c(this.d), this.e, dxjc.c(this.f));
    }
}
