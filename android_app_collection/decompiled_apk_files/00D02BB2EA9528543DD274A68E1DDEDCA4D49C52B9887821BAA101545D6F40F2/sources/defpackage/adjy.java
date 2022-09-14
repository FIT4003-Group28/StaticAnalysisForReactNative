package defpackage;
/* compiled from: PG */
/* renamed from: adjy  reason: default package */
/* loaded from: classes.dex */
public final class adjy {
    private final dzsj<abvw> a;

    public adjy(dzsj<abvw> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final adjx a(dbsg<ilo> dbsgVar, absg absgVar) {
        abvw a = this.a.a();
        b(a, 1);
        b(dbsgVar, 2);
        b(absgVar, 3);
        return new adjx(a, dbsgVar, absgVar);
    }
}
