package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxbg  reason: default package */
/* loaded from: classes5.dex */
public final class cxbg implements Factory<cxbf> {
    private final dzsj<cwrb> a;
    private final dzsj<cxbl> b;
    private final dzsj<Boolean> c;

    public cxbg(dzsj<cwrb> dzsjVar, dzsj<cxbl> dzsjVar2, dzsj<Boolean> dzsjVar3) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxbf(this.a.a(), this.b, this.c);
    }
}
