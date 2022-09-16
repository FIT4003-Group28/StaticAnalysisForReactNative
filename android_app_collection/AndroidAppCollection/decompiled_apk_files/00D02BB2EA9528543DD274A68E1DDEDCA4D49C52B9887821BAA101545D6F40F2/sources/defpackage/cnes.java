package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
/* compiled from: PG */
/* renamed from: cnes  reason: default package */
/* loaded from: classes5.dex */
public final class cnes implements Parcelable.Creator<CarDisplay> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarDisplay createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        CarDisplayId carDisplayId = null;
        Point point = null;
        Rect rect = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    carDisplayId = (CarDisplayId) cnwm.q(parcel, readInt, CarDisplayId.CREATOR);
                    break;
                case 2:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 3:
                    i2 = cnwm.i(parcel, readInt);
                    break;
                case 4:
                    point = (Point) cnwm.q(parcel, readInt, Point.CREATOR);
                    break;
                case 5:
                    rect = (Rect) cnwm.q(parcel, readInt, Rect.CREATOR);
                    break;
                case 6:
                    i3 = cnwm.i(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new CarDisplay(carDisplayId, i, i2, point, rect, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CarDisplay[] newArray(int i) {
        return new CarDisplay[i];
    }
}
