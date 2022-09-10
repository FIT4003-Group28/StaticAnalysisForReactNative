package defpackage;
/* compiled from: PG */
/* renamed from: eby  reason: default package */
/* loaded from: classes6.dex */
public final class eby {
    public final dzsj<gga> a;
    public final dzsj<eco> b;
    public final dzsj<eci> c;
    public final dzsj<ecq> d;

    public eby(dzsj<gga> dzsjVar, dzsj<eco> dzsjVar2, dzsj<eci> dzsjVar3, dzsj<ecq> dzsjVar4) {
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
