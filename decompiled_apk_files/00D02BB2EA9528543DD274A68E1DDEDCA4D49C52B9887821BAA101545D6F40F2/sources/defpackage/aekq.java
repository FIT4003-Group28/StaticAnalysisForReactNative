package defpackage;
/* compiled from: PG */
/* renamed from: aekq  reason: default package */
/* loaded from: classes2.dex */
public class aekq {
    public final dzsj<cqhn> a;
    public final dzsj<gfq> b;
    public final dzsj<gga> c;

    public aekq(dzsj<cqhn> dzsjVar, dzsj<gfq> dzsjVar2, dzsj<gga> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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
