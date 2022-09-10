package defpackage;
/* compiled from: PG */
/* renamed from: nej  reason: default package */
/* loaded from: classes7.dex */
public final class nej {
    public final dzsj<nfg> a;
    public final dzsj<akfa> b;

    public nej(dzsj<nfg> dzsjVar, dzsj<akfa> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
