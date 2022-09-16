package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cmpq  reason: default package */
/* loaded from: classes.dex */
public final class cmpq extends cla implements IInterface {
    public cmpq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String e() {
        Parcel Si = Si(1, a());
        String readString = Si.readString();
        Si.recycle();
        return readString;
    }

    public final boolean f() {
        Parcel a = a();
        a.writeInt(1);
        Parcel Si = Si(2, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }
}
