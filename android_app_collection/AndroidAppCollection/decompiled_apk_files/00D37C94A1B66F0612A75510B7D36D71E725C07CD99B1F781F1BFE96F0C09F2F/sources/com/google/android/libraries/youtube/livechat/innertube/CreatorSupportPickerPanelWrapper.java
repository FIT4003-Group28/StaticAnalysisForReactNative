package com.google.android.libraries.youtube.livechat.innertube;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class CreatorSupportPickerPanelWrapper extends SupportedPickerPanelWrapper {
    public static final Parcelable.Creator CREATOR = new abjw();

    public CreatorSupportPickerPanelWrapper(Parcel parcel) {
        super((asqj) ((ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader())).a(asqj.a));
    }

    @Override // com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper
    public final String a() {
        return ((asqj) this.a).b;
    }

    @Override // com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper
    public final boolean b() {
        return ((asqj) this.a).c.size() > 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, aoqu] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ParcelableMessageLite((aoqu) this.a), 0);
    }

    public CreatorSupportPickerPanelWrapper(asqj asqjVar) {
        super(asqjVar);
    }
}
