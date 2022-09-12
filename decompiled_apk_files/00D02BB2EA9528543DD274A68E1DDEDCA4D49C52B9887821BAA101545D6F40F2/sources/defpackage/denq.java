package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
/* compiled from: PG */
/* renamed from: denq  reason: default package */
/* loaded from: classes6.dex */
public final class denq implements Parcelable.Creator<ActionImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActionImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ActionImpl.MetadataImpl metadataImpl = null;
        String str5 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 2:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 3:
                    str3 = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    str4 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    metadataImpl = (ActionImpl.MetadataImpl) cnwm.q(parcel, readInt, ActionImpl.MetadataImpl.CREATOR);
                    break;
                case 6:
                    str5 = cnwm.o(parcel, readInt);
                    break;
                case 7:
                    bundle = cnwm.r(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ActionImpl(str, str2, str3, str4, metadataImpl, str5, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActionImpl[] newArray(int i) {
        return new ActionImpl[i];
    }
}
