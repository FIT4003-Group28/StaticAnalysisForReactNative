package defpackage;
/* compiled from: PG */
/* renamed from: khu  reason: default package */
/* loaded from: classes7.dex */
public final class khu {
    public final dzsj<btvo> a;
    public final dzsj<crzm<Boolean>> b;
    public final dzsj<btpc> c;
    public final dzsj<cjqy> d;
    public final dzsj<cjqq> e;
    public final dzsj<akfa> f;
    public final dzsj<dehq> g;
    public final dzsj<bvrb> h;
    public final dzsj<btrm> i;

    public khu(dzsj<btvo> dzsjVar, dzsj<crzm<Boolean>> dzsjVar2, dzsj<btpc> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cjqq> dzsjVar5, dzsj<akfa> dzsjVar6, dzsj<dehq> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<btrm> dzsjVar9) {
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
