package defpackage;
/* compiled from: PG */
/* renamed from: xaa  reason: default package */
/* loaded from: classes7.dex */
public final class xaa {
    public final dzsj<btvo> a;
    public final dzsj<dxio<bzmm>> b;
    public final dzsj<dxio<cjnf>> c;
    public final dzsj<cqhu> d;

    public xaa(dzsj<btvo> dzsjVar, dzsj<dxio<bzmm>> dzsjVar2, dzsj<dxio<cjnf>> dzsjVar3, dzsj<cqhu> dzsjVar4) {
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
