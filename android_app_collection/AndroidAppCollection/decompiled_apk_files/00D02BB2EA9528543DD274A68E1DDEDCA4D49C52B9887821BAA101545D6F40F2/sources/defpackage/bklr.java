package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bklr  reason: default package */
/* loaded from: classes3.dex */
public final class bklr {
    private final dzsj<cqhn> a;
    private final dzsj<cjqy> b;
    private final dzsj<bklx> c;

    public bklr(dzsj<cqhn> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<bklx> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final bklq a(bkkj bkkjVar, List<ccln> list, bwrs<ilo> bwrsVar, bknf bknfVar, boolean z) {
        cqhn a = this.a.a();
        b(a, 1);
        cjqy a2 = this.b.a();
        b(a2, 2);
        bklx a3 = this.c.a();
        b(a3, 3);
        b(bkkjVar, 4);
        b(list, 5);
        b(bwrsVar, 6);
        b(bknfVar, 7);
        return new bklq(a, a2, a3, bkkjVar, list, bwrsVar, bknfVar, z);
    }
}
