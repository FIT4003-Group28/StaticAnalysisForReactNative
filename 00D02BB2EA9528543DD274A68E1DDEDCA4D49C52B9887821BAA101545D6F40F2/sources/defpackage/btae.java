package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btae  reason: default package */
/* loaded from: classes4.dex */
public final class btae extends gen {
    public btan a;
    public btam b;
    cjkr c;

    @Override // defpackage.ges
    protected final void Nv() {
        ((btaf) btsx.b(btaf.class, this)).dj(this);
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gga ggaVar = this.aE;
        btan btanVar = this.a;
        Runnable runnable = new Runnable(this) { // from class: btaa
            private final btae a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.aT();
            }
        };
        Runnable runnable2 = new Runnable(this) { // from class: btab
            private final btae a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                gga ggaVar2 = this.a.aE;
                if (ggaVar2 != null) {
                    ggaVar2.C(new btem(), gfu.ACTIVITY_FRAGMENT, new gfs[0]);
                }
            }
        };
        gce a = btanVar.a.a();
        btan.a(a, 1);
        gcr a2 = btanVar.b.a();
        btan.a(a2, 2);
        btan.a(runnable, 3);
        btan.a(runnable2, 4);
        this.b = new btam(a, a2, runnable, runnable2);
        cjkp B = cjkr.B();
        B.t(ggaVar.getResources().getString(R.string.DARK_MODE_SETTINGS_DIALOG_TITLE));
        B.z(ggaVar.getResources().getString(R.string.DARK_MODE_SETTINGS_DIALOG_SAVE), new View.OnClickListener(this) { // from class: btac
            private final btae a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                btae btaeVar = this.a;
                btam btamVar = btaeVar.b;
                if (btamVar != null) {
                    btamVar.d();
                }
                btaeVar.aT();
            }
        }, cjtd.a(dtxn.h));
        B.y(ggaVar.getResources().getString(R.string.DARK_MODE_SETTINGS_DIALOG_CANCEL), new View.OnClickListener(this) { // from class: btad
            private final btae a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.aT();
            }
        }, cjtd.a(dtxn.a));
        cjke cjkeVar = (cjke) B;
        cjkeVar.f = cqgr.fT(new btaj(), this.b);
        cjkeVar.a = ibn.l();
        cjkr u = B.u(ggaVar);
        this.c = u;
        return u.q();
    }
}
