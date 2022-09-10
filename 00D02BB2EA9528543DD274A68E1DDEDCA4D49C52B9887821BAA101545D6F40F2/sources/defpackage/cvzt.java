package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: cvzt  reason: default package */
/* loaded from: classes5.dex */
public final class cvzt extends abg<cvzx> {
    public final dcdc<cvzs> a;
    private final Context f;
    private final cwla g;
    private final cwee h;
    private final cvzw j;
    private final cwiy k;
    private final int l;
    private m m;
    public final ua<Integer> e = new ua<>(Integer.class, new cvzr(this));
    private final HashMap<cvzs, cvzo> i = new HashMap<>();

    public cvzt(Context context, cwla cwlaVar, cwee cweeVar, dcdc<dcdc<cwdc>> dcdcVar, int i) {
        dbsk.s(context);
        this.f = context;
        this.g = cwlaVar;
        this.h = cweeVar;
        dccx dccxVar = new dccx();
        for (int i2 = 0; i2 < dcdcVar.size(); i2++) {
            dcdc<cwdc> dcdcVar2 = dcdcVar.get(i2);
            int size = dcdcVar2.size();
            for (int i3 = 0; i3 < size; i3++) {
                dccxVar.g(new cvzs(dcdcVar2.get(i3), i2));
            }
        }
        this.a = dccxVar.f();
        this.j = new cvzw(context);
        this.k = new cwiy(context);
        this.l = i;
    }

    private final cvzs a(int i) {
        return this.a.get(this.e.a(i).intValue());
    }

    @Override // defpackage.abg
    public final int c() {
        return this.e.b;
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cvzx d(ViewGroup viewGroup, int i) {
        Context context = this.f;
        m mVar = this.m;
        cwla cwlaVar = this.g;
        cwee cweeVar = this.h;
        cwiy cwiyVar = this.k;
        cwie f = cwie.f(cwiyVar.a(cwix.COLOR_ON_SURFACE), cwiyVar.a(cwix.TEXT_PRIMARY), cwiyVar.a(cwix.COLOR_PRIMARY_GOOGLE), cwiyVar.a(cwix.COLOR_ON_PRIMARY_GOOGLE));
        cvzx cvzxVar = new cvzx(mVar, cweeVar, new cwif(context, cwlaVar, viewGroup, f), f);
        cvzxVar.s.E(this.l);
        return cvzxVar;
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cvzx cvzxVar, int i) {
        String a;
        int intValue;
        int a2;
        cvzx cvzxVar2 = cvzxVar;
        cwdc cwdcVar = a(i).a;
        cwif cwifVar = cvzxVar2.s;
        cwib g = cwic.g();
        g.e(cwdcVar.a());
        g.d(cwdcVar.b());
        g.f(cwdcVar.c());
        g.g(cwdcVar.e());
        g.h(cwdcVar.d());
        cwifVar.C(g.i());
        cwdm g2 = cwdcVar.g();
        cvzxVar2.u.setVisibility(8);
        if (g2 != null && (intValue = ((Integer) dbsc.a(g2.c().h(), 0)).intValue()) > 0) {
            if (intValue > g2.d()) {
                intValue = g2.d();
                a2 = g2.b();
            } else {
                a2 = g2.a();
            }
            TextView textView = cvzxVar2.u;
            textView.setText(textView.getResources().getString(a2, Integer.valueOf(intValue)));
            cvzxVar2.u.setVisibility(0);
        }
        cwdp h = cwdcVar.h();
        cwdcVar.a();
        if (h != null && (a = h.a()) != null) {
            cvzxVar2.t.setText(a);
            cvzxVar2.t.setVisibility(0);
            return;
        }
        cvzxVar2.t.setVisibility(8);
        cwee cweeVar = cvzxVar2.w;
        m mVar = cvzxVar2.v;
        View view = cvzxVar2.a;
        cweeVar.b();
    }

    @Override // defpackage.abg
    public final int i(int i) {
        return a(i).b;
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void l(cvzx cvzxVar) {
        cvzxVar.s.D();
    }

    @Override // defpackage.abg
    public final void q(RecyclerView recyclerView) {
        this.m = cwio.a(recyclerView);
        for (int i = 0; i < this.a.size(); i++) {
            final cvzs cvzsVar = this.a.get(i);
            m mVar = this.m;
            cwdc cwdcVar = cvzsVar.a;
            cwdd f = cwdcVar.f();
            if (f != null) {
                f.b();
                cvzo cvzoVar = new cvzo(this, cvzsVar);
                this.i.put(cvzsVar, cvzoVar);
                f.a.add(cvzoVar);
            }
            cwdm g = cwdcVar.g();
            if (g != null) {
                g.c().b(mVar, new aa(this, cvzsVar) { // from class: cvzp
                    private final cvzt a;
                    private final cvzs b;

                    {
                        this.a = this;
                        this.b = cvzsVar;
                    }

                    @Override // defpackage.aa
                    public final void m(Object obj) {
                        cvzt cvztVar = this.a;
                        cvzs cvzsVar2 = this.b;
                        Integer num = (Integer) obj;
                        ua<Integer> uaVar = cvztVar.e;
                        cvztVar.t(uaVar.d(Integer.valueOf(cvztVar.a.indexOf(cvzsVar2)), uaVar.a, uaVar.b, 4));
                    }
                });
            }
            cwdd f2 = cvzsVar.a.f();
            if (f2 == null || f2.b) {
                this.e.c(Integer.valueOf(i));
            }
        }
        recyclerView.g(this.j);
    }

    @Override // defpackage.abg
    public final void r(RecyclerView recyclerView) {
        dcdc<cvzs> dcdcVar = this.a;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cvzs cvzsVar = dcdcVar.get(i);
            cwdd f = cvzsVar.a.f();
            if (f != null) {
                f.c();
                f.a.remove(this.i.remove(cvzsVar));
            }
            cwdm g = cvzsVar.a.g();
            if (g != null) {
                g.c().e(this.m);
            }
        }
        this.e.b();
        recyclerView.h(this.j);
    }
}
