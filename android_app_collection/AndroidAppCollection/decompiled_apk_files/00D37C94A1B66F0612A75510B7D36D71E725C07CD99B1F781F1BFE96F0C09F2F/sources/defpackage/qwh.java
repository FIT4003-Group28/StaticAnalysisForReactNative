package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qwh  reason: default package */
/* loaded from: classes4.dex */
public abstract class qwh extends qwl {
    public final int a;
    public final Bundle b;
    final /* synthetic */ qwr c;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwh(qwr qwrVar, int i, Bundle bundle) {
        super(qwrVar, true);
        this.c = qwrVar;
        this.a = i;
        this.b = bundle;
    }

    protected abstract void a(ConnectionResult connectionResult);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwl
    public final void b() {
    }

    protected abstract boolean c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qwl
    public final /* bridge */ /* synthetic */ void d() {
        PendingIntent pendingIntent = null;
        if (this.a == 0) {
            if (c()) {
                return;
            }
            this.c.k(1, null);
            a(new ConnectionResult(8, null));
            return;
        }
        this.c.k(1, null);
        Bundle bundle = this.b;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        a(new ConnectionResult(this.a, pendingIntent));
    }
}
