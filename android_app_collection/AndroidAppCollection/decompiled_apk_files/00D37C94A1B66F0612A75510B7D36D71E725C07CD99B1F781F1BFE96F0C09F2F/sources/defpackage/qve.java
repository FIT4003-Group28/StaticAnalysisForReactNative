package defpackage;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: qve  reason: default package */
/* loaded from: classes4.dex */
public final class qve extends qtx {
    public rvh d;

    public qve(qux quxVar) {
        super(quxVar, qrq.a);
        this.d = new rvh();
        this.e.c("GmsAvailabilityHelper", this);
    }

    @Override // defpackage.qtx
    protected final void f(ConnectionResult connectionResult, int i) {
        String str = connectionResult.e;
        if (str == null) {
            str = "Error connecting to Google Play services";
        }
        this.d.a(new qsp(new Status(connectionResult, str, connectionResult.c)));
    }

    @Override // defpackage.qtx
    protected final void g() {
        Activity a = this.e.a();
        if (a == null) {
            this.d.c(new qsp(new Status(8)));
            return;
        }
        int g = this.c.g(a);
        if (g == 0) {
            this.d.d(null);
        } else if (this.d.a.j()) {
        } else {
            o(new ConnectionResult(g, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void n() {
        this.d.c(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    public final void o(ConnectionResult connectionResult) {
        a(connectionResult, 0);
    }
}
