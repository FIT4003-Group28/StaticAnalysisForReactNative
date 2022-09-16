package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ziw  reason: default package */
/* loaded from: classes7.dex */
public final class ziw {
    public final dzsj<Activity> a;
    public final dzsj<vnp> b;
    public final dzsj<vmh> c;
    public final dzsj<cjqy> d;
    public final dzsj<bvjj> e;
    public final dzsj<zka> f;
    public final dzsj<zqi> g;
    public final dzsj<zny> h;
    public final dzsj<zlb> i;
    public final dzsj<zky> j;
    public final dzsj<cqat> k;
    public final dzsj<zuz> l;
    public final dzsj<vmz> m;

    public ziw(dzsj<Activity> dzsjVar, dzsj<vnp> dzsjVar2, dzsj<vmh> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<zka> dzsjVar6, dzsj<zqi> dzsjVar7, dzsj<zny> dzsjVar8, dzsj<zlb> dzsjVar9, dzsj<zky> dzsjVar10, dzsj<cqat> dzsjVar11, dzsj<zuz> dzsjVar12, dzsj<vmz> dzsjVar13) {
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
