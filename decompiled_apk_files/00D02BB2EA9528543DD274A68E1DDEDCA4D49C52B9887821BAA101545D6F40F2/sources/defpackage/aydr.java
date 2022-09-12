package defpackage;
/* compiled from: PG */
/* renamed from: aydr  reason: default package */
/* loaded from: classes3.dex */
public class aydr {
    private final dzsj<caxe> a;

    public aydr(dzsj<caxe> dzsjVar) {
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

    public final aydq a(int i, int i2, int i3, aydt aydtVar) {
        caxe a = this.a.a();
        b(a, 1);
        b(aydtVar, 5);
        return new aydq(a, i, i2, i3, aydtVar);
    }
}
