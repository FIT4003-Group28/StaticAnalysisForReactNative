package defpackage;
/* compiled from: PG */
/* renamed from: anvk  reason: default package */
/* loaded from: classes2.dex */
public final class anvk {
    private final dzsj<cjyb> a;
    private final dzsj<aobn> b;
    private final dzsj<anzv> c;
    private final dzsj<fd> d;
    private final dzsj<jkf> e;
    private final dzsj<anhg> f;
    private final dzsj<eapg> g;
    private final dzsj<apjv> h;
    private final dzsj<cjqy> i;
    private final dzsj<cqhn> j;

    public anvk(dzsj<cjyb> dzsjVar, dzsj<aobn> dzsjVar2, dzsj<anzv> dzsjVar3, dzsj<fd> dzsjVar4, dzsj<jkf> dzsjVar5, dzsj<anhg> dzsjVar6, dzsj<eapg> dzsjVar7, dzsj<apjv> dzsjVar8, dzsj<cjqy> dzsjVar9, dzsj<cqhn> dzsjVar10) {
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
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
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

    public final anvj a(@dzsi aouf aoufVar, dbsg<String> dbsgVar, boolean z) {
        cjyb a = this.a.a();
        b(a, 1);
        aobn a2 = this.b.a();
        b(a2, 2);
        anzv a3 = this.c.a();
        b(a3, 3);
        fd fdVar = (fd) ((dxjd) this.d).a;
        b(fdVar, 4);
        jkf a4 = this.e.a();
        b(a4, 5);
        anhg a5 = this.f.a();
        b(a5, 6);
        eapg a6 = this.g.a();
        b(a6, 7);
        apjv a7 = this.h.a();
        b(a7, 8);
        cjqy a8 = this.i.a();
        b(a8, 9);
        b(dbsgVar, 11);
        cqhn a9 = this.j.a();
        b(a9, 12);
        return new anvj(a, a2, a3, fdVar, a4, a5, a6, a7, a8, aoufVar, dbsgVar, a9, z);
    }
}
