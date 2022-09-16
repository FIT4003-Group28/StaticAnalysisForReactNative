package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ioj  reason: default package */
/* loaded from: classes6.dex */
public final class ioj {
    private final dzsj<gga> a;
    private final dzsj<akox> b;
    private final dzsj<hwe> c;
    private final dzsj<btvo> d;
    private final dzsj<amfi> e;
    private final dzsj<dehq> f;
    private final dzsj<Executor> g;
    private final dzsj<crzb> h;
    private final dzsj<btrm> i;
    private final dzsj<cjqy> j;

    public ioj(dzsj<gga> dzsjVar, dzsj<akox> dzsjVar2, dzsj<hwe> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<amfi> dzsjVar5, dzsj<dehq> dzsjVar6, dzsj<Executor> dzsjVar7, dzsj<crzb> dzsjVar8, dzsj<btrm> dzsjVar9, dzsj<cjqy> dzsjVar10) {
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

    public final ioi a(ink inkVar, boolean z, ddho ddhoVar, ddho ddhoVar2) {
        gga a = this.a.a();
        b(a, 1);
        akox a2 = this.b.a();
        b(a2, 2);
        hwe a3 = this.c.a();
        b(a3, 3);
        btvo a4 = this.d.a();
        b(a4, 4);
        amfi a5 = this.e.a();
        b(a5, 5);
        dehq a6 = this.f.a();
        b(a6, 6);
        Executor a7 = this.g.a();
        b(a7, 7);
        crzb a8 = this.h.a();
        b(a8, 8);
        btrm a9 = this.i.a();
        b(a9, 9);
        cjqy a10 = this.j.a();
        b(a10, 10);
        b(inkVar, 11);
        b(ddhoVar, 13);
        b(ddhoVar2, 14);
        return new ioi(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, inkVar, z, ddhoVar, ddhoVar2);
    }
}
