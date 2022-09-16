package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.model.m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SubscriptionNotificationMenuData implements Parcelable {
    public final amuk b;
    public static final SubscriptionNotificationMenuData a = new SubscriptionNotificationMenuData(new ArrayList());
    public static final Parcelable.Creator CREATOR = new m(6);

    public SubscriptionNotificationMenuData(List list) {
        this.b = amuk.o(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SubscriptionNotificationMenuData)) {
            return false;
        }
        return amxp.v(this.b, ((SubscriptionNotificationMenuData) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray((SubscriptionNotificationMenuItem[]) this.b.toArray(new SubscriptionNotificationMenuItem[0]), i);
    }
}
