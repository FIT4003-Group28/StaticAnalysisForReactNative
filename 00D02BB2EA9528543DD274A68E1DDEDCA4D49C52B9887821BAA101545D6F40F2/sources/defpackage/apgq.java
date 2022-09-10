package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: apgq  reason: default package */
/* loaded from: classes2.dex */
public class apgq extends acoi implements apfx {
    public static final dcqe a = dcqe.c("apgq");
    public static final aowo[] b = aowo.values();
    public static final ddho[] c = {dtyi.bb, dtyi.bc, dtyi.aZ, dtyi.ba};
    public final aovg d;
    public final cjqy e;
    public final apgj f;
    public boolean g;
    private final gga h;
    private final apjz i;
    private final apjv j;
    private final aphc k;
    private final apjr l;
    private final apjs m;
    private final apjt n;
    private final aniy o;
    private final cpv p;
    private final acnw q = new apgo(this);
    private final apgp r = new apgp(this);
    @dzsi
    private angu<aogb, aoge> s = null;

    public apgq(gga ggaVar, cqhn cqhnVar, cqhu cqhuVar, cjqy cjqyVar, apjz apjzVar, apjv apjvVar, final anhg anhgVar, aphc aphcVar, apgk apgkVar, aniz anizVar, cpv cpvVar, aovg aovgVar, apjr apjrVar, apjs apjsVar, apjt apjtVar) {
        aowo c2 = aovgVar.c();
        int i = 0;
        while (true) {
            aowo[] aowoVarArr = b;
            if (i >= aowoVarArr.length) {
                break;
            } else if (aowoVarArr[i] == c2) {
                Z(i);
                break;
            } else {
                i++;
            }
        }
        this.h = ggaVar;
        this.e = cjqyVar;
        this.i = apjzVar;
        this.j = apjvVar;
        this.k = aphcVar;
        this.l = apjrVar;
        this.m = apjsVar;
        this.n = apjtVar;
        this.d = aovgVar;
        apgp apgpVar = this.r;
        gga a2 = apgkVar.a.a();
        apgk.a(a2, 1);
        apjz a3 = apgkVar.b.a();
        apgk.a(a3, 2);
        apgk.a(aovgVar, 3);
        apgk.a(apgpVar, 4);
        apgj apgjVar = new apgj(a2, a3, aovgVar, apgpVar);
        this.f = apgjVar;
        apgjVar.b = i();
        this.o = anizVar.a(new anis(this, anhgVar) { // from class: apgl
            private final apgq a;
            private final anhg b;

            {
                this.a = this;
                this.b = anhgVar;
            }

            @Override // defpackage.anis
            public final void a(eapg eapgVar) {
                apgq apgqVar = this.a;
                anhg anhgVar2 = this.b;
                apgqVar.j();
                anhgVar2.D(anhy.m(eapgVar));
            }
        }, new anit(this) { // from class: apgm
            private final apgq a;

            {
                this.a = this;
            }

            @Override // defpackage.anit
            public final void a(eapy eapyVar) {
                apgq apgqVar = this.a;
                if (apgqVar.g) {
                    apgqVar.f.b(eapyVar);
                    cqkx.p(apgqVar.f);
                }
            }
        });
        this.p = cpvVar;
        Y(this.q);
    }

    private final void l() {
        angu<aogb, aoge> anguVar = this.s;
        if (anguVar == null) {
            bvoo.h("setSelectedDayRef must be called before refreshDateTitle", new Object[0]);
            return;
        }
        String b2 = this.i.b(anguVar.a().m(), 20);
        apgj apgjVar = this.f;
        apgjVar.c = String.format("%s  ▾", b2);
        apgjVar.d = false;
        cqkx.p(this.f);
    }

    @Override // defpackage.apfx
    public List<apfz> a() {
        ArrayList arrayList = new ArrayList();
        aowo c2 = this.d.c();
        aowo[] aowoVarArr = b;
        int length = aowoVarArr.length;
        for (int i = 0; i < length; i++) {
            aowo aowoVar = aowoVarArr[i];
            aphc aphcVar = this.k;
            boolean z = c2 == aowoVar;
            Resources a2 = aphcVar.a.a();
            aphc.a(a2, 1);
            aphc.a(aowoVar, 2);
            arrayList.add(new aphb(a2, aowoVar, z));
        }
        return arrayList;
    }

    @Override // defpackage.apfx
    public jbk c() {
        return this.f;
    }

    @Override // defpackage.apfx
    public Boolean d() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.apfx
    public aniu f() {
        return this.o;
    }

    @Override // defpackage.apfx
    public View.OnTouchListener g() {
        return new View.OnTouchListener(this) { // from class: apgn
            private final apgq a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.a.j();
                return true;
            }
        };
    }

    public void h(angu<aogb, aoge> anguVar) {
        this.s = anguVar;
        l();
    }

    public final dcdc<jho> i() {
        dccx F = dcdc.F();
        if (this.d.c() == aowo.DAY) {
            F.g(this.j.f());
        }
        if (this.d.c() == aowo.DAY) {
            F.g(this.j.e(this.l));
            apjv apjvVar = this.j;
            final apjt apjtVar = this.n;
            jhm jhmVar = new jhm();
            jhmVar.a = apjvVar.k(R.string.MAPS_ACTIVITY_ADD_A_NOTE_BUTTON);
            jhmVar.h = 0;
            jhmVar.d(new View.OnClickListener(apjtVar) { // from class: apjk
                private final apjt a;

                {
                    this.a = apjtVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a();
                }
            });
            F.g(jhmVar.c());
            F.g(this.j.c(this.m));
        }
        jho h = this.j.h();
        if (h != null) {
            F.g(h);
        }
        F.g(this.j.j());
        F.g(this.j.i());
        F.g(this.j.b());
        return F.f();
    }

    public boolean j() {
        if (this.g) {
            k();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        View a2;
        angu<aogb, aoge> anguVar = this.s;
        if (anguVar == null) {
            bvoo.h("setSelectedDayRef must be called before toggleCalendar", new Object[0]);
            return;
        }
        boolean z = !this.g;
        this.g = z;
        if (z) {
            eapy eapyVar = new eapy(anguVar.a().m());
            this.o.e(eapyVar);
            this.f.b(eapyVar);
        } else {
            l();
        }
        cqkx.p(this);
        View o = cqkx.o(this);
        if (o == null || (a2 = cqhu.a(o, anir.a)) == null) {
            return;
        }
        this.p.f(a2, this.h.getString(true != this.g ? R.string.ACCESSIBILITY_CALENDAR_COLLAPSED : R.string.ACCESSIBILITY_CALENDAR_EXPANDED));
    }
}
