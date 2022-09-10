package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: rco  reason: default package */
/* loaded from: classes7.dex */
public final class rco {
    private final dzsj<jdj> a;
    private final dzsj<cqkj> b;
    private final dzsj<cqhu> c;
    private final dzsj<bvjj> d;
    private final dzsj<rfr> e;
    private final dzsj<cqat> f;
    private final dzsj<acyr> g;

    public rco(dzsj<jdj> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<rfr> dzsjVar5, dzsj<cqat> dzsjVar6, dzsj<acyr> dzsjVar7) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
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

    public final rcn a(ilo iloVar, View view, gga ggaVar) {
        b(iloVar, 1);
        b(view, 2);
        b(ggaVar, 3);
        b(this.a.a(), 4);
        cqkj a = this.b.a();
        b(a, 5);
        b(this.c.a(), 6);
        bvjj a2 = this.d.a();
        b(a2, 7);
        rfr a3 = this.e.a();
        b(a3, 8);
        cqat a4 = this.f.a();
        b(a4, 9);
        acyr a5 = this.g.a();
        b(a5, 10);
        return new rcn(iloVar, view, ggaVar, a, a2, a3, a4, a5);
    }
}
