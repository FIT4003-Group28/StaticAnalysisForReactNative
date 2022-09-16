package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;
    private List c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new ruc(4);
        public final String a;
        public final byte[] b;
        public List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return tnk.j(this.a, accountConsentInformation.a) && tnk.j(this.b, accountConsentInformation.b) && tnk.j(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int m = tqj.m(parcel);
            tqj.F(parcel, 1, this.a);
            tqj.w(parcel, 2, this.b);
            tqj.A(parcel, 3, new ArrayList(this.c));
            tqj.n(parcel, m);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new ruc(5);
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return tnk.j(this.c, consentInformation.c) && tnk.j(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.J(parcel, 1, new ArrayList(this.c));
        tqj.o(parcel, 2, this.a);
        tqj.o(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
