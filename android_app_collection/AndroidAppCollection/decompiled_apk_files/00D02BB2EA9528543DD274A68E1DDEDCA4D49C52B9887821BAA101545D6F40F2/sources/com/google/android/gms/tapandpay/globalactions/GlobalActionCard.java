package com.google.android.gms.tapandpay.globalactions;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GlobalActionCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GlobalActionCard> CREATOR = new cpba();
    public int a;
    public String b;
    public Bitmap c;
    public String d;
    public String e;
    public String f;
    public Bitmap g;
    public PendingIntent h;

    private GlobalActionCard() {
    }

    public GlobalActionCard(int i, String str, Bitmap bitmap, String str2, String str3, String str4, Bitmap bitmap2, PendingIntent pendingIntent) {
        this.a = i;
        this.b = str;
        this.c = bitmap;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = bitmap2;
        this.h = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalActionCard) {
            GlobalActionCard globalActionCard = (GlobalActionCard) obj;
            if (cnvv.a(Integer.valueOf(this.a), Integer.valueOf(globalActionCard.a)) && cnvv.a(this.b, globalActionCard.b) && cnvv.a(this.c, globalActionCard.c) && cnvv.a(this.d, globalActionCard.d) && cnvv.a(this.e, globalActionCard.e) && cnvv.a(this.f, globalActionCard.f) && cnvv.a(this.g, globalActionCard.g) && cnvv.a(this.h, globalActionCard.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.u(parcel, 3, this.c, i);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.k(parcel, 5, this.e, false);
        cnwn.u(parcel, 6, this.g, i);
        cnwn.u(parcel, 7, this.h, i);
        cnwn.k(parcel, 8, this.f, false);
        cnwn.c(parcel, d);
    }
}
