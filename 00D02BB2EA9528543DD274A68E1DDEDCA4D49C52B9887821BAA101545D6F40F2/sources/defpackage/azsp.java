package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azsp  reason: default package */
/* loaded from: classes3.dex */
final class azsp implements axvp {
    final /* synthetic */ azsu a;

    public azsp(azsu azsuVar) {
        this.a = azsuVar;
    }

    @Override // defpackage.axvp
    public final void E(boolean z, @dzsi azvc azvcVar, Context context) {
        azsu azsuVar = this.a;
        if (azsuVar.aD) {
            azsuVar.ao = new azsq(z, azvcVar, context);
            return;
        }
        axvp axvpVar = azsuVar.al;
        if (axvpVar == null) {
            return;
        }
        axvpVar.E(z, azvcVar, context);
    }
}
