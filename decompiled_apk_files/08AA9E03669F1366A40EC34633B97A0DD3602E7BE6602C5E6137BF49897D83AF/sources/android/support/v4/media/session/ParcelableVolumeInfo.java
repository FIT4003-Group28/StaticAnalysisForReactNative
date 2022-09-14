package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public int f599a;

    /* renamed from: b  reason: collision with root package name */
    public int f600b;

    /* renamed from: c  reason: collision with root package name */
    public int f601c;

    /* renamed from: d  reason: collision with root package name */
    public int f602d;
    public int e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f599a = parcel.readInt();
        this.f601c = parcel.readInt();
        this.f602d = parcel.readInt();
        this.e = parcel.readInt();
        this.f600b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f599a);
        parcel.writeInt(this.f601c);
        parcel.writeInt(this.f602d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f600b);
    }
}
