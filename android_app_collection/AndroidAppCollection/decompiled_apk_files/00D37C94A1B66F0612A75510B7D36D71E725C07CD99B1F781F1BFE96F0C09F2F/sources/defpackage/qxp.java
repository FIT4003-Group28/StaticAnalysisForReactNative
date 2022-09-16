package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
/* compiled from: PG */
/* renamed from: qxp  reason: default package */
/* loaded from: classes4.dex */
public final class qxp extends dvd implements IInterface {
    private qwr a;
    private final int b;

    public qxp(qwr qwrVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = qwrVar;
        this.b = i;
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        qnm.n(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.m(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) dve.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) dve.a(parcel, Bundle.CREATOR);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            ConnectionInfo connectionInfo = (ConnectionInfo) dve.a(parcel, ConnectionInfo.CREATOR);
            qwr qwrVar = this.a;
            qnm.n(qwrVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            qnm.b(connectionInfo);
            qwrVar.E = connectionInfo;
            if (qwrVar.Q()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo.d;
                qxw.a().b(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a);
            }
            a(readInt, readStrongBinder, connectionInfo.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public qxp() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
