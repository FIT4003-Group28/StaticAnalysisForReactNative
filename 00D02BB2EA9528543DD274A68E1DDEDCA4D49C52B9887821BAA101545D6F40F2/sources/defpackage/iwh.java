package defpackage;
/* compiled from: PG */
/* renamed from: iwh  reason: default package */
/* loaded from: classes6.dex */
public final class iwh {
    public final dzsj<gga> a;
    public final dzsj<jkf> b;
    public final dzsj<btvo> c;

    public iwh(dzsj<gga> dzsjVar, dzsj<jkf> dzsjVar2, dzsj<btvo> dzsjVar3) {
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
