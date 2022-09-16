package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
/* compiled from: PG */
/* renamed from: coeo  reason: default package */
/* loaded from: classes5.dex */
public final class coeo implements Parcelable.Creator<OverflowMenuItem> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OverflowMenuItem createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        Intent intent = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 2) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 3) {
                str = cnwm.o(parcel, readInt);
            } else if (b != 4) {
                cnwm.d(parcel, readInt);
            } else {
                intent = (Intent) cnwm.q(parcel, readInt, Intent.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new OverflowMenuItem(i, str, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OverflowMenuItem[] newArray(int i) {
        return new OverflowMenuItem[i];
    }
}
