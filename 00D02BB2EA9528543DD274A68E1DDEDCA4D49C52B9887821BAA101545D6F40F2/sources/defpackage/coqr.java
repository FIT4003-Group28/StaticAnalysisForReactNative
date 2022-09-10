package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.places.PlaceReport;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.location.reporting.SendDataRequest;
import com.google.android.gms.location.reporting.UlrPrivateModeRequest;
import com.google.android.gms.location.reporting.UploadRequest;
import com.google.android.gms.location.reporting.UploadRequestResult;
/* compiled from: PG */
/* renamed from: coqr  reason: default package */
/* loaded from: classes.dex */
public final class coqr extends cla implements IInterface {
    public coqr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.reporting.internal.IReportingService");
    }

    public final ReportingState e(Account account) {
        Parcel a = a();
        clc.e(a, account);
        Parcel Si = Si(1, a);
        ReportingState reportingState = (ReportingState) clc.d(Si, ReportingState.CREATOR);
        Si.recycle();
        return reportingState;
    }

    public final int f(OptInRequest optInRequest) {
        Parcel a = a();
        clc.e(a, optInRequest);
        Parcel Si = Si(6, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final UploadRequestResult g(UploadRequest uploadRequest) {
        Parcel a = a();
        clc.e(a, uploadRequest);
        Parcel Si = Si(3, a);
        UploadRequestResult uploadRequestResult = (UploadRequestResult) clc.d(Si, UploadRequestResult.CREATOR);
        Si.recycle();
        return uploadRequestResult;
    }

    public final int h(long j) {
        Parcel a = a();
        a.writeLong(j);
        Parcel Si = Si(4, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final int i(Account account, PlaceReport placeReport) {
        Parcel a = a();
        clc.e(a, account);
        clc.e(a, placeReport);
        Parcel Si = Si(5, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final int j(Account account, SendDataRequest sendDataRequest) {
        Parcel a = a();
        clc.e(a, account);
        clc.e(a, sendDataRequest);
        Parcel Si = Si(7, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }

    public final int k(UlrPrivateModeRequest ulrPrivateModeRequest) {
        Parcel a = a();
        clc.e(a, ulrPrivateModeRequest);
        Parcel Si = Si(8, a);
        int readInt = Si.readInt();
        Si.recycle();
        return readInt;
    }
}
