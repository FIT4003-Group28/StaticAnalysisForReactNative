package defpackage;
/* compiled from: PG */
/* renamed from: eiq  reason: default package */
/* loaded from: classes6.dex */
public class eiq {
    private final dzsj<amfi> a;

    public eiq(dzsj<amfi> dzsjVar) {
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

    public final eip a(String str) {
        b(str, 1);
        amfi a = this.a.a();
        b(a, 2);
        return new eip(str, a);
    }
}
