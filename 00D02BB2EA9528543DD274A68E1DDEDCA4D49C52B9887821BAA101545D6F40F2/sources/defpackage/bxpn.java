package defpackage;
/* compiled from: PG */
/* renamed from: bxpn  reason: default package */
/* loaded from: classes4.dex */
public class bxpn {
    public final dzsj<cqhn> a;
    public final dzsj<anhp> b;
    public final dzsj<fd> c;

    public bxpn(dzsj<cqhn> dzsjVar, dzsj<anhp> dzsjVar2, dzsj<fd> dzsjVar3) {
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
