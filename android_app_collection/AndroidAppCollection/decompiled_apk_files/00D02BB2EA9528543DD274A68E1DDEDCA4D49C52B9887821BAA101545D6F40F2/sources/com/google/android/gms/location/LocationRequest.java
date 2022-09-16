package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new colb();
    static final long DEFAULT_EXPIRE_AT = Long.MAX_VALUE;
    static final boolean DEFAULT_EXPLICIT_FASTEST_INTERVAL = false;
    static final long DEFAULT_FASTEST_INTERVAL = 600000;
    static final long DEFAULT_INTERVAL = 3600000;
    static final long DEFAULT_MAX_WAIT_TIME = 0;
    static final int DEFAULT_NUM_UPDATES = Integer.MAX_VALUE;
    static final int DEFAULT_PRIORITY = 102;
    static final float DEFAULT_SMALLEST_DISPLACEMENT = 0.0f;
    static final boolean DEFAULT_WAIT_FOR_ACCURATE_LOCATION = false;
    private static final double FASTEST_INTERVAL_FACTOR = 6.0d;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    long expireAt;
    boolean explicitFastestInterval;
    long fastestInterval;
    long interval;
    long maxWaitTime;
    int numUpdates;
    int priority;
    float smallestDisplacement;
    boolean waitForAccurateLocation;

    @Deprecated
    public LocationRequest() {
        this.priority = 102;
        this.interval = DEFAULT_INTERVAL;
        this.fastestInterval = DEFAULT_FASTEST_INTERVAL;
        this.explicitFastestInterval = false;
        this.expireAt = DEFAULT_EXPIRE_AT;
        this.numUpdates = DEFAULT_NUM_UPDATES;
        this.smallestDisplacement = DEFAULT_SMALLEST_DISPLACEMENT;
        this.maxWaitTime = 0L;
        this.waitForAccurateLocation = false;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.priority = i;
        this.interval = j;
        this.fastestInterval = j2;
        this.explicitFastestInterval = z;
        this.expireAt = j3;
        this.numUpdates = i2;
        this.smallestDisplacement = f;
        this.maxWaitTime = j4;
        this.waitForAccurateLocation = z2;
    }

    public LocationRequest(LocationRequest locationRequest) {
        this.priority = locationRequest.priority;
        this.interval = locationRequest.interval;
        this.fastestInterval = locationRequest.fastestInterval;
        this.explicitFastestInterval = locationRequest.explicitFastestInterval;
        this.expireAt = locationRequest.expireAt;
        this.numUpdates = locationRequest.numUpdates;
        this.smallestDisplacement = locationRequest.smallestDisplacement;
        this.maxWaitTime = locationRequest.maxWaitTime;
        this.waitForAccurateLocation = locationRequest.waitForAccurateLocation;
    }

    private static void checkDisplacement(float f) {
        if (f >= DEFAULT_SMALLEST_DISPLACEMENT) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }

    private static void checkInterval(long j) {
        if (j >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    private static void checkPriority(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            return;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static LocationRequest create() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    public static String qualityToString(int i) {
        return i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.priority == locationRequest.priority && this.interval == locationRequest.interval && this.fastestInterval == locationRequest.fastestInterval && this.explicitFastestInterval == locationRequest.explicitFastestInterval && this.expireAt == locationRequest.expireAt && this.numUpdates == locationRequest.numUpdates && this.smallestDisplacement == locationRequest.smallestDisplacement && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.waitForAccurateLocation == locationRequest.waitForAccurateLocation;
    }

    public long getExpirationTime() {
        return this.expireAt;
    }

    public long getFastestInterval() {
        return this.fastestInterval;
    }

    public long getInterval() {
        return this.interval;
    }

    public long getMaxWaitTime() {
        long j = this.maxWaitTime;
        long j2 = this.interval;
        return j < j2 ? j2 : j;
    }

    public int getNumUpdates() {
        return this.numUpdates;
    }

    public int getPriority() {
        return this.priority;
    }

    public float getSmallestDisplacement() {
        return this.smallestDisplacement;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.priority), Long.valueOf(this.interval), Float.valueOf(this.smallestDisplacement), Long.valueOf(this.maxWaitTime)});
    }

    public boolean isBatched() {
        long j = this.maxWaitTime;
        return j / 2 >= this.interval && j > 0;
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.explicitFastestInterval;
    }

    public boolean isWaitForAccurateLocation() {
        return this.waitForAccurateLocation;
    }

    public LocationRequest setExpirationDuration(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = DEFAULT_EXPIRE_AT;
        if (j <= DEFAULT_EXPIRE_AT - elapsedRealtime) {
            j2 = j + elapsedRealtime;
        }
        this.expireAt = j2;
        if (j2 < 0) {
            this.expireAt = 0L;
        }
        return this;
    }

    public LocationRequest setExpirationTime(long j) {
        this.expireAt = j;
        if (j < 0) {
            this.expireAt = 0L;
        }
        return this;
    }

    public LocationRequest setFastestInterval(long j) {
        checkInterval(j);
        this.explicitFastestInterval = true;
        this.fastestInterval = j;
        return this;
    }

    public LocationRequest setInterval(long j) {
        checkInterval(j);
        this.interval = j;
        if (!this.explicitFastestInterval) {
            double d = j;
            Double.isNaN(d);
            this.fastestInterval = (long) (d / FASTEST_INTERVAL_FACTOR);
        }
        return this;
    }

    public LocationRequest setMaxWaitTime(long j) {
        checkInterval(j);
        this.maxWaitTime = j;
        return this;
    }

    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.numUpdates = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public LocationRequest setPriority(int i) {
        checkPriority(i);
        this.priority = i;
        return this;
    }

    public LocationRequest setSmallestDisplacement(float f) {
        checkDisplacement(f);
        this.smallestDisplacement = f;
        return this;
    }

    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.waitForAccurateLocation = z;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        sb.append(qualityToString(this.priority));
        if (this.priority != 105) {
            sb.append(" requested=");
            sb.append(this.interval);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.fastestInterval);
        sb.append("ms");
        if (this.maxWaitTime > this.interval) {
            sb.append(" maxWait=");
            sb.append(this.maxWaitTime);
            sb.append("ms");
        }
        if (this.smallestDisplacement > DEFAULT_SMALLEST_DISPLACEMENT) {
            sb.append(" smallestDisplacement=");
            sb.append(this.smallestDisplacement);
            sb.append("m");
        }
        long j = this.expireAt;
        if (j != DEFAULT_EXPIRE_AT) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.numUpdates != DEFAULT_NUM_UPDATES) {
            sb.append(" num=");
            sb.append(this.numUpdates);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.priority);
        cnwn.h(parcel, 2, this.interval);
        cnwn.h(parcel, 3, this.fastestInterval);
        cnwn.e(parcel, 4, this.explicitFastestInterval);
        cnwn.h(parcel, 5, this.expireAt);
        cnwn.g(parcel, 6, this.numUpdates);
        cnwn.i(parcel, 7, this.smallestDisplacement);
        cnwn.h(parcel, 8, this.maxWaitTime);
        cnwn.e(parcel, 9, this.waitForAccurateLocation);
        cnwn.c(parcel, d);
    }
}
