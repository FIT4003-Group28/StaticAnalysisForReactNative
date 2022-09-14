package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.AuthAccountResult;
/* compiled from: PG */
/* renamed from: cozc  reason: default package */
/* loaded from: classes5.dex */
public final class cozc implements Parcelable.Creator<AuthAccountResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AuthAccountResult createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            int b = cnwm.b(readInt);
            if (b == 1) {
                i = cnwm.i(parcel, readInt);
            } else if (b == 2) {
                i2 = cnwm.i(parcel, readInt);
            } else if (b != 3) {
                cnwm.d(parcel, readInt);
            } else {
                intent = (Intent) cnwm.q(parcel, readInt, Intent.CREATOR);
            }
        }
        cnwm.B(parcel, f);
        return new AuthAccountResult(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AuthAccountResult[] newArray(int i) {
        return new AuthAccountResult[i];
    }
}
