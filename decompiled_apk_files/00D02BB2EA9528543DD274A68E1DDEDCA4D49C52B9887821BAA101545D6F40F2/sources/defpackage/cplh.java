package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;
/* compiled from: PG */
/* renamed from: cplh  reason: default package */
/* loaded from: classes5.dex */
public final class cplh implements Parcelable.Creator<ReportAbuseCardConfigParcel.ButtonState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAbuseCardConfigParcel.ButtonState createFromParcel(Parcel parcel) {
        return new ReportAbuseCardConfigParcel.ButtonState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAbuseCardConfigParcel.ButtonState[] newArray(int i) {
        return new ReportAbuseCardConfigParcel.ButtonState[i];
    }
}
