package defpackage;
/* compiled from: PG */
/* renamed from: abtn  reason: default package */
/* loaded from: classes2.dex */
public final class abtn {
    private final dzsj<abss> a;

    public abtn(dzsj<abss> dzsjVar) {
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

    public final abtm a(String str) {
        abss a = this.a.a();
        b(a, 1);
        b(str, 2);
        return new abtm(a, str);
    }
}
