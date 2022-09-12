package defpackage;
/* compiled from: PG */
/* renamed from: dja  reason: default package */
/* loaded from: classes6.dex */
public final class dja {
    public final dzsj<dbsg<czw>> a;
    public final dzsj<btvo> b;
    public final dzsj<dag> c;

    public dja(dzsj<dbsg<czw>> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<dag> dzsjVar3) {
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
