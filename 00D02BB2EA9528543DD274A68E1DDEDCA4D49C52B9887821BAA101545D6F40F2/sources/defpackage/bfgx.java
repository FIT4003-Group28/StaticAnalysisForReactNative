package defpackage;
/* compiled from: PG */
/* renamed from: bfgx  reason: default package */
/* loaded from: classes3.dex */
public class bfgx {
    private final dzsj<bvsx> a;

    public bfgx(dzsj<bvsx> dzsjVar) {
        b(dzsjVar);
        this.a = dzsjVar;
    }

    private static <T> void b(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final bfgw a(@dzsi dpml dpmlVar) {
        bvsx a = this.a.a();
        b(a);
        return new bfgw(a, dpmlVar);
    }
}
