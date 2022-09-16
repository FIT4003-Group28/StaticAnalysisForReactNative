package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_UploadActivity;
/* compiled from: PG */
/* renamed from: eem  reason: default package */
/* loaded from: classes3.dex */
public abstract class eem extends ees {
    private boolean l = false;

    public eem() {
        addOnContextAvailableListener(new eel(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eea
    public final void c() {
        if (!this.l) {
            this.l = true;
            Shell_UploadActivity shell_UploadActivity = (Shell_UploadActivity) this;
            dwq dwqVar = (dwq) lI();
            ((ees) shell_UploadActivity).a = (egi) dwqVar.a.wz.get();
            ((ees) shell_UploadActivity).b = (Handler) dwqVar.a.an.get();
            shell_UploadActivity.c = (edw) dwqVar.a.ns.get();
            shell_UploadActivity.d = (aadd) dwqVar.a.K.get();
            shell_UploadActivity.e = (ykv) dwqVar.a.V.get();
            shell_UploadActivity.f = ampq.j(dwqVar.c);
            snc sncVar = (snc) dwqVar.a.v.get();
            shell_UploadActivity.g = (yxe) dwqVar.a.X.get();
            shell_UploadActivity.h = (efz) dwqVar.a.cQ.get();
            shell_UploadActivity.i = (efc) dwqVar.a.wA.get();
            shell_UploadActivity.j = (aacz) dwqVar.a.D.get();
        }
    }
}
