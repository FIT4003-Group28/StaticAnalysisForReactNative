package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
/* compiled from: PG */
/* renamed from: dsuu  reason: default package */
/* loaded from: classes6.dex */
public final class dsuu implements Parcelable.Creator<ProtoParsers$InternalDontUse<?>> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProtoParsers$InternalDontUse<?> createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new ProtoParsers$InternalDontUse<>(bArr, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProtoParsers$InternalDontUse<?>[] newArray(int i) {
        return new ProtoParsers$InternalDontUse[i];
    }
}
