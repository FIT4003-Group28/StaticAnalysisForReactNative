package defpackage;

import android.os.SystemClock;
import com.google.android.gms.location.internal.ParcelableGeofence;
/* compiled from: PG */
/* renamed from: cokg  reason: default package */
/* loaded from: classes5.dex */
public final class cokg {
    private double g;
    private double h;
    private float i;
    public String a = null;
    public int b = 0;
    private long e = Long.MIN_VALUE;
    private short f = -1;
    public int c = 0;
    public int d = -1;

    public final ParcelableGeofence a() {
        String str = this.a;
        if (str != null) {
            int i = this.b;
            if (i == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if ((i & 4) != 0 && this.d < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long j = this.e;
            if (j == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if (this.f == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int i2 = this.c;
            if (i2 < 0) {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
            return new ParcelableGeofence(str, i, (short) 1, this.g, this.h, this.i, j, i2, this.d);
        }
        throw new IllegalArgumentException("Request ID not set.");
    }

    public final void b(double d, double d2, float f) {
        this.f = (short) 1;
        this.g = d;
        this.h = d2;
        this.i = f;
    }

    public final void c(long j) {
        if (j < 0) {
            this.e = -1L;
        } else {
            this.e = SystemClock.elapsedRealtime() + j;
        }
    }
}
