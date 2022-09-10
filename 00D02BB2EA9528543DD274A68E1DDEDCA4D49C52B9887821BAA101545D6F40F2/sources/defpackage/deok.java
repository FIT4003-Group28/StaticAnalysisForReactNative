package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;
/* compiled from: PG */
/* renamed from: deok  reason: default package */
/* loaded from: classes6.dex */
public final class deok implements Parcelable.Creator<MutateRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MutateRequest createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        Thing[] thingArr = null;
        String[] strArr = null;
        String[] strArr2 = null;
        ActionImpl actionImpl = null;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    thingArr = (Thing[]) cnwm.z(parcel, readInt, Thing.CREATOR);
                    break;
                case 3:
                    strArr = cnwm.w(parcel, readInt);
                    break;
                case 4:
                default:
                    cnwm.d(parcel, readInt);
                    break;
                case 5:
                    strArr2 = cnwm.w(parcel, readInt);
                    break;
                case 6:
                    actionImpl = (ActionImpl) cnwm.q(parcel, readInt, ActionImpl.CREATOR);
                    break;
                case 7:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 8:
                    str2 = cnwm.o(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new MutateRequest(i, thingArr, strArr, strArr2, actionImpl, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MutateRequest[] newArray(int i) {
        return new MutateRequest[i];
    }
}
