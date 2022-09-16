package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bfxm  reason: default package */
/* loaded from: classes.dex */
public final class bfxm implements afhy {
    private final dzsj<gfq> a;
    private final dzsj<dxio<ache>> b;
    private final dzsj<dxio<blpp>> c;
    private final dzsj<dxio<cfrt>> d;
    private final dzsj<dxio<chnm>> e;
    private final dzsj<dxio<cafi>> f;
    private final dzsj<dxio<bsvm>> g;
    private final dzsj<dxio<btvo>> h;
    private final dzsj<dxio<ausy>> i;

    public bfxm(dzsj<gfq> dzsjVar, dzsj<dxio<ache>> dzsjVar2, dzsj<dxio<blpp>> dzsjVar3, dzsj<dxio<cfrt>> dzsjVar4, dzsj<dxio<chnm>> dzsjVar5, dzsj<dxio<cafi>> dzsjVar6, dzsj<dxio<bsvm>> dzsjVar7, dzsj<dxio<btvo>> dzsjVar8, dzsj<dxio<ausy>> dzsjVar9) {
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
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
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

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, @dzsi String str) {
        b(intent, 1);
        gfq a = this.a.a();
        b(a, 3);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 8);
        dxio a7 = ((dxjh) this.g).a();
        b(a7, 9);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 10);
        dxio a9 = ((dxjh) this.i).a();
        b(a9, 11);
        return new bfxl(intent, str, a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
}
