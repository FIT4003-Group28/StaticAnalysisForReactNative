package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.abuse.reporting.ReportAbuseCardConfigParcel;
/* compiled from: PG */
/* renamed from: cplg  reason: default package */
/* loaded from: classes5.dex */
public final class cplg implements Parcelable.Creator<ReportAbuseCardConfigParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAbuseCardConfigParcel createFromParcel(Parcel parcel) {
        try {
            return new ReportAbuseCardConfigParcel(parcel);
        } catch (dsrm unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ReportAbuseCardConfigParcel[] newArray(int i) {
        return new ReportAbuseCardConfigParcel[i];
    }
}
