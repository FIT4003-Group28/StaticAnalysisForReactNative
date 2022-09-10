package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cabb  reason: default package */
/* loaded from: classes4.dex */
public final class cabb {
    public final dzsj<Resources> a;
    public final dzsj<ff> b;
    public final dzsj<cafi> c;
    public final dzsj<cavs> d;
    public final dzsj<akfa> e;
    public final dzsj<cabl> f;
    public final dzsj<bzyq> g;
    public final dzsj<ech> h;

    public cabb(dzsj<Resources> dzsjVar, dzsj<ff> dzsjVar2, dzsj<cafi> dzsjVar3, dzsj<cavs> dzsjVar4, dzsj<akfa> dzsjVar5, dzsj<cabl> dzsjVar6, dzsj<bzyq> dzsjVar7, dzsj<ech> dzsjVar8) {
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
