package defpackage;
/* compiled from: PG */
/* renamed from: bdfe  reason: default package */
/* loaded from: classes3.dex */
public class bdfe {
    private final dzsj<cqhn> a;

    public bdfe(dzsj<cqhn> dzsjVar) {
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

    public final bdfd a(appj appjVar, dwfl dwflVar, int i, @dzsi Long l) {
        b(appjVar, 1);
        cqhn a = this.a.a();
        b(a, 2);
        b(dwflVar, 3);
        return new bdfd(appjVar, a, dwflVar, i, l);
    }
}
