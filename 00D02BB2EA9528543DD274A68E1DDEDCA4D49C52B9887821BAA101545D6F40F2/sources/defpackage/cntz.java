package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cntz  reason: default package */
/* loaded from: classes.dex */
public abstract class cntz extends cnub<Boolean> {
    public final int a;
    public final Bundle b;
    final /* synthetic */ cnui c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cntz(cnui cnuiVar, int i, Bundle bundle) {
        super(cnuiVar, true);
        this.c = cnuiVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract boolean a();

    protected abstract void b(ConnectionResult connectionResult);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnub
    public final void c() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cnub
    public final /* bridge */ /* synthetic */ void d() {
        ConnectionResult connectionResult;
        PendingIntent pendingIntent = null;
        if (this.a != 0) {
            this.c.E(1, null);
            Bundle bundle = this.b;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            connectionResult = new ConnectionResult(this.a, pendingIntent);
        } else if (a()) {
            return;
        } else {
            this.c.E(1, null);
            connectionResult = new ConnectionResult(8, null);
        }
        b(connectionResult);
    }
}
