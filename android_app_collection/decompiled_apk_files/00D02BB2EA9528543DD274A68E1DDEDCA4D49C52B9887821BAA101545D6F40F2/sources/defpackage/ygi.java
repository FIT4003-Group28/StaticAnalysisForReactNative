package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ygi  reason: default package */
/* loaded from: classes7.dex */
public final class ygi {
    public final dzsj<Activity> a;
    public final dzsj<ivg> b;
    public final dzsj<cqhn> c;
    public final dzsj<jmn> d;
    public final dzsj<ydu> e;
    public final dzsj<ygu> f;
    public final dzsj<yfu> g;
    public final dzsj<vtn> h;
    public final dzsj<bvrb> i;
    public final dzsj<ckcw> j;
    public final dzsj<qbt> k;

    public ygi(dzsj<Activity> dzsjVar, dzsj<ivg> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<jmn> dzsjVar4, dzsj<ydu> dzsjVar5, dzsj<ygu> dzsjVar6, dzsj<yfu> dzsjVar7, dzsj<vtn> dzsjVar8, dzsj<bvrb> dzsjVar9, dzsj<ckcw> dzsjVar10, dzsj<qbt> dzsjVar11) {
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
