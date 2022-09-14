package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwzy  reason: default package */
/* loaded from: classes5.dex */
public final class cwzy implements Factory<cwzx> {
    private final dzsj<cwwp> a;
    private final dzsj<Context> b;
    private final dzsj<cwzn> c;
    private final dzsj<dehq> d;
    private final dzsj<cwze> e;
    private final dzsj<cxac> f;
    private final dzsj<cwuc> g;
    private final dzsj<cxfg> h;

    public cwzy(dzsj<cwwp> dzsjVar, dzsj<Context> dzsjVar2, dzsj<cwzn> dzsjVar3, dzsj<dehq> dzsjVar4, dzsj<cwze> dzsjVar5, dzsj<cxac> dzsjVar6, dzsj<cwuc> dzsjVar7, dzsj<cxfg> dzsjVar8) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
        this.g = dzsjVar7;
        this.h = dzsjVar8;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwzx(((cwwq) this.a).a(), cqau.b(), (Context) ((dxjd) this.b).a, this.c.a(), this.d.a(), dxjc.c(this.e), ((cxad) this.f).a(), this.g.a(), this.h);
    }
}
