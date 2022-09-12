package com.google.android.apps.auto.sdk.nav.state;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.auto.sdk.AbstractBundleable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class DestinationDistance extends AbstractBundleable {
    public static final Parcelable.Creator<DestinationDistance> CREATOR = new cld(DestinationDistance.class);
    private Distance a;
    private String b;
    private long c;

    public DestinationDistance() {
        this.c = -1L;
    }

    public DestinationDistance(Distance distance, String str, long j) {
        this.a = distance;
        this.b = str;
        this.c = j;
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    protected final void a(Bundle bundle) {
        bundle.putParcelable("distance", this.a);
        bundle.putString("estimated_time_of_arrival", this.b);
        bundle.putLong("time_to_destination_seconds", this.c);
    }

    @Override // com.google.android.apps.auto.sdk.AbstractBundleable
    public final void b(Bundle bundle) {
        this.a = (Distance) bundle.getParcelable("distance");
        this.b = bundle.getString("estimated_time_of_arrival");
        this.c = bundle.getLong("time_to_destination_seconds", -1L);
    }
}
