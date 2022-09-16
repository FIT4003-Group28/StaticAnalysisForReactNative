package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_ResultsActivity;
/* compiled from: PG */
/* renamed from: eei  reason: default package */
/* loaded from: classes3.dex */
public abstract class eei extends ees {
    private boolean l = false;

    public eei() {
        addOnContextAvailableListener(new eeh(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eea
    public final void c() {
        if (!this.l) {
            this.l = true;
            Shell_ResultsActivity shell_ResultsActivity = (Shell_ResultsActivity) this;
            dwq dwqVar = (dwq) lI();
            ((ees) shell_ResultsActivity).a = (egi) dwqVar.a.wz.get();
            ((ees) shell_ResultsActivity).b = (Handler) dwqVar.a.an.get();
            shell_ResultsActivity.c = (edw) dwqVar.a.ns.get();
            shell_ResultsActivity.d = (aadd) dwqVar.a.K.get();
            shell_ResultsActivity.e = (ykv) dwqVar.a.V.get();
            shell_ResultsActivity.f = ampq.j(dwqVar.c);
            snc sncVar = (snc) dwqVar.a.v.get();
            shell_ResultsActivity.g = (yxe) dwqVar.a.X.get();
            shell_ResultsActivity.h = (efz) dwqVar.a.cQ.get();
            shell_ResultsActivity.i = (efc) dwqVar.a.wA.get();
            shell_ResultsActivity.j = (aacz) dwqVar.a.D.get();
        }
    }
}
