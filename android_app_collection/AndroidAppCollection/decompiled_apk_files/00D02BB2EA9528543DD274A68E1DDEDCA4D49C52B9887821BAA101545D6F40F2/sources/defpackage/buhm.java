package defpackage;
/* compiled from: PG */
/* renamed from: buhm  reason: default package */
/* loaded from: classes4.dex */
public final class buhm {
    public final dzsj<btrm> a;

    public buhm(dzsj<btrm> dzsjVar) {
        a(dzsjVar);
        this.a = dzsjVar;
    }

    public static <T> void a(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
