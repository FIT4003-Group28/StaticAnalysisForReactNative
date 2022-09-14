package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bviq  reason: default package */
/* loaded from: classes4.dex */
public class bviq {
    private final dzsj<cqhn> a;
    private final dzsj<gga> b;
    private final dzsj<dehq> c;
    private final dzsj<btpc> d;
    private final dzsj<cqat> e;
    private final dzsj<cqhu> f;
    private final dzsj<cjqy> g;
    private final dzsj<cjqq> h;

    public bviq(dzsj<cqhn> dzsjVar, dzsj<gga> dzsjVar2, dzsj<dehq> dzsjVar3, dzsj<btpc> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cqhu> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<cjqq> dzsjVar8) {
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

    public final bvip a(List<? extends bvhv> list, int i, bvio bvioVar, bvil bvilVar, bvin bvinVar) {
        cqhn a = this.a.a();
        b(a, 1);
        gga a2 = this.b.a();
        b(a2, 2);
        dehq a3 = this.c.a();
        b(a3, 3);
        btpc a4 = this.d.a();
        b(a4, 4);
        cqat a5 = this.e.a();
        b(a5, 5);
        cqhu a6 = this.f.a();
        b(a6, 6);
        cjqy a7 = this.g.a();
        b(a7, 7);
        cjqq a8 = this.h.a();
        b(a8, 8);
        b(list, 9);
        b(bvioVar, 11);
        b(bvilVar, 12);
        b(bvinVar, 13);
        return new bvip(a, a2, a3, a4, a5, a6, a7, a8, list, i, bvioVar, bvilVar, bvinVar);
    }
}
