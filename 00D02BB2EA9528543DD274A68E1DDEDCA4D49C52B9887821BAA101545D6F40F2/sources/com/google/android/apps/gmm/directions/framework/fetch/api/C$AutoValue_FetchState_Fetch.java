package com.google.android.apps.gmm.directions.framework.fetch.api;

import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.framework.fetch.api.$AutoValue_FetchState_Fetch  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_FetchState_Fetch extends FetchState.Fetch {
    public final tgk a;
    public final dbsg<bttq> b;

    public C$AutoValue_FetchState_Fetch(tgk tgkVar, dbsg<bttq> dbsgVar) {
        if (tgkVar != null) {
            this.a = tgkVar;
            if (dbsgVar != null) {
                this.b = dbsgVar;
                return;
            }
            throw new NullPointerException("Null errorCode");
        }
        throw new NullPointerException("Null loadingStatus");
    }

    @Override // com.google.android.apps.gmm.directions.framework.fetch.api.FetchState.Fetch
    public final tgk a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.framework.fetch.api.FetchState.Fetch
    public final dbsg<bttq> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchState.Fetch) {
            FetchState.Fetch fetch = (FetchState.Fetch) obj;
            if (this.a.equals(fetch.a()) && this.b.equals(fetch.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(valueOf2).length());
        sb.append("Fetch{loadingStatus=");
        sb.append(valueOf);
        sb.append(", errorCode=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
