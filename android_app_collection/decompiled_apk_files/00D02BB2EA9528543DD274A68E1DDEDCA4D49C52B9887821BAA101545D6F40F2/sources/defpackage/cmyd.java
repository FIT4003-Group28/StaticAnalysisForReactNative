package defpackage;

import android.os.Parcel;
import com.google.android.gms.car.CarUiInfo;
/* compiled from: PG */
/* renamed from: cmyd  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmyd extends clb implements cmye {
    public cmyd() {
        super("com.google.android.gms.car.ICarUiInfoChangedListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((CarUiInfo) clc.d(parcel, CarUiInfo.CREATOR));
            return true;
        }
        return false;
    }
}
