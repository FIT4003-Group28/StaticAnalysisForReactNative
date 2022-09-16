package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
/* compiled from: PG */
/* renamed from: mk  reason: default package */
/* loaded from: classes7.dex */
public final class mk implements Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> {
    /* JADX WARN: Type inference failed for: r0v0, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaSessionCompat$ResultReceiverWrapper createFromParcel(final Parcel parcel) {
        return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new mk();
            ResultReceiver a;

            {
                this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel2, int i) {
                this.a.writeToParcel(parcel2, i);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ MediaSessionCompat$ResultReceiverWrapper[] newArray(int i) {
        return new MediaSessionCompat$ResultReceiverWrapper[i];
    }
}
