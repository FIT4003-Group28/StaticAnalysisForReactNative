package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class CastMediaOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final NotificationOptions c;
    public final boolean d;
    public final boolean e;
    private final qmy f;

    static {
        new qpu("CastMediaOptions");
        CREATOR = new qjl(18);
    }

    public CastMediaOptions(String str, String str2, IBinder iBinder, NotificationOptions notificationOptions, boolean z, boolean z2) {
        qmy qmwVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            qmwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            if (queryLocalInterface instanceof qmy) {
                qmwVar = (qmy) queryLocalInterface;
            } else {
                qmwVar = new qmw(iBinder);
            }
        }
        this.f = qmwVar;
        this.c = notificationOptions;
        this.d = z;
        this.e = z2;
    }

    public final tnk a() {
        qmy qmyVar = this.f;
        if (qmyVar != null) {
            try {
                return (tnk) rac.b(qmyVar.a());
            } catch (RemoteException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        qmy qmyVar = this.f;
        tqj.y(parcel, 4, qmyVar == null ? null : qmyVar.asBinder());
        tqj.E(parcel, 5, this.c, i);
        tqj.o(parcel, 6, this.d);
        tqj.o(parcel, 7, this.e);
        tqj.n(parcel, m);
    }
}
