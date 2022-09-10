package com.google.android.apps.gmm.directions.framework.fetch.api;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.framework.fetch.api.$AutoValue_FetchState  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_FetchState extends FetchState {
    public final FetchState.Fetch a;

    public C$AutoValue_FetchState(FetchState.Fetch fetch) {
        if (fetch != null) {
            this.a = fetch;
            return;
        }
        throw new NullPointerException("Null directionsFetch");
    }

    @Override // com.google.android.apps.gmm.directions.framework.fetch.api.FetchState
    public final FetchState.Fetch a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.framework.fetch.api.FetchState
    public final tgj b() {
        return new tga(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchState)) {
            return false;
        }
        return this.a.equals(((FetchState) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("FetchState{directionsFetch=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
