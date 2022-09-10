package defpackage;
/* compiled from: PG */
/* renamed from: bibx  reason: default package */
/* loaded from: classes3.dex */
public final class bibx {
    private final dzsj<gga> a;
    private final dzsj<dxio<axwo>> b;
    private final dzsj<dxio<axwy>> c;

    public bibx(dzsj<gga> dzsjVar, dzsj<dxio<axwo>> dzsjVar2, dzsj<dxio<axwy>> dzsjVar3) {
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

    public final bibw a(@dzsi azwu azwuVar) {
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        return new bibw(a, a2, a3, azwuVar);
    }
}
