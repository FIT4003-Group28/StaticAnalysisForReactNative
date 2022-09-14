package com.google.android.gms.audit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LogAuditRecordsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogAuditRecordsRequest> CREATOR = new cmqt();
    public final int a;
    public final int b;
    @dzsi
    public final String c;
    public final byte[][] d;
    public final byte[] e;
    public final byte[] f;

    public LogAuditRecordsRequest(int i, int i2, @dzsi String str, byte[][] bArr, @dzsi byte[] bArr2, @dzsi byte[] bArr3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = bArr;
        this.e = bArr2;
        this.f = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.n(parcel, 4, this.d);
        cnwn.l(parcel, 5, this.e, false);
        cnwn.l(parcel, 6, this.f, false);
        cnwn.c(parcel, d);
    }
}
