package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brcf  reason: default package */
/* loaded from: classes4.dex */
public final class brcf {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;
    public final dzsj<broq> c;
    public final dzsj<akox> d;
    public final dzsj<aehr> e;
    public final dzsj<aeht> f;
    public final dzsj<brdi> g;
    public final dzsj<brcs> h;
    public final dzsj<jkj> i;
    public final dzsj<braw> j;
    public final dzsj<brmt> k;

    public brcf(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<broq> dzsjVar3, dzsj<akox> dzsjVar4, dzsj<aehr> dzsjVar5, dzsj<aeht> dzsjVar6, dzsj<brdi> dzsjVar7, dzsj<brcs> dzsjVar8, dzsj<jkj> dzsjVar9, dzsj<braw> dzsjVar10, dzsj<brmt> dzsjVar11) {
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
