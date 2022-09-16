package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.application.Shell_SettingsActivity;
/* compiled from: PG */
/* renamed from: eek  reason: default package */
/* loaded from: classes3.dex */
public abstract class eek extends ees {
    private boolean l = false;

    public eek() {
        addOnContextAvailableListener(new eej(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eea
    public final void c() {
        if (!this.l) {
            this.l = true;
            Shell_SettingsActivity shell_SettingsActivity = (Shell_SettingsActivity) this;
            dwq dwqVar = (dwq) lI();
            ((ees) shell_SettingsActivity).a = (egi) dwqVar.a.wz.get();
            ((ees) shell_SettingsActivity).b = (Handler) dwqVar.a.an.get();
            shell_SettingsActivity.c = (edw) dwqVar.a.ns.get();
            shell_SettingsActivity.d = (aadd) dwqVar.a.K.get();
            shell_SettingsActivity.e = (ykv) dwqVar.a.V.get();
            shell_SettingsActivity.f = ampq.j(dwqVar.c);
            snc sncVar = (snc) dwqVar.a.v.get();
            shell_SettingsActivity.g = (yxe) dwqVar.a.X.get();
            shell_SettingsActivity.h = (efz) dwqVar.a.cQ.get();
            shell_SettingsActivity.i = (efc) dwqVar.a.wA.get();
            shell_SettingsActivity.j = (aacz) dwqVar.a.D.get();
        }
    }
}
