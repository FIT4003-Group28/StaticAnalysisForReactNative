package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abwe  reason: default package */
/* loaded from: classes.dex */
class abwe implements abqt {
    public final dxio<begg> a;
    @dzsi
    public final acwt b;
    private final Activity c;
    private final abwa d;
    private final bvob e;
    private final bvsl f;
    private final ahjq g;
    private final List<jba> h;
    private final cqqw i;
    private final bnjv j;
    private final cjtd k;
    private final absg l;
    private int m;
    private boolean n;

    @Override // defpackage.iqf
    public Boolean a() {
        return Boolean.valueOf(!this.h.isEmpty());
    }

    @Override // defpackage.iqf
    public Boolean b() {
        return Boolean.valueOf(this.h.isEmpty());
    }

    @Override // defpackage.iqf
    public List<jba> c() {
        return this.h;
    }

    @Override // defpackage.iqf
    public cqqw d() {
        return this.i;
    }

    @Override // defpackage.iqf
    public void e() {
    }

    @Override // defpackage.iqf
    public String f() {
        return this.c.getString(R.string.EXPLORE_TOURIST_PLACES_LIST_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.iqf
    public cjtd g() {
        return this.k;
    }

    @Override // defpackage.iqf
    @dzsi
    public View.OnAttachStateChangeListener h() {
        return this.e;
    }

    @Override // defpackage.abqt
    @dzsi
    public abiu i() {
        if (this.m > this.h.size()) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.abqt
    public Boolean j() {
        return Boolean.valueOf(this.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(List<dvyw> list, int i, String str) {
        this.h.clear();
        this.m = i;
        this.d.a(str);
        this.n = true;
        int i2 = 0;
        for (dvyw dvywVar : list) {
            ily ilyVar = new ily();
            ilyVar.E(dvywVar);
            final ilo d = ilyVar.d();
            this.n = this.n && !dbsj.d(isl.a(this.g.a(), d.aj(), this.f));
            List<jba> list2 = this.h;
            bnjs a = this.j.a(d);
            a.c = this.g.a();
            a.a = new bnjt(this, d) { // from class: abwd
                private final abwe a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = d;
                }

                @Override // defpackage.bnjt
                public final void a(cjqm cjqmVar) {
                    abwe abweVar = this.a;
                    ilo iloVar = this.b;
                    abweVar.b.a();
                    begj begjVar = new begj();
                    begjVar.b(iloVar);
                    begjVar.n = true;
                    begjVar.c = jjn.EXPANDED;
                    abweVar.a.a().o(begjVar, false, null);
                }
            };
            cjta c = cjtd.c(d.bZ());
            c.d = this.l == absg.AREA_EXPLORE ? dtxj.cY : dtxr.aV;
            c.i(i2);
            a.n = c.a();
            list2.add(a.a());
            i2++;
        }
    }

    public abwe(bnjv bnjvVar, dxio<begg> dxioVar, Activity activity, bvpe bvpeVar, huc hucVar, ahjq ahjqVar, bvsl bvslVar, abwb abwbVar, @dzsi acwt acwtVar, absg absgVar) {
        this.j = bnjvVar;
        this.a = dxioVar;
        this.b = acwtVar;
        this.c = activity;
        this.k = cjtd.a(absgVar == absg.AREA_EXPLORE ? dtxj.cV : dtxr.aS);
        this.e = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: abwc
            private final abwe a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.g();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        this.i = new cqqw();
        this.h = new ArrayList();
        this.m = 0;
        this.g = ahjqVar;
        this.f = bvslVar;
        Activity activity2 = (Activity) ((dxjd) abwbVar.a).a;
        abwb.a(activity2, 1);
        dxio a = ((dxjh) abwbVar.b).a();
        abwb.a(a, 2);
        abwb.a(absgVar, 4);
        this.d = new abwa(activity2, a, acwtVar, absgVar);
        this.l = absgVar;
    }
}
