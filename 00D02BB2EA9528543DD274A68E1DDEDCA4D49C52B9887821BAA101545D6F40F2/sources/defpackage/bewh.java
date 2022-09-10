package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bewh  reason: default package */
/* loaded from: classes3.dex */
public final class bewh {
    private final dzsj<bewk> a;

    public bewh(dzsj<bewk> dzsjVar) {
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

    public final bewg a(dbrn<drcm, List<dfzq>> dbrnVar) {
        b(dbrnVar, 1);
        bewk a = this.a.a();
        b(a, 2);
        return new bewg(dbrnVar, a);
    }
}
