package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxcx  reason: default package */
/* loaded from: classes5.dex */
public final class cxcx implements Factory<cxcw> {
    private final dzsj<cwwp> a;
    private final dzsj<dehq> b;
    private final dzsj<cxfg> c;
    private final dzsj<cwuc> d;

    public cxcx(dzsj<cwwp> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<cxfg> dzsjVar3, dzsj<cwuc> dzsjVar4) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxcw(((cwwq) this.a).a(), this.b, this.c, this.d.a());
    }
}
