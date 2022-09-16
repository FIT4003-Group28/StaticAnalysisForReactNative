package defpackage;
/* compiled from: PG */
/* renamed from: brpd  reason: default package */
/* loaded from: classes4.dex */
public final class brpd {
    private final dzsj<btpc> a;
    private final dzsj<buxl> b;
    private final dzsj<avnt> c;
    private final dzsj<avoo> d;
    private final dzsj<cjqy> e;
    private final dzsj<cqat> f;
    private final dzsj<bvrb> g;
    private final dzsj<dxio<avij>> h;
    private final dzsj<dxio<ckoq>> i;

    public brpd(dzsj<btpc> dzsjVar, dzsj<buxl> dzsjVar2, dzsj<avnt> dzsjVar3, dzsj<avoo> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cqat> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<dxio<avij>> dzsjVar8, dzsj<dxio<ckoq>> dzsjVar9) {
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

    public final brpc a(dwir dwirVar, @dzsi ahnc ahncVar, brpb brpbVar, btxz btxzVar, brpa brpaVar, bvrj bvrjVar, long j) {
        btpc a = this.a.a();
        b(a, 1);
        buxl a2 = this.b.a();
        b(a2, 2);
        avnt a3 = this.c.a();
        b(a3, 3);
        avoo a4 = this.d.a();
        b(a4, 4);
        cjqy a5 = this.e.a();
        b(a5, 5);
        cqat a6 = this.f.a();
        b(a6, 6);
        bvrb a7 = this.g.a();
        b(a7, 7);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 8);
        b(((dxjh) this.i).a(), 9);
        b(dwirVar, 10);
        b(brpbVar, 12);
        b(btxzVar, 13);
        b(brpaVar, 14);
        b(bvrjVar, 15);
        return new brpc(a, a2, a3, a4, a5, a6, a7, a8, dwirVar, ahncVar, brpbVar, btxzVar, brpaVar, bvrjVar, j);
    }
}
