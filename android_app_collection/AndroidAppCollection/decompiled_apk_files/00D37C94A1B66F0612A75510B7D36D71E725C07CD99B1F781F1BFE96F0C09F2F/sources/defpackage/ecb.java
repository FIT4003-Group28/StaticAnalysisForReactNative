package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.RequiredSignInRendererOuterClass;
import java.util.HashMap;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ecb  reason: default package */
/* loaded from: classes3.dex */
public final class ecb implements afzf {
    final /* synthetic */ ecc a;

    public ecb(ecc eccVar) {
        this.a = eccVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        if (!this.a.d.o()) {
            ecc eccVar = this.a;
            eccVar.e.aE(cffVar, eccVar.a.getApplicationContext().getString(R.string.offline_no_content_title_offline_eligible_and_no_content), new eca(this, 1));
            return;
        }
        ecc eccVar2 = this.a;
        eccVar2.e.aE(cffVar, eccVar2.a.getApplicationContext().getString(R.string.common_error_response), new eca(this));
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aase aaseVar = (aase) obj;
        aarw a = aaseVar.a();
        if (a == null) {
            List c = aaseVar.c();
            if (c.size() == 1) {
                a = (aarw) c.get(0);
            }
        }
        if (a != null) {
            this.a.b.i(a, null, null);
            return;
        }
        final eby ebyVar = this.a.e;
        if (ebyVar == null) {
            return;
        }
        if (aaseVar.b() == null) {
            ebyVar.ag.a();
            return;
        }
        ebyVar.s();
        ebyVar.ap = aaseVar;
        aunq b = ebyVar.ap.b();
        ebyVar.ao = b.h;
        ebyVar.an = new HashMap();
        ebyVar.an.put("AccountItemsForDirectSignIn", ebyVar.ap.c());
        if ((b.b & 1) != 0) {
            YouTubeTextView youTubeTextView = ebyVar.ai;
            arag aragVar = b.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            youTubeTextView.setText(ajgl.b(aragVar));
        }
        if ((b.b & 2) != 0) {
            YouTubeTextView youTubeTextView2 = ebyVar.aj;
            arag aragVar2 = b.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            youTubeTextView2.setText(ajgl.b(aragVar2));
            ebyVar.aj.setVisibility(0);
        } else {
            ebyVar.aj.setVisibility(8);
        }
        if ((b.b & 512) != 0) {
            aunb aunbVar = b.j;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apoj apojVar = (apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer);
            ebyVar.am.removeAllViews();
            ebyVar.r(apojVar, ebyVar.am, null, null, R.layout.learn_more_button);
        }
        if ((b.b & 32) != 0) {
            aunb aunbVar2 = b.g;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            ebyVar.al.removeAllViews();
            ebyVar.q((apoj) ajjh.l(aunbVar2, ButtonRendererOuterClass.buttonRenderer), ebyVar.al, acuo.b(76982));
        }
        if ((b.b & 16) != 0) {
            aunb aunbVar3 = b.f;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            aunp aunpVar = (aunp) ajjh.l(aunbVar3, RequiredSignInRendererOuterClass.expressSignInRenderer);
            ebyVar.ak.removeAllViews();
            final acte acteVar = new acte(acuo.b(76984));
            ebyVar.e.n(acteVar);
            vyu a2 = new vyt(ebyVar.a, ebyVar.d, ebyVar.e, new wfe() { // from class: ebu
                @Override // defpackage.wfe
                public final void a(aarw aarwVar) {
                    eby ebyVar2 = eby.this;
                    acum acumVar = acteVar;
                    ebyVar2.c.c(aarwVar.d(), ebyVar2.an);
                    ebyVar2.e.H(3, acumVar, null);
                }
            }, null, ebyVar.ae, ebyVar.ah).a();
            aunb aunbVar4 = aunpVar.b;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            aarw aarwVar = new aarw((aowy) ajjh.l(aunbVar4, AccountsListRenderer.accountItemRenderer));
            new ajrs();
            a2.d(aarwVar);
            final LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            zgd.u(a2.c, new azqb() { // from class: ebx
                @Override // defpackage.azqb
                public final Object get() {
                    return layoutParams;
                }
            }, zgd.b(zgd.s(layoutParams.width, layoutParams.height), zgd.m(0, 0, 0, zew.i(ebyVar.rh().getDisplayMetrics(), 8))), ViewGroup.MarginLayoutParams.class);
            ebyVar.ak.addView(a2.c);
            aunb aunbVar5 = aunpVar.c;
            if (aunbVar5 == null) {
                aunbVar5 = aunb.a;
            }
            ebyVar.q((apoj) ajjh.l(aunbVar5, ButtonRendererOuterClass.buttonRenderer), ebyVar.ak, acuo.b(76981));
        }
        if ((b.b & 8) != 0) {
            aunb aunbVar6 = b.e;
            if (aunbVar6 == null) {
                aunbVar6 = aunb.a;
            }
            ebyVar.ak.removeAllViews();
            ebyVar.q((apoj) ajjh.l(aunbVar6, ButtonRendererOuterClass.buttonRenderer), ebyVar.ak, acuo.b(76983));
        }
        if ((b.b & 256) == 0) {
            return;
        }
        aunb aunbVar7 = b.i;
        if (aunbVar7 == null) {
            aunbVar7 = aunb.a;
        }
        ebyVar.r((apoj) ajjh.l(aunbVar7, ButtonRendererOuterClass.buttonRenderer), ebyVar.ak, acuo.b(76985), new akbi() { // from class: ebv
            @Override // defpackage.akbi
            public final void oL(aopc aopcVar) {
                eby.this.ag.a();
            }
        }, R.layout.skip_button);
    }
}
