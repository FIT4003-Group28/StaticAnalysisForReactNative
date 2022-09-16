package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qhh();
    final DocumentSection[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            if (tnk.j(this.b, documentContents.b) && tnk.j(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && tnk.j(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.I(parcel, 1, this.a, i);
        tqj.F(parcel, 2, this.b);
        tqj.o(parcel, 3, this.c);
        tqj.E(parcel, 4, this.d, i);
        tqj.n(parcel, m);
    }
}
