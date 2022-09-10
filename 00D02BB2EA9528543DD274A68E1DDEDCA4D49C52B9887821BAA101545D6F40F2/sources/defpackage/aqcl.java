package defpackage;
/* compiled from: PG */
/* renamed from: aqcl  reason: default package */
/* loaded from: classes2.dex */
public class aqcl {
    private final dzsj<auhq> a;
    private final dzsj<dxio<auhi>> b;

    public aqcl(dzsj<auhq> dzsjVar, dzsj<dxio<auhi>> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final aqck a(aujb aujbVar) {
        auhq a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        b(aujbVar, 3);
        return new aqck(a, a2, aujbVar);
    }
}
