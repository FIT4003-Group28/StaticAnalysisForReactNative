package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.t;
/* loaded from: classes.dex */
public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    Messenger f9232b;

    /* renamed from: c  reason: collision with root package name */
    t f9233c;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<i> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: createFromParcel */
        public i mo293createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new i(readStrongBinder);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        /* renamed from: newArray */
        public i[] mo294newArray(int i) {
            return new i[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ClassLoader {
        @Override // java.lang.ClassLoader
        protected final Class<?> loadClass(String str, boolean z) {
            if ("com.google.android.gms.iid.MessengerCompat".equals(str)) {
                if (!FirebaseInstanceId.p()) {
                    return i.class;
                }
                Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
                return i.class;
            }
            return super.loadClass(str, z);
        }
    }

    public i(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f9232b = new Messenger(iBinder);
        } else {
            this.f9233c = new t.a(iBinder);
        }
    }

    public void a(Message message) {
        Messenger messenger = this.f9232b;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f9233c.a(message);
        }
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
            return j().equals(((i) obj).j());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return j().hashCode();
    }

    public IBinder j() {
        Messenger messenger = this.f9232b;
        return messenger != null ? messenger.getBinder() : this.f9233c.asBinder();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f9232b;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f9233c.asBinder());
    }
}
