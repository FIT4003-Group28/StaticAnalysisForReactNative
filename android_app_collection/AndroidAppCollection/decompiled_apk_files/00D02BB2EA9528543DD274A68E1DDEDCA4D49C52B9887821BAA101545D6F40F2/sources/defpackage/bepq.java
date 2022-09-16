package defpackage;
/* compiled from: PG */
/* renamed from: bepq  reason: default package */
/* loaded from: classes3.dex */
public class bepq {
    private final dzsj<ff> a;

    public bepq(dzsj<ff> dzsjVar) {
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

    public final bepp a(boolean z) {
        ff ffVar = (ff) ((dxjd) this.a).a;
        b(ffVar);
        return new bepp(ffVar, z);
    }
}
