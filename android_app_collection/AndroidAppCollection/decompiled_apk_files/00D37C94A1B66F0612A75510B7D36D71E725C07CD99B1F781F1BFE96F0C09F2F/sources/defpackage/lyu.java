package defpackage;

import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.protos.youtube.api.innertube.ChannelListSubMenuRendererOuterClass;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: lyu  reason: default package */
/* loaded from: classes3.dex */
public final class lyu implements lyr {
    public azpq a = azpq.e();
    private final ViewGroup b;
    private apsv c;
    private boolean d;
    private aakw e;
    private acti f;
    private akaf g;
    private final ajsa h;
    private aypg i;
    private elt j;

    public lyu(ajsa ajsaVar, ViewGroup viewGroup) {
        this.b = viewGroup;
        this.h = ajsaVar;
    }

    @Override // defpackage.fsi
    public final void a() {
        apsv apsvVar = this.c;
        if (apsvVar != null) {
            this.f.u(new acte(apsvVar.g), null);
        }
    }

    @Override // defpackage.lyr
    public final akam b() {
        if (!i()) {
            return null;
        }
        aakw aakwVar = this.e;
        elt eltVar = this.j;
        return new lyt(aakwVar, new els(eltVar.e, eltVar.c.n.P()));
    }

    @Override // defpackage.lyr
    public final ayoi c() {
        return this.a;
    }

    @Override // defpackage.lyr
    public final CharSequence d() {
        int intValue;
        apst apstVar;
        apst apstVar2;
        if (!i()) {
            return null;
        }
        elt eltVar = this.j;
        if (!eltVar.e.h() || eltVar.f.e.size() <= (intValue = ((Integer) eltVar.e.c()).intValue()) || ((apsw) eltVar.f.e.get(intValue)).b != 48474525) {
            return null;
        }
        apsw apswVar = (apsw) eltVar.f.e.get(intValue);
        if (apswVar.b == 48474525) {
            apstVar = (apst) apswVar.c;
        } else {
            apstVar = apst.a;
        }
        if ((apstVar.b & 256) == 0) {
            return null;
        }
        apsw apswVar2 = (apsw) eltVar.f.e.get(intValue);
        if (apswVar2.b == 48474525) {
            apstVar2 = (apst) apswVar2.c;
        } else {
            apstVar2 = apst.a;
        }
        arag aragVar = apstVar2.j;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.lyr
    public final void e() {
        f();
        azpq azpqVar = this.a;
        if (azpqVar != null) {
            azpqVar.sm();
            this.a = null;
        }
    }

    @Override // defpackage.lyr
    public final void f() {
        this.c = null;
        this.e = null;
        this.d = false;
        elt eltVar = this.j;
        if (eltVar != null) {
            this.b.removeView(eltVar.b);
            this.j = null;
        }
        aypg aypgVar = this.i;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.i = null;
        }
    }

    @Override // defpackage.lyr
    public final void g(boolean z) {
        if (h()) {
            return;
        }
        this.d = z;
    }

    @Override // defpackage.lyr
    public final boolean h() {
        elt eltVar;
        if (!i() || (eltVar = this.j) == null) {
            return false;
        }
        return eltVar.e.h();
    }

    @Override // defpackage.lyr
    public final boolean i() {
        return this.c != null;
    }

    @Override // defpackage.lyr
    public final boolean j() {
        if (!i() || !h()) {
            return false;
        }
        return this.j.j();
    }

    @Override // defpackage.lyr
    public final boolean k(aakw aakwVar, akaf akafVar, acti actiVar) {
        if (!i() || lxy.c(aakwVar)) {
            if (!h() && this.d) {
                boolean i = i();
                this.d = false;
                l(aakwVar, akafVar, actiVar);
                if (i != i()) {
                    return true;
                }
            }
            return false;
        }
        f();
        return true;
    }

    @Override // defpackage.lyr
    public final void l(aakw aakwVar, akaf akafVar, acti actiVar) {
        atnk atnkVar;
        apsv apsvVar;
        this.d = false;
        actiVar.getClass();
        this.f = actiVar;
        this.g = akafVar;
        this.e = aakwVar;
        if (!lxy.c(aakwVar)) {
            apsvVar = null;
        } else {
            auqg auqgVar = aakwVar.a.g;
            if (auqgVar == null) {
                auqgVar = auqg.a;
            }
            if (auqgVar.b == 256220752) {
                atnkVar = (atnk) auqgVar.c;
            } else {
                atnkVar = atnk.a;
            }
            aunb aunbVar = atnkVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apsvVar = (apsv) aunbVar.qm(ChannelListSubMenuRendererOuterClass.channelListSubMenuRenderer);
        }
        this.c = apsvVar;
        if (apsvVar == null) {
            return;
        }
        if (this.j == null) {
            ajru h = akel.h(this.h, apsvVar, this.b);
            this.b.addView(h.a());
            if (h instanceof elt) {
                elt eltVar = (elt) h;
                this.j = eltVar;
                this.i = eltVar.d.as(new ayqb() { // from class: lys
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        elq elqVar = (elq) obj;
                        azpq azpqVar = lyu.this.a;
                        if (azpqVar != null) {
                            azpqVar.c(Boolean.valueOf(elqVar.c()));
                        }
                    }
                });
            }
        }
        ajrs ajrsVar = new ajrs();
        ajrsVar.f("sectionListController", this.g);
        ajrsVar.a(this.f);
        this.j.oK(ajrsVar, apsvVar);
    }

    @Override // defpackage.lyr
    public final void m(akam akamVar, akaf akafVar, acti actiVar) {
        if (!(akamVar instanceof lyt)) {
            return;
        }
        lyt lytVar = (lyt) akamVar;
        l(lytVar.a, akafVar, actiVar);
        elt eltVar = this.j;
        if (eltVar == null) {
            return;
        }
        akam akamVar2 = lytVar.b;
        if (eltVar.f == null) {
            return;
        }
        els elsVar = (els) akamVar2;
        eltVar.e = elsVar.a;
        Parcelable parcelable = elsVar.b;
        if (parcelable == null) {
            return;
        }
        eltVar.c.n.Y(parcelable);
    }
}
