package com.google.android.apps.youtube.app.common.inappupdate;

import android.app.Activity;
import android.content.IntentSender;
import android.view.View;
import com.google.android.apps.youtube.app.common.inappupdate.DefaultInAppUpdateController;
import com.google.android.play.core.install.InstallState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DefaultInAppUpdateController implements eys, alrt, f {
    public final alqy a;
    public final eyq b;
    private final Activity c;
    private final akfg d;
    private int e;
    private volatile boolean f;
    private volatile boolean g;

    public DefaultInAppUpdateController(Activity activity, akfg akfgVar, alqy alqyVar, eyq eyqVar) {
        this.c = activity;
        this.d = akfgVar;
        this.a = alqyVar;
        this.b = eyqVar;
    }

    private final void k() {
        if (this.g) {
            return;
        }
        this.g = true;
        akfg akfgVar = this.d;
        fvg fvgVar = (fvg) akfgVar.l();
        fvgVar.k(this.c.getString(R.string.in_app_update_downloaded_message));
        fvgVar.m(this.c.getString(R.string.in_app_update_restart_button), new View.OnClickListener() { // from class: eyn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultInAppUpdateController defaultInAppUpdateController = DefaultInAppUpdateController.this;
                defaultInAppUpdateController.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_USER_COMPLETE_UPDATE);
                defaultInAppUpdateController.a.d();
            }
        });
        akfgVar.n(fvgVar.b());
    }

    @Override // defpackage.eys
    public final void g(int i, int i2) {
        if (i == 2400) {
            if (i2 == -1) {
                this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_OK);
            } else if (i2 == 0) {
                this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_CANCELED);
            } else if (i2 != 1) {
            } else {
                this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_ACTIVITY_RESULT_FAILED);
            }
        }
    }

    public final void h(alqw alqwVar) {
        if (alqwVar.a == 2 && alqwVar.a(alrd.a(this.e)) != null) {
            this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_AVAILABLE);
            try {
                this.a.e(alqwVar, this.e, this.c);
                this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_OK);
            } catch (IntentSender.SendIntentException unused) {
                this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_SHOW_DIALOG_FAILED);
            }
        } else if (alqwVar.b == 11) {
            this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADED);
            k();
        } else if (alqwVar.a != 1) {
        } else {
            this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_GET_INFO_UPDATE_NOT_AVAILABLE);
        }
    }

    @Override // defpackage.alrx
    public final /* bridge */ /* synthetic */ void i(Object obj) {
        InstallState installState = (InstallState) obj;
        if (installState.b() == 2) {
            this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADING);
            if (this.f) {
                return;
            }
            this.f = true;
            akfg akfgVar = this.d;
            fvg fvgVar = (fvg) akfgVar.l();
            fvgVar.k(this.c.getString(R.string.in_app_update_downloading_message));
            fvgVar.i(0);
            akfgVar.n(fvgVar.b());
        } else if (installState.b() == 11) {
            this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_DOWNLOADED);
            k();
        } else if (installState.b() == 6) {
            this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_CANCELED);
        } else if (installState.b() != 5) {
        } else {
            this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_INSTALL_STATUS_FAILED);
        }
    }

    @Override // defpackage.eys
    public final void j(arim arimVar) {
        ampq j;
        int V = akel.V(arimVar.b);
        if (V == 0) {
            V = 1;
        }
        if (V == 2) {
            j = ampq.j(0);
        } else {
            j = V == 3 ? ampq.j(1) : amon.a;
        }
        if (!j.h()) {
            return;
        }
        this.e = ((Integer) j.c()).intValue();
        this.f = false;
        this.g = false;
        eyq eyqVar = this.b;
        eyqVar.a.e(new acsd(arin.IN_APP_UPDATE_EVENT_TYPE_STARTED.q, 7), aqzj.FLOW_TYPE_IN_APP_UPDATE);
        eyqVar.b.clear();
        this.a.b(this);
        alvd a = this.a.a();
        a.e(new alvb() { // from class: eyp
            @Override // defpackage.alvb
            public final void a(Object obj) {
                DefaultInAppUpdateController.this.h((alqw) obj);
            }
        });
        a.d(new aluy() { // from class: eyo
            @Override // defpackage.aluy
            public final void a(Exception exc) {
                DefaultInAppUpdateController.this.b.a(arin.IN_APP_UPDATE_EVENT_TYPE_GET_INFO_FAILED);
            }
        });
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.a.c(this);
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
