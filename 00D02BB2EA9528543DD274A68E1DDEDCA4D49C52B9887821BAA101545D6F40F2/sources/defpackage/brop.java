package defpackage;
/* compiled from: PG */
/* renamed from: brop  reason: default package */
/* loaded from: classes4.dex */
public final class brop {
    public final dzsj<btpc> a;
    public final dzsj<buxl> b;
    public final dzsj<avnt> c;
    public final dzsj<cjqy> d;
    public final dzsj<cqat> e;
    public final dzsj<bvrb> f;

    public brop(dzsj<btpc> dzsjVar, dzsj<buxl> dzsjVar2, dzsj<avnt> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<bvrb> dzsjVar6) {
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
