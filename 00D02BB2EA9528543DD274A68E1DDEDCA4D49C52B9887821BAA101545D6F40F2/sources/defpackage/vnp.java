package defpackage;
/* compiled from: PG */
/* renamed from: vnp  reason: default package */
/* loaded from: classes7.dex */
public final class vnp {
    private final dzsj<cjmt> a;
    private final dzsj<cqhu> b;

    public vnp(dzsj<cjmt> dzsjVar, dzsj<cqhu> dzsjVar2) {
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

    public final vno a(cqjg cqjgVar) {
        cjmt a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        b(cqjgVar, 3);
        return new vno(a, cqjgVar);
    }
}
