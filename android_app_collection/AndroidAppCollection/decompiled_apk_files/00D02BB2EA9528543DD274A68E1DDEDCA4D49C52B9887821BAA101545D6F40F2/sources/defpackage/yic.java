package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yic  reason: default package */
/* loaded from: classes7.dex */
public final class yic {
    public final dzsj<Activity> a;
    public final dzsj<ivg> b;
    public final dzsj<cqhn> c;
    public final dzsj<btrm> d;
    public final dzsj<dxio<ahjq>> e;
    public final dzsj<ytc> f;
    public final dzsj<ywn> g;
    public final dzsj<yuu> h;
    public final dzsj<yuw> i;
    public final dzsj<befw> j;
    public final dzsj<qbt> k;

    public yic(dzsj<Activity> dzsjVar, dzsj<ivg> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<dxio<ahjq>> dzsjVar5, dzsj<ytc> dzsjVar6, dzsj<ywn> dzsjVar7, dzsj<yuu> dzsjVar8, dzsj<yuw> dzsjVar9, dzsj<befw> dzsjVar10, dzsj<qbt> dzsjVar11) {
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
