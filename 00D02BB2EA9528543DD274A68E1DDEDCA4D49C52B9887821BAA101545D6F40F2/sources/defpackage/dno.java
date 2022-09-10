package defpackage;
/* compiled from: PG */
/* renamed from: dno  reason: default package */
/* loaded from: classes6.dex */
public final class dno {
    private final dzsj<dnt> a;

    public dno(dzsj<dnt> dzsjVar) {
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

    public final dnn a(gga ggaVar, czo czoVar, czh czhVar) {
        b(this.a.a(), 1);
        b(ggaVar, 2);
        b(czoVar, 3);
        b(czhVar, 4);
        return new dnn();
    }
}
