package defpackage;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveFullscreenConfirmRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acli  reason: default package */
/* loaded from: classes.dex */
public final class acli implements abzi {
    final /* synthetic */ int a;
    final /* synthetic */ acll b;

    public acli(acll acllVar, int i) {
        this.b = acllVar;
        this.a = i;
    }

    @Override // defpackage.abzi
    public final void c(arsp arspVar) {
        aunb aunbVar;
        if (!achk.b(this.b)) {
            return;
        }
        this.b.al.a(2);
        acll acllVar = this.b;
        String str = acllVar.am;
        atgl atglVar = null;
        if (str != null) {
            abzb abzbVar = acllVar.aN;
            abyz abyzVar = new abyz(abzbVar.e, abzbVar.a.c(), str);
            abyzVar.i();
            ylx.n(acllVar, abzbVar.g.b(abyzVar, abzbVar.b), aclb.b, new acla(acllVar, 3));
            acllVar.am = null;
        }
        acll acllVar2 = this.b;
        arsm arsmVar = arspVar.e;
        if (arsmVar == null) {
            arsmVar = arsm.a;
        }
        atgp atgpVar = arsmVar.b;
        if (atgpVar == null) {
            atgpVar = atgp.a;
        }
        atgq atgqVar = atgpVar.c;
        if (atgqVar == null) {
            atgqVar = atgq.a;
        }
        atha athaVar = atgqVar.c;
        if (athaVar == null) {
            athaVar = atha.a;
        }
        acllVar2.ar = athaVar;
        arsm arsmVar2 = arspVar.e;
        if (arsmVar2 == null) {
            arsmVar2 = arsm.a;
        }
        atgp atgpVar2 = arsmVar2.b;
        if (atgpVar2 == null) {
            atgpVar2 = atgp.a;
        }
        atgo atgoVar = atgpVar2.d;
        if (atgoVar == null) {
            atgoVar = atgo.a;
        }
        aclk aclkVar = this.b.aB;
        if ((atgoVar.b & 1) != 0 && (atglVar = atgoVar.c) == null) {
            atglVar = atgl.a;
        }
        aclkVar.I(atglVar);
        this.b.aI();
        aopa mo52toBuilder = this.b.ar.mo52toBuilder();
        acll acllVar3 = this.b;
        acllVar3.aO(acllVar3.O, mo52toBuilder);
        this.b.ar = (atha) mo52toBuilder.mo39build();
        this.b.aJ();
        int i = arspVar.b;
        if (i == 5) {
            acll acllVar4 = this.b;
            aqft aqftVar = ((arsn) arspVar.c).b;
            if (aqftVar == null) {
                aqftVar = aqft.a;
            }
            aqftVar.getClass();
            acllVar4.aB.ac(aqftVar);
        } else if (i != 6) {
            if (i != 10 || !((aunb) arspVar.c).qn(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer)) {
                acll acllVar5 = this.b;
                if (!acllVar5.aL() && acllVar5.ag.mo589getText().length() == 0) {
                    acllVar5.ag.requestFocus();
                    ((InputMethodManager) acllVar5.mJ().getSystemService("input_method")).showSoftInput(acllVar5.ag, 1);
                }
                aunb aunbVar2 = this.b.ar.n;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                avvh avvhVar = (avvh) ajjh.l(aunbVar2, UpsellDialogRendererOuterClass.upsellDialogRenderer);
                if (avvhVar == null) {
                    return;
                }
                Context rb = this.b.rb();
                acll acllVar6 = this.b;
                abhy abhyVar = acllVar6.aO;
                ajmr b = acllVar6.aw.b();
                acll acllVar7 = this.b;
                new abob(avvhVar, rb, abhyVar, b, acllVar7.av, acllVar7.aP).a();
                return;
            }
            acll acllVar8 = this.b;
            if (arspVar.b == 10) {
                aunbVar = (aunb) arspVar.c;
            } else {
                aunbVar = aunb.a;
            }
            asug asugVar = (asug) aunbVar.qm(LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer);
            asugVar.getClass();
            acllVar8.aB.aa(asugVar);
        } else {
            acll acllVar9 = this.b;
            atwq atwqVar = ((arsk) arspVar.c).b;
            if (atwqVar == null) {
                atwqVar = atwq.a;
            }
            atwqVar.getClass();
            acllVar9.aB.Y(atwqVar);
        }
    }

    @Override // defpackage.abzi
    public final void d(int i, aqft aqftVar, asug asugVar) {
        if (!achk.b(this.b)) {
            return;
        }
        if (i == 4) {
            Toast.makeText(this.b.mJ(), (int) R.string.lc_error_state_account_not_enabled, 1).show();
            this.b.aB.V();
        } else if (i != 22) {
            if (i == 27) {
                this.b.aB.X();
            } else {
                this.b.au.postDelayed(new aclh(this), 400L);
            }
        } else {
            acll acllVar = this.b;
            if (aqftVar == null && asugVar == null) {
                return;
            }
            acllVar.aB.ak();
            if (aqftVar != null) {
                acllVar.aP.n(new acte(aqftVar.n));
                ajgx.c(acllVar.mJ(), aqftVar, acllVar.av, acllVar.aP, new aclj(acllVar), null);
                return;
            }
            if ((asugVar.b & 1) != 0) {
                aunb aunbVar = asugVar.c;
                if (aunbVar == null) {
                    aunbVar = aunb.a;
                }
                if (aunbVar.qn(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                    acti actiVar = acllVar.aP;
                    aunb aunbVar2 = asugVar.c;
                    if (aunbVar2 == null) {
                        aunbVar2 = aunb.a;
                    }
                    actiVar.n(new acte(((aqft) aunbVar2.qm(ConfirmDialogRendererOuterClass.confirmDialogRenderer)).n));
                }
            }
            acllVar.aB.B(asugVar);
        }
    }
}
