package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
/* compiled from: PG */
/* renamed from: cxsm  reason: default package */
/* loaded from: classes5.dex */
public final class cxsm implements Parcelable.Creator<PeopleKitSelectionModel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitSelectionModel createFromParcel(Parcel parcel) {
        return new PeopleKitSelectionModel(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PeopleKitSelectionModel[] newArray(int i) {
        return new PeopleKitSelectionModel[i];
    }
}
