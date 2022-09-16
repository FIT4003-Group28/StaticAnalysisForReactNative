package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bgqe  reason: default package */
/* loaded from: classes3.dex */
public final class bgqe {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<apqe> c;
    public final dzsj<cjqy> d;
    public final dzsj<gga> e;
    public final dzsj<bgos> f;
    public final dzsj<bgnj> g;

    public bgqe(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<apqe> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<gga> dzsjVar5, dzsj<bgos> dzsjVar6, dzsj<bgnj> dzsjVar7) {
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
