package defpackage;
/* compiled from: PG */
/* renamed from: dix  reason: default package */
/* loaded from: classes6.dex */
public final class dix {
    private final dzsj<dehq> a;
    private final dzsj<gga> b;

    public dix(dzsj<dehq> dzsjVar, dzsj<gga> dzsjVar2) {
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

    public final diw a(dbsg<? extends czc> dbsgVar, czh czhVar, int i) {
        dehq a = this.a.a();
        b(a, 1);
        gga a2 = this.b.a();
        b(a2, 2);
        b(dbsgVar, 3);
        b(czhVar, 4);
        return new diw(a, a2, dbsgVar, czhVar, i);
    }
}
