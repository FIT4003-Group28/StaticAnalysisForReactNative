package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TokenReference extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenReference> CREATOR = new cpaw();
    String a;
    int b;

    public TokenReference(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenReference) {
            TokenReference tokenReference = (TokenReference) obj;
            if (cnvv.a(this.a, tokenReference.a) && this.b == tokenReference.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("tokenReferenceId", this.a);
        b.a("tokenProvider", Integer.valueOf(this.b));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.g(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
