package defpackage;
/* compiled from: PG */
/* renamed from: bibv  reason: default package */
/* loaded from: classes3.dex */
public final class bibv {
    private final dzsj<gga> a;
    private final dzsj<dxio<axwo>> b;
    private final dzsj<dxio<axwi>> c;
    private final dzsj<cqhn> d;

    public bibv(dzsj<gga> dzsjVar, dzsj<dxio<axwo>> dzsjVar2, dzsj<dxio<axwi>> dzsjVar3, dzsj<cqhn> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final bibu a(azwu azwuVar, azxb azxbVar) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        b(this.d.a(), 4);
        b(azwuVar, 5);
        b(azxbVar, 6);
        return new bibu(a, a2, a3, azwuVar, azxbVar);
    }
}
