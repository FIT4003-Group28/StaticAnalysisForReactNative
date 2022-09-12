package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
/* compiled from: PG */
/* renamed from: gi  reason: default package */
/* loaded from: classes6.dex */
public final class gi implements Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentManager$LaunchedFragmentInfo createFromParcel(Parcel parcel) {
        return new FragmentManager$LaunchedFragmentInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ FragmentManager$LaunchedFragmentInfo[] newArray(int i) {
        return new FragmentManager$LaunchedFragmentInfo[i];
    }
}
