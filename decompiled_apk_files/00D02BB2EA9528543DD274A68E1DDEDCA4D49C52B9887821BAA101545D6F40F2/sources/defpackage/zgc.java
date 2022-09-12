package defpackage;
/* compiled from: PG */
/* renamed from: zgc  reason: default package */
/* loaded from: classes7.dex */
public final class zgc {
    public final dzsj<ff> a;
    public final dzsj<afha> b;
    public final dzsj<wto> c;
    public final dzsj<cqkj> d;
    public final dzsj<bsvm> e;
    public final dzsj<vtn> f;

    public zgc(dzsj<ff> dzsjVar, dzsj<afha> dzsjVar2, dzsj<wto> dzsjVar3, dzsj<cqkj> dzsjVar4, dzsj<bsvm> dzsjVar5, dzsj<vtn> dzsjVar6) {
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
