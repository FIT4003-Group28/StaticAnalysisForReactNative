package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OptInRequest> CREATOR = new coqc();
    public final Account a;
    @dzsi
    public final String b;
    @dzsi
    public final String c;

    public OptInRequest(Account account, @dzsi String str, @dzsi String str2) {
        this.a = account;
        this.b = str;
        this.c = str2;
    }

    public OptInRequest(coqb coqbVar) {
        this.a = coqbVar.a;
        this.b = null;
        this.c = coqbVar.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptInRequest)) {
            return false;
        }
        OptInRequest optInRequest = (OptInRequest) obj;
        return this.a.equals(optInRequest.a) && cnvv.a(this.b, optInRequest.b) && cnvv.a(this.c, optInRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String a = coqs.a(this.a);
        String str = this.b;
        String str2 = this.c;
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append("UploadRequest{, mAccount=");
        sb.append(a);
        sb.append(", mTag='");
        sb.append(str);
        sb.append(", mAuditToken=");
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.c(parcel, d);
    }
}
