package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: nnu  reason: default package */
/* loaded from: classes3.dex */
public final class nnu implements nlx {
    private View A;
    private ImageView B;
    private TextView C;
    private TextView D;
    private View E;
    private TextView F;
    private CharSequence H;
    private CharSequence I;

    /* renamed from: J  reason: collision with root package name */
    private arhm f233J;
    private atfh K;
    private CharSequence L;
    private auxr M;
    private atep N;
    private xnm O;
    private Integer P;
    private ImageView Q;
    private avhn R;
    private apzg S;
    private View T;
    private ViewStub U;
    private yfj V;
    private fta W;
    private aypg X;
    public final aafo a;
    public ImageView b;
    public ImageView c;
    public apoj d;
    public apoj e;
    public nly f;
    public nma g;
    public acti h;
    public nmn j;
    private final Context k;
    private final ajyi l;
    private final ajhl m;
    private final axnm n;
    private final ajrh o;
    private final ajyc p;
    private final ajxz q;
    private final ajmy r;
    private final akfb s;
    private final xyf t;
    private final yfk u;
    private final ftb v;
    private final yni w;
    private final akfw x;
    private final nng y;
    private final nsj z;
    private Optional G = Optional.empty();
    public boolean i = true;

    public nnu(Context context, ajyi ajyiVar, ajhl ajhlVar, axnm axnmVar, ajrh ajrhVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar, ajmy ajmyVar, akfb akfbVar, acti actiVar, xyf xyfVar, yfk yfkVar, ftb ftbVar, yni yniVar, akfw akfwVar, nng nngVar, nsj nsjVar) {
        this.k = context;
        this.l = ajyiVar;
        this.m = ajhlVar;
        this.n = axnmVar;
        this.o = ajrhVar;
        this.a = aafoVar;
        this.p = ajycVar;
        this.q = ajxzVar;
        this.r = ajmyVar;
        this.s = akfbVar;
        this.h = actiVar;
        this.t = xyfVar;
        this.u = yfkVar;
        this.v = ftbVar;
        this.w = yniVar;
        this.x = akfwVar;
        this.y = nngVar;
        this.z = nsjVar;
    }

    private final void s(ImageView imageView, final apoj apojVar) {
        aovr aovrVar;
        if (apojVar != null) {
            zag.o(imageView, true);
            aovs aovsVar = apojVar.s;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            if ((aovsVar.b & 1) != 0) {
                aovs aovsVar2 = apojVar.s;
                if (aovsVar2 == null) {
                    aovsVar2 = aovs.a;
                }
                aovrVar = aovsVar2.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
            } else {
                aovrVar = apojVar.r;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
            }
            if (aovrVar != null && (aovrVar.b & 2) != 0) {
                imageView.setContentDescription(aovrVar.c);
            }
            imageView.setOnClickListener(new View.OnClickListener() { // from class: nnp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    apzg apzgVar;
                    nnu nnuVar = nnu.this;
                    apoj apojVar2 = apojVar;
                    apzg apzgVar2 = null;
                    if ((apojVar2.b & 16384) != 0) {
                        apzgVar = apojVar2.o;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                    } else {
                        apzgVar = null;
                    }
                    if (apzgVar == null) {
                        if ((apojVar2.b & 8192) != 0) {
                            apzgVar = apojVar2.n;
                            if (apzgVar == null) {
                                apzgVar = apzg.a;
                            }
                        } else {
                            apzgVar = null;
                        }
                    }
                    if (apzgVar != null) {
                        apzgVar2 = apzgVar;
                    } else if ((apojVar2.b & 32768) != 0 && (apzgVar2 = apojVar2.p) == null) {
                        apzgVar2 = apzg.a;
                    }
                    if (apzgVar2 != null) {
                        nnuVar.a.a(apzgVar2);
                    }
                }
            });
            arhs arhsVar = apojVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            if ((1 & arhsVar.b) == 0) {
                return;
            }
            ajxz ajxzVar = this.q;
            arhs arhsVar2 = apojVar.g;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            arhr b = arhr.b(arhsVar2.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            imageView.setImageResource(ajxzVar.a(b));
            return;
        }
        zag.o(imageView, false);
    }

    private final void t(aqvs aqvsVar) {
        arhm arhmVar = null;
        if (aqvsVar != null) {
            aunb aunbVar = aqvsVar.h;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(IconBadgeRendererOuterClass.iconBadgeRenderer)) {
                aunb aunbVar2 = aqvsVar.h;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                arhmVar = (arhm) aunbVar2.qm(IconBadgeRendererOuterClass.iconBadgeRenderer);
            }
        }
        this.f233J = arhmVar;
    }

    private final void u(avhn avhnVar, final apzg apzgVar) {
        this.R = avhnVar;
        this.S = apzgVar;
        ImageView imageView = this.Q;
        if (imageView != null) {
            if (avhnVar != null) {
                ImageView imageView2 = (ImageView) this.A.findViewById(R.id.thumbnail);
                this.Q = imageView2;
                imageView2.setVisibility(0);
                this.r.h(this.Q, avhnVar);
                if (apzgVar == null) {
                    return;
                }
                this.Q.setOnClickListener(new View.OnClickListener() { // from class: nnq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        nnu nnuVar = nnu.this;
                        nnuVar.a.a(apzgVar);
                    }
                });
                return;
            }
            imageView.setVisibility(8);
            this.r.e(this.Q);
        }
    }

    private final void v(aqvs aqvsVar) {
        atfh atfhVar = null;
        if (aqvsVar != null) {
            aunb aunbVar = aqvsVar.i;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
                aunb aunbVar2 = aqvsVar.i;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                atfhVar = (atfh) aunbVar2.qm(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
            }
        }
        this.K = atfhVar;
    }

    private final void w() {
        if (this.B == null) {
            return;
        }
        if (this.G.isPresent()) {
            s(this.B, (apoj) this.G.get());
            zag.o(this.B, true);
            return;
        }
        this.B.setOnClickListener(new View.OnClickListener() { // from class: nno
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nnu nnuVar = nnu.this;
                acti actiVar = nnuVar.h;
                if (actiVar != null) {
                    actiVar.H(3, new acte(actj.ENGAGEMENT_PANEL_BACK_BUTTON), null);
                }
                nly nlyVar = nnuVar.f;
                if (nlyVar != null) {
                    nlyVar.a();
                }
            }
        });
        ImageView imageView = this.B;
        int i = 8;
        if (this.y.f() && this.f != null) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    private final void x(apoj apojVar) {
        if (apojVar == null || (apojVar.b & 2048) == 0) {
            return;
        }
        this.x.g(apojVar.k);
    }

    private final void y() {
        String charSequence;
        String str;
        CharSequence charSequence2 = this.H;
        if (charSequence2 == null || charSequence2.toString().isEmpty()) {
            CharSequence charSequence3 = this.L;
            charSequence = charSequence3 != null ? charSequence3.toString() : null;
        } else {
            String valueOf = String.valueOf(this.H);
            CharSequence charSequence4 = this.I;
            String str2 = "";
            if (charSequence4 != null) {
                String valueOf2 = String.valueOf(charSequence4);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb.append(". ");
                sb.append(valueOf2);
                str = sb.toString();
            } else {
                str = str2;
            }
            CharSequence charSequence5 = this.L;
            if (charSequence5 != null) {
                String valueOf3 = String.valueOf(charSequence5);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 2);
                sb2.append(". ");
                sb2.append(valueOf3);
                str2 = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str).length() + String.valueOf(str2).length());
            sb3.append(valueOf);
            sb3.append(str);
            sb3.append(str2);
            charSequence = sb3.toString();
        }
        View view = this.A;
        if (view != null) {
            view.setContentDescription(charSequence);
        }
    }

    private static final void z(aypg aypgVar) {
        if (aypgVar == null || aypgVar.e()) {
            return;
        }
        azof.f((AtomicReference) aypgVar);
    }

    @Override // defpackage.nlx
    public final View a() {
        return this.T;
    }

    @Override // defpackage.nlx
    public final View b() {
        int i = 0;
        if (this.A == null) {
            View inflate = LayoutInflater.from(this.k).inflate(R.layout.engagement_panel_title_header, (ViewGroup) null, false);
            this.A = inflate;
            this.Q = (ImageView) inflate.findViewById(R.id.thumbnail);
            this.C = (TextView) this.A.findViewById(R.id.title);
            this.D = (TextView) this.A.findViewById(R.id.subtitle);
            this.b = (ImageView) this.A.findViewById(R.id.information_button);
            this.c = (ImageView) this.A.findViewById(R.id.action_button);
            this.E = this.A.findViewById(R.id.overflow_menu_anchor);
            this.F = (TextView) this.A.findViewById(R.id.contextual_info);
            this.B = (ImageView) this.A.findViewById(R.id.back_button);
            xnm xnmVar = new xnm(this.k, this.l, this.o, this.A.findViewById(R.id.sort_menu_anchor), this.s, this.h, this.t, this.w);
            this.O = xnmVar;
            if (this.g != null) {
                xnmVar.e = new xnl() { // from class: nns
                    @Override // defpackage.xnl
                    public final void a(ajfz ajfzVar) {
                        nnu.this.g.e(ajfzVar);
                    }
                };
            }
            ViewStub viewStub = (ViewStub) this.A.findViewById(R.id.title_badge);
            this.U = viewStub;
            this.W = this.v.b(this.k, viewStub);
        }
        u(this.R, this.S);
        w();
        this.C.setText(this.H);
        this.C.setVisibility(this.H == null ? 8 : 0);
        this.D.setText(this.I);
        TextView textView = this.D;
        if (this.I == null) {
            i = 8;
        }
        textView.setVisibility(i);
        atfh atfhVar = this.K;
        if (atfhVar != null) {
            if (this.W == null) {
                this.W = this.v.b(this.k, this.U);
            }
            if ((atfhVar.b & 64) != 0) {
                ViewStub viewStub2 = this.U;
                aovr aovrVar = atfhVar.g;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                viewStub2.setContentDescription(aovrVar.c);
            }
            this.W.f(atfhVar);
        }
        s(this.b, this.d);
        s(this.c, this.e);
        arhm arhmVar = this.f233J;
        if (arhmVar == null) {
            yfj yfjVar = this.V;
            if (yfjVar != null) {
                yfjVar.g();
            }
        } else {
            if (this.V == null) {
                ViewStub viewStub3 = (ViewStub) this.A.findViewById(R.id.icon_badge);
                this.V = this.u.a(viewStub3);
                if ((arhmVar.b & 64) != 0) {
                    aovr aovrVar2 = arhmVar.i;
                    if (aovrVar2 == null) {
                        aovrVar2 = aovr.a;
                    }
                    viewStub3.setContentDescription(aovrVar2.c);
                }
            }
            ajrs ajrsVar = new ajrs();
            ajrsVar.a(this.h);
            this.V.oK(ajrsVar, arhmVar);
        }
        o(this.L);
        xnm xnmVar2 = this.O;
        if (xnmVar2 != null) {
            xnmVar2.a(this.M);
        }
        if (this.E != null) {
            q(this.N);
        }
        Integer num = this.P;
        if (num != null) {
            int intValue = num.intValue();
            this.P = Integer.valueOf(intValue);
            TextView textView2 = this.F;
            if (textView2 != null) {
                zgd.t(textView2, zgd.l(intValue), ViewGroup.MarginLayoutParams.class);
            }
        }
        return this.A;
    }

    @Override // defpackage.nlx
    public final void c() {
        z(this.X);
        x(this.d);
        x(this.e);
    }

    @Override // defpackage.nlx
    public final void d() {
        ImageView imageView = this.B;
        if (imageView != null && imageView.getVisibility() == 0) {
            this.h.n(new acte(actj.ENGAGEMENT_PANEL_BACK_BUTTON));
        }
        z(this.X);
        this.X = this.z.j.u(kth.u).Z(new ayqb() { // from class: nnt
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nnu nnuVar = nnu.this;
                nsr nsrVar = (nsr) obj;
                nnuVar.m(nnuVar.b, nnuVar.d);
                nnuVar.m(nnuVar.c, nnuVar.e);
            }
        });
    }

    @Override // defpackage.nlx
    public final void e(boolean z) {
        zag.o(this.B, z);
    }

    @Override // defpackage.nlx
    public final void f(auxr auxrVar) {
        this.M = auxrVar;
        xnm xnmVar = this.O;
        if (xnmVar != null) {
            xnmVar.a(auxrVar);
        }
    }

    @Override // defpackage.nlx
    public final void g(final nma nmaVar) {
        if (this.g == nmaVar) {
            return;
        }
        this.g = nmaVar;
        xnm xnmVar = this.O;
        if (xnmVar == null) {
            return;
        }
        xnmVar.e = new xnl() { // from class: nnr
            @Override // defpackage.xnl
            public final void a(ajfz ajfzVar) {
                nma.this.e(ajfzVar);
            }
        };
    }

    @Override // defpackage.nlx
    public final void h(nly nlyVar) {
        this.f = nlyVar;
    }

    @Override // defpackage.nlx
    public final void i(CharSequence charSequence) {
        this.I = charSequence;
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
            this.D.setVisibility(charSequence != null ? 0 : 8);
            y();
        }
    }

    @Override // defpackage.nlx
    public final void j(CharSequence charSequence) {
        this.H = charSequence;
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
            this.C.setVisibility(charSequence != null ? 0 : 8);
            y();
        }
    }

    @Override // defpackage.nlx
    public final boolean k() {
        return this.i;
    }

    @Override // defpackage.nlx
    public final void l(nmn nmnVar) {
        if (this.j == nmnVar) {
            return;
        }
        this.j = nmnVar;
    }

    public final void m(ImageView imageView, apoj apojVar) {
        if (imageView == null || apojVar == null || (apojVar.b & 2048) == 0) {
            return;
        }
        this.x.d(apojVar.k, imageView);
    }

    public final void n(aqvs aqvsVar) {
        apoj apojVar;
        aunb aunbVar = aqvsVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = aqvsVar.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        this.e = apojVar;
    }

    public final void o(CharSequence charSequence) {
        this.L = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
        y();
    }

    public final void p(aqvs aqvsVar) {
        avhn avhnVar;
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        apoj apojVar = null;
        if (aqvsVar == null) {
            j(null);
            r(null);
            v(null);
            o(null);
            f(null);
            q(null);
            t(null);
            this.d = null;
            this.G = Optional.empty();
            w();
            return;
        }
        if ((aqvsVar.b & 1024) != 0) {
            avhnVar = aqvsVar.j;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        if ((aqvsVar.b & 4096) != 0) {
            apzgVar = aqvsVar.k;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        u(avhnVar, apzgVar);
        if ((aqvsVar.b & 1) != 0) {
            aragVar = aqvsVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        j(ajgl.b(aragVar));
        if ((aqvsVar.b & 16) != 0) {
            aragVar2 = aqvsVar.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        i(ajgl.b(aragVar2));
        aunb aunbVar = aqvsVar.l;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        r(aunbVar);
        v(aqvsVar);
        if ((aqvsVar.b & 4) != 0) {
            aragVar3 = aqvsVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        o(ajgl.b(aragVar3));
        if ((aqvsVar.b & 8) != 0) {
            aqvt aqvtVar = aqvsVar.f;
            if (aqvtVar == null) {
                aqvtVar = aqvt.a;
            }
            f(aqvtVar.b == 76818770 ? (auxr) aqvtVar.c : null);
            q(aqvtVar.b == 66439850 ? (atep) aqvtVar.c : null);
        } else {
            f(null);
            q(null);
        }
        aunb aunbVar2 = aqvsVar.d;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        if (aunbVar2.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar3 = aqvsVar.d;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            apojVar = (apoj) aunbVar3.qm(ButtonRendererOuterClass.buttonRenderer);
        }
        this.d = apojVar;
        n(aqvsVar);
        t(aqvsVar);
        if ((aqvsVar.b & 524288) != 0) {
            aunb aunbVar4 = aqvsVar.m;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            this.G = Optional.of((apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer));
        } else {
            this.G = Optional.empty();
        }
        w();
    }

    public final void q(atep atepVar) {
        String str;
        this.N = atepVar;
        View view = this.E;
        if (view != null) {
            zag.o(view, atepVar != null);
            this.p.d(this.E, atepVar, atepVar, this.h);
            if (atepVar == null) {
                return;
            }
            aovs aovsVar = atepVar.i;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            if ((aovsVar.b & 1) != 0) {
                aovs aovsVar2 = atepVar.i;
                if (aovsVar2 == null) {
                    aovsVar2 = aovs.a;
                }
                aovr aovrVar = aovsVar2.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                str = aovrVar.c;
            } else {
                str = null;
            }
            this.E.setContentDescription(str);
        }
    }

    public final void r(aunb aunbVar) {
        View view;
        if (aunbVar == null || !aunbVar.qn(ElementRendererOuterClass.elementRenderer)) {
            view = null;
        } else {
            ajin ajinVar = (ajin) this.n.get();
            ajhh a = ajhh.a((aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer));
            this.m.oK(new ajrs(), a);
            view = this.m.a();
        }
        this.T = view;
    }
}
