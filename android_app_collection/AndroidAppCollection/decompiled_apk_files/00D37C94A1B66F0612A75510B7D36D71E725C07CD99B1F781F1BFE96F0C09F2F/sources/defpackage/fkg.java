package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: fkg  reason: default package */
/* loaded from: classes3.dex */
public final class fkg implements ajru {
    public static final amuk a = amuk.t(apvh.STYLE_PREMIUM_CHIP, apvh.STYLE_SHORTS_CHIP, apvh.STYLE_EXPLORE_LAUNCHER_CHIP);
    public final fwn b;
    public final nfv c;
    public View.OnClickListener d;
    public ajrm e;
    public boolean f;
    public acti g;
    public aopa h;
    private final ajmy i;
    private final ajxz j;
    private final ajrp k;
    private final akfb l;
    private final axnm m;
    private aypg n;

    public fkg(Context context, aafo aafoVar, ajmy ajmyVar, ajxz ajxzVar, akfb akfbVar, nfv nfvVar, axnm axnmVar) {
        aafoVar.getClass();
        ajmyVar.getClass();
        this.i = ajmyVar;
        ajxzVar.getClass();
        this.j = ajxzVar;
        akfbVar.getClass();
        this.l = akfbVar;
        nfvVar.getClass();
        this.c = nfvVar;
        axnmVar.getClass();
        this.m = axnmVar;
        fwn fwnVar = new fwn(context, !nfvVar.a());
        this.b = fwnVar;
        this.k = new ajrp(aafoVar, fwnVar, new ajrm() { // from class: fka
            @Override // defpackage.ajrm
            public final boolean h(View view) {
                fkg fkgVar = fkg.this;
                ajrm ajrmVar = fkgVar.e;
                if (ajrmVar != null && ajrmVar.h(view)) {
                    fkgVar.h();
                    return true;
                }
                View.OnClickListener onClickListener = fkgVar.d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (!fkgVar.f) {
                    return false;
                }
                fkgVar.h();
                return false;
            }
        });
        this.g = acti.l;
    }

    public static asjj d(apvg apvgVar) {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asja.a.createBuilder();
        int i = true != apvgVar.i ? 3 : 2;
        createBuilder2.copyOnWrite();
        asja asjaVar = (asja) createBuilder2.instance;
        asjaVar.c = i - 1;
        asjaVar.b |= 1;
        asja asjaVar2 = (asja) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asjaVar2.getClass();
        asjjVar.m = asjaVar2;
        asjjVar.b |= 32768;
        return (asjj) createBuilder.mo39build();
    }

    public static void e(ajrs ajrsVar, ayoi ayoiVar) {
        ajrsVar.f("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY", ayoiVar);
    }

    public static void f(ajrs ajrsVar, ajrm ajrmVar) {
        ajrmVar.getClass();
        ajrsVar.f("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT", ajrmVar);
    }

    public static void g(ajrs ajrsVar, View.OnClickListener onClickListener) {
        ajrsVar.f("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER", onClickListener);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    public final void h() {
        aopa aopaVar = this.h;
        if (aopaVar != null) {
            this.g.H(3, new acte(((apvg) aopaVar.instance).l), d((apvg) this.h.mo39build()));
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        argj argjVar;
        apvg apvgVar = (apvg) obj;
        this.h = apvgVar.mo52toBuilder();
        this.g = ajrsVar.a;
        ajrp ajrpVar = this.k;
        acti actiVar = ajrsVar.a;
        apzg apzgVar = ((apvg) this.h.instance).g;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), new ajrn() { // from class: fkb
            @Override // defpackage.ajrn
            public final void oq(Map map) {
                map.put("com.google.android.libraries.youtube.innertube.endpoint.tag", fkg.this.h.mo39build());
            }
        });
        if ((((apvg) this.h.instance).b & 1024) != 0) {
            ((akfw) this.m.get()).d(((apvg) this.h.instance).k, this.b);
        }
        aopa aopaVar = this.h;
        apvg apvgVar2 = (apvg) aopaVar.instance;
        if (apvgVar2.c != 7) {
            this.b.c((apvg) aopaVar.mo39build());
        } else {
            ajxz ajxzVar = this.j;
            arhr b = arhr.b(((arhs) apvgVar2.d).c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            int a2 = ajxzVar.a(b);
            fwn fwnVar = this.b;
            apvg apvgVar3 = (apvg) this.h.mo39build();
            fwl a3 = fwnVar.a();
            a3.e(false);
            a3.d(apvgVar3.c == 6);
            a3.f(apvgVar3.c == 7);
            fwnVar.g(a3, apvgVar3);
            fwnVar.e = a3.a();
            if (a2 == 0) {
                fwnVar.b = null;
                fwnVar.a = null;
            } else {
                ImageView imageView = fwnVar.d;
                int i = fwnVar.e.l;
                zgd.t(imageView, zgd.b(zgd.s(i, i), zgd.l(fwnVar.e.j), zgd.k(fwnVar.e.k)), ViewGroup.MarginLayoutParams.class);
                fwnVar.b = fwnVar.getResources().getDrawable(a2);
                fwnVar.a = fwnVar.getResources().getDrawable(a2);
                fwm fwmVar = fwnVar.e;
                if (!fwmVar.f) {
                    fwnVar.b.setColorFilter(fwmVar.a(false), PorterDuff.Mode.SRC_IN);
                    fwnVar.a.mutate().setColorFilter(fwnVar.e.a(true), PorterDuff.Mode.SRC_IN);
                }
            }
            fwnVar.b(apvgVar3);
        }
        this.d = (View.OnClickListener) ajrsVar.c("CHIP_CLOUD_CHIP_ON_CLICK_LISTENER");
        this.e = (ajrm) ajrsVar.c("CHIP_CLOUD_CHIP_ON_CLICK_INTERCEPT");
        amuk amukVar = a;
        apvi apviVar = apvgVar.e;
        if (apviVar == null) {
            apviVar = apvi.a;
        }
        apvh b2 = apvh.b(apviVar.c);
        if (b2 == null) {
            b2 = apvh.STYLE_UNKNOWN;
        }
        this.f = !amukVar.contains(b2);
        ayoi ayoiVar = (ayoi) ajrsVar.c("CHIP_CLOUD_CHIP_SELECTION_CHANGED_OBSERVABLE_KEY");
        aypg aypgVar = this.n;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        if (ayoiVar != null) {
            this.n = ayoiVar.at(new ayqb() { // from class: fkc
                @Override // defpackage.ayqb
                public final void a(Object obj2) {
                    final fkg fkgVar = fkg.this;
                    Boolean bool = (Boolean) obj2;
                    aopa aopaVar2 = fkgVar.h;
                    boolean booleanValue = bool.booleanValue();
                    aopaVar2.copyOnWrite();
                    apvg apvgVar4 = (apvg) aopaVar2.instance;
                    apvg apvgVar5 = apvg.a;
                    apvgVar4.b |= 256;
                    apvgVar4.i = booleanValue;
                    fkgVar.b.e(true != bool.booleanValue() ? 2 : 1, true ^ fkgVar.c.a());
                    if (bool.booleanValue()) {
                        fkgVar.b.post(new Runnable() { // from class: fkd
                            @Override // java.lang.Runnable
                            public final void run() {
                                fkg.this.b.sendAccessibilityEvent(8);
                            }
                        });
                    }
                    apvg apvgVar6 = (apvg) fkgVar.h.instance;
                    if ((apvgVar6.b & 4096) != 0) {
                        fkgVar.g.w(new acte(apvgVar6.l.I()), fkg.d((apvg) fkgVar.h.mo39build()));
                    }
                }
            }, dzq.p);
        }
        apvg apvgVar4 = (apvg) this.h.instance;
        if (apvgVar4.c == 6) {
            this.i.h(this.b.c, (avhn) apvgVar4.d);
        }
        if ((((apvg) this.h.instance).b & 512) != 0) {
            akfb akfbVar = this.l;
            argl arglVar = apvgVar.j;
            if (arglVar == null) {
                arglVar = argl.a;
            }
            if (arglVar.b == 102716411) {
                argjVar = (argj) arglVar.c;
            } else {
                argjVar = argj.a;
            }
            akfbVar.b(argjVar, this.b, apvgVar, this.g);
        }
        this.g.u(new acte(((apvg) this.h.instance).l), d((apvg) this.h.mo39build()));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g = acti.l;
        this.d = null;
        this.f = false;
        this.k.c();
        aypg aypgVar = this.n;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.n = null;
        }
    }
}
