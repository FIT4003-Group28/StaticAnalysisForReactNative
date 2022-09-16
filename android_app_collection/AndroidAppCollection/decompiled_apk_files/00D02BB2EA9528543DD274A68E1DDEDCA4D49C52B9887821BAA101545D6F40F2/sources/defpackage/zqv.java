package defpackage;
/* compiled from: PG */
/* renamed from: zqv  reason: default package */
/* loaded from: classes7.dex */
public final class zqv {
    public final dzsj<wgh> a;
    public final dzsj<whs> b;
    public final dzsj<qbt> c;
    public final dzsj<whm> d;

    public zqv(dzsj<wgh> dzsjVar, dzsj<whs> dzsjVar2, dzsj<qbt> dzsjVar3, dzsj<whm> dzsjVar4) {
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
