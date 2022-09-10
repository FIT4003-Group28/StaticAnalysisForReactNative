package defpackage;
/* compiled from: PG */
/* renamed from: cjbt  reason: default package */
/* loaded from: classes4.dex */
public final class cjbt {
    private final dzsj<gga> a;
    private final dzsj<cqhn> b;

    public cjbt(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2) {
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

    public final cjbs a(cjbr cjbrVar, dbty<Boolean> dbtyVar) {
        gga a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        b(cjbrVar, 3);
        b(dbtyVar, 4);
        return new cjbs(a, a2, cjbrVar, dbtyVar);
    }
}
