package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cauv  reason: default package */
/* loaded from: classes4.dex */
public final class cauv {
    public final dzsj<gga> a;
    public final dzsj<Resources> b;
    public final dzsj<begg> c;
    public final dzsj<Executor> d;
    public final dzsj<anhk> e;
    public final dzsj<bvff> f;
    public final dzsj<bvfk> g;
    public final dzsj<bvfn> h;
    public final dzsj<cqhn> i;
    public final dzsj<eeu> j;
    public final dzsj<bjbu> k;
    public final dzsj<caux> l;

    public cauv(dzsj<gga> dzsjVar, dzsj<Resources> dzsjVar2, dzsj<begg> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<anhk> dzsjVar5, dzsj<bvff> dzsjVar6, dzsj<bvfk> dzsjVar7, dzsj<bvfn> dzsjVar8, dzsj<cqhn> dzsjVar9, dzsj<eeu> dzsjVar10, dzsj<bjbu> dzsjVar11, dzsj<caux> dzsjVar12) {
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
