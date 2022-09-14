package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxdb  reason: default package */
/* loaded from: classes5.dex */
public final class cxdb implements Factory<dbsg<cxdi>> {
    private final dzsj<dbsg<cxej>> a;
    private final dzsj<cxdp> b;
    private final dzsj<cxdl> c;
    private final dzsj<cwuc> d;

    public cxdb(dzsj<dbsg<cxej>> dzsjVar, dzsj<cxdp> dzsjVar2, dzsj<cxdl> dzsjVar3, dzsj<cwuc> dzsjVar4) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final dbsg<cxdi> a() {
        dbsg<cxej> a = ((cxdx) this.a).a();
        dzsj<cxdp> dzsjVar = this.b;
        dzsj<cxdl> dzsjVar2 = this.c;
        if (!this.d.a().b) {
            return dbsg.i(a.a() ? dzsjVar.a() : dzsjVar2.a());
        }
        return dbpy.a;
    }
}
