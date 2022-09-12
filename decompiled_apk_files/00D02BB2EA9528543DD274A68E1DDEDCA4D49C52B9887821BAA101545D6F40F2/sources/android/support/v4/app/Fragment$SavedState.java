package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes.dex */
public class Fragment$SavedState implements Parcelable {
    public static final Parcelable.Creator<Fragment$SavedState> CREATOR = new fc();
    public final Bundle a;

    public Fragment$SavedState(Bundle bundle) {
        this.a = bundle;
    }

    public Fragment$SavedState(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.a = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
