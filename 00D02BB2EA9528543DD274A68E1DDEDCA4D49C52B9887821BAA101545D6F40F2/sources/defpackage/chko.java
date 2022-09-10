package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chko  reason: default package */
/* loaded from: classes4.dex */
public final class chko {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<Executor> c;
    public final dzsj<buqs> d;
    public final dzsj<cklf> e;
    public final dzsj<bmdv> f;
    public final dzsj<dxio<ahjq>> g;
    public final dzsj<axru> h;
    public final dzsj<axrx> i;
    public final dzsj<bbut> j;
    public final dzsj<Resources> k;
    public final dzsj<cdfx> l;
    public final dzsj<chkg> m;

    public chko(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<buqs> dzsjVar4, dzsj<cklf> dzsjVar5, dzsj<bmdv> dzsjVar6, dzsj<dxio<ahjq>> dzsjVar7, dzsj<axru> dzsjVar8, dzsj<axrx> dzsjVar9, dzsj<bbut> dzsjVar10, dzsj<Resources> dzsjVar11, dzsj<cdfx> dzsjVar12, dzsj<chkg> dzsjVar13) {
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
