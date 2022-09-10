package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bpeg  reason: default package */
/* loaded from: classes3.dex */
public final class bpeg {
    private final dzsj<cqhn> a;
    private final dzsj<bped> b;

    public bpeg(dzsj<cqhn> dzsjVar, dzsj<bped> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final bpef a(boxg boxgVar, List<boxf> list) {
        b(boxgVar, 1);
        b(list, 2);
        cqhn a = this.a.a();
        b(a, 3);
        bped a2 = this.b.a();
        b(a2, 4);
        return new bpef(boxgVar, list, a, a2);
    }
}
