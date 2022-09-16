package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_LiveCreationActivity;
/* compiled from: PG */
/* renamed from: eee  reason: default package */
/* loaded from: classes3.dex */
public abstract class eee extends ees {
    private boolean l = false;

    public eee() {
        addOnContextAvailableListener(new eed(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eea
    public final void c() {
        if (!this.l) {
            this.l = true;
            Shell_LiveCreationActivity shell_LiveCreationActivity = (Shell_LiveCreationActivity) this;
            dwq dwqVar = (dwq) lI();
            ((ees) shell_LiveCreationActivity).a = (egi) dwqVar.a.wz.get();
            ((ees) shell_LiveCreationActivity).b = (Handler) dwqVar.a.an.get();
            shell_LiveCreationActivity.c = (edw) dwqVar.a.ns.get();
            shell_LiveCreationActivity.d = (aadd) dwqVar.a.K.get();
            shell_LiveCreationActivity.e = (ykv) dwqVar.a.V.get();
            shell_LiveCreationActivity.f = ampq.j(dwqVar.c);
            snc sncVar = (snc) dwqVar.a.v.get();
            shell_LiveCreationActivity.g = (yxe) dwqVar.a.X.get();
            shell_LiveCreationActivity.h = (efz) dwqVar.a.cQ.get();
            shell_LiveCreationActivity.i = (efc) dwqVar.a.wA.get();
            shell_LiveCreationActivity.j = (aacz) dwqVar.a.D.get();
        }
    }
}
