package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxde  reason: default package */
/* loaded from: classes5.dex */
public final class cxde implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<cxdi>> a;
    private final dzsj<dbsg<cxej>> b;
    private final dzsj<cxdl> c;
    private final dzsj<cxdp> d;

    public cxde(dzsj<dbsg<cxdi>> dzsjVar, dzsj<dbsg<cxej>> dzsjVar2, dzsj<cxdl> dzsjVar3, dzsj<cxdp> dzsjVar4) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Object obj;
        dbsg<cxdi> a = ((cxdb) this.a).a();
        dbsg<cxej> a2 = ((cxdx) this.b).a();
        dzsj<cxdl> dzsjVar = this.c;
        dzsj<cxdp> dzsjVar2 = this.d;
        if (a.a()) {
            obj = dcep.B(a2.a() ? dzsjVar2.a() : dzsjVar.a());
        } else {
            obj = dcmr.a;
        }
        dxjg.f(obj);
        return obj;
    }
}
