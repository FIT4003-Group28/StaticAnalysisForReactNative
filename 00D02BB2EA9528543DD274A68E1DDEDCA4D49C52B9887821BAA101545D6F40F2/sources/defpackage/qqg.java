package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: qqg  reason: default package */
/* loaded from: classes7.dex */
public final class qqg {
    private final dzsj<gga> a;
    private final dzsj<qqe> b;
    private final dzsj<bvjj> c;
    private final dzsj<jdj> d;
    private final dzsj<yzi> e;
    private final dzsj<cqkj> f;
    private final dzsj<cqhu> g;
    private final dzsj<qqy> h;

    public qqg(dzsj<gga> dzsjVar, dzsj<qqe> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<jdj> dzsjVar4, dzsj<yzi> dzsjVar5, dzsj<cqkj> dzsjVar6, dzsj<cqhu> dzsjVar7, dzsj<qqy> dzsjVar8) {
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
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
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

    public final qqf a(View view) {
        b(view, 1);
        gga a = this.a.a();
        b(a, 2);
        b(this.b.a(), 3);
        bvjj a2 = this.c.a();
        b(a2, 4);
        b(this.d.a(), 5);
        yzi a3 = this.e.a();
        b(a3, 6);
        cqkj a4 = this.f.a();
        b(a4, 7);
        b(this.g.a(), 8);
        qqy a5 = this.h.a();
        b(a5, 9);
        return new qqf(view, a, a2, a3, a4, a5);
    }
}
