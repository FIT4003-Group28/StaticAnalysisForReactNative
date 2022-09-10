package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crkw  reason: default package */
/* loaded from: classes5.dex */
public final class crkw {
    private final dzsj<Application> a;
    private final dzsj<cqat> b;
    private final dzsj<btpc> c;
    private final dzsj<vmy> d;
    private final dzsj<avnt> e;
    private final dzsj<btrm> f;
    private final dzsj<bvrb> g;
    private final dzsj<cjqy> h;
    private final dzsj<ckoq> i;

    public crkw(dzsj<Application> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<btpc> dzsjVar3, dzsj<vmy> dzsjVar4, dzsj<avnt> dzsjVar5, dzsj<btrm> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<cjqy> dzsjVar8, dzsj<ckoq> dzsjVar9) {
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

    public final crkv a(@dzsi GmmLocation gmmLocation, @dzsi ckcq ckcqVar, @dzsi ckcq ckcqVar2) {
        Application a = this.a.a();
        b(a, 1);
        cqat a2 = this.b.a();
        b(a2, 2);
        btpc a3 = this.c.a();
        b(a3, 3);
        vmy a4 = this.d.a();
        b(a4, 4);
        avnt a5 = this.e.a();
        b(a5, 5);
        btrm a6 = this.f.a();
        b(a6, 6);
        bvrb a7 = this.g.a();
        b(a7, 7);
        cjqy a8 = this.h.a();
        b(a8, 8);
        ckoq a9 = this.i.a();
        b(a9, 12);
        return new crkv(a, a2, a3, a4, a5, a6, a7, a8, gmmLocation, ckcqVar, ckcqVar2, a9);
    }
}
