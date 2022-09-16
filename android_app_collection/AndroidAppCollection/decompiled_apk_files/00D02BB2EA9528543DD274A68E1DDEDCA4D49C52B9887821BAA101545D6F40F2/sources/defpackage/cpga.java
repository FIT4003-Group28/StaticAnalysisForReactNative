package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.vision.label.internal.client.ImageLabelParcel;
import com.google.android.gms.vision.label.internal.client.LabelOptions;
/* compiled from: PG */
/* renamed from: cpga  reason: default package */
/* loaded from: classes5.dex */
public final class cpga extends cla implements IInterface {
    public cpga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
    }

    public final ImageLabelParcel[] e(coba cobaVar, LabelOptions labelOptions) {
        Parcel a = a();
        clc.f(a, cobaVar);
        clc.e(a, labelOptions);
        Parcel Si = Si(1, a);
        ImageLabelParcel[] imageLabelParcelArr = (ImageLabelParcel[]) Si.createTypedArray(ImageLabelParcel.CREATOR);
        Si.recycle();
        return imageLabelParcelArr;
    }

    public final void f() {
        Sk(2, a());
    }
}
