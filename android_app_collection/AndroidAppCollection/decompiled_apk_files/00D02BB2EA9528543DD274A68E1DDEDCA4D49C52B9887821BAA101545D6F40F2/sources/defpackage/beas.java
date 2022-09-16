package defpackage;
/* compiled from: PG */
/* renamed from: beas  reason: default package */
/* loaded from: classes3.dex */
public class beas {
    private final dzsj<gga> a;
    private final dzsj<dxio<afha>> b;
    private final dzsj<cqkj> c;

    public beas(dzsj<gga> dzsjVar, dzsj<dxio<afha>> dzsjVar2, dzsj<cqkj> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bear a(dnwx dnwxVar) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        b(this.c.a(), 3);
        b(dnwxVar, 4);
        return new bear(a, a2, dnwxVar);
    }
}
