package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.ui.MultiPageMenuDialogFragmentController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: lyn  reason: default package */
/* loaded from: classes3.dex */
public final class lyn implements luf {
    public final aacz A;
    private final fsx B;
    private final gbq C;
    private final fsd D;
    private final aadd E;
    private final lba F;
    private final lct G;
    private final jjc H;
    private final jsc I;
    public final Activity a;
    public final acth b;
    public final gbu c;
    public final fsx d;
    public final luy e;
    public final luw f;
    public final azqb g;
    public final lvl h;
    public final azqb i;
    public final lya j;
    public final aafd k;
    public final aafo l;
    public final boolean m;
    public final boolean n;
    public final lur o;
    fsx p;
    lux r;
    public luv s;
    public apzg t;
    public byte[] u;
    public boolean w;
    public String x;
    public String y;
    public lcs z;
    public amvn q = amyg.a;
    public boolean v = false;

    /* renamed from: J  reason: collision with root package name */
    private int f224J = 2;

    public lyn(Activity activity, aacz aaczVar, aadd aaddVar, final ayor ayorVar, fsx fsxVar, fsx fsxVar2, acth acthVar, gbu gbuVar, luy luyVar, luw luwVar, azqb azqbVar, gbq gbqVar, fsd fsdVar, lvl lvlVar, azqb azqbVar2, lba lbaVar, lct lctVar, lya lyaVar, jjc jjcVar, jsc jscVar, final lur lurVar, ypf ypfVar, final itg itgVar, final ayoi ayoiVar, aafd aafdVar, aafo aafoVar) {
        boolean z = false;
        this.a = activity;
        this.A = aaczVar;
        this.E = aaddVar;
        this.d = fsxVar;
        this.B = fsxVar2;
        this.b = acthVar;
        this.c = gbuVar;
        this.C = gbqVar;
        this.e = luyVar;
        this.f = luwVar;
        this.g = azqbVar;
        this.D = fsdVar;
        this.h = lvlVar;
        this.i = azqbVar2;
        this.H = jjcVar;
        this.I = jscVar;
        this.F = lbaVar;
        this.G = lctVar;
        this.j = lyaVar;
        this.k = aafdVar;
        this.l = aafoVar;
        this.o = lurVar;
        this.m = eog.aW(aaczVar);
        this.n = eog.R(aaddVar);
        this.w = activity.getResources().getConfiguration().screenWidthDp < 320 ? true : z;
        ypfVar.f(new Callable() { // from class: lye
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final lyn lynVar = lyn.this;
                itg itgVar2 = itgVar;
                lur lurVar2 = lurVar;
                return ayoi.m(itgVar2.a().L(ktg.t), lurVar2.c, lum.c).X(ayorVar).as(new ayqb() { // from class: lyk
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        avjg avjgVar;
                        ampq ampqVar;
                        avjg avjgVar2;
                        ampq ampqVar2;
                        final lyn lynVar2 = lyn.this;
                        Pair pair = (Pair) obj;
                        final atia atiaVar = (atia) pair.first;
                        final ampq ampqVar3 = (ampq) pair.second;
                        if (atiaVar == null) {
                            lynVar2.g();
                            return;
                        }
                        lynVar2.u = atiaVar.c.I();
                        lynVar2.j.a();
                        final amvl i = amvn.i();
                        if (!atiaVar.e) {
                            i.c((fry) lynVar2.g.get());
                        }
                        for (athz athzVar : atiaVar.d) {
                            if (athzVar.b == 330817827) {
                                i.c((fry) lynVar2.g.get());
                            }
                            int i2 = athzVar.b;
                            if (i2 == 65153809) {
                                ampqVar = ampq.j((apoj) athzVar.c);
                            } else {
                                if (i2 == 322055134) {
                                    avjgVar = (avjg) athzVar.c;
                                } else {
                                    avjgVar = avjg.a;
                                }
                                aunb aunbVar = avjgVar.b;
                                if (aunbVar == null) {
                                    aunbVar = aunb.a;
                                }
                                if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                                    if (athzVar.b == 322055134) {
                                        avjgVar2 = (avjg) athzVar.c;
                                    } else {
                                        avjgVar2 = avjg.a;
                                    }
                                    aunb aunbVar2 = avjgVar2.b;
                                    if (aunbVar2 == null) {
                                        aunbVar2 = aunb.a;
                                    }
                                    ampqVar = ampq.j((apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer));
                                } else {
                                    ampqVar = amon.a;
                                }
                            }
                            if (ampqVar.h()) {
                                luy luyVar2 = lynVar2.e;
                                acti oi = lynVar2.b.oi();
                                apoj apojVar = (apoj) ampqVar.c();
                                if (athzVar.b == 322055134) {
                                    ampqVar2 = ampq.j(amuk.o(((avjg) athzVar.c).c));
                                } else {
                                    ampqVar2 = amon.a;
                                }
                                lux a = luyVar2.a(oi, apojVar, (List) ampqVar2.e(amuk.q()));
                                apzg apzgVar = ((apoj) ampqVar.c()).o;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                if (apzgVar.qn(SearchEndpointOuterClass.searchEndpoint)) {
                                    if (lynVar2.n) {
                                        auoy auoyVar = (auoy) apzgVar.qm(SearchEndpointOuterClass.searchEndpoint);
                                        lynVar2.x = auoyVar.d;
                                        lynVar2.y = auoyVar.f;
                                        if (lynVar2.z != null && a.a == null) {
                                            a.a = new lyh(lynVar2, 1);
                                        }
                                    }
                                    lynVar2.r = a;
                                    lynVar2.t = apzgVar;
                                    if (!lynVar2.m) {
                                    }
                                }
                                i.c(a);
                            }
                            if (athzVar.b == 120823052) {
                                atjf atjfVar = (atjf) athzVar.c;
                                luw luwVar2 = lynVar2.f;
                                LayoutInflater layoutInflater = lynVar2.a.getLayoutInflater();
                                Resources resources = lynVar2.a.getResources();
                                acti oi2 = lynVar2.b.oi();
                                dt dtVar = (dt) luwVar2.a.get();
                                dtVar.getClass();
                                ajmy ajmyVar = (ajmy) luwVar2.b.get();
                                ajmyVar.getClass();
                                MultiPageMenuDialogFragmentController multiPageMenuDialogFragmentController = (MultiPageMenuDialogFragmentController) luwVar2.c.get();
                                multiPageMenuDialogFragmentController.getClass();
                                afwc afwcVar = (afwc) luwVar2.d.get();
                                afwcVar.getClass();
                                azqb azqbVar3 = luwVar2.e;
                                ajxz ajxzVar = (ajxz) luwVar2.f.get();
                                ajxzVar.getClass();
                                axnm axnmVar = ((axoz) luwVar2.g).get();
                                axnmVar.getClass();
                                lya lyaVar2 = (lya) luwVar2.h.get();
                                lyaVar2.getClass();
                                layoutInflater.getClass();
                                resources.getClass();
                                oi2.getClass();
                                atjfVar.getClass();
                                lynVar2.s = new luv(dtVar, ajmyVar, multiPageMenuDialogFragmentController, afwcVar, azqbVar3, ajxzVar, axnmVar, lyaVar2, layoutInflater, resources, oi2, atjfVar);
                                i.c(lynVar2.s);
                                lynVar2.v = atjfVar.i;
                            }
                        }
                        fsw a2 = lynVar2.d.a();
                        a2.e(hve.i(R.attr.ytBrandRed));
                        a2.m(new ampg() { // from class: lyj
                            @Override // defpackage.ampg
                            public final Object apply(Object obj2) {
                                lyn lynVar3 = lyn.this;
                                atia atiaVar2 = atiaVar;
                                ampq ampqVar4 = ampqVar3;
                                amvl amvlVar = i;
                                frz frzVar = (frz) obj2;
                                frzVar.b = lynVar3.i(atiaVar2, ampqVar4);
                                frzVar.d(amvlVar.g());
                                return frzVar;
                            }
                        });
                        lynVar2.p = a2.a();
                        ((frv) lynVar2.i.get()).j();
                        if (lynVar2.c.h() == null || lynVar2.c.h().oi() == null || lynVar2.u == null) {
                            return;
                        }
                        lynVar2.c.h().oi().n(new acte(lynVar2.u));
                    }
                });
            }
        });
        ypfVar.f(new Callable() { // from class: lyf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                lyn lynVar = lyn.this;
                itg itgVar2 = itgVar;
                return itgVar2.a().X(ayorVar).M(lyd.b).as(new lyl(lynVar));
            }
        });
        ypfVar.f(new Callable() { // from class: lyg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ayoiVar.as(new lyl(lyn.this, 1));
            }
        });
    }

    private final gbd k() {
        gbd e = this.C.e();
        if (e != null) {
            if (ggs.i()) {
                if (!e.at()) {
                    return null;
                }
            } else if (!e.ar()) {
                return null;
            }
            return e;
        }
        return null;
    }

    private final void l(PaneDescriptor paneDescriptor) {
        Class cls = null;
        final apzg e = paneDescriptor != null ? paneDescriptor.e() : null;
        if (paneDescriptor != null) {
            cls = paneDescriptor.a;
        }
        gbd k = k();
        if ((k != null && k.aY()) || jfw.i(e) || ((Boolean) ayoi.Q(this.q).V(new ayqe() { // from class: lym
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                lyn lynVar = lyn.this;
                apzg apzgVar = e;
                return Boolean.valueOf(lynVar.k.a((apzg) obj, apzgVar));
            }
        }).I(kth.g).ax(false)).booleanValue()) {
            this.f224J = 1;
            return;
        }
        String h = jfw.h(e);
        if ((h != null && ("FEhistory".equals(h) || "FEmy_videos".equals(h) || "FEpurchases".equals(h) || h.indexOf("VL") == 0)) || cls == this.I.a || cls == this.H.a) {
            this.f224J = 3;
        } else {
            this.f224J = 2;
        }
    }

    private final void m(ImageView imageView) {
        String t = eog.t(this.E, this.a);
        if (this.v) {
            imageView.setContentDescription(t);
        }
    }

    @Override // defpackage.luf
    public final fsm a() {
        if (h() == 1) {
            if (this.m) {
                return this.h;
            }
            if (this.n) {
                this.z = this.G.a(this.C.e(), this.F.a(this.x, this.y), this.x, this.b.oi());
                this.b.oi().n(new acte(actj.SEARCH_BAR_MIC_BUTTON));
                lux luxVar = this.r;
                if (luxVar != null) {
                    luxVar.a = new lyh(this);
                }
            }
            return this.r;
        }
        return this.D;
    }

    @Override // defpackage.gbp
    public final void aI(gbr gbrVar) {
        l(this.C.c());
    }

    @Override // defpackage.luf
    public final fsx b() {
        fsx c;
        this.j.a();
        if (h() == 1) {
            if (this.p == null) {
                return c();
            }
            gbd k = k();
            return k != null ? k.aL(this.p) : this.p;
        }
        gbd k2 = k();
        if (k2 != null) {
            c = k2.lt();
        } else {
            c = c();
        }
        if (c == null) {
            return c();
        }
        if (this.f224J != 1) {
            return c;
        }
        fsw a = c.a();
        a.m(new ampg() { // from class: lyi
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                lyn lynVar = lyn.this;
                frz frzVar = (frz) obj;
                frzVar.b = lynVar.i(atia.a, (ampq) lynVar.o.c.aw());
                return frzVar;
            }
        });
        return a.a();
    }

    @Override // defpackage.luf
    public final fsx c() {
        return h() == 3 ? this.B : this.d;
    }

    @Override // defpackage.luf
    public final PaneDescriptor d() {
        gbd k = k();
        if (k == null) {
            return null;
        }
        return PaneDescriptor.b(k);
    }

    @Override // defpackage.gbn
    public final void e(gbd gbdVar) {
        if (!gbdVar.G) {
            l(PaneDescriptor.b(gbdVar));
        }
    }

    @Override // defpackage.luf
    public final lcs f() {
        return this.z;
    }

    @Override // defpackage.luf
    public final void g() {
        this.s = null;
        this.p = null;
        this.u = null;
        this.r = null;
        ((frv) this.i.get()).j();
    }

    @Override // defpackage.luf
    public final int h() {
        int i = this.f224J;
        return i == 1 ? this.p != null ? 1 : 2 : i;
    }

    public final View i(atia atiaVar, ampq ampqVar) {
        View inflate;
        LayoutInflater from = LayoutInflater.from(this.a);
        this.h.f(false);
        final aqls aqlsVar = atiaVar.f;
        if (aqlsVar == null) {
            aqlsVar = aqls.a;
        }
        if (eog.aW(this.A)) {
            View b = this.h.b(from);
            this.h.e(b, this.t, this.v, this.w);
            this.h.f(true);
            return b;
        }
        if (!ampqVar.h() || this.w) {
            inflate = from.inflate(R.layout.action_bar_ringo, (ViewGroup) null);
            j((ImageView) inflate.findViewById(R.id.youtube_logo));
        } else {
            inflate = from.inflate(R.layout.action_bar_yoodle, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.youtube_logo);
            imageView.setImageDrawable((Drawable) ampqVar.c());
            m(imageView);
        }
        aqlr aqlrVar = aqlsVar.b;
        if (aqlrVar == null) {
            aqlrVar = aqlr.a;
        }
        if ((aqlrVar.b & 32) != 0) {
            ImageView imageView2 = (ImageView) inflate.findViewById(R.id.youtube_logo);
            imageView2.setClickable(true);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: lyc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lyn lynVar = lyn.this;
                    aqls aqlsVar2 = aqlsVar;
                    aafo aafoVar = lynVar.l;
                    aqlr aqlrVar2 = aqlsVar2.b;
                    if (aqlrVar2 == null) {
                        aqlrVar2 = aqlr.a;
                    }
                    apzg apzgVar = aqlrVar2.g;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.a(apzgVar);
                }
            });
        }
        return inflate;
    }

    public final void j(ImageView imageView) {
        Drawable g;
        if (!eog.aW(this.A)) {
            if (this.w) {
                g = akf.a(this.a, 2131233295);
            } else if (this.v) {
                g = zhn.g(this.a, R.attr.ytPremiumWordmarkHeader);
            } else {
                g = zhn.g(this.a, R.attr.ytWordmarkHeader);
            }
            imageView.setImageDrawable(g);
            m(imageView);
        }
    }
}
