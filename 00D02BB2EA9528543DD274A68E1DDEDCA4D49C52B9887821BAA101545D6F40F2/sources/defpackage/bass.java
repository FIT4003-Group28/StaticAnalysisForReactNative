package defpackage;
/* compiled from: PG */
/* renamed from: bass  reason: default package */
/* loaded from: classes3.dex */
public class bass {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<btvo> c;
    public final dzsj<gdc> d;
    public final dzsj<brvh> e;
    public final dzsj<bnjv> f;

    public bass(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<gdc> dzsjVar4, dzsj<brvh> dzsjVar5, dzsj<bnjv> dzsjVar6) {
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
