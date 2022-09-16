package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
/* compiled from: PG */
/* renamed from: qqz  reason: default package */
/* loaded from: classes4.dex */
final class qqz {
    public final Messenger a;
    public final CloudMessagingMessengerCompat b;

    public qqz(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new CloudMessagingMessengerCompat(iBinder);
            this.a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }
}
