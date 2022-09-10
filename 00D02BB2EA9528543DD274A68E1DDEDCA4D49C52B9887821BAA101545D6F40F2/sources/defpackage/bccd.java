package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bccd  reason: default package */
/* loaded from: classes3.dex */
public final class bccd {
    public final dzsj<Activity> a;
    public final dzsj<cknm> b;
    public final dzsj<buti> c;
    public final dzsj<bcmm> d;
    public final dzsj<cknb> e;
    public final dzsj<bcmv> f;
    public final dzsj<bcof> g;
    public final dzsj<btvo> h;
    public final dzsj<bckv> i;
    public final dzsj<bhhf> j;
    public final dzsj<afxw> k;

    public bccd(dzsj<Activity> dzsjVar, dzsj<cknm> dzsjVar2, dzsj<buti> dzsjVar3, dzsj<bcmm> dzsjVar4, dzsj<cknb> dzsjVar5, dzsj<bcmv> dzsjVar6, dzsj<bcof> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<bckv> dzsjVar9, dzsj<bhhf> dzsjVar10, dzsj<afxw> dzsjVar11) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
