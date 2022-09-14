package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.label.internal.client.ImageLabelerOptions;
/* compiled from: PG */
/* renamed from: cpgb  reason: default package */
/* loaded from: classes5.dex */
public final class cpgb extends cla implements IInterface {
    public cpgb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
    }

    public final cpga e(coba cobaVar, ImageLabelerOptions imageLabelerOptions) {
        cpga cpgaVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.e(a, imageLabelerOptions);
        Parcel Si = Si(1, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cpgaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            if (queryLocalInterface instanceof cpga) {
                cpgaVar = (cpga) queryLocalInterface;
            } else {
                cpgaVar = new cpga(readStrongBinder);
            }
        }
        Si.recycle();
        return cpgaVar;
    }
}
