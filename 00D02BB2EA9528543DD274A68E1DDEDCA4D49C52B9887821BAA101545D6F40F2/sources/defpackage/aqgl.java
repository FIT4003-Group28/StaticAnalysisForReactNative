package defpackage;
/* compiled from: PG */
/* renamed from: aqgl  reason: default package */
/* loaded from: classes2.dex */
public class aqgl {
    private final dzsj<dxio<aprv>> a;
    private final dzsj<dxio<apyu>> b;
    private final dzsj<dehp> c;

    public aqgl(dzsj<dxio<aprv>> dzsjVar, dzsj<dxio<apyu>> dzsjVar2, dzsj<dehp> dzsjVar3) {
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

    public final aqgk a(btlu btluVar, dbsl<apzn> dbslVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dehp a3 = this.c.a();
        b(a3, 3);
        b(btluVar, 4);
        b(dbslVar, 5);
        return new aqgk(a, a2, a3, btluVar, dbslVar);
    }
}
