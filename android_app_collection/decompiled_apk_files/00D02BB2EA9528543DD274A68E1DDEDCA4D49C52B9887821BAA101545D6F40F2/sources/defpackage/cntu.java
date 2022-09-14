package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
/* compiled from: PG */
/* renamed from: cntu  reason: default package */
/* loaded from: classes.dex */
public final class cntu implements Parcelable.Creator<DataHolder> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                strArr = cnwm.w(parcel, readInt);
            } else if (b == 2) {
                cursorWindowArr = (CursorWindow[]) cnwm.z(parcel, readInt, CursorWindow.CREATOR);
            } else if (b == 3) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b == 4) {
                bundle = cnwm.r(parcel, readInt);
            } else if (b != 1000) {
                cnwm.d(parcel, readInt);
            } else {
                i = cnwm.i(parcel, readInt);
            }
        }
        cnwm.B(parcel, f);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.a();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
