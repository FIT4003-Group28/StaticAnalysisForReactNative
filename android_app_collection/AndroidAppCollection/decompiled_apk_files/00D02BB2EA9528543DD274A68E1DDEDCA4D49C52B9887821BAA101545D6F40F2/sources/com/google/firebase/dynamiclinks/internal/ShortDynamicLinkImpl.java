package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ShortDynamicLinkImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShortDynamicLinkImpl> CREATOR = new deqj();
    public final Uri a;
    public final Uri b;
    public final List<WarningImpl> c;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class WarningImpl extends AbstractSafeParcelable {
        public static final Parcelable.Creator<WarningImpl> CREATOR = new deqk();
        public final String a;

        public WarningImpl(String str) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int d = cnwn.d(parcel);
            cnwn.k(parcel, 2, this.a, false);
            cnwn.c(parcel, d);
        }
    }

    public ShortDynamicLinkImpl(Uri uri, Uri uri2, List<WarningImpl> list) {
        this.a = uri;
        this.b = uri2;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 1, this.a, i);
        cnwn.u(parcel, 2, this.b, i);
        cnwn.y(parcel, 3, this.c);
        cnwn.c(parcel, d);
    }
}
