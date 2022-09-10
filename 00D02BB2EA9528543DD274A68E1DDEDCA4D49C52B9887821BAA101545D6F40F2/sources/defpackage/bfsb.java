package defpackage;
/* compiled from: PG */
/* renamed from: bfsb  reason: default package */
/* loaded from: classes3.dex */
public class bfsb {
    public final dzsj<gga> a;
    public final dzsj<cqkj> b;
    public final dzsj<jdj> c;
    public final dzsj<aekq> d;
    public final dzsj<bfmz> e;
    public final dzsj<btvo> f;

    public bfsb(dzsj<gga> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<jdj> dzsjVar3, dzsj<aekq> dzsjVar4, dzsj<bfmz> dzsjVar5, dzsj<btvo> dzsjVar6) {
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
