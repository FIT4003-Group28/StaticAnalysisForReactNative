package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: noy  reason: default package */
/* loaded from: classes3.dex */
public final class noy extends nkg implements nma, abqf, abip, abhd, feg, frq, ezb, ezg {
    private abjb A;
    private nnu B;
    private ViewGroup C;
    private boolean D;
    private boolean E;
    private boolean F;
    public final feh d;
    public final ezd e;
    public final aadd f;
    public final azpm g;
    public aypg h;
    public CharSequence i;
    public boolean j;
    public boolean k;
    public boolean l;
    public aypg m;
    private final yni n;
    private final Context o;
    private final abjc p;
    private final abiq q;
    private final abja r;
    private final azqb s;
    private final ezh t;
    private final frr u;
    private final akge v;
    private final noi w;
    private String x;
    private assn y;
    private CharSequence z;

    public noy(yni yniVar, Context context, abjc abjcVar, abiq abiqVar, abja abjaVar, azqb azqbVar, feh fehVar, ezd ezdVar, ezh ezhVar, frr frrVar, aadd aaddVar, akge akgeVar, noj nojVar) {
        super(abiqVar.p, aaddVar);
        this.D = false;
        this.l = false;
        this.n = yniVar;
        this.o = context;
        this.p = abjcVar;
        this.q = abiqVar;
        this.r = abjaVar;
        this.s = azqbVar;
        this.d = fehVar;
        this.e = ezdVar;
        this.t = ezhVar;
        this.u = frrVar;
        this.f = aaddVar;
        this.v = akgeVar;
        this.w = nojVar.a(abiqVar.p);
        this.g = azpm.e();
    }

    private final void E(boolean z) {
        aopa createBuilder = ToggleConversationActionOuterClass$ToggleConversationAction.a.createBuilder();
        createBuilder.copyOnWrite();
        ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction = (ToggleConversationActionOuterClass$ToggleConversationAction) createBuilder.instance;
        toggleConversationActionOuterClass$ToggleConversationAction.b |= 2;
        toggleConversationActionOuterClass$ToggleConversationAction.c = z;
        this.n.d(abjv.a(ampq.j("tag"), (ToggleConversationActionOuterClass$ToggleConversationAction) createBuilder.mo39build()));
    }

    private final void F(ezw ezwVar) {
        if (ezwVar == null) {
            this.x = null;
        } else if (TextUtils.equals(this.x, ezwVar.c())) {
        } else {
            String c = ezwVar.c();
            this.g.c(c);
            this.x = c;
            if (!G()) {
                return;
            }
            this.u.b(c, this);
        }
    }

    private final boolean G() {
        asqt asqtVar = this.f.a().d;
        if (asqtVar == null) {
            asqtVar = asqt.a;
        }
        return asqtVar.c;
    }

    @Override // defpackage.nmc
    public final void A(apzg apzgVar) {
        this.w.e(apzgVar);
        this.e.d(this);
        this.t.i(this);
        pa(this.t.g());
        asqt asqtVar = this.f.a().d;
        if (asqtVar == null) {
            asqtVar = asqt.a;
        }
        if (asqtVar.f) {
            m();
        }
        this.E = false;
        this.v.f();
        D();
        this.q.p.u(new acte(this.y.j), null);
    }

    @Override // defpackage.abqf
    public final void B(assl asslVar) {
        if (asslVar == null || asslVar.b != 130028801) {
            return;
        }
        asqr asqrVar = (asqr) asslVar.c;
        nlx b = b();
        if (b == null) {
            return;
        }
        Spanned b2 = ajgl.b(asqrVar.b == 1 ? (arag) asqrVar.c : null);
        if (!TextUtils.isEmpty(b2)) {
            this.z = b2;
            i();
            b.f(null);
        } else if (asqrVar.b != 5) {
        } else {
            auxr auxrVar = (auxr) ((aunb) asqrVar.c).qm(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
            if (auxrVar.c.size() != 0) {
                Iterator it = auxrVar.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    auxq auxqVar = (auxq) it.next();
                    if (auxqVar.g) {
                        this.z = auxqVar.e;
                        i();
                        break;
                    }
                }
            }
            b.f(auxrVar);
        }
    }

    @Override // defpackage.nmc
    public final void C(nlz nlzVar) {
    }

    public final void D() {
        nlx b = b();
        if (b == null || this.E) {
            return;
        }
        boolean z = false;
        if (!this.j && !this.k) {
            z = true;
        }
        nnu nnuVar = (nnu) b;
        if (nnuVar.i == z) {
            return;
        }
        nnuVar.i = z;
        nmn nmnVar = nnuVar.j;
        if (nmnVar == null) {
            return;
        }
        nmnVar.a(z);
    }

    @Override // defpackage.nmc
    public final nlx b() {
        nnu nnuVar = this.B;
        if (nnuVar == null) {
            nnu nnuVar2 = (nnu) this.s.get();
            this.B = nnuVar2;
            nnuVar2.g(this);
            nnu nnuVar3 = this.B;
            nnuVar3.h = this.a;
            return nnuVar3;
        }
        return nnuVar;
    }

    @Override // defpackage.frq
    public final void d(String str, awbf awbfVar) {
        if (!TextUtils.equals(this.x, str) || (awbfVar.b & 4) == 0) {
            return;
        }
        arag aragVar = awbfVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        this.i = ajgl.b(aragVar);
        i();
    }

    @Override // defpackage.nma
    public final void e(ajfz ajfzVar) {
        this.q.d(ajfzVar);
    }

    @Override // defpackage.abhd
    public final void f() {
        throw null;
    }

    @Override // defpackage.ezb
    public final void h(ezw ezwVar) {
        F(ezwVar);
    }

    public final void i() {
        if (!TextUtils.isEmpty(this.z) || !TextUtils.isEmpty(this.i)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(this.z)) {
                spannableStringBuilder.append(this.z);
                if (!TextUtils.isEmpty(this.i)) {
                    spannableStringBuilder.append((char) 160);
                    spannableStringBuilder.append((char) 160);
                }
            }
            if (!TextUtils.isEmpty(this.i)) {
                Drawable drawable = this.o.getResources().getDrawable(2131230922);
                int dimensionPixelSize = this.o.getResources().getDimensionPixelSize(R.dimen.engagement_panel_header_icon_size);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.setTint(zhn.j(this.o, R.attr.ytIcon1).orElse(0));
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append(' ');
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append(this.i);
            }
            b().i(spannableStringBuilder);
            return;
        }
        b().i(null);
    }

    @Override // defpackage.feg
    public final void kF() {
        if (this.C == null) {
            return;
        }
        this.r.c();
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void m() {
        this.D = true;
        this.r.e(this.y);
        E(true);
    }

    @Override // defpackage.nmc
    public final void n() {
        this.D = false;
        this.r.c();
        E(false);
        this.e.h(this);
        this.t.j(this);
        this.q.p.q(new acte(this.y.j), null);
    }

    @Override // defpackage.feg
    public final void nr() {
        if (this.C == null || !this.D) {
            return;
        }
        this.r.e(this.y);
    }

    @Override // defpackage.nmc
    public final void o(apzg apzgVar) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.o).inflate(R.layout.live_chat_content, (ViewGroup) null, false);
        this.C = viewGroup;
        abjc abjcVar = this.p;
        acti actiVar = this.a;
        abrh abrhVar = (abrh) abjcVar.a.get();
        abpl abplVar = (abpl) abjcVar.b.get();
        abqe abqeVar = (abqe) abjcVar.c.get();
        abpy abpyVar = (abpy) abjcVar.d.get();
        abpyVar.getClass();
        abpx abpxVar = (abpx) abjcVar.f.get();
        abpxVar.getClass();
        viewGroup.getClass();
        actiVar.getClass();
        abjb abjbVar = new abjb(abplVar, abqeVar, abpyVar, (abqr) abjcVar.e.get(), abpxVar, viewGroup, actiVar);
        this.A = abjbVar;
        abja abjaVar = this.r;
        if (abjaVar.e != abjbVar) {
            abjaVar.e = abjbVar;
            ViewGroup viewGroup2 = abjaVar.e.d;
            abjaVar.f = new abqb(viewGroup2.getContext());
            abjaVar.f.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            abqb abqbVar = abjaVar.f;
            abqbVar.a = abjaVar;
            viewGroup2.addView(abqbVar);
            abjaVar.a();
        }
        this.A.b().y();
        this.q.x(this);
        abiq abiqVar = this.q;
        abiqVar.i = this;
        abiqVar.k.c = this;
        this.w.b();
    }

    @Override // defpackage.nmc
    public final View oX() {
        return this.C;
    }

    @Override // defpackage.nmc
    public final void oY(ajrt ajrtVar) {
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final void p(aqvq aqvqVar, asjj asjjVar) {
        ivj e;
        Spanned spanned;
        arag aragVar;
        arag aragVar2;
        super.p(aqvqVar, asjjVar);
        if (aqvqVar == null || (e = fyv.e(aqvqVar)) == null) {
            return;
        }
        this.w.g(this.b, this.c);
        F(this.e.a());
        this.y = e.b;
        nlx b = b();
        if (b == null) {
            return;
        }
        aqvs aqvsVar = e.a;
        if (aqvsVar == null || (aqvsVar.b & 1) == 0) {
            b.j(this.o.getString(R.string.live_chat_header_title));
        } else {
            arag aragVar3 = aqvsVar.c;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            b.j(ajgl.b(aragVar3));
        }
        auxr auxrVar = null;
        if (aqvsVar != null) {
            if ((aqvsVar.b & 16) != 0) {
                aragVar2 = aqvsVar.g;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            spanned = ajgl.b(aragVar2);
        } else {
            spanned = null;
        }
        this.z = spanned;
        if (aqvsVar != null && G()) {
            if ((aqvsVar.b & 4) != 0) {
                aragVar = aqvsVar.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            this.i = ajgl.b(aragVar);
        }
        i();
        if (aqvsVar != null && (aqvsVar.b & 8) != 0) {
            aqvt aqvtVar = aqvsVar.f;
            if (aqvtVar == null) {
                aqvtVar = aqvt.a;
            }
            if (aqvtVar.b == 76818770) {
                auxrVar = (auxr) aqvtVar.c;
            } else {
                auxrVar = auxr.a;
            }
        }
        b.f(auxrVar);
        ((nnu) b).n(e.a);
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        if (!this.l) {
            nlx b = b();
            boolean z = !ezxVar.b();
            nnu nnuVar = (nnu) b;
            ImageView imageView = nnuVar.c;
            if (imageView != null && nnuVar.e != null) {
                zag.o(imageView, z);
            }
        }
        asqt asqtVar = this.f.a().d;
        if (asqtVar == null) {
            asqtVar = asqt.a;
        }
        if (!asqtVar.i && this.y != null && !this.E) {
            if (!this.F && ezxVar.b()) {
                this.q.p.q(new acte(this.y.j), null);
            }
            if (this.F && !ezxVar.b()) {
                this.q.p.u(new acte(this.y.j), null);
            }
        }
        this.F = ezxVar.b();
        if (!ezxVar.h()) {
            this.r.c();
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    @Override // defpackage.nkg, defpackage.nmc
    public final boolean s() {
        return true;
    }

    @Override // defpackage.nmc
    public final void y() {
        this.q.q();
        this.d.b(this);
        aypg aypgVar = this.m;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
        aypg aypgVar2 = this.h;
        if (aypgVar2 != null) {
            ayqi.c((AtomicReference) aypgVar2);
        }
        this.w.c();
    }

    @Override // defpackage.nmc
    public final void z() {
        this.w.d();
        this.E = true;
    }
}
