package defpackage;
/* compiled from: PG */
/* renamed from: bsni  reason: default package */
/* loaded from: classes4.dex */
public final class bsni {
    public final dzsj<ckcw> a;
    public final dzsj<cqhn> b;
    public final dzsj<cqhu> c;
    public final dzsj<cjqy> d;
    public final dzsj<cklq> e;
    public final dzsj<ckmp> f;
    public final dzsj<ckml> g;
    public final dzsj<brpm> h;
    public final dzsj<brlk> i;

    public bsni(dzsj<ckcw> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cklq> dzsjVar5, dzsj<ckmp> dzsjVar6, dzsj<ckml> dzsjVar7, dzsj<brpm> dzsjVar8, dzsj<brlk> dzsjVar9) {
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
