package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: ccdy  reason: default package */
/* loaded from: classes4.dex */
public final class ccdy {
    private final dzsj<dxio<ccbk>> a;
    private final dzsj<dxio<cccw>> b;
    private final dzsj<dxio<ccdp>> c;
    private final dzsj<dxio<ccdh>> d;
    private final dzsj<dxio<ccec>> e;
    private final dzsj<dxio<gce>> f;
    private final dzsj<Resources> g;

    public ccdy(dzsj<dxio<ccbk>> dzsjVar, dzsj<dxio<cccw>> dzsjVar2, dzsj<dxio<ccdp>> dzsjVar3, dzsj<dxio<ccdh>> dzsjVar4, dzsj<dxio<ccec>> dzsjVar5, dzsj<dxio<gce>> dzsjVar6, dzsj<Resources> dzsjVar7) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ccdx a(drnp drnpVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        Resources a7 = this.g.a();
        b(a7, 7);
        b(drnpVar, 8);
        return new ccdx(a, a2, a3, a4, a5, a6, a7, drnpVar);
    }
}
