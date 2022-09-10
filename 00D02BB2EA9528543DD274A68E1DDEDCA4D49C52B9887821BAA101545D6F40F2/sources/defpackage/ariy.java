package defpackage;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: ariy  reason: default package */
/* loaded from: classes2.dex */
public class ariy implements arjg {
    private final ges a;
    private final bwrs<arfk> b;
    private final izw c;
    private final ff d;
    private final bwqv e;
    private final arfm f;
    private final gfq g;
    private dcdc<arit> i = dcdc.e();
    private final bwrr<arfk> j = new ariw(this);
    private final cqhm k = new arix(this);
    private Boolean h = false;

    public ariy(ff ffVar, bwqv bwqvVar, arfm arfmVar, bwft bwftVar, fd fdVar, gfq gfqVar, cqhn cqhnVar) {
        this.d = ffVar;
        this.e = bwqvVar;
        this.f = arfmVar;
        ges gesVar = (ges) fdVar;
        this.a = gesVar;
        this.g = gfqVar;
        this.b = arfmVar.C();
        this.c = new aris(bwftVar, arfmVar, ffVar.g(), gesVar.bc());
    }

    private final boolean p() {
        return this.b.c().c == arfj.MAP_LOADED;
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz a = jhz.a();
        a.a = f();
        a.f(new View.OnClickListener(this) { // from class: ariv
            private final ariy a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e();
            }
        });
        a.o = cjtd.a(dtxv.eu);
        return a.b();
    }

    public void b() {
        this.e.g(this.b, this.j);
        d();
    }

    public void c() {
        bwqv.t(this.b, this.j);
    }

    public final void d() {
        bvrj.UI_THREAD.c();
        dvcx e = this.b.c().e();
        if (e == null) {
            e();
            return;
        }
        HashMap d = dcjz.d();
        dcdc<arit> dcdcVar = this.i;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            arit aritVar = dcdcVar.get(i);
            d.put(aritVar.g(), aritVar);
        }
        dccx F = dcdc.F();
        dvcr dvcrVar = e.b;
        if (dvcrVar == null) {
            dvcrVar = dvcr.h;
        }
        for (dvcl dvclVar : dvcrVar.e) {
            dxdm dxdmVar = dvclVar.b;
            if (dxdmVar == null) {
                dxdmVar = dxdm.e;
            }
            arit aritVar2 = (arit) d.get(dxdmVar.d);
            if (aritVar2 == null || !dbsd.a(dvclVar.bR(), aritVar2.a.bR())) {
                aritVar2 = new arit(this.d, this.f, dvclVar);
            }
            cqkx.j(aritVar2, this.k);
            F.g(aritVar2);
        }
        dcdc<arit> f = F.f();
        if (dbsd.a(f, this.i)) {
            return;
        }
        this.i = f;
        cqkx.p(this);
    }

    public final void e() {
        gfq.l(this.a);
    }

    @Override // defpackage.arjg
    public String f() {
        if (p()) {
            dvcr dvcrVar = this.b.c().e().b;
            if (dvcrVar == null) {
                dvcrVar = dvcr.h;
            }
            return dvcrVar.b;
        }
        return "";
    }

    @Override // defpackage.arjg
    public String g() {
        if (p()) {
            dvcr dvcrVar = this.b.c().e().b;
            if (dvcrVar == null) {
                dvcrVar = dvcr.h;
            }
            return dvcrVar.c;
        }
        return "";
    }

    @Override // defpackage.arjg
    public CharSequence h() {
        String string = this.d.getString(R.string.MY_MAPS_DETAILS_MORE_DESCRIPTION_LABEL);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new ForegroundColorSpan(ibm.x().b(this.d)), 0, string.length(), 17);
        return spannableString;
    }

    @Override // defpackage.arjg
    public String i() {
        Resources resources = this.d.getResources();
        if (p()) {
            Object[] objArr = new Object[1];
            dvcr dvcrVar = this.b.c().e().b;
            if (dvcrVar == null) {
                dvcrVar = dvcr.h;
            }
            donu donuVar = dvcrVar.f;
            if (donuVar == null) {
                donuVar = donu.b;
            }
            objArr[0] = donuVar.a;
            return resources.getString(R.string.MY_MAPS_CREATED_DATE_LABEL, objArr);
        }
        return "";
    }

    @Override // defpackage.arjg
    public List<arje> j() {
        return dcdc.r(this.i);
    }

    @Override // defpackage.arjg
    public izw k() {
        return this.c;
    }

    @Override // defpackage.arjg
    public cjtd l() {
        return cjtd.a(dtxv.ev);
    }

    @Override // defpackage.arjg
    public cjtd m() {
        return cjtd.a(dtxv.et);
    }

    @Override // defpackage.arjg
    public cqkl n() {
        this.h = Boolean.valueOf(!this.h.booleanValue());
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.arjg
    public Boolean o() {
        return this.h;
    }
}
