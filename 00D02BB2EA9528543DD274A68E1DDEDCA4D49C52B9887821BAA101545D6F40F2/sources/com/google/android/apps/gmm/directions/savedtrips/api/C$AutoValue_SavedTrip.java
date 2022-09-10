package com.google.android.apps.gmm.directions.savedtrips.api;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.savedtrips.api.$AutoValue_SavedTrip  reason: invalid class name */
/* loaded from: classes5.dex */
public abstract class C$AutoValue_SavedTrip extends SavedTrip {
    public final String a;
    public final SavedTrip.Data b;

    public C$AutoValue_SavedTrip(String str, SavedTrip.Data data) {
        if (str != null) {
            this.a = str;
            if (data != null) {
                this.b = data;
                return;
            }
            throw new NullPointerException("Null data");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip
    public final SavedTrip.Data b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip
    public final wdq c() {
        return new wdi(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SavedTrip) {
            SavedTrip savedTrip = (SavedTrip) obj;
            if (this.a.equals(savedTrip.a()) && this.b.equals(savedTrip.b())) {
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
        StringBuilder sb = new StringBuilder(str.length() + 21 + String.valueOf(valueOf).length());
        sb.append("SavedTrip{id=");
        sb.append(str);
        sb.append(", data=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
