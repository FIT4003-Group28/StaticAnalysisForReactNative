package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: shc  reason: default package */
/* loaded from: classes7.dex */
public class shc {
    public final dzsj<Application> a;
    public final dzsj<cqhn> b;
    public final dzsj<qjk> c;
    public final dzsj<shu> d;
    public final dzsj<sic> e;
    public final dzsj<sdz> f;
    public final dzsj<qsm> g;
    public final dzsj<vox> h;
    public final dzsj<sgc> i;
    public final dzsj<akox> j;
    public final dzsj<rln> k;
    public final dzsj<btvo> l;

    public shc(dzsj<Application> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<qjk> dzsjVar3, dzsj<shu> dzsjVar4, dzsj<sic> dzsjVar5, dzsj<sdz> dzsjVar6, dzsj<qsm> dzsjVar7, dzsj<vox> dzsjVar8, dzsj<sgc> dzsjVar9, dzsj<akox> dzsjVar10, dzsj<rln> dzsjVar11, dzsj<btvo> dzsjVar12) {
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
