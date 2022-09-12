package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ahfo  reason: default package */
/* loaded from: classes2.dex */
public class ahfo {
    private final dzsj<cqhn> a;
    private final dzsj<gga> b;
    private final dzsj<akfa> c;
    private final dzsj<ahha> d;
    private final dzsj<agaw> e;
    private final dzsj<ania> f;
    private final dzsj<dehq> g;
    private final dzsj<dehq> h;
    private final dzsj<agbv<akqi>> i;

    public ahfo(dzsj<cqhn> dzsjVar, dzsj<gga> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<ahha> dzsjVar4, dzsj<agaw> dzsjVar5, dzsj<ania> dzsjVar6, dzsj<dehq> dzsjVar7, dzsj<dehq> dzsjVar8, dzsj<agbv<akqi>> dzsjVar9) {
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

    public final ahfn a(dlcx dlcxVar, int i, ddzg ddzgVar, @dzsi List<dwfl> list, boolean z) {
        cqhn a = this.a.a();
        b(a, 1);
        gga a2 = this.b.a();
        b(a2, 2);
        akfa a3 = this.c.a();
        b(a3, 3);
        ahha a4 = this.d.a();
        b(a4, 4);
        agaw a5 = this.e.a();
        b(a5, 5);
        ania a6 = this.f.a();
        b(a6, 6);
        dehq a7 = this.g.a();
        b(a7, 7);
        dehq a8 = this.h.a();
        b(a8, 8);
        agbv<akqi> a9 = this.i.a();
        b(a9, 9);
        b(dlcxVar, 10);
        b(ddzgVar, 12);
        return new ahfn(a, a2, a3, a4, a5, a6, a7, a8, a9, dlcxVar, i, ddzgVar, list, z);
    }
}
