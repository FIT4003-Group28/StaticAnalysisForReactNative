package defpackage;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Locale;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cizb  reason: default package */
/* loaded from: classes4.dex */
public class cizb implements ciyx, crzp {
    @dzsi
    public amfu a;
    private final chrx c;
    private final crzp<ccih> d;
    private final gce e;
    private final jlp g;
    public boolean b = false;
    private final bil h = new ciyy(this);
    private final View.OnAttachStateChangeListener i = new ciyz(this);
    private chvi f = chvi.f;

    public cizb(Executor executor, cqhn cqhnVar, cqhu cqhuVar, cchz cchzVar, amfi amfiVar, jlp jlpVar, gce gceVar, chrx chrxVar, crzm<chvi> crzmVar, btlu btluVar) {
        this.c = chrxVar;
        this.g = jlpVar;
        this.e = gceVar;
        this.a = amfiVar.a(cchzVar.c(btluVar), cizb.class.getSimpleName(), null);
        ciza cizaVar = new ciza(this, btluVar, amfiVar);
        this.d = cizaVar;
        cchzVar.d().b(cizaVar, executor);
        crzmVar.b(this, executor);
    }

    @Override // defpackage.crzp
    public void On(crzm<chvi> crzmVar) {
        chvi l = crzmVar.l();
        dbsk.s(l);
        if (this.f.equals(l)) {
            return;
        }
        this.f = l;
        cqkx.p(this);
        View o = cqkx.o(this);
        if (o != null) {
            chvi chviVar = this.f;
            if ((chviVar.a & 8) != 0) {
                jlp jlpVar = this.g;
                chxv chxvVar = chviVar.e;
                if (chxvVar == null) {
                    chxvVar = chxv.d;
                }
                jlo a = jlpVar.a(chxvVar.b, o);
                a.l(-20);
                chxv chxvVar2 = this.f.e;
                if (chxvVar2 == null) {
                    chxvVar2 = chxv.d;
                }
                a.m(chxvVar2.c);
                a.t(jln.GM2_BLUE);
                a.o(true);
                a.n();
                a.w(cjtd.a(dtxl.hm));
                a.r();
                a.a();
            }
        }
        i();
    }

    @Override // defpackage.ciyx
    public cqkl b() {
        this.c.o();
        return cqkl.a;
    }

    @Override // defpackage.ciyx
    public bil c() {
        return this.h;
    }

    @Override // defpackage.ciyx
    public eim d() {
        String str;
        String format;
        String format2 = String.format(Locale.US, "%03d", Integer.valueOf(this.f.c));
        int a = chvh.a(this.f.b);
        String format3 = (a != 0 && a == 3) ? format2 : String.format(Locale.US, "%03d", Integer.valueOf(this.f.d));
        int a2 = chvh.a(this.f.b);
        if (a2 != 0 && a2 == 2) {
            chvi chviVar = this.f;
            int i = chviVar.d - chviVar.c;
            if (i > 0) {
                format = String.format(Locale.US, "+%d", Integer.valueOf(i));
            } else if (i != 0) {
                format = String.format(Locale.US, "%d", Integer.valueOf(i));
            }
            str = format;
            return new ein(dcdn.m("000", format2, "001", format3, "+1", str));
        }
        str = "";
        return new ein(dcdn.m("000", format2, "001", format3, "+1", str));
    }

    @Override // defpackage.ciyx
    public Integer e() {
        return Integer.valueOf(this.f.c);
    }

    @Override // defpackage.ciyx
    public Boolean f() {
        int a = chvh.a(this.f.b);
        boolean z = false;
        if (a != 0 && a != 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ciyx
    public View.OnAttachStateChangeListener g() {
        return this.i;
    }

    @Override // defpackage.ciyx
    public Boolean h() {
        return Boolean.valueOf(this.e.h());
    }

    public final void i() {
        View o = cqkx.o(this);
        LottieAnimationView lottieAnimationView = null;
        if (o != null) {
            View a = cqhu.a(o, ciyw.a);
            if (a instanceof LottieAnimationView) {
                lottieAnimationView = (LottieAnimationView) a;
            }
        }
        if (lottieAnimationView == null) {
            this.b = true;
            return;
        }
        lottieAnimationView.e();
        lottieAnimationView.setProgress(0.0f);
        int a2 = chvh.a(this.f.b);
        if (a2 == 0 || a2 != 2) {
            return;
        }
        lottieAnimationView.a();
    }
}
