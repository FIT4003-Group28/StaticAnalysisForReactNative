package defpackage;
/* compiled from: PG */
/* renamed from: chkd  reason: default package */
/* loaded from: classes4.dex */
public class chkd {
    private final dzsj<chkb> a;

    public chkd(dzsj<chkb> dzsjVar) {
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

    public final chkc a(dqeg dqegVar) {
        b(dqegVar, 1);
        chkb a = this.a.a();
        b(a, 2);
        return new chkc(dqegVar, a);
    }
}
