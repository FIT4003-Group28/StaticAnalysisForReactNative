package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new cpax();
    TokenReference a;
    int b;
    boolean c;

    public TokenStatus(TokenReference tokenReference, int i, boolean z) {
        this.a = tokenReference;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj;
            if (cnvv.a(this.a, tokenStatus.a) && this.b == tokenStatus.b && this.c == tokenStatus.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("tokenReference", this.a);
        b.a("tokenState", Integer.valueOf(this.b));
        b.a("isSelected", Boolean.valueOf(this.c));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.g(parcel, 3, this.b);
        cnwn.e(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
