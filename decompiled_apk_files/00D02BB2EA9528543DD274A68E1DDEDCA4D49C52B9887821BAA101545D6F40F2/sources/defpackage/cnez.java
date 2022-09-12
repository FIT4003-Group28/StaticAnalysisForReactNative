package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import com.google.android.gms.car.display.CarDisplayId;
/* compiled from: PG */
/* renamed from: cnez  reason: default package */
/* loaded from: classes5.dex */
public abstract class cnez extends clb implements cnfa {
    public cnez() {
        super("com.google.android.gms.car.display.manager.ICarDisplayContentInsetsChangedListener");
    }

    @Override // defpackage.clb
    protected final boolean Sw(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            b((CarDisplayId) clc.d(parcel, CarDisplayId.CREATOR), (Rect) clc.d(parcel, Rect.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
