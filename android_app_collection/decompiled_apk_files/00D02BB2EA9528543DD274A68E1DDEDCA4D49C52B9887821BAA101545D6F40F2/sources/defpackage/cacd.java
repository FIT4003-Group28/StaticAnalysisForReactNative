package defpackage;
/* compiled from: PG */
/* renamed from: cacd  reason: default package */
/* loaded from: classes4.dex */
public class cacd {
    public final dzsj<gga> a;
    public final dzsj<cafi> b;
    public final dzsj<cqhn> c;
    public final dzsj<caui> d;
    public final dzsj<caez> e;
    public final dzsj<btvo> f;

    public cacd(dzsj<gga> dzsjVar, dzsj<cafi> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<caui> dzsjVar4, dzsj<caez> dzsjVar5, dzsj<btvo> dzsjVar6) {
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
