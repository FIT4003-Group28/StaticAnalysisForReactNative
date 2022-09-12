package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.shared.util.io.ProtoBufUtil$ParcelableProtoList;
/* compiled from: PG */
/* renamed from: bvrr  reason: default package */
/* loaded from: classes4.dex */
public final class bvrr implements Parcelable.Creator<ProtoBufUtil$ParcelableProtoList<? extends dssj>> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProtoBufUtil$ParcelableProtoList<? extends dssj> createFromParcel(Parcel parcel) {
        byte[] bArr;
        int i;
        try {
            i = parcel.readInt();
            bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
        } catch (RuntimeException unused) {
            bArr = new byte[0];
            i = -1;
        }
        return new ProtoBufUtil$ParcelableProtoList<>(bArr, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ProtoBufUtil$ParcelableProtoList<? extends dssj>[] newArray(int i) {
        return new ProtoBufUtil$ParcelableProtoList[i];
    }
}
