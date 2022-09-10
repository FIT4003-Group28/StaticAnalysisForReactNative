package defpackage;
/* compiled from: PG */
/* renamed from: azsz  reason: default package */
/* loaded from: classes3.dex */
public final class azsz {
    public final dzsj<bxqd> a;
    public final dzsj<gga> b;
    public final dzsj<btvo> c;
    public final dzsj<bath> d;

    public azsz(dzsj<bxqd> dzsjVar, dzsj<gga> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<bath> dzsjVar4) {
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
