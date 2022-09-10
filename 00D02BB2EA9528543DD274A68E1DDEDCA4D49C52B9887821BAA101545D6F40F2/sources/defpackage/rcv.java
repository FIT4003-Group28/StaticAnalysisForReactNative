package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rcv  reason: default package */
/* loaded from: classes7.dex */
public final class rcv {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;
    public final dzsj<btrm> c;
    public final dzsj<srv> d;
    public final dzsj<rcx> e;
    public final dzsj<ahjq> f;
    public final dzsj<akpm> g;
    public final dzsj<bvjj> h;
    public final dzsj<bvrb> i;
    public final dzsj<btvo> j;
    public final dzsj<ckcw> k;
    public final dzsj<wbw> l;

    public rcv(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<srv> dzsjVar4, dzsj<rcx> dzsjVar5, dzsj<ahjq> dzsjVar6, dzsj<akpm> dzsjVar7, dzsj<bvjj> dzsjVar8, dzsj<bvrb> dzsjVar9, dzsj<btvo> dzsjVar10, dzsj<ckcw> dzsjVar11, dzsj<wbw> dzsjVar12) {
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
