package com.google.android.apps.youtube.app.player.autonav;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AutoplaySwitchButtonRendererOuterClass;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AutonavToggleController extends fqe implements ahit, f {
    public final acti d;
    public final aafo e;
    public final Handler f;
    public SwitchCompat h;
    private final jxn j;
    private final airw k;
    private final ajxz m;
    private final int n;
    private final ColorStateList o;
    private aiga p;
    public boolean i = true;
    public final Runnable g = new Runnable() { // from class: jwt
        @Override // java.lang.Runnable
        public final void run() {
            apzg apzgVar;
            AutonavToggleController autonavToggleController = AutonavToggleController.this;
            apjl apjlVar = (apjl) autonavToggleController.b;
            if (apjlVar == null) {
                return;
            }
            aafo aafoVar = autonavToggleController.e;
            if (autonavToggleController.h.isChecked()) {
                apzgVar = apjlVar.d;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            } else {
                apzgVar = apjlVar.e;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            aafoVar.a(apzgVar);
        }
    };
    private final aypf l = new aypf();

    public AutonavToggleController(Context context, acti actiVar, ajxz ajxzVar, aafo aafoVar, airw airwVar, jxn jxnVar, Handler handler) {
        this.d = actiVar;
        this.k = airwVar;
        this.m = ajxzVar;
        this.e = aafoVar;
        this.j = jxnVar;
        this.f = handler;
        this.n = context.getResources().getDimensionPixelSize(R.dimen.autonav_toggle_tap_bloom_size);
        this.o = zhn.f(context, R.attr.ytOverlayButtonPrimary);
    }

    @Override // defpackage.fqe
    protected final void i() {
        SwitchCompat switchCompat = (SwitchCompat) g().findViewById(R.id.autonav_toggle_button);
        this.h = switchCompat;
        switchCompat.a = this.o;
        switchCompat.b = true;
        switchCompat.a();
        this.h.setChecked(this.j.g());
        this.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: jwr
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                AutonavToggleController autonavToggleController = AutonavToggleController.this;
                autonavToggleController.q();
                apjl apjlVar = (apjl) autonavToggleController.b;
                if (apjlVar == null) {
                    return;
                }
                autonavToggleController.n();
                if (!autonavToggleController.i) {
                    return;
                }
                autonavToggleController.d.H(3, new acte(apjlVar.j), null);
                autonavToggleController.f.removeCallbacks(autonavToggleController.g);
                autonavToggleController.f.postDelayed(autonavToggleController.g, 300L);
                autonavToggleController.s(apjlVar);
            }
        });
        this.j.d(this);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.fqe, defpackage.fqu
    public final void l(boolean z, boolean z2) {
        SwitchCompat switchCompat;
        boolean o = o();
        super.l(z, z2);
        if (z && (switchCompat = this.h) != null) {
            switchCompat.setChecked(this.j.g());
        }
        apjl apjlVar = (apjl) this.b;
        if (o || !o() || apjlVar == null) {
            if (o()) {
                return;
            }
            q();
            return;
        }
        this.d.u(new acte(apjlVar.j), null);
        fgl fglVar = (fgl) this.j.b.c();
        int i = 1;
        if ((fglVar.b & 1) != 0) {
            i = fglVar.c;
        }
        if (i <= 0) {
            return;
        }
        if (this.p == null) {
            this.p = new aiga((TapBloomView) g().findViewById(R.id.autonav_tap_bloom_view), 1000, 4);
        }
        aiga aigaVar = this.p;
        int i2 = this.n / 2;
        aigaVar.b(i2, i2);
        s(apjlVar);
        ylx.m(this.j.b.b(new fgn(i - 1, 3)), jou.k);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.j.f(this);
    }

    @Override // defpackage.fqe
    public final void n() {
        arhr b;
        String str;
        apjl apjlVar = (apjl) this.b;
        if (apjlVar == null) {
            return;
        }
        ajxz ajxzVar = this.m;
        if (this.h.isChecked()) {
            arhs arhsVar = apjlVar.b;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
        } else {
            arhs arhsVar2 = apjlVar.c;
            if (arhsVar2 == null) {
                arhsVar2 = arhs.a;
            }
            b = arhr.b(arhsVar2.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
        }
        int a = ajxzVar.a(b);
        if (a != 0) {
            SwitchCompat switchCompat = this.h;
            switchCompat.e(po.b(switchCompat.getContext(), a));
        } else {
            this.h.e(null);
        }
        SwitchCompat switchCompat2 = this.h;
        if (switchCompat2.isChecked()) {
            aovs aovsVar = apjlVar.h;
            if (aovsVar == null) {
                aovsVar = aovs.a;
            }
            aovr aovrVar = aovsVar.c;
            if (aovrVar == null) {
                aovrVar = aovr.a;
            }
            str = aovrVar.c;
        } else {
            aovs aovsVar2 = apjlVar.i;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar2 = aovsVar2.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            str = aovrVar2.c;
        }
        switchCompat2.setContentDescription(str);
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        this.l.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        this.l.c();
        this.l.d(this.k.ao().I().G(aypa.a()).aa(new ayqb() { // from class: jws
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                AutonavToggleController autonavToggleController = AutonavToggleController.this;
                WatchNextResponseModel a = ((ahhm) obj).a();
                apjl apjlVar = null;
                aube aubeVar = a == null ? null : a.i;
                if (aubeVar != null && (aubeVar.b & 32768) != 0) {
                    aunb aunbVar = aubeVar.j;
                    if (aunbVar == null) {
                        aunbVar = aunb.a;
                    }
                    if (aunbVar.qn(AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer)) {
                        aunb aunbVar2 = aubeVar.j;
                        if (aunbVar2 == null) {
                            aunbVar2 = aunb.a;
                        }
                        apjlVar = (apjl) aunbVar2.qm(AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer);
                    }
                }
                autonavToggleController.k(apjlVar);
            }
        }, jww.b));
    }

    @Override // defpackage.fqe
    protected final void p() {
    }

    public final void q() {
        ValueAnimator valueAnimator;
        aiga aigaVar = this.p;
        if (aigaVar == null || (valueAnimator = aigaVar.b) == null) {
            return;
        }
        valueAnimator.cancel();
    }

    @Override // defpackage.ahit
    public final void r(boolean z) {
        this.i = false;
        this.h.setChecked(this.j.g());
        this.i = true;
    }

    public final void s(apjl apjlVar) {
        apzg apzgVar;
        aafo aafoVar = this.e;
        if (this.h.isChecked()) {
            apzgVar = apjlVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = apjlVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        }
        aafoVar.a(apzgVar);
    }
}
