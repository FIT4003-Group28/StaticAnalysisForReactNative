package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
/* compiled from: PG */
/* renamed from: rvr  reason: default package */
/* loaded from: classes4.dex */
public class rvr extends dvd implements IInterface {
    public rvr() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void a(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        throw new IllegalStateException("Not implemented.");
    }

    public void b(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                a((Status) dve.a(parcel, Status.CREATOR), (UsageReportingOptInOptions) dve.a(parcel, UsageReportingOptInOptions.CREATOR));
                return true;
            case 3:
                Status status = (Status) dve.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) dve.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 5:
                b((Status) dve.a(parcel, Status.CREATOR));
                return true;
            case 6:
                Status status3 = (Status) dve.a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                throw new IllegalStateException("Not implemented.");
            case 7:
                Status status4 = (Status) dve.a(parcel, Status.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 8:
                Status status5 = (Status) dve.a(parcel, Status.CREATOR);
                dve.j(parcel);
                ConsentInformation consentInformation = (ConsentInformation) dve.a(parcel, ConsentInformation.CREATOR);
                throw new IllegalStateException("Not implemented.");
            case 9:
                Status status6 = (Status) dve.a(parcel, Status.CREATOR);
                ConsentInformation consentInformation2 = (ConsentInformation) dve.a(parcel, ConsentInformation.CREATOR);
                throw new IllegalStateException("Not implemented");
            default:
                return false;
        }
    }
}
