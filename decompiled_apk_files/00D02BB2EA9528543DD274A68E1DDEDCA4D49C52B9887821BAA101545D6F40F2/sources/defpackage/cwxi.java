package defpackage;

import android.content.Context;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwxi  reason: default package */
/* loaded from: classes5.dex */
public final class cwxi implements Factory<cwxf> {
    private final dzsj<cwwp> a;
    private final dzsj<Context> b;
    private final dzsj<dehq> c;
    private final dzsj<cwwz> d;
    private final dzsj<cxfg> e;
    private final dzsj<cwxg> f;

    public cwxi(dzsj<cwwp> dzsjVar, dzsj<Context> dzsjVar2, dzsj<dehq> dzsjVar3, dzsj<cwwz> dzsjVar4, dzsj<cxfg> dzsjVar5, dzsj<cwxg> dzsjVar6) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwxf(((cwwq) this.a).a(), (Context) ((dxjd) this.b).a, this.c.a(), dxjc.c(this.d), this.e, cqau.b(), this.f);
    }
}
