package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: mxl  reason: default package */
/* loaded from: classes3.dex */
public final class mxl {
    private final nck a;
    private final mvo b;
    private final View c;
    private acti d;
    private apoj e;
    private atng f;

    public mxl(nck nckVar, mvo mvoVar, View view) {
        nckVar.getClass();
        this.a = nckVar;
        mvoVar.getClass();
        this.b = mvoVar;
        view.getClass();
        this.c = view;
    }

    private final void d() {
        apoj apojVar;
        apzg apzgVar;
        this.c.setVisibility(8);
        View view = this.b.d;
        if (view != null) {
            view.setVisibility(0);
        }
        atng atngVar = this.f;
        if (atngVar != null) {
            mvo mvoVar = this.b;
            acti actiVar = this.d;
            actiVar.getClass();
            if (mvoVar.d == null) {
                mvoVar.d = mvoVar.b.inflate();
                mvoVar.e = (TextView) mvoVar.d.findViewById(R.id.notification_text);
                mvoVar.f = (TextView) mvoVar.d.findViewById(R.id.undo_button);
                mvoVar.g = (TextView) mvoVar.d.findViewById(R.id.ad_settings_button);
                mvoVar.f.setOnClickListener(new mvm(mvoVar, 1));
                mvoVar.g.setOnClickListener(new mvm(mvoVar));
            }
            apzg apzgVar2 = null;
            actiVar.u(new acte(atngVar.g), null);
            aunb aunbVar = atngVar.d;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            apoj apojVar2 = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
            if ((atngVar.b & 4) != 0) {
                aunb aunbVar2 = atngVar.e;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apojVar = null;
            }
            if (apojVar2 == null || (apojVar2.b & 8192) == 0) {
                apzgVar = null;
            } else {
                apzgVar = apojVar2.n;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            mvoVar.h = apzgVar;
            if (apojVar != null && (apojVar.b & 16384) != 0 && (apzgVar2 = apojVar.o) == null) {
                apzgVar2 = apzg.a;
            }
            mvoVar.i = apzgVar2;
            arag aragVar = atngVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            Spanned b = ajgl.b(aragVar);
            Spanned a = mvo.a(apojVar2);
            Spanned a2 = mvo.a(apojVar);
            zag.m(mvoVar.e, b);
            zag.m(mvoVar.f, a);
            zag.m(mvoVar.g, a2);
        }
    }

    private final void e() {
        this.c.setVisibility(0);
        View view = this.b.d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void a() {
        if (this.e == null || this.a.L() || this.f == null) {
            return;
        }
        apoj apojVar = this.e;
        if ((apojVar.b & 8192) != 0) {
            nck nckVar = this.a;
            apzg apzgVar = apojVar.n;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            nckVar.g(apzgVar);
        }
        this.a.K(true);
        d();
        nck nckVar2 = this.a;
        long j = this.f.f;
        Object obj = nckVar2.b;
        if (obj == null || j < 0) {
            return;
        }
        nckVar2.t = new nci(nckVar2.m, obj);
        nckVar2.l.postDelayed(nckVar2.t, j);
    }

    public final void b() {
        this.a.K(false);
        e();
        nck nckVar = this.a;
        nci nciVar = nckVar.t;
        if (nciVar != null) {
            nciVar.a = true;
            nckVar.t = null;
        }
    }

    public final void c(acti actiVar, apoj apojVar, atng atngVar) {
        actiVar.getClass();
        this.d = actiVar;
        this.e = apojVar;
        this.f = atngVar;
        if (!this.a.L() || atngVar == null) {
            e();
        } else {
            d();
        }
    }
}
