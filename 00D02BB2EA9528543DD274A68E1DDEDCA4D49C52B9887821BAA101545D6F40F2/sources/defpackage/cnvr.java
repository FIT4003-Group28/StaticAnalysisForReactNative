package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
/* compiled from: PG */
/* renamed from: cnvr  reason: default package */
/* loaded from: classes5.dex */
public final class cnvr extends cla implements IInterface {
    public cnvr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean e(GoogleCertificatesQuery googleCertificatesQuery, coba cobaVar) {
        Parcel a = a();
        clc.e(a, googleCertificatesQuery);
        clc.f(a, cobaVar);
        Parcel Si = Si(5, a);
        boolean a2 = clc.a(Si);
        Si.recycle();
        return a2;
    }

    public final GoogleCertificatesLookupResponse f(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
        Parcel a = a();
        clc.e(a, googleCertificatesLookupQuery);
        Parcel Si = Si(6, a);
        GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) clc.d(Si, GoogleCertificatesLookupResponse.CREATOR);
        Si.recycle();
        return googleCertificatesLookupResponse;
    }

    public final boolean g() {
        Parcel Si = Si(7, a());
        boolean a = clc.a(Si);
        Si.recycle();
        return a;
    }
}
