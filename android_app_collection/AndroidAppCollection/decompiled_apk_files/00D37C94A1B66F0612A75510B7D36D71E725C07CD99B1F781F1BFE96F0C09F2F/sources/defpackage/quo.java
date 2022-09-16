package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
/* compiled from: PG */
/* renamed from: quo  reason: default package */
/* loaded from: classes4.dex */
final class quo implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ qup b;

    public quo(qup qupVar, ConnectionResult connectionResult) {
        this.b = qupVar;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qup qupVar = this.b;
        qum qumVar = (qum) qupVar.e.l.get(qupVar.b);
        if (qumVar == null) {
            return;
        }
        if (this.a.c()) {
            qup qupVar2 = this.b;
            qupVar2.d = true;
            if (qupVar2.a.j()) {
                this.b.c();
                return;
            }
            try {
                qsn qsnVar = this.b.a;
                qsnVar.B(null, qsnVar.u());
                return;
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                this.b.a.f("Failed to get service from broker.");
                qumVar.i(new ConnectionResult(10));
                return;
            }
        }
        qumVar.i(this.a);
    }
}
