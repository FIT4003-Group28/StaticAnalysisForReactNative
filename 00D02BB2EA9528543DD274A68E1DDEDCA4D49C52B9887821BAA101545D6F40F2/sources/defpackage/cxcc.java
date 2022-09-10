package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxcc  reason: default package */
/* loaded from: classes5.dex */
public final class cxcc implements Factory<cxch> {
    private final dzsj<dbsg<dzsj<cxcg>>> a;
    private final dzsj<cxcj> b;

    public cxcc(dzsj<dbsg<dzsj<cxcg>>> dzsjVar, dzsj<cxcj> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        cxcj cxcaVar = (!cxcb.a() || !((dbsg) ((dxjd) this.a).a).a()) ? new cxca() : this.b.a();
        dxjg.f(cxcaVar);
        return cxcaVar;
    }
}
