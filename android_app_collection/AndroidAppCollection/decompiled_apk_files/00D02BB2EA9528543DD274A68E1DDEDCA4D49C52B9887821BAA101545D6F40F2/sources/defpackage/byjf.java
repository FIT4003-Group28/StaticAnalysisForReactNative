package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: byjf  reason: default package */
/* loaded from: classes4.dex */
public final class byjf {
    public final dzsj<bvjj> a;
    public final dzsj<axwq> b;
    public final dzsj<btrm> c;
    public final dzsj<srv> d;
    public final dzsj<vxa> e;
    public final dzsj<acyr> f;
    public final dzsj<dxio<ahjq>> g;
    public final dzsj<Activity> h;
    public final dzsj<byex> i;
    public final dzsj<btvo> j;

    public byjf(dzsj<bvjj> dzsjVar, dzsj<axwq> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<srv> dzsjVar4, dzsj<vxa> dzsjVar5, dzsj<acyr> dzsjVar6, dzsj<dxio<ahjq>> dzsjVar7, dzsj<Activity> dzsjVar8, dzsj<byex> dzsjVar9, dzsj<btvo> dzsjVar10) {
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
