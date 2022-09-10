package defpackage;
/* compiled from: PG */
/* renamed from: lvv  reason: default package */
/* loaded from: classes7.dex */
public final class lvv {
    public final dzsj<cqhn> a;
    public final dzsj<cjqy> b;
    public final dzsj<cjqq> c;
    public final dzsj<ahvo> d;
    public final dzsj<lwa> e;

    public lvv(dzsj<cqhn> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<ahvo> dzsjVar4, dzsj<lwa> dzsjVar5) {
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
