package defpackage;
/* compiled from: PG */
/* renamed from: abvz  reason: default package */
/* loaded from: classes.dex */
public class abvz {
    public final dzsj<btvo> a;
    public final dzsj<akpm> b;
    public final dzsj<bsmd> c;
    public final dzsj<gga> d;
    public final dzsj<efg> e;

    public abvz(dzsj<btvo> dzsjVar, dzsj<akpm> dzsjVar2, dzsj<bsmd> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<efg> dzsjVar5) {
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
