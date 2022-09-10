package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: aphy  reason: default package */
/* loaded from: classes2.dex */
public class aphy {
    private final dzsj<gga> a;
    private final dzsj<bwqv> b;

    public aphy(dzsj<gga> dzsjVar, dzsj<bwqv> dzsjVar2) {
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

    public final aphx a(Callable<bwrs<aoyg>> callable) {
        gga a = this.a.a();
        b(a, 1);
        bwqv a2 = this.b.a();
        b(a2, 2);
        b(callable, 3);
        return new aphx(a, a2, callable);
    }
}
