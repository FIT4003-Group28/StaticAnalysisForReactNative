package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: covy  reason: default package */
/* loaded from: classes.dex */
public final class covy extends cla implements IInterface {
    public covy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void e(covx covxVar, boolean z, int i) {
        Parcel a = a();
        clc.f(a, covxVar);
        a.writeInt(z ? 1 : 0);
        a.writeString(null);
        a.writeString(null);
        a.writeInt(i);
        Parcel Si = Si(11, a);
        Bundle bundle = (Bundle) clc.d(Si, Bundle.CREATOR);
        Si.recycle();
    }

    public final cnvk f(covx covxVar, String str, String str2, int i, int i2) {
        Parcel a = a();
        clc.f(a, covxVar);
        a.writeString(str);
        cnvk cnvkVar = null;
        a.writeString(null);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel Si = Si(505, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof cnvk) {
                cnvkVar = (cnvk) queryLocalInterface;
            } else {
                cnvkVar = new cnvk(readStrongBinder);
            }
        }
        Si.recycle();
        return cnvkVar;
    }

    public final cnvk g(covx covxVar, String str, String str2) {
        cnvk cnvkVar;
        Parcel a = a();
        clc.f(a, covxVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeInt(0);
        Parcel Si = Si(506, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cnvkVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof cnvk) {
                cnvkVar = (cnvk) queryLocalInterface;
            } else {
                cnvkVar = new cnvk(readStrongBinder);
            }
        }
        Si.recycle();
        return cnvkVar;
    }

    public final void h(covx covxVar, int i) {
        Parcel a = a();
        clc.f(a, covxVar);
        a.writeInt(0);
        a.writeInt(0);
        a.writeString(null);
        a.writeString(null);
        a.writeInt(i);
        Sk(305, a);
    }
}
