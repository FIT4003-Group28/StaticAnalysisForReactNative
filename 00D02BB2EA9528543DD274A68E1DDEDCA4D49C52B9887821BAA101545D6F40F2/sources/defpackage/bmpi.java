package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bmpi  reason: default package */
/* loaded from: classes3.dex */
public final class bmpi {
    private final dzsj<btvo> a;
    private final dzsj<Application> b;
    private final dzsj<cqat> c;
    private final dzsj<dxio<ckcw>> d;
    private final dzsj<dxio<akfa>> e;
    private final dzsj<dehq> f;
    private final dzsj<axru> g;
    private final dzsj<colr> h;

    public bmpi(dzsj<btvo> dzsjVar, dzsj<Application> dzsjVar2, dzsj<cqat> dzsjVar3, dzsj<dxio<ckcw>> dzsjVar4, dzsj<dxio<akfa>> dzsjVar5, dzsj<dehq> dzsjVar6, dzsj<axru> dzsjVar7, dzsj<colr> dzsjVar8) {
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

    public final bmph a(bmpg bmpgVar) {
        btvo a = this.a.a();
        b(a, 1);
        Application a2 = this.b.a();
        b(a2, 2);
        cqat a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 5);
        dehq a6 = this.f.a();
        b(a6, 6);
        axru a7 = this.g.a();
        b(a7, 7);
        colr a8 = this.h.a();
        b(a8, 8);
        b(bmpgVar, 9);
        return new bmph(a, a2, a3, a4, a5, a6, a7, a8, bmpgVar);
    }
}
