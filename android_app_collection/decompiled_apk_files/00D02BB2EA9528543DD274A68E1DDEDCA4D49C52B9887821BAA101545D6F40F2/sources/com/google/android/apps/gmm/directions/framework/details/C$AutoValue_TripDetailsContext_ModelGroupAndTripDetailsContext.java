package com.google.android.apps.gmm.directions.framework.details;

import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.framework.details.$AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext extends TripDetailsContext.ModelGroupAndTripDetailsContext {
    public final String a;
    public final dbsg<Integer> b;

    public C$AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext(String str, dbsg<Integer> dbsgVar) {
        if (str != null) {
            this.a = str;
            if (dbsgVar != null) {
                this.b = dbsgVar;
                return;
            }
            throw new NullPointerException("Null tripIndexOverride");
        }
        throw new NullPointerException("Null groupId");
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext.ModelGroupAndTripDetailsContext
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.framework.details.TripDetailsContext.ModelGroupAndTripDetailsContext
    public final dbsg<Integer> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TripDetailsContext.ModelGroupAndTripDetailsContext) {
            TripDetailsContext.ModelGroupAndTripDetailsContext modelGroupAndTripDetailsContext = (TripDetailsContext.ModelGroupAndTripDetailsContext) obj;
            if (this.a.equals(modelGroupAndTripDetailsContext.a()) && this.b.equals(modelGroupAndTripDetailsContext.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 61 + String.valueOf(valueOf).length());
        sb.append("ModelGroupAndTripDetailsContext{groupId=");
        sb.append(str);
        sb.append(", tripIndexOverride=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
