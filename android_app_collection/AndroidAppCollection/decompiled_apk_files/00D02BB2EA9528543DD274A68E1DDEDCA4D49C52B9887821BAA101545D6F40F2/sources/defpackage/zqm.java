package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: zqm  reason: default package */
/* loaded from: classes7.dex */
public final class zqm {
    private final dzsj<zgt> a;
    private final dzsj<zoo> b;
    private final dzsj<wuw> c;
    private final dzsj<zpf> d;
    private final dzsj<zmc> e;
    private final dzsj<zkp> f;
    private final dzsj<zld> g;
    private final dzsj<zkj> h;
    private final dzsj<vwv> i;
    private final dzsj<qbv> j;

    public zqm(dzsj<zgt> dzsjVar, dzsj<zoo> dzsjVar2, dzsj<wuw> dzsjVar3, dzsj<zpf> dzsjVar4, dzsj<zmc> dzsjVar5, dzsj<zkp> dzsjVar6, dzsj<zld> dzsjVar7, dzsj<zkj> dzsjVar8, dzsj<vwv> dzsjVar9, dzsj<qbv> dzsjVar10) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final zql a(Context context, zfn zfnVar, dqvj dqvjVar, amve amveVar, @dzsi String str, int i, amvh amvhVar, @dzsi dosz doszVar, boolean z, cqhn cqhnVar) {
        zgt a = this.a.a();
        b(a, 1);
        zoo a2 = this.b.a();
        b(a2, 2);
        wuw a3 = this.c.a();
        b(a3, 3);
        zpf a4 = this.d.a();
        b(a4, 4);
        zmc a5 = this.e.a();
        b(a5, 5);
        b(this.f.a(), 6);
        zld a6 = this.g.a();
        b(a6, 7);
        zkj a7 = this.h.a();
        b(a7, 8);
        b(this.i.a(), 9);
        qbv a8 = this.j.a();
        b(a8, 10);
        b(context, 11);
        b(zfnVar, 12);
        b(dqvjVar, 13);
        b(amveVar, 14);
        b(amvhVar, 17);
        b(cqhnVar, 20);
        return new zql(a, a2, a3, a4, a5, a6, a7, a8, context, zfnVar, dqvjVar, amveVar, str, i, amvhVar, doszVar, z, cqhnVar);
    }
}
