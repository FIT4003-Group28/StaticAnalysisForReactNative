package defpackage;
/* compiled from: PG */
/* renamed from: blht  reason: default package */
/* loaded from: classes3.dex */
public class blht {
    private final dzsj<btvo> a;
    private final dzsj<cebr> b;
    private final dzsj<blic> c;
    private final dzsj<blhi> d;
    private final dzsj<blie> e;
    private final dzsj<blhf> f;
    private final dzsj<blhm> g;
    private final dzsj<blha> h;

    public blht(dzsj<btvo> dzsjVar, dzsj<cebr> dzsjVar2, dzsj<blic> dzsjVar3, dzsj<blhi> dzsjVar4, dzsj<blie> dzsjVar5, dzsj<blhf> dzsjVar6, dzsj<blhm> dzsjVar7, dzsj<blha> dzsjVar8) {
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

    public final blhs a(boolean z, cdjk cdjkVar) {
        b(cdjkVar, 2);
        btvo a = this.a.a();
        b(a, 3);
        cebr a2 = this.b.a();
        b(a2, 4);
        blic a3 = this.c.a();
        b(a3, 5);
        blhi a4 = this.d.a();
        b(a4, 6);
        blie a5 = this.e.a();
        b(a5, 7);
        b(this.f.a(), 8);
        blhm a6 = this.g.a();
        b(a6, 9);
        blha a7 = this.h.a();
        b(a7, 10);
        return new blhs(z, cdjkVar, a, a2, a3, a4, a5, a6, a7);
    }
}
