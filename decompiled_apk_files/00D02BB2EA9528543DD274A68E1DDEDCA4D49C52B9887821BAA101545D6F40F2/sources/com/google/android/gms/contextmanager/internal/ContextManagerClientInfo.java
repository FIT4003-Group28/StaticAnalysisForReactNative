package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ContextManagerClientInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContextManagerClientInfo> CREATOR = new cnza();
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    private clcn l;

    public ContextManagerClientInfo(String str, String str2, int i, String str3, int i2, int i3, String str4, String str5, int i4, int i5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = i3;
        this.g = str4;
        this.h = str5;
        this.i = i4;
        this.j = i5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextManagerClientInfo)) {
            return false;
        }
        ContextManagerClientInfo contextManagerClientInfo = (ContextManagerClientInfo) obj;
        return this.c == contextManagerClientInfo.c && this.e == contextManagerClientInfo.e && this.f == contextManagerClientInfo.f && this.i == contextManagerClientInfo.i && TextUtils.equals(this.a, contextManagerClientInfo.a) && TextUtils.equals(this.b, contextManagerClientInfo.b) && TextUtils.equals(this.d, contextManagerClientInfo.d) && TextUtils.equals(this.g, contextManagerClientInfo.g) && TextUtils.equals(this.h, contextManagerClientInfo.h) && TextUtils.equals(this.k, contextManagerClientInfo.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g, this.h, Integer.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.g(parcel, 4, this.c);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.g(parcel, 6, this.e);
        cnwn.g(parcel, 7, this.f);
        cnwn.k(parcel, 8, this.g, false);
        cnwn.k(parcel, 9, this.h, false);
        cnwn.g(parcel, 10, this.i);
        cnwn.g(parcel, 11, this.j);
        cnwn.k(parcel, 12, this.k, false);
        cnwn.c(parcel, d);
    }

    public final String toString() {
        clcn clcnVar;
        String str = this.a;
        if (str == null) {
            clcnVar = null;
        } else {
            if (this.l == null) {
                this.l = new clcn(str);
            }
            clcnVar = this.l;
        }
        String valueOf = String.valueOf(clcnVar);
        String str2 = this.b;
        int i = this.c;
        String str3 = this.d;
        int i2 = this.e;
        String num = Integer.toString(this.f);
        String str4 = this.g;
        String str5 = this.h;
        int i3 = this.j;
        String str6 = this.k;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(num).length();
        int length5 = String.valueOf(str4).length();
        StringBuilder sb = new StringBuilder(length + 105 + length2 + length3 + length4 + length5 + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("(accnt=");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(str2);
        sb.append("(");
        sb.append(i);
        sb.append("):");
        sb.append(str3);
        sb.append(", vrsn=");
        sb.append(i2);
        sb.append(", ");
        sb.append(num);
        sb.append(", 3pPkg = ");
        sb.append(str4);
        sb.append(" ,  3pMdlId = ");
        sb.append(str5);
        sb.append(" ,  pid = ");
        sb.append(i3);
        sb.append(" ,  featureId = ");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
