package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ivg  reason: default package */
/* loaded from: classes6.dex */
public class ivg {
    private final dzsj<eeu> a;
    private final dzsj<dehq> b;
    private final dzsj<Executor> c;
    private final dzsj<cqat> d;

    public ivg(dzsj<eeu> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<cqat> dzsjVar4) {
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

    public final ivf a(izy izyVar) {
        eeu a = this.a.a();
        b(a, 1);
        dehq a2 = this.b.a();
        b(a2, 2);
        Executor a3 = this.c.a();
        b(a3, 3);
        cqat a4 = this.d.a();
        b(a4, 4);
        b(izyVar, 5);
        return new ivf(a, a2, a3, a4, izyVar);
    }
}
