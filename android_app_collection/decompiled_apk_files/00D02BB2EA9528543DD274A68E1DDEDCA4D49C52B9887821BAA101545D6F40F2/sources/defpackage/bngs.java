package defpackage;
/* compiled from: PG */
/* renamed from: bngs  reason: default package */
/* loaded from: classes3.dex */
public class bngs {
    public final dzsj<bwqv> a;
    public final dzsj<cqhn> b;
    public final dzsj<bnfu> c;
    public final dzsj<cebm> d;
    public final dzsj<bngl> e;
    public final dzsj<bnfr> f;
    public final dzsj<bhuh> g;
    public final dzsj<dxio<bkpi>> h;

    public bngs(dzsj<bwqv> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bnfu> dzsjVar3, dzsj<cebm> dzsjVar4, dzsj<bngl> dzsjVar5, dzsj<bnfr> dzsjVar6, dzsj<bhuh> dzsjVar7, dzsj<dxio<bkpi>> dzsjVar8) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
