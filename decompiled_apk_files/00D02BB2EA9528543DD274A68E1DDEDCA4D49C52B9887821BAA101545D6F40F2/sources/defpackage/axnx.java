package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axnx  reason: default package */
/* loaded from: classes3.dex */
public final class axnx {
    private final dzsj<axis> a;
    private final dzsj<Executor> b;

    public axnx(dzsj<axis> dzsjVar, dzsj<Executor> dzsjVar2) {
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

    public final axnw a(@dzsi String str, @dzsi diyr diyrVar) {
        axis a = this.a.a();
        b(a, 1);
        Executor a2 = this.b.a();
        b(a2, 2);
        return new axnw(a, a2, str, diyrVar);
    }
}
