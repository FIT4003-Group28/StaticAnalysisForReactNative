package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aosw  reason: default package */
/* loaded from: classes2.dex */
public final class aosw {
    public final dzsj<anqr> a;
    public final dzsj<Executor> b;
    public final dzsj<Executor> c;
    public final dzsj<btpc> d;
    public final dzsj<fd> e;
    public final dzsj<btrm> f;
    public final dzsj<anhk> g;
    public final dzsj<burp> h;
    public final dzsj<Activity> i;
    public final dzsj<cqat> j;
    public final dzsj<bvju> k;

    public aosw(dzsj<anqr> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<btpc> dzsjVar4, dzsj<fd> dzsjVar5, dzsj<btrm> dzsjVar6, dzsj<anhk> dzsjVar7, dzsj<burp> dzsjVar8, dzsj<Activity> dzsjVar9, dzsj<cqat> dzsjVar10, dzsj<bvju> dzsjVar11) {
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
