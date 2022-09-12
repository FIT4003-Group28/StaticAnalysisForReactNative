package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* compiled from: PG */
/* renamed from: cpyn  reason: default package */
/* loaded from: classes5.dex */
public final class cpyn extends cla implements IInterface {
    public cpyn(IBinder iBinder) {
        super(iBinder, "com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationService");
    }

    public final cpyo e(String str, cpyq cpyqVar) {
        cpyo cpyoVar;
        Parcel a = a();
        a.writeString(str);
        clc.f(a, cpyqVar);
        Parcel Si = Si(1, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cpyoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSession");
            if (queryLocalInterface instanceof cpyo) {
                cpyoVar = (cpyo) queryLocalInterface;
            } else {
                cpyoVar = new cpyo(readStrongBinder);
            }
        }
        Si.recycle();
        return cpyoVar;
    }
}
