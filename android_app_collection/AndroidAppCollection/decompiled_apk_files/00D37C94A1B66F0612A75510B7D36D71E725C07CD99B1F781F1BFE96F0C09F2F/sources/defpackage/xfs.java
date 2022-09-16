package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownTextView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xfs  reason: default package */
/* loaded from: classes4.dex */
public final class xfs implements xhr {
    private final xfg a;
    private final SkipAdButton b;

    public xfs(xfg xfgVar, SkipAdButton skipAdButton) {
        this.a = xfgVar;
        skipAdButton.getClass();
        this.b = skipAdButton;
        j(3, false);
    }

    @Override // defpackage.xhr
    public final void b() {
    }

    @Override // defpackage.xhr
    public final void c(int i) {
        AdCountdownView adCountdownView = this.a.a;
        if (adCountdownView.e || adCountdownView.h != xdb.POST_ROLL) {
            return;
        }
        adCountdownView.c.d(R.string.ad_will_end_in_multiline, i);
    }

    @Override // defpackage.xhr
    public final void d(int i) {
        AdCountdownView adCountdownView = this.a.a;
        if (!adCountdownView.e) {
            return;
        }
        adCountdownView.c.d(R.string.skip_ad_in_multiline, i);
    }

    @Override // defpackage.xhr
    public final void f(xdb xdbVar) {
        AdCountdownView adCountdownView = this.a.a;
        xdb xdbVar2 = xdb.POST_ROLL;
        boolean z = false;
        boolean z2 = xdbVar != xdbVar2;
        if (xdbVar == xdbVar2) {
            z = true;
        }
        xhw xhwVar = adCountdownView.b;
        xhwVar.e = z;
        xhwVar.a();
        adCountdownView.f = z2;
        if (!adCountdownView.e && xdbVar == xdb.POST_ROLL) {
            xhn xhnVar = adCountdownView.c;
            AdCountdownTextView adCountdownTextView = xhnVar.c;
            adCountdownTextView.setPadding(16, adCountdownTextView.getPaddingTop(), 16, xhnVar.c.getPaddingBottom());
        }
        adCountdownView.h = xdbVar;
    }

    @Override // defpackage.xhr
    public final void g(float f, int i) {
        AdCountdownView adCountdownView = this.a.a;
        Resources resources = adCountdownView.getResources();
        int i2 = adCountdownView.l;
        int i3 = adCountdownView.k;
        float f2 = i * resources.getDisplayMetrics().density;
        adCountdownView.d.getLayoutParams().width = (int) (i2 * f);
        int i4 = (int) (f * i3);
        adCountdownView.d.getLayoutParams().height = i4;
        aopc aopcVar = (aopc) apaq.a.createBuilder();
        aopcVar.copyOnWrite();
        apaq.a((apaq) aopcVar.instance);
        aopcVar.copyOnWrite();
        apaq.e((apaq) aopcVar.instance);
        apaq apaqVar = (apaq) aopcVar.mo39build();
        xhn xhnVar = adCountdownView.c;
        ajgo e = ajgo.e(6);
        if (e != null) {
            xhnVar.c.setTypeface(e.d(xhnVar.a, 0), 0);
        }
        xhnVar.d.b(apaqVar);
        xhnVar.d.a();
        xhn xhnVar2 = adCountdownView.c;
        int i5 = (int) f2;
        xhnVar2.b.getLayoutParams().width = 0;
        xhnVar2.c.getLayoutParams().height = i4;
        xhnVar2.b.getLayoutParams().height = i4;
        AdCountdownTextView adCountdownTextView = xhnVar2.c;
        adCountdownTextView.setPadding(i5, adCountdownTextView.getPaddingTop(), i5, xhnVar2.c.getPaddingBottom());
    }

    @Override // defpackage.xhr
    public final void k(float f) {
        xhn xhnVar = this.a.a.c;
        xhnVar.d.c(xhu.a(f, xhnVar.h, xhnVar.i));
        xhnVar.e.setColor(xhu.a(f, xhnVar.f, xhnVar.g));
        xhnVar.d.a();
        SkipAdButton skipAdButton = this.b;
        skipAdButton.k.setColor(xhu.a(f, skipAdButton.i, skipAdButton.j));
        skipAdButton.b.c(xhu.a(f, skipAdButton.g, skipAdButton.h));
        skipAdButton.a.a();
        skipAdButton.b.a();
        SkipAdButton.a(skipAdButton.e.getDrawable(), f);
    }

    @Override // defpackage.xhr
    public final void l(xho xhoVar, boolean z, int i) {
        if (!z) {
            AdCountdownView adCountdownView = this.a.a;
            aalc aalcVar = xhoVar.b;
            if (aalcVar == null) {
                return;
            }
            xhw xhwVar = adCountdownView.b;
            xhwVar.a = aalcVar;
            xhwVar.a();
            return;
        }
        xfg xfgVar = this.a;
        aalc aalcVar2 = xhoVar.b;
        AdCountdownView adCountdownView2 = xfgVar.a;
        aopc aopcVar = (aopc) apaq.a.createBuilder();
        aopcVar.copyOnWrite();
        apaq.a((apaq) aopcVar.instance);
        aopa createBuilder = apas.a.createBuilder();
        aopa createBuilder2 = apar.a.createBuilder();
        if (i == 0) {
            i = 6;
        }
        createBuilder2.copyOnWrite();
        apar aparVar = (apar) createBuilder2.instance;
        aparVar.c = i - 1;
        aparVar.b |= 1;
        apar aparVar2 = (apar) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        apas apasVar = (apas) createBuilder.instance;
        aparVar2.getClass();
        apasVar.c = aparVar2;
        apasVar.b |= 1;
        aopcVar.copyOnWrite();
        apaq apaqVar = (apaq) aopcVar.instance;
        apas apasVar2 = (apas) createBuilder.mo39build();
        apasVar2.getClass();
        apaqVar.d = apasVar2;
        apaqVar.b |= 2;
        aopcVar.copyOnWrite();
        apaq.e((apaq) aopcVar.instance);
        aopa createBuilder3 = aoyu.a.createBuilder();
        if (aalcVar2.e() != null) {
            avhn e = aalcVar2.e();
            createBuilder3.copyOnWrite();
            aoyu aoyuVar = (aoyu) createBuilder3.instance;
            e.getClass();
            aoyuVar.c = e;
            aoyuVar.b |= 1;
        }
        aopcVar.copyOnWrite();
        apaq apaqVar2 = (apaq) aopcVar.instance;
        aoyu aoyuVar2 = (aoyu) createBuilder3.mo39build();
        aoyuVar2.getClass();
        apaqVar2.f = aoyuVar2;
        apaqVar2.b |= 32;
        aopa createBuilder4 = aoyu.a.createBuilder();
        aopa createBuilder5 = aoyv.a.createBuilder();
        aopa createBuilder6 = aoyj.a.createBuilder();
        createBuilder6.copyOnWrite();
        aoyj aoyjVar = (aoyj) createBuilder6.instance;
        aoyjVar.b |= 4;
        aoyjVar.e = true;
        aoyj aoyjVar2 = (aoyj) createBuilder6.mo39build();
        createBuilder5.copyOnWrite();
        aoyv aoyvVar = (aoyv) createBuilder5.instance;
        aoyjVar2.getClass();
        aoyvVar.c = aoyjVar2;
        aoyvVar.b |= 1;
        createBuilder4.copyOnWrite();
        aoyu aoyuVar3 = (aoyu) createBuilder4.instance;
        aoyv aoyvVar2 = (aoyv) createBuilder5.mo39build();
        aoyvVar2.getClass();
        aoyuVar3.d = aoyvVar2;
        aoyuVar3.b |= 2;
        adCountdownView2.c.c((apaq) aopcVar.mo39build());
        adCountdownView2.b.c((aoyu) createBuilder4.mo39build());
        adCountdownView2.b.a();
    }

    @Override // defpackage.xhr
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        SkipAdButton skipAdButton = this.b;
        zgd.t(skipAdButton, zgd.e((!z4 || !z3 || !z2 || !z) ? skipAdButton.m : skipAdButton.n), ViewGroup.MarginLayoutParams.class);
        AdCountdownView adCountdownView = this.a.a;
        zgd.t(adCountdownView, zgd.e((!z4 || !z3 || !z2 || !z) ? adCountdownView.i : adCountdownView.j), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.xhr
    public final void e(wzr wzrVar) {
        int i = wzrVar.c;
        boolean z = false;
        if (i > 1 && wzrVar.b < i) {
            z = true;
        }
        SkipAdButton skipAdButton = this.b;
        skipAdButton.f.setText(z ? skipAdButton.d : skipAdButton.c);
        AdCountdownView adCountdownView = this.a.a;
        adCountdownView.g = z;
        adCountdownView.b(adCountdownView.e);
    }

    @Override // defpackage.xhr
    public final void h(aozw aozwVar) {
        apaq apaqVar;
        aoyu aoyuVar;
        AdCountdownView adCountdownView = this.a.a;
        aoyj aoyjVar = null;
        if (aozwVar == null) {
            apaqVar = null;
        } else if ((aozwVar.b & 4) != 0) {
            aozv aozvVar = aozwVar.d;
            if (aozvVar == null) {
                aozvVar = aozv.a;
            }
            apaqVar = aozvVar.b;
            if (apaqVar == null) {
                apaqVar = apaq.a;
            }
        } else {
            apaqVar = aozwVar.f;
            if (apaqVar == null) {
                apaqVar = apaq.a;
            }
        }
        xhw xhwVar = adCountdownView.b;
        if (aozwVar == null) {
            aoyuVar = null;
        } else {
            aoyuVar = aozwVar.e;
            if (aoyuVar == null) {
                aoyuVar = aoyu.a;
            }
        }
        xhwVar.c(aoyuVar);
        xhx xhxVar = adCountdownView.a;
        if (aozwVar != null && (aozwVar.b & 1) != 0) {
            aozx aozxVar = aozwVar.c;
            if (aozxVar == null) {
                aozxVar = aozx.a;
            }
            aoyjVar = aozxVar.b;
            if (aoyjVar == null) {
                aoyjVar = aoyj.a;
            }
        }
        xhxVar.d = aoyjVar;
        adCountdownView.c.c(apaqVar);
        adCountdownView.a.a();
        adCountdownView.b.a();
    }

    @Override // defpackage.xhr
    public final void i(auwp auwpVar) {
        apaq apaqVar;
        SkipAdButton skipAdButton = this.b;
        xhv xhvVar = skipAdButton.b;
        aoyj aoyjVar = null;
        if (auwpVar == null) {
            apaqVar = null;
        } else {
            apaqVar = auwpVar.d;
            if (apaqVar == null) {
                apaqVar = apaq.a;
            }
        }
        xhvVar.b(apaqVar);
        xhx xhxVar = skipAdButton.a;
        if (auwpVar != null && (auwpVar.b & 1) != 0) {
            auwq auwqVar = auwpVar.c;
            if (auwqVar == null) {
                auwqVar = auwq.a;
            }
            aoyjVar = auwqVar.b;
            if (aoyjVar == null) {
                aoyjVar = aoyj.a;
            }
        }
        xhxVar.d = aoyjVar;
        skipAdButton.b.a();
        skipAdButton.a.a();
        if (auwpVar == null || (auwpVar.b & 16) == 0) {
            return;
        }
        avkt avktVar = auwpVar.f;
        if (avktVar == null) {
            avktVar = avkt.a;
        }
        skipAdButton.l = avktVar;
    }

    @Override // defpackage.xhr
    public final void j(int i, boolean z) {
        if (z) {
            if (i != 3) {
                this.b.setVisibility(8);
                this.a.c(8);
                return;
            }
        } else if (i == 0) {
            if (this.b.c()) {
                this.b.setVisibility(0);
                SkipAdButton skipAdButton = this.b;
                if (skipAdButton.c()) {
                    avkt avktVar = skipAdButton.l;
                    AlphaAnimation alphaAnimation = new AlphaAnimation(avktVar.f, avktVar.g);
                    alphaAnimation.setStartOffset(skipAdButton.l.c);
                    alphaAnimation.setFillAfter(skipAdButton.l.h);
                    alphaAnimation.setDuration(skipAdButton.l.b);
                    skipAdButton.startAnimation(alphaAnimation);
                }
            } else {
                this.b.setVisibility(8);
            }
            this.a.c(0);
            this.a.b(true);
            return;
        } else if (i == 1) {
            this.b.setVisibility(0);
            this.a.c(8);
            return;
        } else if (i == 2) {
            this.b.setVisibility(8);
            this.a.b(false);
            this.a.c(0);
            return;
        } else if (i != 3) {
            return;
        }
        this.b.setVisibility(8);
        this.a.c(8);
        this.a.a();
    }
}
