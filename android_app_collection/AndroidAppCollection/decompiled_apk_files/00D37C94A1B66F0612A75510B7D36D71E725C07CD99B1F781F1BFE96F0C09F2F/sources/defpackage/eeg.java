package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_MediaSearchActivity;
/* compiled from: PG */
/* renamed from: eeg  reason: default package */
/* loaded from: classes3.dex */
public abstract class eeg extends ees {
    private boolean l = false;

    public eeg() {
        addOnContextAvailableListener(new eef(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eea
    public final void c() {
        if (!this.l) {
            this.l = true;
            Shell_MediaSearchActivity shell_MediaSearchActivity = (Shell_MediaSearchActivity) this;
            dwq dwqVar = (dwq) lI();
            ((ees) shell_MediaSearchActivity).a = (egi) dwqVar.a.wz.get();
            ((ees) shell_MediaSearchActivity).b = (Handler) dwqVar.a.an.get();
            shell_MediaSearchActivity.c = (edw) dwqVar.a.ns.get();
            shell_MediaSearchActivity.d = (aadd) dwqVar.a.K.get();
            shell_MediaSearchActivity.e = (ykv) dwqVar.a.V.get();
            shell_MediaSearchActivity.f = ampq.j(dwqVar.c);
            snc sncVar = (snc) dwqVar.a.v.get();
            shell_MediaSearchActivity.g = (yxe) dwqVar.a.X.get();
            shell_MediaSearchActivity.h = (efz) dwqVar.a.cQ.get();
            shell_MediaSearchActivity.i = (efc) dwqVar.a.wA.get();
            shell_MediaSearchActivity.j = (aacz) dwqVar.a.D.get();
        }
    }
}
