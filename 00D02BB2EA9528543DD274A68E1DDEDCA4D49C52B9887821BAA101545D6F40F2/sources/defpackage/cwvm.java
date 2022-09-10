package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cwvm  reason: default package */
/* loaded from: classes5.dex */
public final class cwvm implements Factory<cwvl> {
    private final dzsj<cwwp> a;
    private final dzsj<Context> b;
    private final dzsj<cwrb> c;
    private final dzsj<dehq> d;
    private final dzsj<cwvf> e;
    private final dzsj<cwwb> f;
    private final dzsj<cwvb> g;
    private final dzsj<cxfg> h;
    private final dzsj<Executor> i;

    public cwvm(dzsj<cwwp> dzsjVar, dzsj<Context> dzsjVar2, dzsj<cwrb> dzsjVar3, dzsj<dehq> dzsjVar4, dzsj<cwvf> dzsjVar5, dzsj<cwwb> dzsjVar6, dzsj<cwvb> dzsjVar7, dzsj<cxfg> dzsjVar8, dzsj<Executor> dzsjVar9) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
        this.g = dzsjVar7;
        this.h = dzsjVar8;
        this.i = dzsjVar9;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwvl(((cwwq) this.a).a(), (Context) ((dxjd) this.b).a, this.c.a(), this.d.a(), dxjc.c(this.e), ((cwwc) this.f).a(), ((cwvc) this.g).a(), this.h, this.i.a());
    }
}
