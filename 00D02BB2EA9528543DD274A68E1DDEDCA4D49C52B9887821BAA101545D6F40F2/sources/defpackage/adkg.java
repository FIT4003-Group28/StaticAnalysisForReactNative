package defpackage;
/* compiled from: PG */
/* renamed from: adkg  reason: default package */
/* loaded from: classes.dex */
public final class adkg {
    private final dzsj<abfa> a;
    private final dzsj<acyr> b;
    private final dzsj<adkm> c;

    public adkg(dzsj<abfa> dzsjVar, dzsj<acyr> dzsjVar2, dzsj<adkm> dzsjVar3) {
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

    public final adkf a(absg absgVar) {
        abfa a = this.a.a();
        b(a, 1);
        acyr a2 = this.b.a();
        b(a2, 2);
        adkm a3 = this.c.a();
        b(a3, 3);
        b(absgVar, 4);
        return new adkf(a, a2, a3, absgVar);
    }
}
