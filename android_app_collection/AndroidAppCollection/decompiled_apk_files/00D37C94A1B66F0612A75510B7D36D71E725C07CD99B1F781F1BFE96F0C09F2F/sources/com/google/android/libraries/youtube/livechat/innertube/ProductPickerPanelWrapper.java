package com.google.android.libraries.youtube.livechat.innertube;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class ProductPickerPanelWrapper extends SupportedPickerPanelWrapper {
    public static final Parcelable.Creator CREATOR = new abjw(2);

    public ProductPickerPanelWrapper(Parcel parcel) {
        super((assi) ((ParcelableMessageLite) parcel.readParcelable(ParcelableMessageLite.class.getClassLoader())).a(assi.a));
    }

    @Override // com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper
    public final String a() {
        return ((assi) this.a).b;
    }

    @Override // com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper
    public final boolean b() {
        return ((assi) this.a).c.size() > 0;
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

    public ProductPickerPanelWrapper(assi assiVar) {
        super(assiVar);
    }
}
