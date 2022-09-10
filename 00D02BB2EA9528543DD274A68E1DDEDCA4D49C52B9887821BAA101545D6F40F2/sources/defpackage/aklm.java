package defpackage;
/* compiled from: PG */
/* renamed from: aklm  reason: default package */
/* loaded from: classes2.dex */
public final class aklm {
    private final dzsj<acwt> a;
    private final dzsj<dxio<aklw>> b;
    private final dzsj<dxio<aklq>> c;

    public aklm(dzsj<acwt> dzsjVar, dzsj<dxio<aklw>> dzsjVar2, dzsj<dxio<aklq>> dzsjVar3) {
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

    public final akll a(akgk akgkVar) {
        b(akgkVar, 1);
        acwt a = this.a.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 4);
        return new akll(akgkVar, a, a2, a3);
    }
}
