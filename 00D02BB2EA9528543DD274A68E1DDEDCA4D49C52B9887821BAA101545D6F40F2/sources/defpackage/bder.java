package defpackage;

import android.app.Activity;
import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bder  reason: default package */
/* loaded from: classes3.dex */
public final class bder implements bdag {
    private final Activity a;
    private final bdcz b;
    private final bbtq c;

    public bder(bbtq bbtqVar, Activity activity, bdcz bdczVar) {
        this.a = activity;
        this.b = bdczVar;
        this.c = bbtqVar;
    }

    @Override // defpackage.bdag
    @dzsi
    public final jbt a(bczw bczwVar) {
        dhjx dhjxVar = bczwVar.a().m;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if ((dhjxVar.a & 1) != 0) {
            ilo c = ckob.c(bczwVar.a());
            bdcz bdczVar = this.b;
            bbtq bbtqVar = this.c;
            bdcz.a(c, 1);
            bdcz.a(bbtqVar, 2);
            Application a = bdczVar.a.a();
            bdcz.a(a, 3);
            bvjj a2 = bdczVar.b.a();
            bdcz.a(a2, 4);
            dxio a3 = ((dxjh) bdczVar.c).a();
            bdcz.a(a3, 5);
            bfgx a4 = bdczVar.d.a();
            bdcz.a(a4, 6);
            bdcz.a(bdczVar.e.a(), 7);
            gga a5 = bdczVar.f.a();
            bdcz.a(a5, 8);
            ahjq a6 = bdczVar.g.a();
            bdcz.a(a6, 9);
            bwqv a7 = bdczVar.h.a();
            bdcz.a(a7, 10);
            brvm a8 = bdczVar.i.a();
            bdcz.a(a8, 11);
            aeqg a9 = bdczVar.j.a();
            bdcz.a(a9, 12);
            bmmq a10 = bdczVar.k.a();
            bdcz.a(a10, 13);
            bdct a11 = bdczVar.l.a();
            bdcz.a(a11, 14);
            akox a12 = bdczVar.m.a();
            bdcz.a(a12, 15);
            befw a13 = bdczVar.n.a();
            bdcz.a(a13, 16);
            bfhu a14 = bdczVar.o.a();
            bdcz.a(a14, 17);
            bnjv a15 = bdczVar.p.a();
            bdcz.a(a15, 18);
            begg a16 = bdczVar.q.a();
            bdcz.a(a16, 19);
            brwc a17 = bdczVar.r.a();
            bdcz.a(a17, 20);
            aaaf a18 = bdczVar.s.a();
            bdcz.a(a18, 21);
            bruu a19 = bdczVar.t.a();
            bdcz.a(a19, 22);
            return new bdcy(c, bbtqVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19);
        }
        return null;
    }

    @Override // defpackage.bdag
    public final String b(bczw bczwVar) {
        dizh dizhVar = bczwVar.a().p;
        if (dizhVar == null) {
            dizhVar = dizh.j;
        }
        dlwk dlwkVar = dizhVar.d;
        if (dlwkVar == null) {
            dlwkVar = dlwk.g;
        }
        String str = dlwkVar.f;
        if (!str.isEmpty()) {
            return str;
        }
        dhjx dhjxVar = bczwVar.a().m;
        if (dhjxVar == null) {
            dhjxVar = dhjx.f;
        }
        if ((dhjxVar.a & 1) == 0) {
            return this.a.getString(R.string.UNKNOWN_PLACE);
        }
        return this.a.getString(R.string.VIEW_PLACE_LINK_TITLE);
    }
}
