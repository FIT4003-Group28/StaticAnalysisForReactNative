package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ActionImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionImpl> CREATOR = new denq();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MetadataImpl e;
    public final String f;
    public final Bundle g;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class MetadataImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator<MetadataImpl> CREATOR = new deoj();
        public int a;
        public final boolean b;
        public final String c;
        public final String d;
        public final byte[] e;
        public final boolean f;

        public MetadataImpl(int i, boolean z, String str, String str2, byte[] bArr, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = bArr;
            this.f = z2;
        }

        public MetadataImpl(boolean z) {
            this.a = 0;
            this.b = z;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = false;
        }

        public final String toString() {
            byte[] bArr;
            StringBuilder sb = new StringBuilder();
            sb.append("MetadataImpl { ");
            sb.append("{ eventStatus: '");
            sb.append(this.a);
            sb.append("' } ");
            sb.append("{ uploadable: '");
            sb.append(this.b);
            sb.append("' } ");
            if (this.c != null) {
                sb.append("{ completionToken: '");
                sb.append(this.c);
                sb.append("' } ");
            }
            if (this.d != null) {
                sb.append("{ accountName: '");
                sb.append(this.d);
                sb.append("' } ");
            }
            if (this.e != null) {
                sb.append("{ ssbContext: [ ");
                for (byte b : this.e) {
                    sb.append("0x");
                    sb.append(Integer.toHexString(b));
                    sb.append(" ");
                }
                sb.append("] } ");
            }
            sb.append("{ contextOnly: '");
            sb.append(this.f);
            sb.append("' } ");
            sb.append("}");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.g(parcel, 1, this.a);
            cnwn.e(parcel, 2, this.b);
            cnwn.k(parcel, 3, this.c, false);
            cnwn.k(parcel, 4, this.d, false);
            cnwn.l(parcel, 5, this.e, false);
            cnwn.e(parcel, 6, this.f);
            cnwn.c(parcel, d);
        }
    }

    public ActionImpl(String str, String str2, String str3, String str4, MetadataImpl metadataImpl, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = metadataImpl;
        this.f = str5;
        if (bundle != null) {
            this.g = bundle;
        } else {
            this.g = Bundle.EMPTY;
        }
        this.g.setClassLoader(getClass().getClassLoader());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActionImpl { ");
        sb.append("{ actionType: '");
        sb.append(this.a);
        sb.append("' } ");
        sb.append("{ objectName: '");
        sb.append(this.b);
        sb.append("' } ");
        sb.append("{ objectUrl: '");
        sb.append(this.c);
        sb.append("' } ");
        if (this.d != null) {
            sb.append("{ objectSameAs: '");
            sb.append(this.d);
            sb.append("' } ");
        }
        if (this.e != null) {
            sb.append("{ metadata: '");
            sb.append(this.e.toString());
            sb.append("' } ");
        }
        if (this.f != null) {
            sb.append("{ actionStatus: '");
            sb.append(this.f);
            sb.append("' } ");
        }
        if (!this.g.isEmpty()) {
            sb.append("{ ");
            sb.append(this.g);
            sb.append(" } ");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.u(parcel, 5, this.e, i);
        cnwn.k(parcel, 6, this.f, false);
        cnwn.m(parcel, 7, this.g);
        cnwn.c(parcel, d);
    }
}
