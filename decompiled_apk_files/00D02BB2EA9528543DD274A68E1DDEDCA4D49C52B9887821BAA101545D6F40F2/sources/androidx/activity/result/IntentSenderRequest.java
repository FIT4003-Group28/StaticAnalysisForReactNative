package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new agw();
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public IntentSenderRequest(IntentSender intentSender, int i, int i2) {
        this.a = intentSender;
        this.b = null;
        this.c = i;
        this.d = i2;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
