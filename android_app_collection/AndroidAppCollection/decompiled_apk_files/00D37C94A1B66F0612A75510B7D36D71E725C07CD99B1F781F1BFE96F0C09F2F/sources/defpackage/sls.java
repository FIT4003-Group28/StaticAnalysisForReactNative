package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
/* compiled from: PG */
/* renamed from: sls  reason: default package */
/* loaded from: classes4.dex */
public final class sls implements dwh {
    public static final amzy a = amzy.l("com/google/android/libraries/assistant/appintegration/MaestroConnector");
    public final Context b;
    public final slp c;
    public final qsf d;
    protected final sma e;
    public slz f;
    private final slr g = new slr(this);

    public sls(Context context, sma smaVar, slp slpVar, qsf qsfVar) {
        this.b = context;
        this.c = slpVar;
        this.d = qsfVar;
        this.e = smaVar;
    }

    @Override // defpackage.dwh
    public final int a() {
        return this.g.a;
    }

    @Override // defpackage.dwh
    public final void b(smr smrVar) {
        ((amzw) ((amzw) a.b().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "sendData", 100, "MaestroConnector.java")).q("#sendData()");
        if (a() != 3 || !d()) {
            throw new RemoteException("Maestro service not connected yet");
        }
        slz slzVar = this.f;
        byte[] byteArray = smrVar.toByteArray();
        Parcel pv = slzVar.pv();
        pv.writeByteArray(byteArray);
        slzVar.py(1, pv);
    }

    @Override // defpackage.dwh
    public final boolean c(smr smrVar) {
        amzy amzyVar = a;
        ((amzw) ((amzw) amzyVar.b().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 62, "MaestroConnector.java")).q("#connect()");
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.gsa.opa.APP_INTEGRATION_SERVICE");
        intent.setPackage("com.google.android.googlequicksearchbox");
        if (this.b.bindService(intent, this.g, 1)) {
            ((amzw) ((amzw) amzyVar.d().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 67, "MaestroConnector.java")).q("#bindService(): binding service.");
            this.g.a = 2;
            return true;
        }
        ((amzw) ((amzw) amzyVar.g().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 71, "MaestroConnector.java")).q("#bindService(): failed to bind service.");
        return false;
    }

    @Override // defpackage.dwh
    public final boolean d() {
        return this.f != null;
    }
}
