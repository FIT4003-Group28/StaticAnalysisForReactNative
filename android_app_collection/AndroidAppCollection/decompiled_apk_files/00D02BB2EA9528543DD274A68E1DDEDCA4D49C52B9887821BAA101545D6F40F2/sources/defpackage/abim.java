package defpackage;
/* compiled from: PG */
/* renamed from: abim  reason: default package */
/* loaded from: classes.dex */
public final class abim {
    private final dzsj<abfa> a;
    private final dzsj<adau> b;
    private final dzsj<adcf> c;
    private final dzsj<adfz> d;
    private final dzsj<adkg> e;
    private final dzsj<adkp> f;
    private final dzsj<adbg> g;
    private final dzsj<adai> h;
    private final dzsj<adjm> i;
    private final dzsj<adjc> j;
    private final dzsj<adfu> k;

    public abim(dzsj<abfa> dzsjVar, dzsj<adau> dzsjVar2, dzsj<adcf> dzsjVar3, dzsj<adfz> dzsjVar4, dzsj<adkg> dzsjVar5, dzsj<adkp> dzsjVar6, dzsj<adbg> dzsjVar7, dzsj<adai> dzsjVar8, dzsj<adjm> dzsjVar9, dzsj<adjc> dzsjVar10, dzsj<adfu> dzsjVar11) {
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
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
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

    public final abil a(absg absgVar) {
        b(this.a.a(), 1);
        adau a = this.b.a();
        b(a, 2);
        adcf a2 = this.c.a();
        b(a2, 3);
        adfz a3 = this.d.a();
        b(a3, 4);
        adkg a4 = this.e.a();
        b(a4, 5);
        adkp a5 = this.f.a();
        b(a5, 6);
        adbg a6 = this.g.a();
        b(a6, 7);
        adai a7 = this.h.a();
        b(a7, 8);
        adjm a8 = this.i.a();
        b(a8, 9);
        adjc a9 = this.j.a();
        b(a9, 10);
        adfu a10 = this.k.a();
        b(a10, 11);
        b(absgVar, 12);
        return new abil(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, absgVar);
    }
}
