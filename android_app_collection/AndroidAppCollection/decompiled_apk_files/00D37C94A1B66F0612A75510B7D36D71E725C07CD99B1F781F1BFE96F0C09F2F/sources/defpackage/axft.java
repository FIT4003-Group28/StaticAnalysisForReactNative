package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
/* compiled from: PG */
/* renamed from: axft  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class axft implements Runnable {
    public final /* synthetic */ ControllerServiceBridge a;
    private final /* synthetic */ int b;

    public /* synthetic */ axft(ControllerServiceBridge controllerServiceBridge) {
        this.a = controllerServiceBridge;
    }

    public /* synthetic */ axft(ControllerServiceBridge controllerServiceBridge, int i) {
        this.b = i;
        this.a = controllerServiceBridge;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.a();
        } else if (i != 1) {
            ControllerServiceBridge controllerServiceBridge = this.a;
            ControllerServiceBridge.d();
            axfw axfwVar = controllerServiceBridge.g;
            if (axfwVar != null) {
                try {
                    Parcel pw = axfwVar.pw(10, axfwVar.pv());
                    int readInt = pw.readInt();
                    pw.recycle();
                    if (readInt > 0) {
                        if (!controllerServiceBridge.f) {
                            return;
                        }
                        controllerServiceBridge.b();
                        return;
                    }
                } catch (RemoteException e) {
                    String valueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
                    sb.append("Remote exception while getting number of controllers: ");
                    sb.append(valueOf);
                    Log.w("VrCtl.ServiceBridge", sb.toString());
                }
            }
            int size = controllerServiceBridge.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                axfv axfvVar = (axfv) controllerServiceBridge.d.valueAt(i2);
                if (axfvVar != null) {
                    axfvVar.a.onControllerStateChanged(i2, 0);
                }
            }
            ControllerServiceBridge.d();
            controllerServiceBridge.d.clear();
            controllerServiceBridge.e.a.onServiceDisconnected();
        } else {
            ControllerServiceBridge controllerServiceBridge2 = this.a;
            ControllerServiceBridge.d();
            if (controllerServiceBridge2.f) {
                Log.w("VrCtl.ServiceBridge", "Service is already bound.");
                return;
            }
            Intent intent = new Intent("com.google.vr.vrcore.controller.BIND");
            intent.setPackage("com.google.vr.vrcore");
            if (!controllerServiceBridge2.a.bindService(intent, controllerServiceBridge2, 1)) {
                Log.w("VrCtl.ServiceBridge", "Bind failed. Service is not available.");
                controllerServiceBridge2.e.a.onServiceUnavailable();
            }
            controllerServiceBridge2.f = true;
        }
    }
}
