package defpackage;
/* compiled from: PG */
/* renamed from: pmc  reason: default package */
/* loaded from: classes7.dex */
public class pmc {
    public final dzsj<gga> a;
    public final dzsj<dxio<afha>> b;
    public final dzsj<brba> c;

    public pmc(dzsj<gga> dzsjVar, dzsj<dxio<afha>> dzsjVar2, dzsj<brba> dzsjVar3) {
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
