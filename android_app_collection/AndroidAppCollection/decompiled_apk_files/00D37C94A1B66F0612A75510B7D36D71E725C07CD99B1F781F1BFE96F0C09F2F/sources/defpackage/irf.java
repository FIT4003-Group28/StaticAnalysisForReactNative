package defpackage;

import android.app.Dialog;
/* compiled from: PG */
/* renamed from: irf  reason: default package */
/* loaded from: classes3.dex */
final class irf implements afwa {
    final /* synthetic */ irh a;

    public irf(irh irhVar) {
        this.a = irhVar;
    }

    @Override // defpackage.afwa
    public final void a() {
        this.a.ku();
    }

    @Override // defpackage.afwa
    public final void b() {
        Dialog dialog = this.a.d;
        if (dialog != null) {
            dialog.show();
            this.a.aI();
        }
    }

    @Override // defpackage.afwa
    public final void c(Exception exc) {
        this.a.ak.e(exc);
        this.a.ku();
    }
}
