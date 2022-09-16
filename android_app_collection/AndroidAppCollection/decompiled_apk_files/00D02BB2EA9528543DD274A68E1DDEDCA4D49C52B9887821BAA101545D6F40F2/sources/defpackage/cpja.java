package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpja  reason: default package */
/* loaded from: classes5.dex */
final class cpja<T> {
    public final Map<T, cpjy<T>> a = new HashMap();

    public final void a(IBinder iBinder) {
        cpiy cpiyVar;
        synchronized (this.a) {
            if (iBinder == null) {
                cpiyVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                if (queryLocalInterface instanceof cpiy) {
                    cpiyVar = (cpiy) queryLocalInterface;
                } else {
                    cpiyVar = new cpiy(iBinder);
                }
            }
            cpju cpjuVar = new cpju();
            for (Map.Entry<T, cpjy<T>> entry : this.a.entrySet()) {
                cpjy<T> value = entry.getValue();
                try {
                    cpiyVar.g(cpjuVar, new AddListenerRequest(value));
                } catch (RemoteException unused) {
                    String valueOf = String.valueOf(entry.getKey());
                    String valueOf2 = String.valueOf(value);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
                    sb.append("onPostInitHandler: Didn't add: ");
                    sb.append(valueOf);
                    sb.append("/");
                    sb.append(valueOf2);
                    sb.toString();
                }
            }
        }
    }
}
