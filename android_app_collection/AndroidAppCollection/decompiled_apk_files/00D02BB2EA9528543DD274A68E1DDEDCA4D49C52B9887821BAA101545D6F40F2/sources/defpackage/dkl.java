package defpackage;
/* compiled from: PG */
/* renamed from: dkl  reason: default package */
/* loaded from: classes6.dex */
public final class dkl {
    private final dzsj<dkh> a;
    private final dzsj<cjqy> b;

    public dkl(dzsj<dkh> dzsjVar, dzsj<cjqy> dzsjVar2) {
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

    public final dkk a(dbsg<cjqp> dbsgVar, ddho ddhoVar, @dzsi akqi akqiVar) {
        dkh a = this.a.a();
        b(a, 1);
        cjqy a2 = this.b.a();
        b(a2, 2);
        b(dbsgVar, 3);
        b(ddhoVar, 4);
        return new dkk(a, a2, dbsgVar, ddhoVar, akqiVar);
    }
}
