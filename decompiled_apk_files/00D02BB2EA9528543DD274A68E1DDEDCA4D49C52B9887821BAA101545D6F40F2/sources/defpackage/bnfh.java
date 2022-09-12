package defpackage;
/* compiled from: PG */
/* renamed from: bnfh  reason: default package */
/* loaded from: classes3.dex */
public final class bnfh {
    public final dzsj<gga> a;
    public final dzsj<bwqv> b;
    public final dzsj<bnfb> c;
    public final dzsj<bnfe> d;
    public final dzsj<bgpu> e;
    public final dzsj<bhhf> f;

    public bnfh(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2, dzsj<bnfb> dzsjVar3, dzsj<bnfe> dzsjVar4, dzsj<bgpu> dzsjVar5, dzsj<bhhf> dzsjVar6) {
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
