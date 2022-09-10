package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
/* compiled from: PG */
/* renamed from: cpfr  reason: default package */
/* loaded from: classes5.dex */
public final class cpfr extends cla implements IInterface {
    public cpfr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    public final FaceParcel[] e(coba cobaVar, FrameMetadataParcel frameMetadataParcel) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.e(a, frameMetadataParcel);
        Parcel Si = Si(1, a);
        FaceParcel[] faceParcelArr = (FaceParcel[]) Si.createTypedArray(FaceParcel.CREATOR);
        Si.recycle();
        return faceParcelArr;
    }

    public final void f() {
        Sk(3, a());
    }
}
