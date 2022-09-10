package defpackage;
/* compiled from: PG */
/* renamed from: mbq  reason: default package */
/* loaded from: classes7.dex */
public final class mbq {
    public final dzsj<cqat> a;
    public final dzsj<bvsl> b;
    public final dzsj<mcc> c;
    public final dzsj<jzp> d;
    public final dzsj<cjqy> e;
    public final dzsj<cjqq> f;
    public final dzsj<btvo> g;
    public final dzsj<ckcw> h;
    public final dzsj<ckmd> i;

    public mbq(dzsj<cqat> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<mcc> dzsjVar3, dzsj<jzp> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cjqq> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<ckcw> dzsjVar8, dzsj<ckmd> dzsjVar9) {
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
