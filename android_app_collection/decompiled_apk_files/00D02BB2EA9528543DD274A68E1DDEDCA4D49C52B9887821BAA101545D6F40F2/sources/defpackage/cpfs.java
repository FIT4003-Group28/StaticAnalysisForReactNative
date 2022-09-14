package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
/* compiled from: PG */
/* renamed from: cpfs  reason: default package */
/* loaded from: classes5.dex */
public final class cpfs extends cla implements IInterface {
    public cpfs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public final cpfr e(coba cobaVar, FaceSettingsParcel faceSettingsParcel) {
        cpfr cpfrVar;
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.e(a, faceSettingsParcel);
        Parcel Si = Si(1, a);
        IBinder readStrongBinder = Si.readStrongBinder();
        if (readStrongBinder == null) {
            cpfrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            if (queryLocalInterface instanceof cpfr) {
                cpfrVar = (cpfr) queryLocalInterface;
            } else {
                cpfrVar = new cpfr(readStrongBinder);
            }
        }
        Si.recycle();
        return cpfrVar;
    }
}
