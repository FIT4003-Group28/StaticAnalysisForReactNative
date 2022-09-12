package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aeqs  reason: default package */
/* loaded from: classes2.dex */
public class aeqs {
    private final dzsj<Resources> a;
    private final dzsj<cqhn> b;

    public aeqs(dzsj<Resources> dzsjVar, dzsj<cqhn> dzsjVar2) {
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

    public final aeqr a(dcdc<Integer> dcdcVar, Integer num) {
        Resources a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        b(dcdcVar, 3);
        b(num, 4);
        return new aeqr(a, a2, dcdcVar, num);
    }
}
