package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.abuse.reporting.ReportAbuseComponentState;
/* compiled from: PG */
/* renamed from: cplp  reason: default package */
/* loaded from: classes5.dex */
public final class cplp implements Parcelable.Creator<ReportAbuseComponentState> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAbuseComponentState createFromParcel(Parcel parcel) {
        try {
            return new ReportAbuseComponentState(parcel);
        } catch (dsrm unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAbuseComponentState[] newArray(int i) {
        return new ReportAbuseComponentState[i];
    }
}
