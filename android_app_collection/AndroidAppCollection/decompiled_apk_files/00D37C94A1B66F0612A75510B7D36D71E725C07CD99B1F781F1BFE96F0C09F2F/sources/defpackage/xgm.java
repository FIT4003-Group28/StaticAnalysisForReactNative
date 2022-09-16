package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.ads.model.SurveyAd;
import com.google.android.libraries.youtube.ads.model.SurveyQuestionRendererModel;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ThumbnailsRenderer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xgm  reason: default package */
/* loaded from: classes4.dex */
public final class xgm implements wkp, airt {
    public final aafo a;
    public final xge b;
    public final xiw c;
    public final afy d;
    public SurveyAd e;
    CountDownTimer f;
    public CountDownTimer g;
    public xec h;
    private final azqb i;
    private final snc j;
    private final zdt k;
    private final wkt l;
    private final wwd m;
    private final wvx n;
    private apap o;
    private boolean p;
    private boolean q;
    private boolean r;
    private xcb s;
    private xdu t;
    private xci u;
    private asjj v;
    private wqw w;
    private final kiu x;

    public xgm(azqb azqbVar, aafo aafoVar, xge xgeVar, snc sncVar, zdt zdtVar, xiw xiwVar, wkt wktVar, wwd wwdVar, wvx wvxVar) {
        azqbVar.getClass();
        this.i = azqbVar;
        aafoVar.getClass();
        this.a = aafoVar;
        xgeVar.getClass();
        this.b = xgeVar;
        sncVar.getClass();
        this.j = sncVar;
        zdtVar.getClass();
        this.k = zdtVar;
        xiwVar.getClass();
        this.c = xiwVar;
        wktVar.getClass();
        this.l = wktVar;
        wwdVar.getClass();
        this.m = wwdVar;
        wvxVar.getClass();
        this.n = wvxVar;
        this.d = new afy();
        xgeVar.g(new xgh(this));
        kiu p = xgeVar.p();
        this.x = p;
        if (p != null) {
            p.i = new xgi(this);
        }
        h();
    }

    public static final void j(CountDownTimer countDownTimer) {
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    private final void k() {
        this.p = true;
        this.b.d();
        this.c.m();
    }

    private final void l(int i) {
        xci xciVar = this.u;
        if (xciVar != null) {
            this.l.e(this.s, this.t, xciVar, i);
            this.l.u(this.u);
        }
        xdu xduVar = this.t;
        if (xduVar != null) {
            this.l.l(this.s, xduVar);
            this.l.p(this.s, this.t);
        }
        this.s = null;
        this.u = null;
        this.t = null;
    }

    public final Map a() {
        if (this.e != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b);
            return hashMap;
        }
        return null;
    }

    public final void b(wzq wzqVar) {
        this.k.a(false);
        j(this.f);
        this.b.j(false);
        if (this.e != null) {
            ((acti) this.i.get()).q(new acte(this.e.q()), this.v);
        }
        this.c.i(wzqVar);
        wqw wqwVar = this.w;
        if (wqwVar != null) {
            wqwVar.d(wzqVar);
            this.w = null;
        }
        h();
        int i = 0;
        while (true) {
            afy afyVar = this.d;
            if (i < afyVar.b) {
                ((xgj) afyVar.b(i)).g(false, 0);
                i++;
            } else {
                l(xci.a(wzqVar));
                return;
            }
        }
    }

    @Override // defpackage.wkp
    public final void c() {
        h();
        l(4);
    }

    public final void d(long j) {
        SurveyAd surveyAd = this.e;
        if (surveyAd == null || surveyAd.p.size() == 0) {
            return;
        }
        long a = (((aalo) this.e.p.get(0)).a() * 1000) - j;
        xiw xiwVar = this.c;
        wyu wyuVar = new wyu(a);
        ylr.c();
        if (xiwVar.d != null) {
            xiwVar.d.w(wyuVar);
        }
        if (j > 0) {
            this.b.l((int) j);
            if (!this.q) {
                return;
            }
            SurveyAd surveyAd2 = this.e;
            if (a < (!surveyAd2.p.isEmpty() ? surveyAd2.ac().c() : 5) * 1000 || this.p || !this.e.ab()) {
                return;
            }
            k();
            return;
        }
        f();
    }

    @Override // defpackage.wkp
    public final boolean e(wqw wqwVar) {
        arag aragVar;
        PlayerAd a = wqwVar.a();
        int i = 0;
        if (!(a instanceof SurveyAd)) {
            return false;
        }
        this.s = xcb.a(wqwVar.c(), wqwVar.b());
        xdu b = this.m.b();
        this.t = b;
        this.l.o(this.s, b);
        h();
        this.w = wqwVar;
        this.e = (SurveyAd) a;
        apap apapVar = a.k.c.E;
        if (apapVar == null) {
            apapVar = apap.a;
        }
        this.o = apapVar;
        SurveyQuestionRendererModel ac = this.e.ac();
        this.p = false;
        if (ac == null || ac.g() == null || ac.h() == null || ac.h().size() == 0) {
            wqwVar.d(wzq.SURVEY_ENDED);
            this.l.p(this.s, this.t);
            return true;
        }
        wvx wvxVar = this.n;
        xdu xduVar = this.t;
        aoyz qP = this.e.qP();
        String a2 = wvxVar.c.a(apcb.LAYOUT_TYPE_SURVEY, xduVar.a);
        xci d = xci.d(a2, apcb.LAYOUT_TYPE_SURVEY, 3, amuk.q(), amuk.q(), amuk.q(), ampq.i(qP), ampq.j(wvxVar.d.c(xduVar, a2, apcb.LAYOUT_TYPE_SURVEY, 3, qP)), xac.b(new xal[0]));
        this.u = d;
        ampq ampqVar = d.i;
        if (ampqVar.h()) {
            aopa createBuilder = asjj.a.createBuilder();
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjjVar.t = (asit) ampqVar.c();
            asjjVar.c |= 1024;
            this.v = (asjj) createBuilder.mo39build();
        }
        this.l.f(this.s, this.t, this.u);
        avee aveeVar = this.e.c;
        this.r = (aveeVar == null || this.x == null) ? false : true;
        this.b.o(ac.g(), ac.h(), ac.j(), this.e.ad());
        this.b.l((int) TimeUnit.MILLISECONDS.convert(ac.a(), TimeUnit.SECONDS));
        if (this.e.A() != null) {
            this.b.k();
        }
        boolean aa = a.aa();
        this.q = aa;
        if (aa) {
            SurveyAd surveyAd = this.e;
            if (surveyAd.b.g && surveyAd.ab()) {
                k();
            }
        }
        if (this.r) {
            kiu kiuVar = this.x;
            kiuVar.g = aveeVar;
            kiuVar.c();
            TextView textView = kiuVar.c;
            arag aragVar2 = null;
            if ((aveeVar.b & 2) != 0) {
                aragVar = aveeVar.d;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            ajmy ajmyVar = kiuVar.h.b;
            ImageView imageView = kiuVar.e;
            avhn avhnVar = aveeVar.i;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            aunb aunbVar = aveeVar.j;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            avht avhtVar = (avht) ajjh.l(aunbVar, ThumbnailsRenderer.thumbnailLandscapePortraitRenderer);
            if (avhtVar != null) {
                ajmy ajmyVar2 = kiuVar.h.b;
                ImageView imageView2 = kiuVar.f;
                avhn avhnVar2 = avhtVar.c;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
                ajmyVar2.h(imageView2, avhnVar2);
            }
            aunb aunbVar2 = aveeVar.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aoyl aoylVar = (aoyl) ajjh.l(aunbVar2, AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
            if (aoylVar != null) {
                TextView textView2 = kiuVar.d;
                if ((aoylVar.b & 1) != 0 && (aragVar2 = aoylVar.e) == null) {
                    aragVar2 = arag.a;
                }
                textView2.setText(ajgl.b(aragVar2));
                if (kiuVar.d.getBackground().getCurrent() instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) kiuVar.d.getBackground().getCurrent().mutate();
                    gradientDrawable.setColor(aoylVar.c == 3 ? ((Integer) aoylVar.d).intValue() : 0);
                    gradientDrawable.setCornerRadius(kiuVar.a * aoylVar.i);
                    gradientDrawable.setStroke(Math.round(kiuVar.a * aoylVar.l), aoylVar.j);
                    kiuVar.d.setBackground(gradientDrawable);
                }
                kiuVar.d.setVisibility(0);
            } else {
                kiuVar.d.setVisibility(8);
            }
        }
        this.l.i(this.s, this.t);
        this.l.b(this.s, this.t, this.u);
        this.c.r();
        this.h = new xec(this.o, this.j);
        this.b.j(true);
        ((acti) this.i.get()).u(new acte(this.e.q()), this.v);
        while (true) {
            afy afyVar = this.d;
            if (i >= afyVar.b) {
                break;
            }
            ((xgj) afyVar.b(i)).g(true, this.e.ad());
            i++;
        }
        if (this.r) {
            this.x.b(true);
            xgl xglVar = new xgl(this, (int) TimeUnit.MILLISECONDS.convert(aveeVar.c, TimeUnit.SECONDS));
            this.g = xglVar;
            xglVar.start();
            this.a.d(aveeVar.e, a());
        } else {
            i();
        }
        this.k.a(true);
        return true;
    }

    public final void f() {
        xec xecVar = this.h;
        if (xecVar != null) {
            xecVar.c();
            this.c.q(this.h);
        }
        b(wzq.SURVEY_ENDED);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.Z(new ayqb() { // from class: xgg
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                xgm xgmVar = xgm.this;
                if (((ahhw) obj).c() == aika.NEW) {
                    xgmVar.h();
                }
            }
        })};
    }

    public final void h() {
        j(this.f);
        j(this.g);
        this.b.f();
        kiu kiuVar = this.x;
        if (kiuVar != null) {
            kiuVar.a();
        }
        this.p = false;
        this.e = null;
        this.o = null;
        this.w = null;
        this.r = false;
    }

    public final void i() {
        apzg apzgVar;
        kiu kiuVar = this.x;
        if (kiuVar != null) {
            kiuVar.b(false);
        }
        aafo aafoVar = this.a;
        avcu avcuVar = this.e.b;
        if ((avcuVar.b & 4) != 0) {
            apzgVar = avcuVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        aafoVar.c(apzgVar, a());
        xgk xgkVar = new xgk(this, (int) TimeUnit.MILLISECONDS.convert(this.e.ac().a(), TimeUnit.SECONDS));
        this.f = xgkVar;
        xgkVar.start();
        xec xecVar = this.h;
        if (xecVar != null) {
            xecVar.c = xecVar.a.c();
        }
    }
}
