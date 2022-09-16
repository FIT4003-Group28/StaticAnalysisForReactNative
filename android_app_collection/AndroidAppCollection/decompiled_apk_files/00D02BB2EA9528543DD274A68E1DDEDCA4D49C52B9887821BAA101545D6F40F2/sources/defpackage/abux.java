package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abux  reason: default package */
/* loaded from: classes.dex */
class abux implements abnh {
    public final dxio<begg> a;
    @dzsi
    public final acwt b;
    private final Activity c;
    private final abut d;
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
        return this.c.getString(R.string.EXPLORE_POPULAR_AREAS_CAROUSEL_CONTENT_DESCRIPTION);
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

    @Override // defpackage.abnh
    @dzsi
    public abiu i() {
        if (this.m > this.h.size()) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.abnh
    public Boolean j() {
        return Boolean.valueOf(this.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k(List<dvyw> list) {
        this.h.clear();
        this.m = list.size();
        this.n = true;
        int i = 0;
        for (dvyw dvywVar : list) {
            if (i >= 8) {
                return;
            }
            ily ilyVar = new ily();
            ilyVar.E(dvywVar);
            final ilo d = ilyVar.d();
            this.n = this.n && !dbsj.d(isl.a(this.g.a(), d.aj(), this.f));
            List<jba> list2 = this.h;
            bnjs a = this.j.a(d);
            a.c = this.g.a();
            a.a = new bnjt(this, d) { // from class: abuw
                private final abux a;
                private final ilo b;

                {
                    this.a = this;
                    this.b = d;
                }

                @Override // defpackage.bnjt
                public final void a(cjqm cjqmVar) {
                    abux abuxVar = this.a;
                    ilo iloVar = this.b;
                    abuxVar.b.a();
                    begj begjVar = new begj();
                    begjVar.b(iloVar);
                    begjVar.n = true;
                    begjVar.c = jjn.EXPANDED;
                    abuxVar.a.a().o(begjVar, false, null);
                }
            };
            cjta b = cjtd.b();
            b.d = this.l == absg.AREA_EXPLORE ? dtxj.cG : dtxr.aB;
            b.i(i);
            a.n = b.a();
            list2.add(a.a());
            i++;
        }
    }

    public abux(bnjv bnjvVar, dxio<begg> dxioVar, Activity activity, bvpe bvpeVar, huc hucVar, ahjq ahjqVar, bvsl bvslVar, abuu abuuVar, @dzsi acwt acwtVar, absg absgVar) {
        this.j = bnjvVar;
        this.a = dxioVar;
        this.b = acwtVar;
        this.c = activity;
        this.k = cjtd.a(absgVar == absg.AREA_EXPLORE ? dtxj.cE : dtxr.az);
        this.e = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: abuv
            private final abux a;

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
        Activity activity2 = (Activity) ((dxjd) abuuVar.a).a;
        abuu.a(activity2, 1);
        dxio a = ((dxjh) abuuVar.b).a();
        abuu.a(a, 2);
        akpm a2 = abuuVar.c.a();
        abuu.a(a2, 3);
        dxio a3 = ((dxjh) abuuVar.d).a();
        abuu.a(a3, 4);
        abuu.a(absgVar, 6);
        this.d = new abut(activity2, a, a2, a3, acwtVar, absgVar);
        this.l = absgVar;
    }
}
