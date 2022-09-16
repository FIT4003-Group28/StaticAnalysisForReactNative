package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: bxls  reason: default package */
/* loaded from: classes4.dex */
public final class bxls {
    private final dzsj<btpc> a;
    private final dzsj<buye> b;
    private final dzsj<avnt> c;
    private final dzsj<cqat> d;
    private final dzsj<bvrb> e;
    private final dzsj<dxio<avij>> f;
    private final dzsj<avoo> g;
    private final dzsj<btvo> h;

    public bxls(dzsj<btpc> dzsjVar, dzsj<buye> dzsjVar2, dzsj<avnt> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<bvrb> dzsjVar5, dzsj<dxio<avij>> dzsjVar6, dzsj<avoo> dzsjVar7, dzsj<btvo> dzsjVar8) {
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

    public final bxlr a(btxz btxzVar, dwjn dwjnVar, boolean z, bxlt bxltVar, bxes bxesVar, bxee bxeeVar, @dzsi GmmLocation gmmLocation, @dzsi GmmLocation gmmLocation2, bvrj bvrjVar, long j, long j2, long j3) {
        btpc a = this.a.a();
        b(a, 1);
        buye a2 = this.b.a();
        b(a2, 2);
        avnt a3 = this.c.a();
        b(a3, 3);
        cqat a4 = this.d.a();
        b(a4, 4);
        bvrb a5 = this.e.a();
        b(a5, 5);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 6);
        avoo a7 = this.g.a();
        b(a7, 7);
        btvo a8 = this.h.a();
        b(a8, 8);
        b(btxzVar, 9);
        b(dwjnVar, 10);
        b(bxltVar, 12);
        b(bxesVar, 13);
        b(bxeeVar, 14);
        b(bvrjVar, 17);
        return new bxlr(a, a2, a3, a4, a5, a6, a7, a8, btxzVar, dwjnVar, z, bxesVar, bxeeVar, gmmLocation, gmmLocation2, bvrjVar, j, j2, j3);
    }
}
