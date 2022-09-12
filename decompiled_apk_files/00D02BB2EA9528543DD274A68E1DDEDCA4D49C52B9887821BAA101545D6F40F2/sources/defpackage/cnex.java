package defpackage;

import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplay;
/* compiled from: PG */
/* renamed from: cnex  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnex extends clb implements cney {
    public cnex() {
        super("com.google.android.gms.car.display.manager.ICarDisplayChangedListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((CarDisplay) clc.d(parcel, CarDisplay.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
