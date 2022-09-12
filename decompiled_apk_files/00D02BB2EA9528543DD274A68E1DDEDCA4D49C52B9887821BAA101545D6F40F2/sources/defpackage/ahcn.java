package defpackage;

import android.content.DialogInterface;
import android.text.format.DateUtils;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ahcn  reason: default package */
/* loaded from: classes2.dex */
public class ahcn implements agzc {
    public final agwa a;
    public final gdc b;
    public final gga c;
    public final afzv d;
    public final bvrb e;
    public final agzd f;
    public final int g;
    public final btlu h;
    public final dldl i;
    public final List<dlay> j;
    @dzsi
    public isc k;
    public boolean l;
    private final isd m;
    private final ilo n;
    private final String o;
    private boolean p;

    public ahcn(agwa agwaVar, gdc gdcVar, gga ggaVar, isd isdVar, afzv afzvVar, bvrb bvrbVar, agzd agzdVar, int i, btlu btluVar, dldj dldjVar) {
        this.a = agwaVar;
        this.b = gdcVar;
        this.c = ggaVar;
        this.m = isdVar;
        this.d = afzvVar;
        this.e = bvrbVar;
        this.f = agzdVar;
        this.g = i;
        this.h = btluVar;
        dldl dldlVar = dldjVar.b;
        this.i = dldlVar == null ? dldl.c : dldlVar;
        ily ilyVar = new ily();
        dvyw dvywVar = dldjVar.a;
        ilyVar.E(dvywVar == null ? dvyw.bv : dvywVar);
        this.n = ilyVar.d();
        this.j = dldjVar.c;
        Formatter formatter = new Formatter(new StringBuilder(50), Locale.getDefault());
        eatp c = eaul.h.c();
        dldl dldlVar2 = dldjVar.b;
        long j = c.k((dldlVar2 == null ? dldl.c : dldlVar2).a).a;
        eatp c2 = eaul.h.c();
        dldl dldlVar3 = dldjVar.b;
        this.o = DateUtils.formatDateRange(ggaVar, formatter, j, c2.k((dldlVar3 == null ? dldl.c : dldlVar3).b).a + 1, 65560, "UTC").toString();
        this.p = false;
        this.l = false;
    }

    @Override // defpackage.agzc
    public String a() {
        return this.n.n();
    }

    @Override // defpackage.agzc
    public String b() {
        return this.o;
    }

    @Override // defpackage.agzc
    public jic c() {
        if (this.n.bJ() == null || dbsj.d(this.n.bJ().h)) {
            return new jic((String) null, ckqc.FULLY_QUALIFIED, iup.f(R.raw.localstream_travel_trip_placeholder_svg, cqrp.d(120.0d), cqrp.d(120.0d)), 250);
        }
        dwfl bJ = this.n.bJ();
        return new jic(bJ.h, jfv.b(bJ), 0, 250);
    }

    @Override // defpackage.agzc
    public cqkl d(View view) {
        ArrayList arrayList = new ArrayList();
        jhm jhmVar = new jhm();
        jhmVar.a = this.c.getString(R.string.LOCALSTREAM_SEE_TRIP_EMAILS_MENU_ITEM);
        cjta b = cjtd.b();
        b.d = dtxu.cF;
        b.i(this.g);
        jhmVar.f = b.a();
        boolean z = true;
        jhmVar.n = !this.j.isEmpty();
        jhmVar.d(new View.OnClickListener(this) { // from class: ahci
            private final ahcn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ahcn ahcnVar = this.a;
                ahcnVar.d.f(ahcnVar.j, ahcnVar.h);
            }
        });
        arrayList.add(jhmVar.c());
        jhm jhmVar2 = new jhm();
        jhmVar2.a = this.c.getString(R.string.LOCALSTREAM_HIDE_TRIP_MENU_ITEM);
        if (this.p || this.l) {
            z = false;
        }
        jhmVar2.n = z;
        cjta b2 = cjtd.b();
        b2.d = dtxu.cE;
        b2.i(this.g);
        jhmVar2.f = b2.a();
        jhmVar2.d(new View.OnClickListener(this) { // from class: ahcj
            private final ahcn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                final ahcn ahcnVar = this.a;
                gcz a = ahcnVar.b.a();
                a.i(R.string.LOCALSTREAM_HIDE_TRIP_POPUP_HEADER);
                a.e = ahcnVar.c.getString(R.string.LOCALSTREAM_HIDE_TRIP_POPUP_MESSAGE, new Object[]{ahcnVar.a(), ahcnVar.b()});
                cjta b3 = cjtd.b();
                b3.d = dtxu.cD;
                b3.i(ahcnVar.g);
                a.h(R.string.LOCALSTREAM_HIDE_TRIP_POPUP_BUTTON_HIDE, b3.a(), new gdd(ahcnVar) { // from class: ahck
                    private final ahcn a;

                    {
                        this.a = ahcnVar;
                    }

                    @Override // defpackage.gdd
                    public final void a(DialogInterface dialogInterface) {
                        ahcn ahcnVar2 = this.a;
                        ahcnVar2.h(true);
                        deha.q(ahcnVar2.a.l(ahcnVar2.h, ahcnVar2.i), new ahcm(ahcnVar2), ahcnVar2.e.h());
                    }
                });
                cjta b4 = cjtd.b();
                b4.d = dtxu.cC;
                b4.i(ahcnVar.g);
                a.e(R.string.LOCALSTREAM_HIDE_TRIP_POPUP_BUTTON_CANCEL, b4.a(), ahcl.a);
                cjta b5 = cjtd.b();
                b5.d = dtxu.cB;
                a.i = b5.a();
                a.b();
            }
        });
        arrayList.add(jhmVar2.c());
        isc a = this.m.a(view);
        a.a(arrayList);
        a.show();
        this.k = a;
        return cqkl.a;
    }

    @Override // defpackage.agzc
    public final String e() {
        return this.c.getString(R.string.LOCALSTREAM_ACCESSIBILITY_OVERFLOW_MENU_FOR_DESTINATION_SETTINGS, new Object[]{a()});
    }

    @Override // defpackage.agzc
    public Boolean f() {
        return Boolean.valueOf(this.p);
    }

    public Boolean g() {
        return Boolean.valueOf(this.l);
    }

    public final void h(boolean z) {
        if (this.p != z) {
            this.p = z;
            cqkx.p(this);
        }
    }
}
