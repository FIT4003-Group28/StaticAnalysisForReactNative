package com.google.android.setupcompat.logging;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MetricKey implements Parcelable {
    public static final Parcelable.Creator<MetricKey> CREATOR = new daop();
    private static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    private final String a;
    private final String b;

    static {
        Pattern.compile("^([a-z]+[.])+[A-Z][a-zA-Z0-9]+");
        Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]+");
    }

    public MetricKey(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static MetricKey a(String str, Activity activity) {
        String className = activity.getComponentName().getClassName();
        daon.a(str, "MetricKey.name", 5, 30);
        daof.a(c.matcher(str).matches(), "Invalid MetricKey, only alpha numeric characters are allowed.");
        return new MetricKey(str, className);
    }

    public static Bundle b(MetricKey metricKey) {
        daof.c(metricKey, "MetricKey cannot be null.");
        Bundle bundle = new Bundle();
        bundle.putInt("MetricKey_version", 1);
        bundle.putString("MetricKey_name", metricKey.a);
        bundle.putString("MetricKey_screenName", metricKey.b);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricKey)) {
            return false;
        }
        MetricKey metricKey = (MetricKey) obj;
        return dapc.a(this.a, metricKey.a) && dapc.a(this.b, metricKey.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
