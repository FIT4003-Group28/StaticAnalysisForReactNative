package defpackage;
/* compiled from: PG */
/* renamed from: bpys  reason: default package */
/* loaded from: classes4.dex */
public class bpys {
    private final dzsj<ff> a;
    private final dzsj<cqhn> b;

    public bpys(dzsj<ff> dzsjVar, dzsj<cqhn> dzsjVar2) {
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

    public final bpyr a(bqgw bqgwVar) {
        b(bqgwVar, 1);
        ff ffVar = (ff) ((dxjd) this.a).a;
        b(ffVar, 2);
        cqhn a = this.b.a();
        b(a, 3);
        return new bpyr(bqgwVar, ffVar, a);
    }
}
