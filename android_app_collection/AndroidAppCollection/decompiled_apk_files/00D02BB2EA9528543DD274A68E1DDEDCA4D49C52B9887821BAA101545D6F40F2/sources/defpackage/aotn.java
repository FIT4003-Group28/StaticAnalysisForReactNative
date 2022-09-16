package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aotn  reason: default package */
/* loaded from: classes2.dex */
public final class aotn extends gen {
    public aotp a;
    cjkr b;

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        aotp aotpVar = this.a;
        Runnable runnable = new Runnable(this) { // from class: aotk
            private final aotn a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT();
            }
        };
        Activity activity = (Activity) ((dxjd) aotpVar.a).a;
        aotp.a(activity, 1);
        bsvm a = aotpVar.b.a();
        aotp.a(a, 2);
        ache a2 = aotpVar.c.a();
        aotp.a(a2, 3);
        aotp.a(runnable, 4);
        final aoto aotoVar = new aoto(activity, a, a2, runnable);
        gga ggaVar = this.aE;
        cjkp B = cjkr.B();
        B.t(ggaVar.getString(R.string.INFO_DIALOG_TITLE));
        B.y(ggaVar.getString(R.string.TIMELINE_LEARN_MORE), new View.OnClickListener(aotoVar) { // from class: aotl
            private final aoto a;

            {
                this.a = aotoVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f();
            }
        }, cjtd.a(dtyc.af));
        B.z(ggaVar.getString(R.string.OK), new View.OnClickListener(this) { // from class: aotm
            private final aotn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.aT();
            }
        }, cjtd.a(dtyc.ag));
        cjke cjkeVar = (cjke) B;
        cjkeVar.f = cqgr.fT(new aosk(), aotoVar);
        cjkeVar.a = ibn.l();
        cjkr u = B.u(ggaVar);
        this.b = u;
        return u.q();
    }
}
