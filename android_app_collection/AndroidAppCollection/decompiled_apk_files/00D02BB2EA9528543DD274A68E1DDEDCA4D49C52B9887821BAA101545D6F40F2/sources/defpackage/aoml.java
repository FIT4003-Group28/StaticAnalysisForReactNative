package defpackage;
/* compiled from: PG */
/* renamed from: aoml  reason: default package */
/* loaded from: classes2.dex */
public final class aoml {
    public final dzsj<aolt> a;
    public final dzsj<aobn> b;
    public final dzsj<aoog> c;
    public final dzsj<apjv> d;
    public final dzsj<cjqy> e;

    public aoml(dzsj<aolt> dzsjVar, dzsj<aobn> dzsjVar2, dzsj<aoog> dzsjVar3, dzsj<apjv> dzsjVar4, dzsj<cjqy> dzsjVar5) {
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
