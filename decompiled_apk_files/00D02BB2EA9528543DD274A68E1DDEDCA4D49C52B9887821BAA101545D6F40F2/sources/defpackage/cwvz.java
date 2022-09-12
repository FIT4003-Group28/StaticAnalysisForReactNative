package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwvz  reason: default package */
/* loaded from: classes5.dex */
public final class cwvz implements Factory<cwvg> {
    private final dzsj<dbsg<dzsj<cwvf>>> a;
    private final dzsj<cwvl> b;

    public cwvz(dzsj<dbsg<dzsj<cwvf>>> dzsjVar, dzsj<cwvl> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cwvg a() {
        cwvl cwvvVar;
        dbsg dbsgVar = (dbsg) ((dxjd) this.a).a;
        dzsj<cwvl> dzsjVar = this.b;
        if (!cwvw.a() || !dbsgVar.a()) {
            cwvvVar = new cwvv();
        } else {
            cwvvVar = dzsjVar.a();
        }
        dxjg.f(cwvvVar);
        return cwvvVar;
    }
}
