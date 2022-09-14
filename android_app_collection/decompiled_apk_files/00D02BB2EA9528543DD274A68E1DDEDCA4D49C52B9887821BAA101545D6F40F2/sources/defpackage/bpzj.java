package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bpzj  reason: default package */
/* loaded from: classes4.dex */
public class bpzj implements bqii, bqih {
    public final bqgw a;
    public final bpsr b;
    public final ff c;
    public final zzn d;
    public final bvrb e;
    public final cztz f;
    public final bpza g;
    private final jlp i;
    private final afwr j;
    private final bpzi l;
    private final afuc m;
    @dzsi
    private jmb p;
    private final Runnable n = new bpzf(this);
    public boolean h = true;
    private boolean o = true;
    private final bpzh k = new bpzh(this);

    public bpzj(bqgw bqgwVar, bpsr bpsrVar, bpza bpzaVar, ff ffVar, zzn zznVar, cqhn cqhnVar, bvrb bvrbVar, jlp jlpVar, cztz cztzVar, afwr afwrVar) {
        this.a = bqgwVar;
        this.b = bpsrVar;
        this.g = bpzaVar;
        this.c = ffVar;
        this.d = zznVar;
        this.e = bvrbVar;
        this.i = jlpVar;
        this.f = cztzVar;
        this.j = afwrVar;
        bpzi bpziVar = new bpzi(this);
        this.l = bpziVar;
        bpziVar.g();
        this.m = new afud(afwrVar.l());
    }

    public void a() {
        this.m.c(this.n);
        ImageView imageView = (ImageView) this.d.b();
        if (imageView != null) {
            c();
            if (this.a.f().isEmpty()) {
                jlo a = this.i.a(this.c.getString(R.string.MISSING_ROAD_POLYLINE_ADD_TIP_SUBTITLE), imageView);
                a.o(true);
                a.p();
                a.r();
                a.t(jln.GM2_BLUE);
                this.p = a.a();
            }
        }
        m();
    }

    public cqss b() {
        if (this.j.l().d(afwm.SATELLITE)) {
            return ibm.b();
        }
        return ibm.c();
    }

    public final void c() {
        boolean d = this.j.l().d(afwm.SATELLITE);
        ImageView imageView = (ImageView) this.d.b();
        if (imageView != null) {
            imageView.setColorFilter(b().b(this.c));
        }
        bpza bpzaVar = this.g;
        int i = 1;
        if (true == d) {
            i = 2;
        }
        bpzaVar.f(i);
    }

    public void d() {
        jmb jmbVar = this.p;
        if (jmbVar != null) {
            jmbVar.a();
            this.p = null;
        }
        ImageView imageView = (ImageView) this.d.b();
        if (imageView != null) {
            imageView.clearColorFilter();
        }
        this.m.d();
    }

    @Override // defpackage.bqii
    public jib e() {
        jhz a = jhz.a();
        a.a = this.c.getString(R.string.MISSING_ROAD_POLYLINE_TITLE);
        a.C = 2;
        a.b = this.c.getString(R.string.MISSING_ROAD_POLYLINE_SUBTITLE);
        a.D = 2;
        a.x = true;
        a.f(new View.OnClickListener(this) { // from class: bpzd
            private final bpzj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((ges) this.a.b).e();
            }
        });
        a.o = cjtd.a(dtya.cz);
        jhm a2 = jhm.a();
        a2.h = 1;
        a2.a = this.c.getString(R.string.NEXT);
        a2.n = n();
        ddho ddhoVar = dtya.cC;
        akqq b = this.g.b();
        List<akqq> f = this.a.f();
        int round = (b == null || f.isEmpty()) ? 0 : (int) Math.round(akqo.e(b, (akqq) dcft.s(f)));
        cjta cjtaVar = new cjta();
        cjtaVar.d = ddhoVar;
        dddf bZ = dddg.g.bZ();
        ddds bZ2 = dddt.d.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dddt dddtVar = (dddt) bZ2.b;
        dddtVar.a = 2 | dddtVar.a;
        dddtVar.c = round;
        int size = f.size();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dddt dddtVar2 = (dddt) bZ2.b;
        dddtVar2.a = 1 | dddtVar2.a;
        dddtVar2.b = size;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddt bK = bZ2.bK();
        bK.getClass();
        dddgVar.e = bK;
        dddgVar.a |= 64;
        cjtaVar.j(bZ.bK());
        a2.f = cjtaVar.a();
        a2.d(new View.OnClickListener(this) { // from class: bpze
            private final bpzj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bpzj bpzjVar = this.a;
                if (bpzjVar.n()) {
                    bpzjVar.b.a();
                }
            }
        });
        a.c(a2.c());
        return a.b();
    }

    @Override // defpackage.bqih
    public Boolean f() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.bqih
    public CharSequence g() {
        return this.c.getString(R.string.RMI_NOT_SUPPORTED);
    }

    @Override // defpackage.bqih
    /* renamed from: h */
    public bpzh q() {
        return this.k;
    }

    @Override // defpackage.bqih
    public CharSequence i() {
        return this.c.getText(R.string.MISSING_ROAD_ADD_POINT_BUTTON_LABEL);
    }

    @Override // defpackage.bqih
    /* renamed from: j */
    public bpzi p() {
        return this.l;
    }

    @Override // defpackage.bqih
    public CharSequence k() {
        return this.c.getText(R.string.MISSING_ROAD_REMOVE_POINT_BUTTON_LABEL);
    }

    @Override // defpackage.bqih
    public afuc l() {
        return this.m;
    }

    public final void m() {
        jaq jaqVar;
        bpzh bpzhVar = this.k;
        if (bpzhVar.c.h) {
            jaqVar = jaq.DAY_NIGHT_WHITE_ON_BLUE;
        } else {
            jaqVar = jaq.DAY_NIGHT_GREY_ON_LIGHT_BLUE_GREY;
        }
        bpzhVar.D(jaqVar);
        this.l.g();
        cqkx.p(this);
    }

    public final boolean n() {
        return this.a.f().size() > 1;
    }

    public void o(boolean z) {
        if (this.o != z) {
            this.o = z;
            m();
        }
    }
}
