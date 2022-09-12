package defpackage;
/* compiled from: PG */
/* renamed from: bwie  reason: default package */
/* loaded from: classes4.dex */
public final class bwie {
    private final dzsj<akfa> a;

    public bwie(dzsj<akfa> dzsjVar) {
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

    public final bwid a() {
        akfa a = this.a.a();
        b(a);
        return new bwid(a);
    }
}
