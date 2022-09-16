package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CloudMessagingMessengerCompat implements Parcelable {
    public static final Parcelable.Creator<CloudMessagingMessengerCompat> CREATOR = new cnll();
    Messenger a;

    public CloudMessagingMessengerCompat(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    public final IBinder b() {
        Messenger messenger = this.a;
        messenger.getClass();
        return messenger.getBinder();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return b().equals(((CloudMessagingMessengerCompat) obj).b());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void a(Message message) {
        Messenger messenger = this.a;
        messenger.getClass();
        messenger.send(message);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
