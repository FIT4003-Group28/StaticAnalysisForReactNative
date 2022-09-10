package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cexb  reason: default package */
/* loaded from: classes4.dex */
public class cexb {
    private final dzsj<gga> a;
    private final dzsj<eeu> b;
    private final dzsj<Executor> c;
    private final dzsj<anhk> d;
    private final dzsj<bvff> e;
    private final dzsj<bvfk> f;
    private final dzsj<bvfn> g;
    private final dzsj<begg> h;
    private final dzsj<bjbu> i;
    private final dzsj<btvo> j;

    public cexb(dzsj<gga> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<anhk> dzsjVar4, dzsj<bvff> dzsjVar5, dzsj<bvfk> dzsjVar6, dzsj<bvfn> dzsjVar7, dzsj<begg> dzsjVar8, dzsj<bjbu> dzsjVar9, dzsj<btvo> dzsjVar10) {
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

    public final cexa a(jic jicVar, djcb djcbVar, boolean z, cewt cewtVar) {
        gga a = this.a.a();
        b(a, 1);
        eeu a2 = this.b.a();
        b(a2, 2);
        Executor a3 = this.c.a();
        b(a3, 3);
        anhk a4 = this.d.a();
        b(a4, 4);
        bvff a5 = this.e.a();
        b(a5, 5);
        bvfk a6 = this.f.a();
        b(a6, 6);
        bvfn a7 = this.g.a();
        b(a7, 7);
        begg a8 = this.h.a();
        b(a8, 8);
        bjbu a9 = this.i.a();
        b(a9, 9);
        btvo a10 = this.j.a();
        b(a10, 10);
        b(jicVar, 11);
        b(djcbVar, 12);
        b(cewtVar, 14);
        return new cexa(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, jicVar, djcbVar, z, cewtVar);
    }
}
