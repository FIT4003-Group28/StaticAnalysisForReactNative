package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: xfx  reason: default package */
/* loaded from: classes4.dex */
public final class xfx implements wkp {
    public final xft a;
    public final aafo b;
    public final xiw c;
    CountDownTimer d;
    public apzg e;
    public aoyf f;
    public aoyf g;
    public aoyf h;
    public long i;
    private final wkt j;
    private final wwd k;
    private final wvx l;
    private final ajmy m;
    private final Handler n;
    private final acti o;
    private final yzm p;
    private asjj q;
    private yiy r;
    private xcb s;
    private xdu t;
    private xci u;
    private long v;
    private wqw w;

    public xfx(xft xftVar, ajmy ajmyVar, aafo aafoVar, yzm yzmVar, xiw xiwVar, wkt wktVar, wwd wwdVar, wvx wvxVar, acti actiVar) {
        xftVar.getClass();
        this.a = xftVar;
        aafoVar.getClass();
        this.b = aafoVar;
        xiwVar.getClass();
        this.c = xiwVar;
        wktVar.getClass();
        this.j = wktVar;
        wwdVar.getClass();
        this.k = wwdVar;
        wvxVar.getClass();
        this.l = wvxVar;
        ajmyVar.getClass();
        this.m = ajmyVar;
        actiVar.getClass();
        this.o = actiVar;
        yzmVar.getClass();
        this.p = yzmVar;
        this.n = new Handler(Looper.getMainLooper());
        ((kkz) xftVar).G = new xfu(this);
    }

    private static aoyf i(aunb aunbVar) {
        if (!aunbVar.qn(AdClickCommandRendererOuterClass.adClickCommandRenderer)) {
            return null;
        }
        return (aoyf) aunbVar.qm(AdClickCommandRendererOuterClass.adClickCommandRenderer);
    }

    private final void j() {
        f();
        yiy yiyVar = this.r;
        if (yiyVar != null) {
            yiyVar.d();
            this.r = null;
        }
        this.i = 0L;
        this.v = 0L;
        this.a.e();
        this.e = null;
        this.w = null;
        this.p.j(false);
        this.f = null;
        this.g = null;
        this.h = null;
        this.q = null;
    }

    private final void k() {
        this.s = null;
        this.u = null;
        this.t = null;
    }

    private final void l(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.c((apzg) it.next(), null);
        }
    }

    private final void m(int i) {
        xci xciVar = this.u;
        if (xciVar != null) {
            this.j.e(this.s, this.t, xciVar, i);
            this.j.u(this.u);
        }
        xdu xduVar = this.t;
        if (xduVar != null) {
            this.j.l(this.s, xduVar);
            this.j.p(this.s, this.t);
        }
        k();
    }

    public final apzg a(apzg apzgVar) {
        if (this.q != null) {
            return apzgVar;
        }
        aopc aopcVar = (aopc) apzgVar.mo52toBuilder();
        aopc aopcVar2 = (aopc) apzh.a.createBuilder();
        aopcVar2.e(askh.a, this.q);
        apzh apzhVar = (apzh) aopcVar2.mo39build();
        aopcVar.copyOnWrite();
        apzg apzgVar2 = (apzg) aopcVar.instance;
        apzhVar.getClass();
        apzgVar2.e = apzhVar;
        apzgVar2.b |= 2;
        return (apzg) aopcVar.mo39build();
    }

    public final void b(wzq wzqVar) {
        this.p.j(false);
        this.a.f(false);
        if (this.w != null) {
            m(xci.a(wzqVar));
            this.w.d(wzqVar);
            this.w = null;
        }
        j();
    }

    @Override // defpackage.wkp
    public final void c() {
        j();
        m(4);
    }

    public final void d(aoyf aoyfVar) {
        if (aoyfVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(aoyfVar.d);
            if ((aoyfVar.b & 1) != 0) {
                apzg apzgVar = aoyfVar.c;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                arrayList.add(a(apzgVar));
            }
            this.b.d(arrayList, null);
        }
    }

    @Override // defpackage.wkp
    public final boolean e(wqw wqwVar) {
        apbc apbcVar;
        aopc aopcVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        avhn avhnVar;
        avhn avhnVar2;
        aoyl aoylVar;
        apbc apbcVar2;
        apzg apzgVar;
        arag aragVar4;
        arag aragVar5;
        arag aragVar6;
        arag aragVar7;
        avhn avhnVar3;
        avhn avhnVar4;
        aoyl aoylVar2;
        if (wqwVar.a().i() == null) {
            return false;
        }
        apax i = wqwVar.a().i();
        this.s = xcb.a(wqwVar.c(), wqwVar.b());
        xdu b = this.k.b();
        this.t = b;
        this.u = this.l.e(b, i);
        this.j.o(this.s, this.t);
        this.j.f(this.s, this.t, this.u);
        j();
        this.w = wqwVar;
        ampq ampqVar = this.u.i;
        if (ampqVar.h()) {
            aopa createBuilder = asjj.a.createBuilder();
            createBuilder.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder.instance;
            asjjVar.t = (asit) ampqVar.c();
            asjjVar.c |= 1024;
            this.q = (asjj) createBuilder.mo39build();
        }
        Iterator it = i.c.iterator();
        while (true) {
            apbcVar = null;
            if (!it.hasNext()) {
                aopcVar = null;
                break;
            }
            apaz apazVar = (apaz) it.next();
            if (apazVar.b == 90451653) {
                aopcVar = (aopc) ((apba) apazVar.c).mo52toBuilder();
                break;
            }
        }
        if (aopcVar == null || (((apba) aopcVar.instance).b & 512) == 0) {
            int size = i.c.size();
            int i2 = 0;
            while (i2 < size) {
                aopa mo52toBuilder = ((apaz) i.c.get(i2)).mo52toBuilder();
                apaz apazVar2 = (apaz) mo52toBuilder.instance;
                if (apazVar2.b == 122556306) {
                    aopc aopcVar2 = (aopc) ((apbb) apazVar2.c).mo52toBuilder();
                    if ((((apbb) aopcVar2.instance).b & 128) != 0) {
                        this.j.i(this.s, this.t);
                        this.j.b(this.s, this.t, this.u);
                        if (!aopcVar2.qn(auwj.b) || !((Boolean) aopcVar2.qm(auwj.b)).booleanValue()) {
                            l(Collections.unmodifiableList(((apbb) aopcVar2.instance).m));
                            this.o.u(new acte(((apbb) aopcVar2.instance).q), this.q);
                            aopcVar2.e(auwj.b, true);
                        }
                        apbb apbbVar = (apbb) aopcVar2.instance;
                        if ((apbbVar.b & 4) != 0) {
                            aragVar = apbbVar.e;
                            if (aragVar == null) {
                                aragVar = arag.a;
                            }
                        } else {
                            aragVar = null;
                        }
                        Spanned b2 = ajgl.b(aragVar);
                        apbb apbbVar2 = (apbb) aopcVar2.instance;
                        if ((apbbVar2.b & 64) != 0) {
                            aragVar2 = apbbVar2.i;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        Spanned b3 = ajgl.b(aragVar2);
                        apbb apbbVar3 = (apbb) aopcVar2.instance;
                        if ((apbbVar3.b & 16) != 0) {
                            aragVar3 = apbbVar3.g;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                        } else {
                            aragVar3 = null;
                        }
                        Spanned b4 = ajgl.b(aragVar3);
                        apbb apbbVar4 = (apbb) aopcVar2.instance;
                        if ((apbbVar4.b & 512) != 0) {
                            avhn avhnVar5 = apbbVar4.n;
                            if (avhnVar5 == null) {
                                avhnVar5 = avhn.a;
                            }
                            avhnVar = avhnVar5;
                        } else {
                            avhnVar = null;
                        }
                        apbb apbbVar5 = (apbb) aopcVar2.instance;
                        if ((apbbVar5.b & 1) != 0) {
                            avhn avhnVar6 = apbbVar5.c;
                            if (avhnVar6 == null) {
                                avhnVar6 = avhn.a;
                            }
                            avhnVar2 = avhnVar6;
                        } else {
                            avhnVar2 = null;
                        }
                        aunb aunbVar = ((apbb) aopcVar2.instance).p;
                        if (aunbVar == null) {
                            aunbVar = aunb.a;
                        }
                        if (aunbVar.qn(AdCtaButtonRendererOuterClass.adCtaButtonRenderer)) {
                            aunb aunbVar2 = ((apbb) aopcVar2.instance).p;
                            if (aunbVar2 == null) {
                                aunbVar2 = aunb.a;
                            }
                            aoylVar = (aoyl) aunbVar2.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                        } else {
                            aoylVar = null;
                        }
                        Integer valueOf = Integer.valueOf(((apbb) aopcVar2.instance).o);
                        apbb apbbVar6 = (apbb) aopcVar2.instance;
                        if ((apbbVar6.b & 16384) != 0) {
                            apbc apbcVar3 = apbbVar6.r;
                            if (apbcVar3 == null) {
                                apbcVar3 = apbc.a;
                            }
                            apbcVar2 = apbcVar3;
                        } else {
                            apbcVar2 = null;
                        }
                        apbb apbbVar7 = (apbb) aopcVar2.instance;
                        float f = apbbVar7.k;
                        if ((apbbVar7.b & 128) != 0) {
                            apzg apzgVar2 = apbbVar7.j;
                            if (apzgVar2 == null) {
                                apzgVar2 = apzg.a;
                            }
                            apzgVar = apzgVar2;
                        } else {
                            apzgVar = null;
                        }
                        aunb aunbVar3 = ((apbb) aopcVar2.instance).d;
                        if (aunbVar3 == null) {
                            aunbVar3 = aunb.a;
                        }
                        aoyf i3 = i(aunbVar3);
                        aunb aunbVar4 = ((apbb) aopcVar2.instance).f;
                        if (aunbVar4 == null) {
                            aunbVar4 = aunb.a;
                        }
                        aoyf i4 = i(aunbVar4);
                        aunb aunbVar5 = ((apbb) aopcVar2.instance).h;
                        if (aunbVar5 == null) {
                            aunbVar5 = aunb.a;
                        }
                        aoyf i5 = i(aunbVar5);
                        apbb apbbVar8 = (apbb) aopcVar2.instance;
                        int i6 = i2;
                        n(b2, b3, b4, 0.0f, null, avhnVar, avhnVar2, aoylVar, valueOf, apbcVar2, 1, f, apzgVar, i3, i4, i5, (apbbVar8.b & 32768) != 0 ? Float.valueOf(apbbVar8.s) : null);
                        mo52toBuilder.copyOnWrite();
                        apaz apazVar3 = (apaz) mo52toBuilder.instance;
                        apbb apbbVar9 = (apbb) aopcVar2.mo39build();
                        apbbVar9.getClass();
                        apazVar3.c = apbbVar9;
                        apazVar3.b = 122556306;
                        aopa mo52toBuilder2 = i.mo52toBuilder();
                        mo52toBuilder2.copyOnWrite();
                        apax apaxVar = (apax) mo52toBuilder2.instance;
                        apaz apazVar4 = (apaz) mo52toBuilder.mo39build();
                        apazVar4.getClass();
                        aopu aopuVar = apaxVar.c;
                        if (!aopuVar.c()) {
                            apaxVar.c = aopi.mutableCopy(aopuVar);
                        }
                        apaxVar.c.set(i6, apazVar4);
                        apax apaxVar2 = (apax) mo52toBuilder2.mo39build();
                        return true;
                    }
                }
                i2++;
                i = i;
            }
            this.j.p(this.s, this.t);
            k();
            return false;
        }
        this.j.i(this.s, this.t);
        this.j.b(this.s, this.t, this.u);
        if (!aopcVar.qn(aphp.b) || !((Boolean) aopcVar.qm(aphp.b)).booleanValue()) {
            l(Collections.unmodifiableList(((apba) aopcVar.instance).p));
            this.o.u(new acte(((apba) aopcVar.instance).o), this.q);
            aopcVar.e(aphp.b, true);
        }
        apba apbaVar = (apba) aopcVar.instance;
        if ((apbaVar.b & 4) != 0) {
            aragVar4 = apbaVar.e;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        Spanned b5 = ajgl.b(aragVar4);
        apba apbaVar2 = (apba) aopcVar.instance;
        if ((apbaVar2.b & 256) != 0) {
            aragVar5 = apbaVar2.k;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        Spanned b6 = ajgl.b(aragVar5);
        apba apbaVar3 = (apba) aopcVar.instance;
        if ((apbaVar3.b & 16) != 0) {
            aragVar6 = apbaVar3.g;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
        } else {
            aragVar6 = null;
        }
        Spanned b7 = ajgl.b(aragVar6);
        apba apbaVar4 = (apba) aopcVar.instance;
        float f2 = apbaVar4.h;
        if ((apbaVar4.b & 128) != 0) {
            aragVar7 = apbaVar4.j;
            if (aragVar7 == null) {
                aragVar7 = arag.a;
            }
        } else {
            aragVar7 = null;
        }
        Spanned b8 = ajgl.b(aragVar7);
        apba apbaVar5 = (apba) aopcVar.instance;
        if ((apbaVar5.b & 8192) != 0) {
            avhnVar3 = apbaVar5.q;
            if (avhnVar3 == null) {
                avhnVar3 = avhn.a;
            }
        } else {
            avhnVar3 = null;
        }
        apba apbaVar6 = (apba) aopcVar.instance;
        if ((apbaVar6.b & 1) != 0) {
            avhnVar4 = apbaVar6.c;
            if (avhnVar4 == null) {
                avhnVar4 = avhn.a;
            }
        } else {
            avhnVar4 = null;
        }
        apba apbaVar7 = (apba) aopcVar.instance;
        if ((apbaVar7.b & 65536) != 0) {
            aunb aunbVar6 = apbaVar7.t;
            if (aunbVar6 == null) {
                aunbVar6 = aunb.a;
            }
            aoylVar2 = (aoyl) aunbVar6.qm(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
        } else {
            aoylVar2 = null;
        }
        Integer valueOf2 = Integer.valueOf(((apba) aopcVar.instance).r);
        apba apbaVar8 = (apba) aopcVar.instance;
        if ((apbaVar8.b & 131072) != 0 && (apbcVar = apbaVar8.u) == null) {
            apbcVar = apbc.a;
        }
        apbc apbcVar4 = apbcVar;
        int bQ = awwc.bQ(((apba) aopcVar.instance).s);
        int i7 = bQ == 0 ? 1 : bQ;
        apba apbaVar9 = (apba) aopcVar.instance;
        float f3 = apbaVar9.n;
        apzg apzgVar3 = apbaVar9.m;
        if (apzgVar3 == null) {
            apzgVar3 = apzg.a;
        }
        apzg apzgVar4 = apzgVar3;
        aunb aunbVar7 = ((apba) aopcVar.instance).d;
        if (aunbVar7 == null) {
            aunbVar7 = aunb.a;
        }
        aoyf i8 = i(aunbVar7);
        aunb aunbVar8 = ((apba) aopcVar.instance).f;
        if (aunbVar8 == null) {
            aunbVar8 = aunb.a;
        }
        aoyf i9 = i(aunbVar8);
        aunb aunbVar9 = ((apba) aopcVar.instance).i;
        if (aunbVar9 == null) {
            aunbVar9 = aunb.a;
        }
        n(b5, b6, b7, f2, b8, avhnVar3, avhnVar4, aoylVar2, valueOf2, apbcVar4, i7, f3, apzgVar4, i8, i9, i(aunbVar9), null);
        return true;
    }

    public final void f() {
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.d = null;
        }
    }

    public final void g(long j) {
        if (this.e == null) {
            return;
        }
        if (j > 0) {
            this.a.g(j, this.v);
        } else {
            b(wzq.ENDCAP_ENDED);
        }
    }

    public final void h(long j) {
        xfv xfvVar = new xfv(this, j);
        this.d = xfvVar;
        xfvVar.start();
    }

    private final void n(Spanned spanned, CharSequence charSequence, Spanned spanned2, float f, CharSequence charSequence2, avhn avhnVar, avhn avhnVar2, aoyl aoylVar, Integer num, apbc apbcVar, int i, float f2, apzg apzgVar, aoyf aoyfVar, aoyf aoyfVar2, aoyf aoyfVar3, Float f3) {
        int i2;
        this.e = apzgVar;
        xft xftVar = this.a;
        boolean z = aoyfVar != null;
        boolean z2 = aoyfVar2 != null;
        boolean z3 = aoyfVar3 != null;
        kkz kkzVar = (kkz) xftVar;
        if (kkzVar.o == null) {
            kkzVar.o = (ViewGroup) LayoutInflater.from(kkzVar.a).inflate(R.layout.endcap_layout, (ViewGroup) xftVar);
            kkzVar.u = kkzVar.o.findViewById(R.id.endcap_layout);
            kkzVar.e = (ImageView) kkzVar.o.findViewById(R.id.background_image);
            kkzVar.y = kkzVar.o.findViewById(R.id.metadata_container);
            kkzVar.f = (ImageView) kkzVar.y.findViewById(R.id.ad_thumbnail);
            kkzVar.g = (TextView) kkzVar.y.findViewById(R.id.title);
            kkzVar.h = kkzVar.y.findViewById(R.id.action_button);
            kkzVar.i = (TextView) kkzVar.y.findViewById(R.id.action_button_text);
            kkzVar.j = kkzVar.y.findViewById(R.id.action_cta_button);
            kkzVar.k = (TextView) kkzVar.y.findViewById(R.id.ad_cta_button_text);
            kkzVar.A = kkzVar.y.findViewById(R.id.description_container);
            kkzVar.B = (TextView) kkzVar.A.findViewById(R.id.app_store_text);
            kkzVar.C = kkzVar.y.findViewById(R.id.action_description_container);
            kkzVar.D = (TextView) kkzVar.C.findViewById(R.id.action_description_text);
            kkzVar.m = (TextView) kkzVar.A.findViewById(R.id.ratings_count_text);
            kkzVar.l = (TextView) kkzVar.o.findViewById(R.id.ad_text);
            kkzVar.n = kkzVar.o.findViewById(R.id.skip_ad_button);
            kkzVar.s = (TimeBar) kkzVar.o.findViewById(R.id.time_bar);
            kkzVar.t = new aibt();
            kkzVar.t.h = ControlsOverlayStyle.i.q;
            kkzVar.t.k = ControlsOverlayStyle.i.r;
            kkzVar.t.l = ControlsOverlayStyle.i.w;
            kkzVar.t.m = ControlsOverlayStyle.i.s;
            kkzVar.t.n = ControlsOverlayStyle.i.x;
            kkzVar.s.y(kkzVar.t);
            if (kkzVar.v == null) {
                kkzVar.v = kkzVar.d.a(null, kkzVar.j);
            }
            if (kkzVar.x == null) {
                kkzVar.x = new maf(kkzVar.y);
            }
            kkzVar.F = ((ColorDrawable) kkzVar.u.getBackground()).getColor();
            ((RelativeLayout.LayoutParams) kkzVar.n.getLayoutParams()).bottomMargin += kkzVar.c;
            ((LinearLayout.LayoutParams) kkzVar.h.getLayoutParams()).bottomMargin += kkzVar.c;
            kkzVar.n.setOnClickListener(new kkw(kkzVar, 3, (byte[]) null));
            kkzVar.n.setOnTouchListener(new kkx(kkzVar));
            kkzVar.h.setOnClickListener(new kkw(kkzVar, 4, (char[]) null));
            kkzVar.j.setOnClickListener(new kkw(kkzVar, 5, (short[]) null));
            kkzVar.f.setOnClickListener(new kkw(kkzVar, 1));
            kkzVar.g.setOnClickListener(new kkw(kkzVar));
            kkzVar.A.setOnClickListener(new kkw(kkzVar, 2));
        }
        kkzVar.e();
        kkzVar.r = spanned;
        kkzVar.g.setText(spanned);
        kkz.i(kkzVar.g);
        kkzVar.g.setClickable(z2);
        kkzVar.B.setText(spanned2);
        kkz.i(kkzVar.B);
        kkzVar.m.setText(charSequence2);
        kkz.i(kkzVar.m);
        kkzVar.A.setClickable(z3);
        zag.o(kkzVar.n, !TextUtils.isEmpty(kkzVar.r));
        zag.o(kkzVar.l, !TextUtils.isEmpty(kkzVar.r));
        kkzVar.s.setEnabled(!TextUtils.isEmpty(kkzVar.r));
        kkzVar.z = f;
        kkzVar.H = i;
        kkzVar.x.b(f, i);
        if (num.intValue() != 0) {
            kkzVar.u.setBackgroundColor(num.intValue());
        }
        if (avhnVar != null) {
            kkzVar.b.h(kkzVar.e, avhnVar);
            kkzVar.e.setVisibility(0);
            kkzVar.e.setClickable(z);
            kkzVar.e.setImageAlpha(63);
        } else {
            kkzVar.e.setVisibility(8);
        }
        kkzVar.w = aoylVar;
        aoyl aoylVar2 = kkzVar.w;
        if (aoylVar2 != null) {
            kkzVar.v.a(aoylVar2, null);
        } else {
            kkzVar.h.setVisibility(0);
            kkzVar.i.setText(charSequence);
            kkz.i(kkzVar.i);
        }
        ezx ezxVar = kkzVar.E;
        if ((ezxVar == null || ezxVar.i()) && apbcVar != null) {
            if (kkzVar.o.isAttachedToWindow()) {
                kkzVar.d(apbcVar);
            } else {
                kkzVar.o.getViewTreeObserver().addOnGlobalLayoutListener(new kky(kkzVar, apbcVar));
            }
        }
        if (f3 == null || f3.floatValue() <= 0.0f) {
            i2 = 0;
            kkzVar.A.setVisibility(0);
            kkzVar.C.setVisibility(8);
        } else {
            kkzVar.A.setVisibility(8);
            kkzVar.C.setVisibility(0);
            kkzVar.D.setText(spanned2);
            ((LinearLayout.LayoutParams) kkzVar.D.getLayoutParams()).weight = f3.floatValue();
            i2 = 0;
        }
        kkzVar.setVisibility(i2);
        if (avhnVar2 != null) {
            this.r = yiy.c(new xfw(this));
            this.m.l(akel.q(avhnVar2), yje.c(this.n, this.r));
        }
        long convert = TimeUnit.MILLISECONDS.convert((int) f2, TimeUnit.SECONDS);
        this.v = convert;
        this.a.g(convert, convert);
        h(this.v);
        this.a.f(true);
        this.p.j(true);
        this.f = aoyfVar;
        this.g = aoyfVar2;
        this.h = aoyfVar3;
        if (aoyfVar != null) {
            this.o.u(new acte(aoyfVar.e), this.q);
        }
        aoyf aoyfVar4 = this.g;
        if (aoyfVar4 != null) {
            this.o.u(new acte(aoyfVar4.e), this.q);
        }
        aoyf aoyfVar5 = this.h;
        if (aoyfVar5 != null) {
            this.o.u(new acte(aoyfVar5.e), this.q);
        }
    }
}
