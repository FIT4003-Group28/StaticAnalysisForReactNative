package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
/* compiled from: PG */
/* renamed from: rga  reason: default package */
/* loaded from: classes4.dex */
public final class rga extends dvd implements rgb {
    private final qvd a;

    public rga() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public final synchronized void a() {
        this.a.a();
    }

    public rga(qvd qvdVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.a = qvdVar;
    }

    @Override // defpackage.dvd
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.a.b(new rgo((LocationResult) dve.a(parcel, LocationResult.CREATOR)));
        } else if (i != 2) {
            return false;
        } else {
            this.a.b(new rgp((LocationAvailability) dve.a(parcel, LocationAvailability.CREATOR)));
        }
        return true;
    }
}
