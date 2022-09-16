package defpackage;
/* compiled from: PG */
/* renamed from: gbj  reason: default package */
/* loaded from: classes6.dex */
public final class gbj {
    public final dzsj<cqhn> a;
    public final dzsj<dxio<afha>> b;
    public final dzsj<amfi> c;
    public final dzsj<gga> d;

    public gbj(dzsj<cqhn> dzsjVar, dzsj<dxio<afha>> dzsjVar2, dzsj<amfi> dzsjVar3, dzsj<gga> dzsjVar4) {
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
