package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dpk  reason: default package */
/* loaded from: classes6.dex */
public final class dpk {
    private final dzsj<gga> a;
    private final dzsj<Executor> b;
    private final dzsj<bwqv> c;
    private final dzsj<dtc> d;

    public dpk(dzsj<gga> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<dtc> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final dpj a(dehn<dbsg<dpf>> dehnVar, m mVar) {
        gga a = this.a.a();
        b(a, 1);
        Executor a2 = this.b.a();
        b(a2, 2);
        bwqv a3 = this.c.a();
        b(a3, 3);
        dtc a4 = this.d.a();
        b(a4, 4);
        b(dehnVar, 5);
        b(mVar, 6);
        return new dpj(a, a2, a3, a4, dehnVar, mVar);
    }
}
