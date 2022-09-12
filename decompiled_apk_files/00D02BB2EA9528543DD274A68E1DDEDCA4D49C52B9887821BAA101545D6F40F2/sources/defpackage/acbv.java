package defpackage;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acbv  reason: default package */
/* loaded from: classes2.dex */
public class acbv implements acbc, abwp {
    public static final dcqe b = dcqe.c("acbv");
    public final abwq c;
    public final acbg d;
    private final eaol e;
    private final acbs f;
    private final cjtd g;
    private final cjtd h;
    private final cjtd i;
    private final acek j;
    private dcdc<acbu> k;
    private final acbt l;
    private final Application m;
    private final acbi n;
    private final accj o;

    public acbv(abwo abwoVar, abwq abwqVar, Application application, acbi acbiVar, accn accnVar, cqhn cqhnVar, acbg acbgVar, acek acekVar, bckz bckzVar) {
        acbt acbtVar = new acbt(this, abwoVar);
        this.l = acbtVar;
        this.m = application;
        eaol a = eaol.a();
        this.e = a;
        this.c = abwqVar;
        this.n = acbiVar;
        this.d = acbgVar;
        this.j = acekVar;
        this.f = new acbs(this, bckzVar.a(acac.a, acbo.a));
        acbp acbpVar = new acbp(this);
        accn.a(accnVar.a.a(), 1);
        abwq a2 = accnVar.b.a();
        accn.a(a2, 2);
        accn.a(accnVar.c.a(), 3);
        accn.a(acbpVar, 4);
        accm accmVar = new accm(a2, acbpVar);
        abwqVar.a(accmVar);
        this.o = accmVar;
        this.k = C(abwqVar.e().c(), dcdc.e(), a, acbtVar, application, acbiVar);
        this.g = cjtd.a(dtye.s);
        this.h = cjtd.a(dtye.B);
        this.i = cjtd.a(dtye.C);
    }

    private static dcdc<acbu> C(dcdc<acej> dcdcVar, dcdc<acbu> dcdcVar2, eaol eaolVar, final acbt acbtVar, Application application, acbi acbiVar) {
        acba acbaVar;
        dcdc<acbu> dcdcVar3 = dcdcVar2;
        dccx F = dcdc.F();
        int size = dcdcVar.size();
        int i = 0;
        final int i2 = 0;
        while (i < size) {
            acej acejVar = dcdcVar.get(i);
            if (i2 >= dcdcVar2.size() || !acejVar.equals(dcdcVar3.get(i2).a)) {
                dwfl a = acejVar.a();
                dbsg i3 = dbsg.i(ckob.d(acejVar.a()));
                int i4 = i2 + 1;
                String a2 = acen.a(acejVar.b(), eaolVar, application);
                View.OnClickListener onClickListener = new View.OnClickListener(acbtVar, i2) { // from class: acbq
                    private final acbt a;
                    private final int b;

                    {
                        this.a = acbtVar;
                        this.b = i2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        acbt acbtVar2 = this.a;
                        acbtVar2.b.b(acbtVar2.a.c.e(), this.b);
                    }
                };
                String str = ((dvyw) ((dbsu) i3).a).i;
                if (cknv.j(a)) {
                    acbaVar = new acbm(a, onClickListener, application, a2, str, i2);
                } else if (cknv.c(a)) {
                    acbaVar = new acbk(a, onClickListener, application, a2, str, i2);
                } else if (cknv.f(a)) {
                    acbi.a(a, 1);
                    acbi.a(onClickListener, 2);
                    acbi.a(a2, 3);
                    acbi.a(str, 4);
                    Application a3 = acbiVar.a.a();
                    acbi.a(a3, 6);
                    bdvd a4 = acbiVar.b.a();
                    acbi.a(a4, 7);
                    acbaVar = new acbh(a, onClickListener, a2, str, i2, a3, a4);
                } else {
                    dizh dizhVar = a.p;
                    if (dizhVar == null) {
                        dizhVar = dizh.j;
                    }
                    dghk dghkVar = dizhVar.c;
                    if (dghkVar == null) {
                        dghkVar = dghk.g;
                    }
                    dggc b2 = dggc.b(dghkVar.b);
                    if (b2 == null) {
                        b2 = dggc.UNKNOWN;
                    }
                    int i5 = b2.f;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Unsupported image format: ");
                    sb.append(i5);
                    bvoo.f(new IllegalArgumentException(sb.toString()));
                    acbaVar = null;
                }
                acba acbaVar2 = acbaVar;
                if (acbaVar2 != null) {
                    F.g(new acbu(acejVar, acbaVar2));
                }
                i2 = i4;
            } else {
                F.g(dcdcVar3.get(i2));
                i2++;
            }
            i++;
            dcdcVar3 = dcdcVar2;
        }
        return F.f();
    }

    public int A() {
        if (w().booleanValue()) {
            return this.d.a;
        }
        return 0;
    }

    public void B(int i) {
        acbg acbgVar = this.d;
        acbgVar.d = i;
        if (acbgVar.a()) {
            cqkx.p(this);
        }
    }

    @Override // defpackage.abwp
    public synchronized void a() {
        View o;
        acei e = this.c.e();
        if (e.c().isEmpty() && (o = cqkx.o(this)) != null) {
            RecyclerView recyclerView = (RecyclerView) cqkx.e(o, a, RecyclerView.class);
            dbsk.s(recyclerView);
            recyclerView.n(0);
        }
        this.k = C(e.c(), this.k, this.e, this.l, this.m, this.n);
        cqkx.p(this);
    }

    @Override // defpackage.abwp
    public void b() {
    }

    @Override // defpackage.abwp
    public void c() {
    }

    @Override // defpackage.abwp
    public void d(dvha dvhaVar) {
    }

    @Override // defpackage.acbc
    public synchronized dcdc<acba> e() {
        dccx F;
        F = dcdc.F();
        dcdc<acbu> dcdcVar = this.k;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            F.g(dcdcVar.get(i).b);
        }
        return F.f();
    }

    @Override // defpackage.acbc
    public cqqw f() {
        return this.f;
    }

    @Override // defpackage.acbc
    public Boolean g() {
        acei e = this.c.e();
        boolean z = true;
        if (!e.d() && e.a()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.acbc
    public synchronized Boolean h() {
        boolean z;
        acei e = this.c.e();
        z = false;
        if (e.c().isEmpty() && e.e() == null && !e.d() && e.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.acbc
    public synchronized Boolean i() {
        boolean z;
        btzy e = this.c.e().e();
        z = false;
        if (e != null && !btzy.k.equals(e)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.acbc
    public synchronized Boolean j() {
        return Boolean.valueOf(btzy.k.equals(this.c.e().e()));
    }

    @Override // defpackage.acbc
    public cqkl k() {
        this.j.a();
        return cqkl.a;
    }

    @Override // defpackage.acbc
    public cqkl l() {
        this.c.f();
        this.c.d();
        return cqkl.a;
    }

    @Override // defpackage.acbc
    public String m() {
        return this.m.getString(R.string.VISUAL_EXPLORE_NO_PHOTOS_SUBTITLE);
    }

    @Override // defpackage.acbc
    public String n() {
        return this.m.getString(R.string.VISUAL_EXPLORE_NO_PHOTOS_TITLE);
    }

    @Override // defpackage.acbc
    public String o() {
        return this.m.getString(R.string.VISUAL_EXPLORE_SERVER_ERROR_TITLE);
    }

    @Override // defpackage.acbc
    public String p() {
        return this.m.getString(R.string.VISUAL_EXPLORE_TRY_AGAIN_BUTTON_TEXT);
    }

    @Override // defpackage.acbc
    public String q() {
        return this.m.getString(R.string.NO_INTERNET_CONNECTION_ERROR_TITLE);
    }

    @Override // defpackage.acbc
    public String r() {
        return this.m.getString(R.string.NO_INTERNET_CONNECTION_TRY_AGAIN_BUTTON);
    }

    @Override // defpackage.acbc
    public cjtd s() {
        return this.g;
    }

    @Override // defpackage.acbc
    public cjtd t() {
        return this.h;
    }

    @Override // defpackage.acbc
    public cjtd u() {
        return this.i;
    }

    @Override // defpackage.acbc
    public accj v() {
        return this.o;
    }

    @Override // defpackage.acbc
    public Boolean w() {
        return Boolean.valueOf(!this.o.e().isEmpty());
    }

    @Override // defpackage.acbc
    public acax x() {
        return this.d.f;
    }

    @Override // defpackage.acbc
    public Integer y() {
        int i;
        if (w().booleanValue()) {
            acbg acbgVar = this.d;
            i = acbgVar.e + acbgVar.b;
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.acbc
    public cqrd z() {
        return acbr.a;
    }
}
