package defpackage;
/* compiled from: PG */
/* renamed from: ahge  reason: default package */
/* loaded from: classes2.dex */
public final class ahge {
    public final dzsj<btvo> a;
    public final dzsj<cqat> b;
    public final dzsj<bvjj> c;
    public final dzsj<ahfz> d;
    public final dzsj<ahht> e;

    public ahge(dzsj<btvo> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<ahfz> dzsjVar4, dzsj<ahht> dzsjVar5) {
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
