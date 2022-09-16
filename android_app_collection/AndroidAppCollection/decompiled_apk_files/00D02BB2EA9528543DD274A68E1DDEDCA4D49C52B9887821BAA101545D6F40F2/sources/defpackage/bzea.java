package defpackage;
/* compiled from: PG */
/* renamed from: bzea  reason: default package */
/* loaded from: classes4.dex */
public final class bzea {
    public final dzsj<qdx> a;
    public final dzsj<dehq> b;
    public final dzsj<byzk> c;
    public final dzsj<btvo> d;
    public final dzsj<zar> e;
    public final dzsj<zag> f;

    public bzea(dzsj<qdx> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<byzk> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<zar> dzsjVar5, dzsj<zag> dzsjVar6) {
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
