package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.PictureDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: asiz  reason: default package */
/* loaded from: classes2.dex */
public final class asiz extends ex {
    public static final cjtd ad = cjtd.a(dtxw.ag);
    public static final cjtd ae = cjtd.a(dtxw.ah);
    public static final cjtd af = cjtd.a(dtxw.ai);
    public static final cjtd ag = cjtd.a(dtxw.af);
    public cjqy ah;
    public cjqq ai;
    public cpv aj;
    public boolean ak = true;
    public boolean al = false;
    public cjql am;
    public cjql an;
    public cjql ao;
    public cjql ap;
    public asji aq;
    private cjqp ar;

    public final void aJ() {
        this.ak = false;
    }

    public final void aK(@dzsi cjql cjqlVar, cjtd cjtdVar) {
        if (cjqlVar != null) {
            this.ah.n(cjqlVar, new cjte(deaf.TAP), cjtdVar);
        }
    }

    @Override // defpackage.fd
    public final void ak() {
        super.ak();
        if (this.al) {
            f();
            asji asjiVar = this.aq;
            dbsk.s(asjiVar);
            asjiVar.a.q();
        }
    }

    @Override // defpackage.fd
    public final void al() {
        super.al();
        aJ();
    }

    @Override // defpackage.fd
    public final void am() {
        super.am();
        cjqp cjqpVar = this.ar;
        if (cjqpVar != null) {
            this.ai.l(cjqpVar);
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        ((asiy) btsr.a(asiy.class)).sv(this);
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aJ();
        aK(this.ap, ag);
        asji asjiVar = this.aq;
        dbsk.s(asjiVar);
        asjiVar.a();
    }

    @Override // defpackage.ex
    public final Dialog q(@dzsi Bundle bundle) {
        if (!this.aj.d(H())) {
            new Handler().postDelayed(new Runnable(this) { // from class: asip
                private final asiz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    asiz asizVar = this.a;
                    if (!asizVar.ak) {
                        return;
                    }
                    asizVar.f();
                    asji asjiVar = asizVar.aq;
                    dbsk.s(asjiVar);
                    asjiVar.a();
                }
            }, 10000L);
        }
        cjkp B = cjkr.B();
        cjke cjkeVar = (cjke) B;
        cjkeVar.a = cqrp.d(560.0d);
        PictureDrawable a = dxer.a(Rn(), R.raw.navigation_assistant_driving_mode_opt_in_dialog_assistant_icon).a();
        cjkeVar.d = new cjkn(new Object[]{a}, a);
        B.t(Rn().getString(R.string.NAVIGATION_ASSISTANT_DRIVING_MODE_OPT_IN_DIALOG_TITLE));
        cjkeVar.e = Rn().getString(R.string.NAVIGATION_ASSISTANT_DRIVING_MODE_OPT_IN_DIALOG_TEXT);
        cjkeVar.f = cqgr.fT(new asiv(), new asix(this));
        B.z(Rn().getString(R.string.NAVIGATION_ASSISTANT_DRIVING_MODE_OPT_IN_DIALOG_OPT_IN), new View.OnClickListener(this) { // from class: asiq
            private final asiz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                asiz asizVar = this.a;
                asizVar.aJ();
                asizVar.aK(asizVar.an, asiz.ae);
                asizVar.f();
                asji asjiVar = asizVar.aq;
                dbsk.s(asjiVar);
                deha.q(deha.h(asjiVar.a.d.a().e(1), 5L, TimeUnit.SECONDS, asjiVar.a.e), new asjh(asjiVar), asjiVar.a.e);
            }
        }, null);
        B.y(Rn().getString(R.string.NAVIGATION_ASSISTANT_DRIVING_MODE_OPT_IN_DIALOG_OPT_OUT), new View.OnClickListener(this) { // from class: asir
            private final asiz a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                asiz asizVar = this.a;
                asizVar.aJ();
                asizVar.aK(asizVar.ao, asiz.af);
                asizVar.f();
                asji asjiVar = asizVar.aq;
                dbsk.s(asjiVar);
                asjiVar.a.d.a().e(2);
                asjiVar.a.q();
            }
        }, null);
        cjkeVar.g = new DialogInterface.OnCancelListener(this) { // from class: asis
            private final asiz a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                asiz asizVar = this.a;
                asizVar.f();
                asizVar.aK(asizVar.ap, asiz.ag);
                asji asjiVar = asizVar.aq;
                dbsk.s(asjiVar);
                asjiVar.a();
            }
        };
        return B.u(J()).q();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void s() {
        super.s();
        cjqp j = this.ai.j(new cjsz(dtxw.ae));
        this.ar = j;
        this.am = j.d(ad);
        this.an = this.ar.d(ae);
        this.ao = this.ar.d(af);
        this.ap = this.ar.d(ag);
    }
}
