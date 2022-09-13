package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<AppCompatSpinner$SavedState> CREATOR = new yc();
    public boolean a;

    public AppCompatSpinner$SavedState(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public AppCompatSpinner$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}