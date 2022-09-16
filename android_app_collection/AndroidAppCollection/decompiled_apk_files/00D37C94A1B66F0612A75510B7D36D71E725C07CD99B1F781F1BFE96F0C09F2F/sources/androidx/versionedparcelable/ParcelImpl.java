package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bpc();
    public final bpf a;

    public ParcelImpl(Parcel parcel) {
        this.a = new bpe(parcel).c();
    }

    public ParcelImpl(bpf bpfVar) {
        this.a = bpfVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new bpe(parcel).k(this.a);
    }
}
