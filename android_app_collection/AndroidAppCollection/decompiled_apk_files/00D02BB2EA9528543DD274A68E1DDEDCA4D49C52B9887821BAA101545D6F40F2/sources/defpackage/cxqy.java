package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
/* compiled from: PG */
/* renamed from: cxqy  reason: default package */
/* loaded from: classes5.dex */
public final class cxqy implements Parcelable.Creator<AutocompleteMatchInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutocompleteMatchInfo createFromParcel(Parcel parcel) {
        return new AutocompleteMatchInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AutocompleteMatchInfo[] newArray(int i) {
        return new AutocompleteMatchInfo[i];
    }
}
