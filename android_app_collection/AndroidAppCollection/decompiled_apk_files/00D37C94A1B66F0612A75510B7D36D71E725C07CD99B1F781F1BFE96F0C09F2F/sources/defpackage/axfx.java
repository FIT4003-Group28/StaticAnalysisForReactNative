package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.vr.vrcore.controller.api.ControllerEventPacket;
import com.google.vr.vrcore.controller.api.ControllerEventPacket2;
import com.google.vr.vrcore.controller.api.ControllerListenerOptions;
import com.google.vr.vrcore.controller.api.ControllerOrientationEvent;
import com.google.vr.vrcore.controller.api.ControllerServiceBridge;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: axfx  reason: default package */
/* loaded from: classes2.dex */
public final class axfx extends dvd implements IInterface {
    private final WeakReference a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axfx(axfv axfvVar, int i) {
        super("com.google.vr.vrcore.controller.api.IControllerListener");
        this.b = i;
        this.a = new WeakReference(axfvVar);
    }

    public axfx(ControllerServiceBridge controllerServiceBridge) {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
        this.a = new WeakReference(controllerServiceBridge);
    }

    public axfx() {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (this.b == 0) {
            if (i == 1) {
                parcel2.writeNoException();
                parcel2.writeInt(25);
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int readInt = parcel.readInt();
                ControllerServiceBridge controllerServiceBridge = (ControllerServiceBridge) this.a.get();
                if (controllerServiceBridge == null || readInt != 1) {
                    return true;
                }
                controllerServiceBridge.b.post(new axft(controllerServiceBridge, 2));
                return true;
            }
        } else if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(25);
            return true;
        } else {
            if (i != 2) {
                switch (i) {
                    case 9:
                        axfv axfvVar = (axfv) this.a.get();
                        ControllerListenerOptions controllerListenerOptions = axfvVar == null ? null : axfvVar.b;
                        parcel2.writeNoException();
                        dve.h(parcel2, controllerListenerOptions);
                        break;
                    case 10:
                        ControllerEventPacket controllerEventPacket = (ControllerEventPacket) dve.a(parcel, ControllerEventPacket.CREATOR);
                        axfv axfvVar2 = (axfv) this.a.get();
                        if (axfvVar2 != null) {
                            controllerEventPacket.e(axfvVar2.c);
                            axfvVar2.a.onControllerEventPacket(controllerEventPacket);
                            controllerEventPacket.d();
                            return true;
                        }
                        break;
                    case 11:
                        ControllerOrientationEvent controllerOrientationEvent = (ControllerOrientationEvent) dve.a(parcel, ControllerOrientationEvent.CREATOR);
                        axfv axfvVar3 = (axfv) this.a.get();
                        if (axfvVar3 != null) {
                            controllerOrientationEvent.e = axfvVar3.c;
                            axfvVar3.a.onControllerRecentered(controllerOrientationEvent);
                            return true;
                        }
                        break;
                    case 12:
                        ControllerEventPacket2 controllerEventPacket2 = (ControllerEventPacket2) dve.a(parcel, ControllerEventPacket2.CREATOR);
                        axfv axfvVar4 = (axfv) this.a.get();
                        if (axfvVar4 != null) {
                            int i3 = ControllerServiceBridge.h;
                            if (controllerEventPacket2.g != 0) {
                                long a = ControllerEventPacket2.a() - controllerEventPacket2.g;
                                if (a > 300) {
                                    StringBuilder sb = new StringBuilder(122);
                                    sb.append("Experiencing large controller packet delivery time between service and  client: timestamp diff in ms: ");
                                    sb.append(a);
                                    Log.w("VrCtl.ServiceBridge", sb.toString());
                                }
                            }
                            controllerEventPacket2.e(axfvVar4.c);
                            axfvVar4.a.onControllerEventPacket2(controllerEventPacket2);
                            controllerEventPacket2.d();
                            break;
                        }
                        break;
                    default:
                        return false;
                }
            } else {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                axfv axfvVar5 = (axfv) this.a.get();
                if (axfvVar5 != null) {
                    axfvVar5.a.onControllerStateChanged(readInt2, readInt3);
                    return true;
                }
            }
            return true;
        }
    }
}
