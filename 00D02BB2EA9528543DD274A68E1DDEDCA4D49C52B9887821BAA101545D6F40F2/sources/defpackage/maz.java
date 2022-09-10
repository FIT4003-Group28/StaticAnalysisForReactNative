package defpackage;
/* compiled from: PG */
/* renamed from: maz  reason: default package */
/* loaded from: classes7.dex */
public final class maz {
    public final dzsj<jzp> a;
    public final dzsj<cjqy> b;
    public final dzsj<cjqq> c;
    public final dzsj<ckcw> d;
    public final dzsj<btvo> e;
    public final dzsj<akfa> f;

    public maz(dzsj<jzp> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<ckcw> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<akfa> dzsjVar6) {
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
