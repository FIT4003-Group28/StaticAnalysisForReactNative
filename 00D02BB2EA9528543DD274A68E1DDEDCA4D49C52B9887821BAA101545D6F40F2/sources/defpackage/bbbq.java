package defpackage;
/* compiled from: PG */
/* renamed from: bbbq  reason: default package */
/* loaded from: classes3.dex */
public final class bbbq {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<ania> c;
    public final dzsj<bmdv> d;
    public final dzsj<angp> e;
    public final dzsj<anhg> f;
    public final dzsj<cjqy> g;
    public final dzsj<cjqq> h;
    public final dzsj<batz> i;

    public bbbq(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<ania> dzsjVar3, dzsj<bmdv> dzsjVar4, dzsj<angp> dzsjVar5, dzsj<anhg> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<cjqq> dzsjVar8, dzsj<batz> dzsjVar9) {
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
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
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
