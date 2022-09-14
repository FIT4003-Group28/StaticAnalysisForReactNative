package defpackage;
/* compiled from: PG */
/* renamed from: xhx  reason: default package */
/* loaded from: classes7.dex */
public class xhx {
    private final dzsj<dxio<qbt>> a;

    public xhx(dzsj<dxio<qbt>> dzsjVar) {
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

    public final xhw a(dpgh dpghVar) {
        dxio a = ((dxjh) this.a).a();
        b(a, 1);
        b(dpghVar, 2);
        return new xhw(a, dpghVar);
    }
}
