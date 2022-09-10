package defpackage;

import android.app.ProgressDialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azso  reason: default package */
/* loaded from: classes3.dex */
final class azso implements axwu {
    final /* synthetic */ azsu a;
    @dzsi
    private ProgressDialog b;

    public azso(azsu azsuVar) {
        this.a = azsuVar;
    }

    @Override // defpackage.axwu
    public final void F(boolean z) {
        azsu azsuVar = this.a;
        if (azsuVar.aD) {
            if (this.b == null) {
                gga ggaVar = azsuVar.aE;
                dbsk.s(ggaVar);
                this.b = new ProgressDialog(ggaVar, 0);
            }
            if (z) {
                this.b.setMessage(this.a.J().getString(R.string.ALIAS_IS_SAVING));
                this.b.show();
                return;
            }
            this.b.dismiss();
        }
    }

    @Override // defpackage.axwu
    public final boolean G() {
        return this.a.aD;
    }
}
