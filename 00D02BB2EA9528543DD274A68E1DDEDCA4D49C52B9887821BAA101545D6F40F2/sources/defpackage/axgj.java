package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axgj  reason: default package */
/* loaded from: classes3.dex */
public final class axgj {
    private final dzsj<axis> a;
    private final dzsj<axjm> b;
    private final dzsj<Executor> c;
    private final dzsj<akfa> d;
    private final dzsj<bvjj> e;

    public axgj(dzsj<axis> dzsjVar, dzsj<axjm> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<bvjj> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
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

    public final axgi a(String str) {
        axis a = this.a.a();
        b(a, 1);
        axjm a2 = this.b.a();
        b(a2, 2);
        Executor a3 = this.c.a();
        b(a3, 3);
        akfa a4 = this.d.a();
        b(a4, 4);
        bvjj a5 = this.e.a();
        b(a5, 5);
        b(str, 6);
        return new axgi(a, a2, a3, a4, a5, str);
    }
}
