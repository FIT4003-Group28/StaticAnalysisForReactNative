package com.google.android.apps.gmm.directions.framework.details;

import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.framework.details.$AutoValue_TripDetailsContext_TaxiTripDetailsContext  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_TripDetailsContext_TaxiTripDetailsContext extends TripDetailsContext.TaxiTripDetailsContext {
    public final String a;
    public final Integer b;

    public C$AutoValue_TripDetailsContext_TaxiTripDetailsContext(String str, Integer num) {
        if (str != null) {
            this.a = str;
            this.b = num;
            return;
        }
        throw new NullPointerException("Null groupId");
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext.TaxiTripDetailsContext
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext.TaxiTripDetailsContext
    public final Integer b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TripDetailsContext.TaxiTripDetailsContext) {
            TripDetailsContext.TaxiTripDetailsContext taxiTripDetailsContext = (TripDetailsContext.TaxiTripDetailsContext) obj;
            if (this.a.equals(taxiTripDetailsContext.a()) && this.b.equals(taxiTripDetailsContext.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 59 + String.valueOf(valueOf).length());
        sb.append("TaxiTripDetailsContext{groupId=");
        sb.append(str);
        sb.append(", selectedProductTripIndex=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
