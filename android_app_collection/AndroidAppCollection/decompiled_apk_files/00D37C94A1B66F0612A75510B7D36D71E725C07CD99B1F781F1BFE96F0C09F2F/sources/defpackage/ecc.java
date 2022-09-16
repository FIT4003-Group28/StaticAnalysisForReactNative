package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsController;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ecc  reason: default package */
/* loaded from: classes3.dex */
public final class ecc implements ecd, ynl {
    public final dt a;
    public final wge b;
    public final HatsController c;
    public final yrj d;
    eby e;
    private final afvn f;
    private final aasc g;
    private final whp h;
    private final yni i;
    private final abdm j;
    private final axwo k;
    private final Executor l;
    private Object m;
    private final gcc n;

    public ecc(afvn afvnVar, dt dtVar, aasc aascVar, whp whpVar, wge wgeVar, yni yniVar, abdm abdmVar, HatsController hatsController, Executor executor, gcc gccVar, yrj yrjVar, axwo axwoVar) {
        this.l = executor;
        this.c = hatsController;
        this.j = abdmVar;
        this.f = afvnVar;
        this.a = dtVar;
        this.h = whpVar;
        this.g = aascVar;
        this.b = wgeVar;
        this.i = yniVar;
        this.n = gccVar;
        this.d = yrjVar;
        this.k = axwoVar;
    }

    private final void g() {
        this.i.d(new wgh(wgg.CANCELLED, true));
    }

    private final void h(boolean z) {
        View findViewById = this.a.findViewById(R.id.accessibility_layer_container);
        if (findViewById instanceof AccessibilityLayerLayout) {
            AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) findViewById;
            accessibilityLayerLayout.c(z);
            accessibilityLayerLayout.b(z);
        }
    }

    @Override // defpackage.ecd
    public final void a() {
        b();
        g();
    }

    public final void b() {
        h(true);
        if (this.a.getSupportFragmentManager().f("require_signin_fragment") == null) {
            return;
        }
        Object obj = this.m;
        if (obj != null) {
            this.n.d(obj);
            this.m = null;
        }
        eby ebyVar = (eby) this.a.getSupportFragmentManager().f("require_signin_fragment");
        this.e = ebyVar;
        if (ebyVar == null) {
            return;
        }
        ex l = this.a.getSupportFragmentManager().l();
        l.m(this.e);
        if (((Boolean) this.k.a().y(false).aE().e(0).aw()).booleanValue()) {
            l.d();
        } else {
            l.a();
        }
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.interstitials_container);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.setVisibility(8);
        }
        if (this.e.ao) {
            abdl a = this.j.a();
            a.i();
            aopa createBuilder = asdu.a.createBuilder();
            aopa createBuilder2 = asdl.a.createBuilder();
            createBuilder2.copyOnWrite();
            asdl asdlVar = (asdl) createBuilder2.instance;
            asdlVar.b |= 1;
            asdlVar.c = true;
            asdl asdlVar2 = (asdl) createBuilder2.mo39build();
            createBuilder.copyOnWrite();
            asdu asduVar = (asdu) createBuilder.instance;
            asdlVar2.getClass();
            asduVar.c = asdlVar2;
            asduVar.b = 6;
            a.a = (asdu) createBuilder.mo39build();
            ylx.k(this.j.b(a), this.l, dzl.f, new ylw() { // from class: ebz
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj2) {
                    aunb aunbVar;
                    ecc eccVar = ecc.this;
                    asdw asdwVar = (asdw) obj2;
                    if ((asdwVar.b & 2) != 0) {
                        aunbVar = asdwVar.d;
                        if (aunbVar == null) {
                            aunbVar = aunb.a;
                        }
                    } else {
                        aunbVar = null;
                    }
                    avdv avdvVar = (avdv) ajjh.l(aunbVar, SurveyRenderer.surveyTriggerRenderer);
                    if (avdvVar == null || (avdvVar.b & 16) == 0) {
                        return;
                    }
                    HatsController hatsController = eccVar.c;
                    avdu avduVar = avdvVar.c;
                    if (avduVar == null) {
                        avduVar = avdu.a;
                    }
                    hatsController.k(avduVar);
                }
            });
        }
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r5 = this;
            r0 = 0
            whp r1 = r5.h     // Catch: java.lang.Exception -> L10
            android.accounts.Account[] r1 = r1.h()     // Catch: java.lang.Exception -> L10
            if (r1 == 0) goto L19
            int r2 = r1.length     // Catch: java.lang.Exception -> L10
            if (r2 <= 0) goto L19
            r2 = 0
            r1 = r1[r2]     // Catch: java.lang.Exception -> L10
            goto L1a
        L10:
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "Get exception when fetching device account."
            defpackage.zep.c(r1, r2)
        L19:
            r1 = r0
        L1a:
            eby r2 = r5.e
            r2.aF()
            ecb r2 = new ecb
            r2.<init>(r5)
            r3 = 9
            if (r1 == 0) goto L36
            aasc r0 = r5.g
            java.lang.String r4 = r1.name
            com.google.android.libraries.youtube.account.identity.AccountIdentity r4 = com.google.android.libraries.youtube.account.identity.AccountIdentity.t(r4)
            java.lang.String r1 = r1.name
            r0.a(r4, r2, r1, r3)
            return
        L36:
            aasc r1 = r5.g
            afvm r4 = defpackage.afvl.a
            r1.a(r4, r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecc.c():void");
    }

    @Override // defpackage.ecd
    public final void e() {
        this.i.g(this);
        afvm c = this.f.c();
        if (c.g()) {
            g();
        } else if (!c.z()) {
        } else {
            if (this.m == null) {
                this.m = this.n.c(1);
            }
            if (this.a.getSupportFragmentManager().f("require_signin_fragment") == null) {
                this.e = new eby();
                ex l = this.a.getSupportFragmentManager().l();
                l.q(R.id.interstitials_container, this.e, "require_signin_fragment");
                if (((Boolean) this.k.a().y(false).aE().e(0).aw()).booleanValue()) {
                    l.d();
                } else {
                    l.a();
                }
            } else {
                this.e = (eby) this.a.getSupportFragmentManager().f("require_signin_fragment");
            }
            h(false);
            ViewGroup viewGroup = (ViewGroup) this.a.findViewById(R.id.interstitials_container);
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            c();
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                b();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwb.class};
    }
}
