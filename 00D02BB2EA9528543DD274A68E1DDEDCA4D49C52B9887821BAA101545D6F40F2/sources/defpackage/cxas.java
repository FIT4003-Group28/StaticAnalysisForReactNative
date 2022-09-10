package defpackage;

import android.content.Context;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cxas  reason: default package */
/* loaded from: classes5.dex */
public final class cxas implements Factory<cxar> {
    private final dzsj<cwwp> a;
    private final dzsj<Context> b;
    private final dzsj<cwrb> c;
    private final dzsj<dehq> d;
    private final dzsj<cxai> e;
    private final dzsj<cxak> f;
    private final dzsj<cxfg> g;
    private final dzsj<Executor> h;

    public cxas(dzsj<cwwp> dzsjVar, dzsj<Context> dzsjVar2, dzsj<cwrb> dzsjVar3, dzsj<dehq> dzsjVar4, dzsj<cxai> dzsjVar5, dzsj<cxak> dzsjVar6, dzsj<cxfg> dzsjVar7, dzsj<Executor> dzsjVar8) {
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
        return new cxar(((cwwq) this.a).a(), (Context) ((dxjd) this.b).a, this.c.a(), this.d.a(), dxjc.c(this.e), ((cxal) this.f).a(), this.g, this.h.a());
    }
}
