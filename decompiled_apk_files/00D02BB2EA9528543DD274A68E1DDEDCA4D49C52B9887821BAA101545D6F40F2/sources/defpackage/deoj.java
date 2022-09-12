package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
/* compiled from: PG */
/* renamed from: deoj  reason: default package */
/* loaded from: classes6.dex */
public final class deoj implements Parcelable.Creator<ActionImpl.MetadataImpl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActionImpl.MetadataImpl createFromParcel(Parcel parcel) {
        int f = cnwm.f(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < f) {
            int readInt = parcel.readInt();
            switch (cnwm.b(readInt)) {
                case 1:
                    i = cnwm.i(parcel, readInt);
                    break;
                case 2:
                    z = cnwm.g(parcel, readInt);
                    break;
                case 3:
                    str = cnwm.o(parcel, readInt);
                    break;
                case 4:
                    str2 = cnwm.o(parcel, readInt);
                    break;
                case 5:
                    bArr = cnwm.s(parcel, readInt);
                    break;
                case 6:
                    z2 = cnwm.g(parcel, readInt);
                    break;
                default:
                    cnwm.d(parcel, readInt);
                    break;
            }
        }
        cnwm.B(parcel, f);
        return new ActionImpl.MetadataImpl(i, z, str, str2, bArr, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ActionImpl.MetadataImpl[] newArray(int i) {
        return new ActionImpl.MetadataImpl[i];
    }
}
