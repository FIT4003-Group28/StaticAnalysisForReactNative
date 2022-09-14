package com.google.android.setupcompat.logging;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator<CustomEvent> CREATOR = new daoo();
    public final long a;
    public final MetricKey b;
    public final PersistableBundle c;
    public final PersistableBundle d;

    public CustomEvent(long j, MetricKey metricKey, PersistableBundle persistableBundle, PersistableBundle persistableBundle2) {
        daof.a(j >= 0, "Timestamp cannot be negative.");
        daof.c(metricKey, "MetricKey cannot be null.");
        daof.c(persistableBundle, "Bundle cannot be null.");
        daof.a(!persistableBundle.isEmpty(), "Bundle cannot be empty.");
        daof.c(persistableBundle2, "piiValues cannot be null.");
        for (String str : persistableBundle.keySet()) {
            daon.a(str, "bundle key", 3, 50);
            Object obj = persistableBundle.get(str);
            if (obj instanceof String) {
                daof.a(((String) obj).length() <= 50, String.format("Maximum length of string value for key='%s' cannot exceed %s.", str, 50));
            }
        }
        this.a = j;
        this.b = metricKey;
        this.c = new PersistableBundle(persistableBundle);
        this.d = new PersistableBundle(persistableBundle2);
    }

    public static CustomEvent a(MetricKey metricKey, PersistableBundle persistableBundle) {
        boolean z = true;
        daof.a(Build.VERSION.SDK_INT >= 29, "The constructor only support on sdk Q or higher.");
        PersistableBundle persistableBundle2 = PersistableBundle.EMPTY;
        if (Build.VERSION.SDK_INT < 29) {
            z = false;
        }
        daof.a(z, "The constructor only support on sdk Q or higher");
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
        daoe.c(persistableBundle);
        daoe.c(persistableBundle2);
        return new CustomEvent(millis, metricKey, persistableBundle, persistableBundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomEvent)) {
            return false;
        }
        CustomEvent customEvent = (CustomEvent) obj;
        return this.a == customEvent.a && dapc.a(this.b, customEvent.b) && daoe.b(this.c, customEvent.c) && daoe.b(this.d, customEvent.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writePersistableBundle(this.c);
        parcel.writePersistableBundle(this.d);
    }
}
