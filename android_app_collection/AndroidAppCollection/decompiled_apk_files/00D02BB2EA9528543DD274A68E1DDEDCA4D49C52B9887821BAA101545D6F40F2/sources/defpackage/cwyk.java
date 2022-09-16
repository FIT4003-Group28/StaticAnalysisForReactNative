package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwyk  reason: default package */
/* loaded from: classes5.dex */
public final class cwyk implements Factory<cwyj> {
    private final dzsj<cwwp> a;
    private final dzsj<Context> b;
    private final dzsj<cwrb> c;
    private final dzsj<cwyo> d;
    private final dzsj<dbsg<dzsj<Boolean>>> e;
    private final dzsj<cwyl> f;
    private final dzsj<cxfg> g;
    private final dzsj<Executor> h;

    public cwyk(dzsj<cwwp> dzsjVar, dzsj<Context> dzsjVar2, dzsj<cwrb> dzsjVar3, dzsj<cwyo> dzsjVar4, dzsj<dbsg<dzsj<Boolean>>> dzsjVar5, dzsj<cwyl> dzsjVar6, dzsj<cxfg> dzsjVar7, dzsj<Executor> dzsjVar8) {
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
        return new cwyj(((cwwq) this.a).a(), (Context) ((dxjd) this.b).a, this.c.a(), dxjc.c(this.d), (dbsg) ((dxjd) this.e).a, this.f, this.g, this.h.a());
    }
}
