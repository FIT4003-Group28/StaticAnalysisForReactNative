package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: klt  reason: default package */
/* loaded from: classes3.dex */
public final class klt implements ecj {
    private frb A;
    private yye B;
    public final acti a;
    public final njb b;
    public final Rect c;
    public klr d;
    public arbm e;
    public boolean f;
    public boolean g;
    public int h;
    public arbh i;
    public asjj j;
    private final Set k;
    private final int l;
    private final int m;
    private final int n;
    private final klc o;
    private final kln p;
    private final Context q;
    private final aigl r;
    private final aadd s;
    private View t;
    private View u;
    private View v;
    private TextView w;
    private RecyclerView x;
    private klm y;
    private klb z;

    public klt(Context context, acti actiVar, klc klcVar, kln klnVar, njb njbVar, aigl aiglVar, aadd aaddVar) {
        actiVar.getClass();
        this.a = actiVar;
        this.o = klcVar;
        this.p = klnVar;
        this.b = njbVar;
        this.q = context;
        this.c = new Rect();
        this.k = Collections.newSetFromMap(new WeakHashMap());
        this.l = context.getResources().getDimensionPixelSize(R.dimen.fullscreen_engagement_header_height);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_height);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_max_top_margin);
        this.s = aaddVar;
        this.r = aiglVar;
        aiglVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: klp
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                klt kltVar = klt.this;
                if (i2 == kltVar.h) {
                    return;
                }
                kltVar.h = i2;
                if (!kltVar.g) {
                    return;
                }
                kltVar.f();
            }
        });
    }

    private final void j() {
        this.r.f.getClass();
        View inflate = LayoutInflater.from(this.q).inflate(R.layout.fullscreen_engagement_overlay, (ViewGroup) null);
        this.t = inflate;
        this.w = (TextView) inflate.findViewById(R.id.engagement_title);
        this.t.findViewById(R.id.engagement_overflow_button).setOnClickListener(new klo(this, 1));
        this.u = this.t.findViewById(R.id.engagement_content);
        this.v = this.t.findViewById(R.id.engagement_header_background);
        this.x = (RecyclerView) this.t.findViewById(R.id.metadata_highlights);
        this.A = new frb(this.x, this.r.f);
        kln klnVar = this.p;
        RecyclerView recyclerView = this.x;
        ((Context) klnVar.a.get()).getClass();
        klh klhVar = (klh) klnVar.b.get();
        klhVar.getClass();
        klj kljVar = (klj) klnVar.c.get();
        kljVar.getClass();
        klj kljVar2 = (klj) klnVar.d.get();
        kljVar2.getClass();
        ajsg ajsgVar = (ajsg) klnVar.e.get();
        ajsgVar.getClass();
        azqb azqbVar = klnVar.f;
        axnm axnmVar = ((axoz) klnVar.g).get();
        axnmVar.getClass();
        aadd aaddVar = (aadd) klnVar.h.get();
        aaddVar.getClass();
        recyclerView.getClass();
        this.y = new klm(klhVar, kljVar, kljVar2, ajsgVar, azqbVar, axnmVar, aaddVar, recyclerView, null);
        klc klcVar = this.o;
        ViewGroup viewGroup = (ViewGroup) this.t.findViewById(R.id.action_bar);
        View findViewById = this.t.findViewById(R.id.action_bar_background);
        acti actiVar = (acti) klcVar.a.get();
        actiVar.getClass();
        kla klaVar = (kla) klcVar.b.get();
        klaVar.getClass();
        klf klfVar = (klf) klcVar.c.get();
        klfVar.getClass();
        mqg mqgVar = (mqg) klcVar.d.get();
        mqgVar.getClass();
        mpu mpuVar = (mpu) klcVar.e.get();
        mpuVar.getClass();
        viewGroup.getClass();
        findViewById.getClass();
        this.z = new klb(actiVar, klaVar, klfVar, mqgVar, mpuVar, viewGroup, findViewById);
        this.t.findViewById(R.id.engagement_close_button).setOnClickListener(new klo(this));
        yye yyeVar = new yye(this.t);
        this.B = yyeVar;
        yyeVar.d = 300L;
        yyeVar.e = 300L;
        yyeVar.h(new zas() { // from class: klq
            @Override // defpackage.zas
            public final void nH(int i, yye yyeVar2) {
                klt kltVar = klt.this;
                if (i == 2) {
                    arbm arbmVar = kltVar.e;
                    if (arbmVar != null) {
                        kltVar.a.u(new acte(arbmVar.d.I()), null);
                        kltVar.a.u(new acte(actj.FULLSCREEN_ENGAGEMENT_EXPLICIT_CLOSE_BUTTON), null);
                    }
                    i = 2;
                }
                kltVar.c(i, kltVar.f);
            }
        });
        this.B.b(false);
        if (this.e != null) {
            k();
        }
        d();
        this.g = true;
    }

    private final void k() {
        int i;
        arag aragVar;
        argj argjVar;
        arag aragVar2;
        boolean z = true;
        if (this.e != null) {
            this.a.D(new acte(actj.FULLSCREEN_ENGAGEMENT_EXPLICIT_CLOSE_BUTTON));
            TextView textView = this.w;
            arbm arbmVar = this.e;
            if ((arbmVar.b & 1) != 0) {
                aragVar2 = arbmVar.c;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView.setText(ajgl.b(aragVar2));
        }
        e();
        klb klbVar = this.z;
        arbm arbmVar2 = this.e;
        klbVar.c.removeAllViews();
        mqf mqfVar = klbVar.i;
        if (mqfVar != null) {
            mqfVar.b();
        }
        mqf mqfVar2 = klbVar.j;
        if (mqfVar2 != null) {
            mqfVar2.b();
        }
        mpt mptVar = klbVar.k;
        if (mptVar != null) {
            mptVar.b();
        }
        arbi b = klb.b(arbmVar2);
        if (b != null && b.b.size() != 0) {
            for (aunb aunbVar : b.b) {
                if (!aunbVar.qn(SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer)) {
                    if (aunbVar.qn(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer)) {
                        auxb auxbVar = (auxb) aunbVar.qm(SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer);
                        if (auxbVar.c) {
                            if (klbVar.i == null) {
                                klbVar.i = klbVar.a();
                            }
                            klbVar.i.k(auxbVar);
                            klbVar.c.addView(klbVar.i.c);
                        } else if (auxbVar.d) {
                            if (klbVar.j == null) {
                                klbVar.j = klbVar.a();
                            }
                            klbVar.j.k(auxbVar);
                            klbVar.c.addView(klbVar.j.c);
                        }
                    }
                    if (!aunbVar.qn(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer)) {
                        if (aunbVar.qn(SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer)) {
                            auwx auwxVar = (auwx) aunbVar.qm(SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer);
                            if (klbVar.k == null) {
                                mpu mpuVar = klbVar.g;
                                ViewGroup viewGroup = klbVar.c;
                                mqp mqpVar = klb.a;
                                aafo aafoVar = (aafo) mpuVar.a.get();
                                aafoVar.getClass();
                                ajxz ajxzVar = (ajxz) mpuVar.b.get();
                                ajxzVar.getClass();
                                Context context = (Context) mpuVar.c.get();
                                context.getClass();
                                yni yniVar = (yni) mpuVar.d.get();
                                yniVar.getClass();
                                aagi aagiVar = (aagi) mpuVar.e.get();
                                aagiVar.getClass();
                                aacz aaczVar = (aacz) mpuVar.f.get();
                                aaczVar.getClass();
                                ayor ayorVar = (ayor) mpuVar.g.get();
                                ayorVar.getClass();
                                yrj yrjVar = (yrj) mpuVar.h.get();
                                yrjVar.getClass();
                                SharedPreferences sharedPreferences = (SharedPreferences) mpuVar.i.get();
                                sharedPreferences.getClass();
                                klbVar.k = new mpt(aafoVar, ajxzVar, context, yniVar, aagiVar, aaczVar, ayorVar, yrjVar, sharedPreferences, viewGroup, R.layout.fullscreen_engagement_action_bar_button, mqpVar);
                            }
                            klbVar.k.n(auwxVar);
                            klbVar.c.addView(klbVar.k.c);
                        }
                    } else {
                        final arbj arbjVar = (arbj) aunbVar.qm(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer);
                        if (klbVar.h == null) {
                            klf klfVar = klbVar.f;
                            ViewGroup viewGroup2 = klbVar.c;
                            Context context2 = (Context) klfVar.a.get();
                            context2.getClass();
                            acti actiVar = (acti) klfVar.b.get();
                            actiVar.getClass();
                            aafo aafoVar2 = (aafo) klfVar.c.get();
                            aafoVar2.getClass();
                            ajxz ajxzVar2 = (ajxz) klfVar.d.get();
                            ajxzVar2.getClass();
                            akfb akfbVar = (akfb) klfVar.e.get();
                            akfbVar.getClass();
                            akbk akbkVar = (akbk) klfVar.f.get();
                            akbkVar.getClass();
                            klbVar.h = new kle(context2, actiVar, aafoVar2, ajxzVar2, akfbVar, akbkVar, viewGroup2);
                        }
                        final kle kleVar = klbVar.h;
                        if ((arbjVar.b & 1) != 0) {
                            aunb aunbVar2 = arbjVar.c;
                            if (aunbVar2 == null) {
                                aunbVar2 = aunb.a;
                            }
                            apoj apojVar = (apoj) ajjh.l(aunbVar2, ButtonRendererOuterClass.buttonRenderer);
                            if (apojVar != null) {
                                final HashMap hashMap = new HashMap();
                                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", kleVar);
                                kleVar.f.a(apojVar, kleVar.g, hashMap);
                                kleVar.c.setOnLongClickListener(new View.OnLongClickListener() { // from class: kld
                                    @Override // android.view.View.OnLongClickListener
                                    public final boolean onLongClick(View view) {
                                        kle kleVar2 = kle.this;
                                        arbj arbjVar2 = arbjVar;
                                        Map map = hashMap;
                                        if ((arbjVar2.b & 2) != 0) {
                                            aafo aafoVar3 = kleVar2.h;
                                            apzg apzgVar = arbjVar2.d;
                                            if (apzgVar == null) {
                                                apzgVar = apzg.a;
                                            }
                                            aafoVar3.c(apzgVar, map);
                                            return true;
                                        }
                                        return false;
                                    }
                                });
                                if ((apojVar.b & 32) != 0) {
                                    ajxz ajxzVar3 = kleVar.a;
                                    arhs arhsVar = apojVar.g;
                                    if (arhsVar == null) {
                                        arhsVar = arhs.a;
                                    }
                                    arhr b2 = arhr.b(arhsVar.c);
                                    if (b2 == null) {
                                        b2 = arhr.UNKNOWN;
                                    }
                                    i = ajxzVar3.a(b2);
                                } else {
                                    i = 0;
                                }
                                Drawable a = i == 0 ? null : akf.a(kleVar.b, i);
                                if (a == null) {
                                    kleVar.d.setImageResource(0);
                                } else {
                                    Drawable mutate = iy.l(a).mutate();
                                    mutate.setTint(kleVar.j);
                                    kleVar.d.setImageDrawable(mutate);
                                }
                                TextView textView2 = kleVar.e;
                                if ((apojVar.b & 256) != 0) {
                                    aragVar = apojVar.i;
                                    if (aragVar == null) {
                                        aragVar = arag.a;
                                    }
                                } else {
                                    aragVar = null;
                                }
                                textView2.setText(ajgl.b(aragVar));
                                argl arglVar = apojVar.m;
                                if (arglVar == null) {
                                    arglVar = argl.a;
                                }
                                if (arglVar.b == 102716411) {
                                    akfb akfbVar2 = kleVar.i;
                                    argl arglVar2 = apojVar.m;
                                    if (arglVar2 == null) {
                                        arglVar2 = argl.a;
                                    }
                                    if (arglVar2.b == 102716411) {
                                        argjVar = (argj) arglVar2.c;
                                    } else {
                                        argjVar = argj.a;
                                    }
                                    akfbVar2.b(argjVar, kleVar.c, apojVar, kleVar.g);
                                }
                            }
                        }
                        klbVar.c.addView(klbVar.h.c);
                    }
                } else {
                    kla klaVar = klbVar.e;
                    ViewGroup viewGroup3 = klbVar.c;
                    ajxz ajxzVar4 = (ajxz) klaVar.a.get();
                    ajxzVar4.getClass();
                    akfb akfbVar3 = (akfb) klaVar.b.get();
                    akfbVar3.getClass();
                    Context context3 = (Context) klaVar.c.get();
                    context3.getClass();
                    akbk akbkVar2 = (akbk) klaVar.d.get();
                    akbkVar2.getClass();
                    mff mffVar = new mff(ajxzVar4, akfbVar3, context3, akbkVar2, viewGroup3, R.layout.fullscreen_engagement_action_bar_button, R.attr.ytOverlayIconActiveOther);
                    mffVar.c((auwy) aunbVar.qm(SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer), klbVar.b, null);
                    klbVar.c.addView(mffVar.a);
                }
            }
        }
        if (klbVar.c.getChildCount() <= 0) {
            z = false;
        }
        zag.o(klbVar.c, z);
        zag.o(klbVar.d, z);
    }

    public final View a() {
        if (!this.g) {
            j();
        }
        return this.t;
    }

    public final void b(kls klsVar) {
        this.k.add(klsVar);
    }

    public final void c(int i, boolean z) {
        for (kls klsVar : this.k) {
            klsVar.e(i, z);
        }
    }

    public final void d() {
        this.u.setPadding(this.c.left, this.c.top, this.c.right, this.c.bottom);
        klm klmVar = this.y;
        Rect rect = this.c;
        if (!klmVar.c.equals(rect)) {
            klmVar.c.set(rect);
            klmVar.a.setPadding(klmVar.d + rect.left, 0, klmVar.e + rect.right, 0);
            klmVar.a.ab(0);
        }
        zgd.t(this.v, zgd.p(this.c.top), ViewGroup.MarginLayoutParams.class);
        f();
    }

    public final void e() {
        if (this.y == null) {
            return;
        }
        asxp asxpVar = this.s.a().e;
        if (asxpVar == null) {
            asxpVar = asxp.a;
        }
        boolean z = true;
        if (asxpVar.ag) {
            frb frbVar = this.A;
            if (!frbVar.b) {
                if (frbVar.c == null) {
                    frbVar.c = new fra(frbVar.a);
                }
                RecyclerView[] recyclerViewArr = frbVar.a;
                for (int i = 0; i < 2; i++) {
                    recyclerViewArr[i].aE(frbVar.c);
                }
                frbVar.b = true;
            }
        } else {
            frb frbVar2 = this.A;
            if (frbVar2.b) {
                RecyclerView[] recyclerViewArr2 = frbVar2.a;
                for (int i2 = 0; i2 < 2; i2++) {
                    recyclerViewArr2[i2].aG(frbVar2.c);
                }
                frbVar2.b = false;
            }
        }
        klm klmVar = this.y;
        arbm arbmVar = this.e;
        arbh arbhVar = this.i;
        asjj asjjVar = this.j;
        ViewGroup viewGroup = (ViewGroup) klmVar.a.findViewById(R.id.fullscreen_engagement_ad_container);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        klmVar.a.ab(0);
        klmVar.h = null;
        klmVar.b.clear();
        if (arbmVar != null && arbmVar.e.size() != 0) {
            for (aunb aunbVar : arbmVar.e) {
                if (aunbVar.qn(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer)) {
                    klmVar.b.add(aunbVar.qm(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer));
                } else if (!aunbVar.qn(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementAdSlotRenderer) || arbhVar == null) {
                    if (aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
                        aqtb aqtbVar = (aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer);
                        asxp asxpVar2 = klmVar.g.a().e;
                        if (asxpVar2 == null) {
                            asxpVar2 = asxp.a;
                        }
                        if (asxpVar2.as) {
                            ajsm ajsmVar = klmVar.b;
                            ajin ajinVar = (ajin) klmVar.f.get();
                            ajsmVar.add(ajhh.a(aqtbVar));
                        } else {
                            klmVar.b.add(aqtbVar);
                        }
                    }
                } else {
                    klmVar.b.add(arbhVar);
                    klmVar.h = asjjVar;
                }
            }
        }
        RecyclerView recyclerView = klmVar.a;
        if (klmVar.b.size() <= 0) {
            z = false;
        }
        zag.o(recyclerView, z);
        klmVar.b.l();
    }

    public final void f() {
        int i = this.c.top;
        int i2 = this.l;
        zgd.t(this.x, zgd.p(Math.min(this.n, Math.max(0, (this.h - ((i + i2) + this.m)) / 2)) + this.l + this.c.top), ViewGroup.MarginLayoutParams.class);
    }

    public final void g(arbm arbmVar) {
        if (!akzj.f(this.e, arbmVar)) {
            this.e = arbmVar;
            if (!this.g) {
                return;
            }
            k();
        }
    }

    public final void h(boolean z, boolean z2, boolean z3) {
        if (!this.g) {
            if (!z) {
                return;
            }
            j();
        }
        boolean z4 = this.f;
        this.f = z2;
        if (z == this.B.e() && z2 != z4) {
            c(this.B.c, z2);
        } else if (z) {
            this.B.c(z3);
        } else {
            this.B.b(z3);
        }
    }

    public final boolean i() {
        return this.g && this.B.c != 0;
    }
}
