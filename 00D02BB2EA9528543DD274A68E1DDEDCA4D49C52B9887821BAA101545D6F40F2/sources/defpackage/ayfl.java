package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ayfl  reason: default package */
/* loaded from: classes3.dex */
public final class ayfl {
    private final dzsj<gga> a;
    private final dzsj<fd> b;
    private final dzsj<ahjq> c;
    private final dzsj<dxio<ayfd>> d;
    private final dzsj<btpc> e;
    private final dzsj<begg> f;
    private final dzsj<bvrb> g;
    private final dzsj<cztz> h;
    private final dzsj<bnjv> i;
    private final dzsj<btvo> j;
    private final dzsj<btrg> k;
    private final dzsj<Executor> l;
    private final dzsj<batz> m;

    public ayfl(dzsj<gga> dzsjVar, dzsj<fd> dzsjVar2, dzsj<ahjq> dzsjVar3, dzsj<dxio<ayfd>> dzsjVar4, dzsj<btpc> dzsjVar5, dzsj<begg> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<cztz> dzsjVar8, dzsj<bnjv> dzsjVar9, dzsj<btvo> dzsjVar10, dzsj<btrg> dzsjVar11, dzsj<Executor> dzsjVar12, dzsj<batz> dzsjVar13) {
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
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
        b(dzsjVar13, 13);
        this.m = dzsjVar13;
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

    public final ayfk a(@dzsi baad baadVar, @dzsi ayfi ayfiVar) {
        gga a = this.a.a();
        b(a, 1);
        fd fdVar = (fd) ((dxjd) this.b).a;
        b(fdVar, 2);
        ahjq a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        btpc a4 = this.e.a();
        b(a4, 5);
        begg a5 = this.f.a();
        b(a5, 6);
        bvrb a6 = this.g.a();
        b(a6, 7);
        cztz a7 = this.h.a();
        b(a7, 8);
        bnjv a8 = this.i.a();
        b(a8, 9);
        btvo a9 = this.j.a();
        b(a9, 10);
        btrg a10 = this.k.a();
        b(a10, 11);
        Executor a11 = this.l.a();
        b(a11, 12);
        batz a12 = this.m.a();
        b(a12, 13);
        return new ayfk(a, fdVar, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, baadVar, ayfiVar);
    }
}
