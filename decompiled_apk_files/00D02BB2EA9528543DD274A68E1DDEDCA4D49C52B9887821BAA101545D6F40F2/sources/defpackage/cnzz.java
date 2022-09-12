package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.droidguard.internal.DroidGuardInitReply;
/* compiled from: PG */
/* renamed from: cnzz  reason: default package */
/* loaded from: classes5.dex */
public final class cnzz implements Parcelable.Creator<DroidGuardInitReply> {
    @Override // android.os.Parcelable.Creator
    @dzsi
    public final /* bridge */ /* synthetic */ DroidGuardInitReply createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        Parcelable readParcelable = parcel.readParcelable(getClass().getClassLoader());
        boolean z = false;
        boolean z2 = parcelFileDescriptor == null;
        if (readParcelable == null) {
            z = true;
        }
        if (z2 == z) {
            return new DroidGuardInitReply(parcelFileDescriptor, readParcelable);
        }
        return null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ DroidGuardInitReply[] newArray(int i) {
        return new DroidGuardInitReply[i];
    }
}
