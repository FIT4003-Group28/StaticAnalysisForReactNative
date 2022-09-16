package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.onegoogle.popovercontainer.AutoValue_ExpandableDialogView_State;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
/* compiled from: PG */
/* renamed from: cwpd  reason: default package */
/* loaded from: classes5.dex */
public final class cwpd implements Parcelable.Creator<AutoValue_ExpandableDialogView_State> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ExpandableDialogView_State createFromParcel(Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new AutoValue_ExpandableDialogView_State(z, parcel.readParcelable(ExpandableDialogView.State.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutoValue_ExpandableDialogView_State[] newArray(int i) {
        return new AutoValue_ExpandableDialogView_State[i];
    }
}
