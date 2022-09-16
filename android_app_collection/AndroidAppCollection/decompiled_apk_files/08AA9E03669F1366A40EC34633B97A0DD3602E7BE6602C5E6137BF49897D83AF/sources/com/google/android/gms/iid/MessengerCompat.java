package com.google.android.gms.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
/* loaded from: classes.dex */
public class MessengerCompat implements ReflectedParcelable {
    public static final Parcelable.Creator<MessengerCompat> CREATOR = new zzq();
    private Messenger zzab;
    private zzl zzby;

    public MessengerCompat(IBinder iBinder) {
        zzl zzmVar;
        if (Build.VERSION.SDK_INT >= 21) {
            this.zzab = new Messenger(iBinder);
            return;
        }
        if (iBinder == null) {
            zzmVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            zzmVar = queryLocalInterface instanceof zzl ? (zzl) queryLocalInterface : new zzm(iBinder);
        }
        this.zzby = zzmVar;
    }

    private final IBinder getBinder() {
        return this.zzab != null ? this.zzab.getBinder() : this.zzby.asBinder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return getBinder().equals(((MessengerCompat) obj).getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public final void send(Message message) {
        if (this.zzab != null) {
            this.zzab.send(message);
        } else {
            this.zzby.send(message);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzab != null ? this.zzab.getBinder() : this.zzby.asBinder());
    }
}
