package defpackage;
/* compiled from: PG */
/* renamed from: bsam  reason: default package */
/* loaded from: classes4.dex */
public final class bsam {
    private final dzsj<bshe> a;
    private final dzsj<bsiq> b;
    private final dzsj<bsim> c;
    private final dzsj<bsjd> d;
    private final dzsj<bshj> e;
    private final dzsj<bshp> f;
    private final dzsj<bsht> g;
    private final dzsj<bsiw> h;
    private final dzsj<bsii> i;
    private final dzsj<bshy> j;
    private final dzsj<bshc> k;
    private final dzsj<bsid> l;
    private final dzsj<btvo> m;

    public bsam(dzsj<bshe> dzsjVar, dzsj<bsiq> dzsjVar2, dzsj<bsim> dzsjVar3, dzsj<bsjd> dzsjVar4, dzsj<bshj> dzsjVar5, dzsj<bshp> dzsjVar6, dzsj<bsht> dzsjVar7, dzsj<bsiw> dzsjVar8, dzsj<bsii> dzsjVar9, dzsj<bshy> dzsjVar10, dzsj<bshc> dzsjVar11, dzsj<bsid> dzsjVar12, dzsj<btvo> dzsjVar13) {
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
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
        b(dzsjVar13, 13);
        this.m = dzsjVar13;
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

    public final bsal a(bsjm bsjmVar, int i, bsak bsakVar) {
        btvo a = this.m.a();
        b(a, 13);
        b(bsjmVar, 14);
        b(bsakVar, 16);
        return new bsal(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l.a(), a, bsjmVar, i, bsakVar);
    }
}
