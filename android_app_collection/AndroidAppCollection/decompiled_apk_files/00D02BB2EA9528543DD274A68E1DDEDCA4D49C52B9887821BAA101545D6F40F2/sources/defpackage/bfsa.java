package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfsa  reason: default package */
/* loaded from: classes3.dex */
public class bfsa implements bfrq {
    public final gga a;
    public final cqkj b;
    public final bfmz c;
    @dzsi
    public jdi d;
    @dzsi
    public dnng e;
    private final acmv f;
    private final btvo g;
    private final Resources h;
    private final aekq i;
    private final cjtd j;
    @dzsi
    private aekh k;
    @dzsi
    private Integer l;
    private boolean m;

    public bfsa(gga ggaVar, cqkj cqkjVar, jdj jdjVar, aekq aekqVar, bfmz bfmzVar, btvo btvoVar, Resources resources, Integer num) {
        acmw b;
        this.a = ggaVar;
        this.b = cqkjVar;
        this.i = aekqVar;
        this.c = bfmzVar;
        this.g = btvoVar;
        this.h = resources;
        int i = num.equals(Integer.valueOf(resources.getColor(R.color.ad_badge_background_green))) ? 4 : 3;
        if (btvoVar.getAdsParameters().l) {
            b = acpd.a(resources.getString(R.string.ADS));
        } else {
            b = acpd.b(resources.getString(R.string.ADS), i, resources);
        }
        this.f = b;
        this.j = cjtd.a(dtxy.hA);
    }

    private final boolean q() {
        return this.g.getHotelBookingModuleParameters().i();
    }

    @Override // defpackage.bfrq
    public acmv a() {
        return this.f;
    }

    @Override // defpackage.bfrq
    public CharSequence b() {
        return this.h.getText(R.string.INLINE_HOTEL_BOOKING_HEADER);
    }

    @Override // defpackage.bfrq
    public CharSequence c() {
        if (this.m || q()) {
            return this.h.getText(R.string.INLINE_HOTEL_BOOKING_HEADER);
        }
        Integer num = this.l;
        if (num == null) {
            return this.h.getText(R.string.RATES_TAB_TITLE_FALLBACK);
        }
        return this.h.getQuantityString(R.plurals.RATES_TAB_TITLE, num.intValue(), this.l);
    }

    @Override // defpackage.bfrq
    public cjtd d() {
        return this.j;
    }

    @Override // defpackage.bfrq
    public String e() {
        return this.m ? this.h.getString(R.string.HOTEL_PARTNER_RANKING_DISCLAIMER) : "";
    }

    @Override // defpackage.bfrq
    public View.OnClickListener f() {
        return new bfrz(this);
    }

    @Override // defpackage.bfrq
    public String g() {
        dnng dnngVar = this.e;
        int max = dnngVar != null ? Math.max(1, dnngVar.f.size()) : 0;
        return max > 0 ? this.h.getQuantityString(R.plurals.HOTEL_ADS_DISCLAIMER_TITLE, max) : "";
    }

    @Override // defpackage.bfrq
    public cjtd h() {
        return cjtd.a(dtxr.cg);
    }

    @Override // defpackage.bfrq
    public Boolean i() {
        return Boolean.valueOf(this.g.getAdsParameters().l);
    }

    @Override // defpackage.bfrq
    @dzsi
    public aekh j() {
        return this.k;
    }

    public void k(dnng dnngVar) {
        Integer num;
        this.e = dnngVar;
        if ((dnngVar.a & 32) != 0) {
            dnnn dnnnVar = dnngVar.b;
            if (dnnnVar == null) {
                dnnnVar = dnnn.l;
            }
            num = Integer.valueOf(dnnnVar.c);
        } else {
            num = null;
        }
        this.l = num;
        this.m = dnngVar.p;
    }

    public void l() {
        this.e = null;
        this.l = null;
        this.m = false;
    }

    public void m(dbsg<dqtl> dbsgVar) {
        if (!q() || !dbsgVar.a()) {
            n();
            return;
        }
        aekh aekhVar = this.k;
        if (aekhVar == null) {
            aekq aekqVar = this.i;
            dqtl b = dbsgVar.b();
            cqhn a = aekqVar.a.a();
            aekq.a(a, 1);
            gfq a2 = aekqVar.b.a();
            aekq.a(a2, 2);
            gga a3 = aekqVar.c.a();
            aekq.a(a3, 3);
            aekq.a(b, 4);
            this.k = new aekp(a, a2, a3, b);
            return;
        }
        aekhVar.d(dbsgVar.b());
    }

    public void n() {
        this.k = null;
    }

    public void o() {
        p();
    }

    public final void p() {
        jdi jdiVar = this.d;
        if (jdiVar != null) {
            jdiVar.f();
        }
    }
}
