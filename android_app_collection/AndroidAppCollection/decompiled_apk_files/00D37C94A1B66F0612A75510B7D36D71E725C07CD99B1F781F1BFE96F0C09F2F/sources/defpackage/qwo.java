package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: qwo  reason: default package */
/* loaded from: classes4.dex */
public final class qwo implements qwm {
    final /* synthetic */ qwr a;

    public qwo(qwr qwrVar) {
        this.a = qwrVar;
    }

    @Override // defpackage.qwm
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.c()) {
            qwr qwrVar = this.a;
            qwrVar.B(null, qwrVar.F());
            return;
        }
        qwj qwjVar = this.a.z;
        if (qwjVar == null) {
            return;
        }
        qwjVar.c(connectionResult);
    }
}
