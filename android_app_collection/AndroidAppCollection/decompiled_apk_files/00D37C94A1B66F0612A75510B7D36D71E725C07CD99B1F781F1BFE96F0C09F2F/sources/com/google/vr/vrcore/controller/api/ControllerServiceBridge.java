package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ControllerServiceBridge implements ServiceConnection {
    public static final /* synthetic */ int h = 0;
    private static final AtomicInteger i = new AtomicInteger(-1);
    public final Context a;
    public final Handler b;
    final String c;
    public final SparseArray d;
    public axfv e;
    public boolean f;
    public axfw g;
    private final int j;
    private final axfx k;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface Callbacks {
        void onControllerEventPacket(ControllerEventPacket controllerEventPacket);

        void onControllerEventPacket2(ControllerEventPacket2 controllerEventPacket2);

        void onControllerRecentered(ControllerOrientationEvent controllerOrientationEvent);

        void onControllerStateChanged(int i, int i2);

        void onServiceConnected(int i);

        void onServiceDisconnected();

        void onServiceFailed();

        void onServiceInitFailed(int i);

        void onServiceUnavailable();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i2) {
        ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(i2);
        SparseArray sparseArray = new SparseArray();
        this.d = sparseArray;
        this.a = context.getApplicationContext();
        int i3 = 0;
        axfv axfvVar = new axfv(callbacks, controllerListenerOptions, 0);
        this.e = axfvVar;
        sparseArray.put(axfvVar.c, axfvVar);
        this.b = new Handler(Looper.getMainLooper());
        this.k = new axfx(this);
        try {
            i3 = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (axfj unused) {
        }
        this.j = i3;
        int incrementAndGet = i.incrementAndGet();
        StringBuilder sb = new StringBuilder(30);
        sb.append("VrCtl.ServiceBridge");
        sb.append(incrementAndGet);
        this.c = sb.toString();
    }

    public static final void d() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("This should be running on the main thread.");
    }

    private final boolean e(int i2, axfv axfvVar) {
        try {
            axfw axfwVar = this.g;
            String str = this.c;
            axfx axfxVar = new axfx(axfvVar, 1);
            Parcel pv = axfwVar.pv();
            pv.writeInt(i2);
            pv.writeString(str);
            dve.i(pv, axfxVar);
            Parcel pw = axfwVar.pw(5, pv);
            boolean j = dve.j(pw);
            pw.recycle();
            return j;
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
            return false;
        }
    }

    public final void a() {
        d();
        if (this.f) {
            d();
            axfw axfwVar = this.g;
            if (axfwVar != null) {
                try {
                    String str = this.c;
                    Parcel pv = axfwVar.pv();
                    pv.writeString(str);
                    Parcel pw = axfwVar.pw(6, pv);
                    dve.j(pw);
                    pw.recycle();
                } catch (RemoteException e) {
                    Log.w("VrCtl.ServiceBridge", "RemoteException while unregistering listeners.", e);
                }
            }
            if (this.j >= 21) {
                try {
                    axfw axfwVar2 = this.g;
                    if (axfwVar2 != null) {
                        axfx axfxVar = this.k;
                        Parcel pv2 = axfwVar2.pv();
                        dve.i(pv2, axfxVar);
                        Parcel pw2 = axfwVar2.pw(9, pv2);
                        boolean j = dve.j(pw2);
                        pw2.recycle();
                        if (!j) {
                            Log.w("VrCtl.ServiceBridge", "Failed to unregister remote service listener.");
                        }
                    }
                } catch (RemoteException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
                    sb.append("Exception while unregistering remote service listener: ");
                    sb.append(valueOf);
                    Log.w("VrCtl.ServiceBridge", sb.toString());
                }
            }
            this.a.unbindService(this);
            this.g = null;
            this.f = false;
            return;
        }
        Log.w("VrCtl.ServiceBridge", "Service is already unbound.");
    }

    public final void b() {
        this.e.a.onServiceConnected(1);
        axfv axfvVar = this.e;
        if (!e(axfvVar.c, axfvVar)) {
            Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
            this.e.a.onServiceFailed();
            a();
            return;
        }
        SparseArray sparseArray = this.d;
        axfv axfvVar2 = this.e;
        sparseArray.put(axfvVar2.c, axfvVar2);
    }

    public final void c(int i2, ControllerRequest controllerRequest) {
        d();
        axfw axfwVar = this.g;
        if (axfwVar != null) {
            try {
                Parcel pv = axfwVar.pv();
                pv.writeInt(i2);
                dve.g(pv, controllerRequest);
                axfwVar.px(11, pv);
                return;
            } catch (RemoteException e) {
                Log.w("VrCtl.ServiceBridge", "RemoteException while vibrating the controller.", e);
                return;
            }
        }
        Log.w("VrCtl.ServiceBridge", "Vibration cancelled: service not connected");
    }

    public void controllerHapticsEffect(int i2, int i3, int i4) {
        aopa createBuilder = axga.a.createBuilder();
        aopa createBuilder2 = axfy.a.createBuilder();
        createBuilder2.copyOnWrite();
        axfy axfyVar = (axfy) createBuilder2.instance;
        axfyVar.b |= 1;
        axfyVar.c = i3;
        createBuilder2.copyOnWrite();
        axfy axfyVar2 = (axfy) createBuilder2.instance;
        axfyVar2.b |= 2;
        axfyVar2.d = i4;
        axfy axfyVar3 = (axfy) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        axga axgaVar = (axga) createBuilder.instance;
        axfyVar3.getClass();
        axgaVar.d = axfyVar3;
        axgaVar.b |= 2;
        ControllerRequest controllerRequest = new ControllerRequest();
        controllerRequest.c((axga) createBuilder.mo39build());
        this.b.post(new axfu(this, i2, controllerRequest, 1));
    }

    public boolean createAndConnectController(int i2, Callbacks callbacks, int i3) {
        ControllerListenerOptions controllerListenerOptions = new ControllerListenerOptions(i3);
        d();
        if (this.g == null) {
            return false;
        }
        axfv axfvVar = new axfv(callbacks, controllerListenerOptions, i2);
        if (e(axfvVar.c, axfvVar)) {
            if (axfvVar.c == 0) {
                this.e = axfvVar;
            }
            this.d.put(i2, axfvVar);
            return true;
        }
        if (i2 == 0) {
            Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
            i2 = 0;
        }
        this.d.remove(i2);
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        axfw axfwVar;
        String str;
        d();
        if (this.f) {
            if (iBinder == null) {
                axfwVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                if (queryLocalInterface instanceof axfw) {
                    axfwVar = (axfw) queryLocalInterface;
                } else {
                    axfwVar = new axfw(iBinder);
                }
            }
            this.g = axfwVar;
            try {
                Parcel pv = axfwVar.pv();
                pv.writeInt(25);
                Parcel pw = axfwVar.pw(1, pv);
                int readInt = pw.readInt();
                pw.recycle();
                if (readInt != 0) {
                    if (readInt == 0) {
                        str = "SUCCESS";
                    } else if (readInt == 1) {
                        str = "FAILED_UNSUPPORTED";
                    } else if (readInt == 2) {
                        str = "FAILED_NOT_AUTHORIZED";
                    } else if (readInt != 3) {
                        StringBuilder sb = new StringBuilder(45);
                        sb.append("[UNKNOWN CONTROLLER INIT RESULT: ");
                        sb.append(readInt);
                        sb.append("]");
                        str = sb.toString();
                    } else {
                        str = "FAILED_CLIENT_OBSOLETE";
                    }
                    String valueOf = String.valueOf(str);
                    Log.e("VrCtl.ServiceBridge", valueOf.length() != 0 ? "initialize() returned error: ".concat(valueOf) : new String("initialize() returned error: "));
                    this.e.a.onServiceInitFailed(readInt);
                    a();
                    return;
                }
                if (this.j >= 21) {
                    try {
                        axfw axfwVar2 = this.g;
                        axfx axfxVar = this.k;
                        Parcel pv2 = axfwVar2.pv();
                        dve.i(pv2, axfxVar);
                        Parcel pw2 = axfwVar2.pw(8, pv2);
                        boolean j = dve.j(pw2);
                        pw2.recycle();
                        if (!j) {
                            Log.e("VrCtl.ServiceBridge", "Failed to register remote service listener.");
                            this.e.a.onServiceInitFailed(0);
                            a();
                            return;
                        }
                    } catch (RemoteException e) {
                        String valueOf2 = String.valueOf(e);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 53);
                        sb2.append("Exception while registering remote service listener: ");
                        sb2.append(valueOf2);
                        Log.w("VrCtl.ServiceBridge", sb2.toString());
                    }
                }
                b();
            } catch (RemoteException e2) {
                Log.e("VrCtl.ServiceBridge", "Failed to call initialize() on controller service (RemoteException).", e2);
                this.e.a.onServiceFailed();
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d();
        this.g = null;
        this.e.a.onServiceDisconnected();
    }

    public void requestBind() {
        this.b.post(new axft(this, 1));
    }

    public void requestUnbind() {
        this.b.post(new axft(this));
    }

    public void vibrateController(int i2, int i3, int i4, int i5) {
        aopa createBuilder = axga.a.createBuilder();
        aopa createBuilder2 = axfz.a.createBuilder();
        createBuilder2.copyOnWrite();
        axfz axfzVar = (axfz) createBuilder2.instance;
        axfzVar.b |= 1;
        axfzVar.c = i3;
        createBuilder2.copyOnWrite();
        axfz axfzVar2 = (axfz) createBuilder2.instance;
        axfzVar2.b |= 2;
        axfzVar2.d = i4;
        createBuilder2.copyOnWrite();
        axfz axfzVar3 = (axfz) createBuilder2.instance;
        axfzVar3.b |= 4;
        axfzVar3.e = i5;
        axfz axfzVar4 = (axfz) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        axga axgaVar = (axga) createBuilder.instance;
        axfzVar4.getClass();
        axgaVar.c = axfzVar4;
        axgaVar.b |= 1;
        ControllerRequest controllerRequest = new ControllerRequest();
        controllerRequest.c((axga) createBuilder.mo39build());
        this.b.post(new axfu(this, i2, controllerRequest));
    }
}
