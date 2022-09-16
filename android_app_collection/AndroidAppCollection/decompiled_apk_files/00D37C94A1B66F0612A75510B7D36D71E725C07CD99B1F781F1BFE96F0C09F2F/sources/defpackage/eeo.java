package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_UrlActivity;
/* compiled from: PG */
/* renamed from: eeo  reason: default package */
/* loaded from: classes3.dex */
public abstract class eeo extends efa {
    private boolean l = false;

    public eeo() {
        addOnContextAvailableListener(new een(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eea
    public final void c() {
        if (!this.l) {
            this.l = true;
            Shell_UrlActivity shell_UrlActivity = (Shell_UrlActivity) this;
            dwq dwqVar = (dwq) lI();
            ((ees) shell_UrlActivity).a = (egi) dwqVar.a.wz.get();
            ((ees) shell_UrlActivity).b = (Handler) dwqVar.a.an.get();
            shell_UrlActivity.c = (edw) dwqVar.a.ns.get();
            shell_UrlActivity.d = (aadd) dwqVar.a.K.get();
            shell_UrlActivity.e = (ykv) dwqVar.a.V.get();
            shell_UrlActivity.f = ampq.j(dwqVar.c);
            snc sncVar = (snc) dwqVar.a.v.get();
            shell_UrlActivity.g = (yxe) dwqVar.a.X.get();
            shell_UrlActivity.h = (efz) dwqVar.a.cQ.get();
            shell_UrlActivity.i = (efc) dwqVar.a.wA.get();
            shell_UrlActivity.j = (aacz) dwqVar.a.D.get();
        }
    }
}
