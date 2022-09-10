package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: aoug  reason: default package */
/* loaded from: classes2.dex */
public final class aoug {
    private final dzsj<Application> a;
    private final dzsj<bvjj> b;
    private final dzsj<auhi> c;
    private final dzsj<bsvn> d;
    private final dzsj<bvrb> e;

    public aoug(dzsj<Application> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<auhi> dzsjVar3, dzsj<bsvn> dzsjVar4, dzsj<bvrb> dzsjVar5) {
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

    public final aouf a(auzu auzuVar, anhu anhuVar) {
        b(auzuVar, 1);
        b(anhuVar, 2);
        Application a = this.a.a();
        b(a, 3);
        bvjj a2 = this.b.a();
        b(a2, 4);
        auhi a3 = this.c.a();
        b(a3, 5);
        bsvn a4 = this.d.a();
        b(a4, 6);
        bvrb a5 = this.e.a();
        b(a5, 7);
        return new aouf(auzuVar, anhuVar, a, a2, a3, a4, a5);
    }
}
