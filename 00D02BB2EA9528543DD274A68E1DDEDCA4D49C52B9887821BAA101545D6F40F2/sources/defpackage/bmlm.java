package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bmlm  reason: default package */
/* loaded from: classes3.dex */
public class bmlm {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<cjqy> c;
    public final dzsj<begg> d;
    public final dzsj<iqs> e;
    public final dzsj<bmdk> f;
    public final dzsj<jkf> g;
    public final dzsj<btvo> h;
    public final dzsj<bnam> i;
    public final dzsj<cebr> j;

    public bmlm(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<begg> dzsjVar4, dzsj<iqs> dzsjVar5, dzsj<bmdk> dzsjVar6, dzsj<jkf> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<bnam> dzsjVar9, dzsj<cebr> dzsjVar10) {
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
