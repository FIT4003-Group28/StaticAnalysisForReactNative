package defpackage;
/* compiled from: PG */
/* renamed from: cetv  reason: default package */
/* loaded from: classes4.dex */
public class cetv {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<axjh> c;
    public final dzsj<axhs> d;
    public final dzsj<axhq> e;

    public cetv(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<axjh> dzsjVar3, dzsj<axhs> dzsjVar4, dzsj<axhq> dzsjVar5) {
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
