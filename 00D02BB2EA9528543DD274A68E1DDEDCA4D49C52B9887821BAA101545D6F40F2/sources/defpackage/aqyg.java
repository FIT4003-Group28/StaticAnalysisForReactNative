package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aqyg  reason: default package */
/* loaded from: classes2.dex */
public final class aqyg extends arab {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;
    public final dzsj<btrm> c;
    public final dzsj<btvo> d;
    public final dzsj<ahjq> e;
    public final dzsj<yys> f;
    public final dzsj<akox> g;
    public final dzsj<qbt> h;
    public final dzsj<ascb> i;
    public final dzsj<brba> j;
    public final dzsj<afha> k;

    public aqyg(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<ahjq> dzsjVar5, dzsj<yys> dzsjVar6, dzsj<akox> dzsjVar7, dzsj<qbt> dzsjVar8, dzsj<ascb> dzsjVar9, dzsj<brba> dzsjVar10, dzsj<afha> dzsjVar11) {
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
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final aqyf a(boolean z, @dzsi dqvj dqvjVar, boolean z2, arac aracVar, @dzsi qbi qbiVar, @dzsi bdxs bdxsVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqat a = this.b.a();
        b(a, 2);
        btrm a2 = this.c.a();
        b(a2, 3);
        btvo a3 = this.d.a();
        b(a3, 4);
        ahjq a4 = this.e.a();
        b(a4, 5);
        b(this.f.a(), 6);
        dzsj<akox> dzsjVar = this.g;
        dzsj<qbt> dzsjVar2 = this.h;
        dzsj<ascb> dzsjVar3 = this.i;
        dzsj<brba> dzsjVar4 = this.j;
        dzsj<afha> dzsjVar5 = this.k;
        b(aracVar, 15);
        return new aqyf(activity, a, a2, a3, a4, dzsjVar, dzsjVar2, dzsjVar3, dzsjVar4, dzsjVar5, z, dqvjVar, z2, aracVar, qbiVar, bdxsVar);
    }

    @Override // defpackage.arab
    public final /* bridge */ /* synthetic */ arad c(@dzsi dqvj dqvjVar, boolean z, arac aracVar, @dzsi bdxs bdxsVar) {
        return a(true, dqvjVar, z, aracVar, null, bdxsVar);
    }
}
