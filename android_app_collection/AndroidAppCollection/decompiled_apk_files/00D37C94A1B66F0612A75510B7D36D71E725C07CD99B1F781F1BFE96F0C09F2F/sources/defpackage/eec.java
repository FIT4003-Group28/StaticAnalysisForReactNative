package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
/* compiled from: PG */
/* renamed from: eec  reason: default package */
/* loaded from: classes3.dex */
public abstract class eec extends ees {
    private boolean l = false;

    public eec() {
        addOnContextAvailableListener(new eeb(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eea
    public final void c() {
        if (!this.l) {
            this.l = true;
            Shell_HomeActivity shell_HomeActivity = (Shell_HomeActivity) this;
            dwq dwqVar = (dwq) lI();
            ((ees) shell_HomeActivity).a = (egi) dwqVar.a.wz.get();
            ((ees) shell_HomeActivity).b = (Handler) dwqVar.a.an.get();
            shell_HomeActivity.c = (edw) dwqVar.a.ns.get();
            shell_HomeActivity.d = (aadd) dwqVar.a.K.get();
            shell_HomeActivity.e = (ykv) dwqVar.a.V.get();
            shell_HomeActivity.f = ampq.j(dwqVar.c);
            snc sncVar = (snc) dwqVar.a.v.get();
            shell_HomeActivity.g = (yxe) dwqVar.a.X.get();
            shell_HomeActivity.h = (efz) dwqVar.a.cQ.get();
            shell_HomeActivity.i = (efc) dwqVar.a.wA.get();
            shell_HomeActivity.j = (aacz) dwqVar.a.D.get();
        }
    }
}
