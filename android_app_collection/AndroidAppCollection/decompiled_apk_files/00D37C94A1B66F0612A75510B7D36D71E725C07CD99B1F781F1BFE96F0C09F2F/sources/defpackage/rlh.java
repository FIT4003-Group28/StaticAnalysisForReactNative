package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
/* compiled from: PG */
/* renamed from: rlh  reason: default package */
/* loaded from: classes4.dex */
public final class rlh implements ServiceConnection {
    public final String a;
    final /* synthetic */ rli b;

    public rlh(rli rliVar, String str) {
        this.b = rliVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        pyn pynVar;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof pyn) {
                    pynVar = (pyn) queryLocalInterface;
                } else {
                    pynVar = new pyn(iBinder);
                }
                if (pynVar == null) {
                    this.b.a.aG().f.a("Install Referrer Service implementation was not found");
                    return;
                }
                this.b.a.aG().k.a("Install Referrer Service connected");
                this.b.a.aH().g(new rlg(this, pynVar, this));
                return;
            } catch (RuntimeException e) {
                this.b.a.aG().f.b("Exception occurred while calling Install Referrer API", e);
                return;
            }
        }
        this.b.a.aG().f.a("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.aG().k.a("Install Referrer Service disconnected");
    }
}
