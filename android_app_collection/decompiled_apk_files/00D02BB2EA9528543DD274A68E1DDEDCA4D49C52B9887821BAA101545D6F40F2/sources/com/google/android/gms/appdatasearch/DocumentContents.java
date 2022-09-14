package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.BitSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DocumentContents> CREATOR = new cmpu();
    final DocumentSection[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocumentContents(Account account, DocumentSection... documentSectionArr) {
        this(documentSectionArr, null, false, account);
        if (documentSectionArr != null) {
            int length = cmpz.a.length;
            BitSet bitSet = new BitSet(10);
            for (DocumentSection documentSection : documentSectionArr) {
                int i = documentSection.e;
                if (i != -1) {
                    if (!bitSet.get(i)) {
                        bitSet.set(i);
                    } else {
                        String valueOf = String.valueOf(cmpz.a(i));
                        throw new IllegalArgumentException(valueOf.length() != 0 ? "Duplicate global search section type ".concat(valueOf) : new String("Duplicate global search section type "));
                    }
                }
            }
        }
    }

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            if (cnvv.a(this.b, documentContents.b) && cnvv.a(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && cnvv.a(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a)) {
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
        int d = cnwn.d(parcel);
        cnwn.x(parcel, 1, this.a, i);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.e(parcel, 3, this.c);
        cnwn.u(parcel, 4, this.d, i);
        cnwn.c(parcel, d);
    }
}
