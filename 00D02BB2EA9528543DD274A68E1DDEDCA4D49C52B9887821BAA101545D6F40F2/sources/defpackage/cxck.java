package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxck  reason: default package */
/* loaded from: classes5.dex */
public final class cxck implements Factory<cxcj> {
    private final dzsj<cwwp> a;
    private final dzsj<Context> b;
    private final dzsj<cwrb> c;
    private final dzsj<dehq> d;
    private final dzsj<cxcg> e;
    private final dzsj<cxet> f;
    private final dzsj<cxfg> g;

    public cxck(dzsj<cwwp> dzsjVar, dzsj<Context> dzsjVar2, dzsj<cwrb> dzsjVar3, dzsj<dehq> dzsjVar4, dzsj<cxcg> dzsjVar5, dzsj<cxet> dzsjVar6, dzsj<cxfg> dzsjVar7) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
        this.g = dzsjVar7;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxcj(((cwwq) this.a).a(), (Context) ((dxjd) this.b).a, this.c.a(), this.d.a(), dxjc.c(this.e), ((cxeu) this.f).a(), this.g);
    }
}
