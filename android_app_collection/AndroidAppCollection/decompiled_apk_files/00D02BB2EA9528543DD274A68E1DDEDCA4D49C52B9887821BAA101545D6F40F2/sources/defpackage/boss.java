package defpackage;
/* compiled from: PG */
/* renamed from: boss  reason: default package */
/* loaded from: classes3.dex */
public final class boss {
    private final dzsj<dxio<boxa>> a;
    private final dzsj<jmx> b;

    public boss(dzsj<dxio<boxa>> dzsjVar, dzsj<jmx> dzsjVar2) {
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

    public final bosr a(ges gesVar, bosj bosjVar, bonr bonrVar, @dzsi bond bondVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        jmx a2 = this.b.a();
        b(a2, 2);
        b(gesVar, 3);
        b(bosjVar, 4);
        b(bonrVar, 5);
        return new bosr(a, a2, gesVar, bosjVar, bonrVar, bondVar);
    }
}
