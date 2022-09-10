package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: akco  reason: default package */
/* loaded from: classes2.dex */
public final class akco extends ex {
    @dzsi
    public akey ad;
    @dzsi
    public cqiw<cqkp> ae;
    @dzsi
    akfy af;
    public awoe ag;
    public dxio<akfa> ah;
    public akfc ai;
    public cqkj aj;
    public Boolean ak;

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        this.af = new akfs(J(), this.ah, this.ag, this.ai, this.ad, new Runnable(this) { // from class: akcm
            private final akco a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.f();
            }
        }, new Runnable(this) { // from class: akcn
            private final akco a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                akco akcoVar = this.a;
                akcoVar.f();
                akey akeyVar = akcoVar.ad;
                if (akeyVar != null) {
                    akeyVar.b();
                }
            }
        }, this.ak.booleanValue());
        super.l(bundle);
    }

    @Override // defpackage.ex, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        akey akeyVar = this.ad;
        if (akeyVar != null) {
            akeyVar.b();
        }
    }

    @Override // defpackage.ex
    public final synchronized Dialog q(@dzsi Bundle bundle) {
        gdf gdfVar;
        cqkf c = this.aj.c(new akfm(this.ae), null);
        c.e(this.af);
        gdfVar = new gdf(J(), (int) R.style.LoginDialogTheme);
        gdfVar.setTitle(J().getString(R.string.LOGIN_DIALOG_ACCESSIBILITY));
        gdfVar.getWindow().requestFeature(1);
        gdfVar.setContentView(c.c());
        return gdfVar;
    }
}
