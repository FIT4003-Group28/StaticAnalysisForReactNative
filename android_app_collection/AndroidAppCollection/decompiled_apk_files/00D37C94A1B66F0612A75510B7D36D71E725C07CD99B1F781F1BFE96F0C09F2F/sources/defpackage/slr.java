package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: PG */
/* renamed from: slr  reason: default package */
/* loaded from: classes4.dex */
public final class slr implements ServiceConnection {
    public volatile int a = 0;
    final /* synthetic */ sls b;

    public slr(sls slsVar) {
        this.b = slsVar;
    }

    public final void a() {
        this.b.f = null;
        this.a = 1;
        sma smaVar = this.b.e;
        boolean z = smaVar.b;
        if (smaVar.e == null) {
            ((amzw) ((amzw) sls.a.g().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "resetAndNotifyDisconnected", 204, "MaestroConnector.java")).q("#resetAndNotifyDisconnected(): callback is null when try to notify onServiceDisconnected.");
        } else {
            int i = gps.b;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
        ((amzw) ((amzw) sls.a.d().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "onServiceConnected", 136, "MaestroConnector.java")).s("#onServiceConnected(): %s", componentName);
        anjk.a.execute(ammo.f(new Runnable() { // from class: slq
            @Override // java.lang.Runnable
            public final void run() {
                sly slyVar;
                slz slzVar;
                slr slrVar = slr.this;
                ComponentName componentName2 = componentName;
                IBinder iBinder2 = iBinder;
                if (componentName2 != null) {
                    String packageName = componentName2.getPackageName();
                    if ("com.google.android.googlequicksearchbox".equals(packageName) && slrVar.b.d.a(packageName).b) {
                        if (iBinder2 == null) {
                            slyVar = null;
                        } else {
                            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
                            if (queryLocalInterface instanceof sly) {
                                slyVar = (sly) queryLocalInterface;
                            } else {
                                slyVar = new sly(iBinder2);
                            }
                        }
                        try {
                            sls slsVar = slrVar.b;
                            String packageName2 = slsVar.b.getPackageName();
                            sma smaVar = slrVar.b.e;
                            Parcel pv = slyVar.pv();
                            pv.writeString(packageName2);
                            dve.i(pv, smaVar);
                            Parcel pw = slyVar.pw(1, pv);
                            IBinder readStrongBinder = pw.readStrongBinder();
                            if (readStrongBinder == null) {
                                slzVar = null;
                            } else {
                                IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession");
                                if (queryLocalInterface2 instanceof slz) {
                                    slzVar = (slz) queryLocalInterface2;
                                } else {
                                    slzVar = new slz(readStrongBinder);
                                }
                            }
                            pw.recycle();
                            slsVar.f = slzVar;
                            if (slrVar.b.f != null) {
                                slrVar.a = 3;
                                slp slpVar = slrVar.b.c;
                                if (slpVar.c.c()) {
                                    try {
                                        slpVar.g(slpVar.e(slpVar.f()));
                                        slpVar.f = null;
                                    } catch (RemoteException unused) {
                                        Log.w("AssistantIntegClient", "#sendCurrentVoicePlateParamsAndCapabilities(): failed to send VoicePlateParams");
                                    }
                                }
                                if (slrVar.b.e.e != null) {
                                    ((amzw) ((amzw) sls.a.c().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "sendToken", 157, "MaestroConnector.java")).q("#sendToken()");
                                    slrVar.b.e.e.a();
                                    return;
                                }
                                ((amzw) ((amzw) sls.a.g().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 190, "MaestroConnector.java")).q("#onServiceConnected(): callback is null when try to notify onServiceConnected.");
                                return;
                            }
                            slrVar.a();
                            return;
                        } catch (RemoteException unused2) {
                            ((amzw) ((amzw) sls.a.g().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 183, "MaestroConnector.java")).q("#onServiceConnected(): Failed to start session");
                            slrVar.a();
                            return;
                        }
                    }
                }
                ((amzw) ((amzw) sls.a.g().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "verifyAndCallback", 169, "MaestroConnector.java")).q("#onServiceConnected(): Service signature is not matched");
                slrVar.a();
            }
        }));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((amzw) ((amzw) sls.a.d().g(anaz.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector$AppIntegrationServiceConnection", "onServiceDisconnected", 143, "MaestroConnector.java")).s("#onServiceDisconnected(): %s", componentName);
        boolean z = this.b.e.b;
        a();
    }
}
