package defpackage;
/* compiled from: PG */
/* renamed from: cefd  reason: default package */
/* loaded from: classes4.dex */
public class cefd {
    public final dzsj<buvg> a;
    public final dzsj<cese> b;

    public cefd(dzsj<buvg> dzsjVar, dzsj<cese> dzsjVar2) {
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
