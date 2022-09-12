package com.google.android.apps.gmm.directions.framework.details;

import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
import com.google.android.filament.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.framework.details.$AutoValue_TripDetailsContext  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_TripDetailsContext extends TripDetailsContext {
    public final boolean a;
    public final dbsg b;
    public final dbsg<TripDetailsContext.ModelGroupAndTripDetailsContext> c;
    public final dbsg<TripDetailsContext.TaxiTripDetailsContext> d;

    public C$AutoValue_TripDetailsContext(boolean z, dbsg dbsgVar, dbsg<TripDetailsContext.ModelGroupAndTripDetailsContext> dbsgVar2, dbsg<TripDetailsContext.TaxiTripDetailsContext> dbsgVar3) {
        this.a = z;
        if (dbsgVar != null) {
            this.b = dbsgVar;
            this.c = dbsgVar2;
            this.d = dbsgVar3;
            return;
        }
        throw new NullPointerException("Null tripCardLoggingMetadata");
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext
    public final boolean a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext
    public final dbsg b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext
    public final dbsg<TripDetailsContext.ModelGroupAndTripDetailsContext> c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext
    public final dbsg<TripDetailsContext.TaxiTripDetailsContext> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TripDetailsContext) {
            TripDetailsContext tripDetailsContext = (TripDetailsContext) obj;
            if (this.a == tripDetailsContext.a() && this.b.equals(tripDetailsContext.b()) && this.c.equals(tripDetailsContext.c()) && this.d.equals(tripDetailsContext.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_toolbarStyle + length2 + String.valueOf(valueOf3).length());
        sb.append("TripDetailsContext{allowTripSelection=");
        sb.append(z);
        sb.append(", tripCardLoggingMetadata=");
        sb.append(valueOf);
        sb.append(", groupAndTripContext=");
        sb.append(valueOf2);
        sb.append(", taxiDetailsContext=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
