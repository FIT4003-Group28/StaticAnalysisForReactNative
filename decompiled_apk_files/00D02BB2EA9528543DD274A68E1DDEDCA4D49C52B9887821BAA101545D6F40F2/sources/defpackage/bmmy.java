package defpackage;
/* compiled from: PG */
/* renamed from: bmmy  reason: default package */
/* loaded from: classes3.dex */
public final class bmmy {
    public final dzsj<bmmu> a;

    public bmmy(dzsj<bmmu> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
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