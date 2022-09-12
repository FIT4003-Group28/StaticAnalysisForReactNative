package defpackage;
/* compiled from: PG */
/* renamed from: djs  reason: default package */
/* loaded from: classes6.dex */
public final class djs {
    public final dzsj<dehq> a;
    public final dzsj<btvo> b;
    public final dzsj<cjqq> c;
    public final dzsj<dju> d;

    public djs(dzsj<dehq> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<dju> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
