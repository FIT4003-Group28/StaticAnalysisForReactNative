package defpackage;

import android.os.Parcel;
import com.google.android.gms.car.CarSensorEvent;
/* compiled from: PG */
/* renamed from: cmyb  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmyb extends clb implements cmyc {
    public cmyb() {
        super("com.google.android.gms.car.ICarSensorEventListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((CarSensorEvent) clc.d(parcel, CarSensorEvent.CREATOR));
            return true;
        }
        return false;
    }
}
