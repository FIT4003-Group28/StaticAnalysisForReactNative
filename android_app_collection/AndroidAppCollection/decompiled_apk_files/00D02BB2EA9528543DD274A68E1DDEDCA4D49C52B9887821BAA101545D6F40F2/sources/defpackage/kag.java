package defpackage;
/* compiled from: PG */
/* renamed from: kag  reason: default package */
/* loaded from: classes7.dex */
public final class kag {
    public final dzsj<bvsl> a;
    public final dzsj<cjqy> b;
    public final dzsj<cjqq> c;
    public final dzsj<btrm> d;
    public final dzsj<bvrb> e;
    public final dzsj<dehq> f;
    public final dzsj<akfa> g;
    public final dzsj<kcl> h;

    public kag(dzsj<bvsl> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<dehq> dzsjVar6, dzsj<akfa> dzsjVar7, dzsj<kcl> dzsjVar8) {
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
