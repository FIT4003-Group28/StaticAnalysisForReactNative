package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApplicationMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(1);
    public String a;
    String b;
    List c;
    String d;
    Uri e;
    String f;
    public String g;

    private ApplicationMetadata() {
        this.c = new ArrayList();
    }

    public ApplicationMetadata(String str, String str2, List list, String str3, Uri uri, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplicationMetadata)) {
            return false;
        }
        ApplicationMetadata applicationMetadata = (ApplicationMetadata) obj;
        return qpl.j(this.a, applicationMetadata.a) && qpl.j(this.b, applicationMetadata.b) && qpl.j(this.c, applicationMetadata.c) && qpl.j(this.d, applicationMetadata.d) && qpl.j(this.e, applicationMetadata.e) && qpl.j(this.f, applicationMetadata.f) && qpl.j(this.g, applicationMetadata.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String str3 = this.d;
        String valueOf = String.valueOf(this.e);
        String str4 = this.f;
        String str5 = this.g;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 118 + length2 + length3 + String.valueOf(valueOf).length() + String.valueOf(str4).length() + String.valueOf(str5).length());
        sb.append("applicationId: ");
        sb.append(str);
        sb.append(", name: ");
        sb.append(str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        sb.append(", senderAppLaunchUrl: ");
        sb.append(valueOf);
        sb.append(", iconUrl: ");
        sb.append(str4);
        sb.append(", type: ");
        sb.append(str5);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.J(parcel, 4, null);
        tqj.H(parcel, 5, Collections.unmodifiableList(this.c));
        tqj.F(parcel, 6, this.d);
        tqj.E(parcel, 7, this.e, i);
        tqj.F(parcel, 8, this.f);
        tqj.F(parcel, 9, this.g);
        tqj.n(parcel, m);
    }
}
