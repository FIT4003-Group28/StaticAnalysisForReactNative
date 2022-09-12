package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
/* compiled from: PG */
/* renamed from: cnlw  reason: default package */
/* loaded from: classes5.dex */
final class cnlw {
    public final Messenger a;
    public final CloudMessagingMessengerCompat b;

    public cnlw(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new CloudMessagingMessengerCompat(iBinder);
            this.a = null;
        } else {
            if (String.valueOf(interfaceDescriptor).length() == 0) {
                new String("Invalid interface descriptor: ");
            }
            throw new RemoteException();
        }
    }
}
