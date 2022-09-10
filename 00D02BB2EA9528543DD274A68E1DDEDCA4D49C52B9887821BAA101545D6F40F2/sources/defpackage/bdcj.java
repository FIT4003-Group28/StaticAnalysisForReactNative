package defpackage;
/* compiled from: PG */
/* renamed from: bdcj  reason: default package */
/* loaded from: classes3.dex */
public class bdcj {
    private final dzsj<afxv> a;

    public bdcj(dzsj<afxv> dzsjVar) {
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

    public final bdci a() {
        afxv a = this.a.a();
        b(a);
        return new bdci(a);
    }
}
