package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: zif  reason: default package */
/* loaded from: classes7.dex */
public final class zif {
    public final dzsj<vwv> a;
    public final dzsj<bvjj> b;
    public final dzsj<dxio<vml>> c;
    public final dzsj<cjqq> d;
    public final dzsj<dxio<bzmm>> e;
    public final dzsj<zik> f;
    public final dzsj<zln> g;
    public final dzsj<zgh> h;
    public final dzsj<zkk> i;
    public final dzsj<zhe> j;
    public final dzsj<arrf> k;
    public final dzsj<arri> l;
    public final dzsj<Activity> m;

    public zif(dzsj<vwv> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<dxio<vml>> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<dxio<bzmm>> dzsjVar5, dzsj<zik> dzsjVar6, dzsj<zln> dzsjVar7, dzsj<zgh> dzsjVar8, dzsj<zkk> dzsjVar9, dzsj<zhe> dzsjVar10, dzsj<arrf> dzsjVar11, dzsj<arri> dzsjVar12, dzsj<Activity> dzsjVar13) {
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
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
        a(dzsjVar13, 13);
        this.m = dzsjVar13;
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
