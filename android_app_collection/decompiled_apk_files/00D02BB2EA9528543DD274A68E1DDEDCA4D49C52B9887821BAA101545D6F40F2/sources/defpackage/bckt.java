package defpackage;
/* compiled from: PG */
/* renamed from: bckt  reason: default package */
/* loaded from: classes3.dex */
public class bckt {
    private final dzsj<cjqy> a;

    public bckt(dzsj<cjqy> dzsjVar) {
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

    public final bcks a(cjtd cjtdVar) {
        b(cjtdVar, 1);
        cjqy a = this.a.a();
        b(a, 2);
        return new bcks(cjtdVar, a);
    }
}
