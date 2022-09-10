package com.google.android.apps.gmm.directions.savedtrips.api;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: com.google.android.apps.gmm.directions.savedtrips.api.$AutoValue_SavedTrip_Data  reason: invalid class name */
/* loaded from: classes5.dex */
abstract class C$AutoValue_SavedTrip_Data extends SavedTrip.Data {
    public final amvh a;
    public final amvh b;
    public final dqvj c;
    public final dspd d;
    public final dbsg<dcdc<dspd>> e;
    public final int f;
    public final int g;

    public C$AutoValue_SavedTrip_Data(amvh amvhVar, amvh amvhVar2, dqvj dqvjVar, int i, dspd dspdVar, dbsg<dcdc<dspd>> dbsgVar, int i2) {
        this.a = amvhVar;
        if (amvhVar2 != null) {
            this.b = amvhVar2;
            if (dqvjVar != null) {
                this.c = dqvjVar;
                if (i != 0) {
                    this.f = i;
                    this.d = dspdVar;
                    if (dbsgVar != null) {
                        this.e = dbsgVar;
                        if (i2 != 0) {
                            this.g = i2;
                            return;
                        }
                        throw new NullPointerException("Null generatingFeature");
                    }
                    throw new NullPointerException("Null legTokens");
                }
                throw new NullPointerException("Null source");
            }
            throw new NullPointerException("Null travelMode");
        }
        throw new NullPointerException("Null destination");
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final amvh a() {
        return this.a;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final amvh b() {
        return this.b;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final dqvj c() {
        return this.c;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final dspd d() {
        return this.d;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final dbsg<dcdc<dspd>> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dspd dspdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SavedTrip.Data) {
            SavedTrip.Data data = (SavedTrip.Data) obj;
            amvh amvhVar = this.a;
            if (amvhVar != null ? amvhVar.equals(data.a()) : data.a() == null) {
                if (this.b.equals(data.b()) && this.c.equals(data.c()) && this.f == data.g() && ((dspdVar = this.d) != null ? dspdVar.equals(data.d()) : data.d() == null) && this.e.equals(data.e()) && this.g == data.h()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final wdr f() {
        return new wdj(this);
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final int g() {
        return this.f;
    }

    @Override // com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip.Data
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        amvh amvhVar = this.a;
        int i = 0;
        int hashCode = ((((((((amvhVar == null ? 0 : amvhVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f) * 1000003;
        dspd dspdVar = this.d;
        if (dspdVar != null) {
            i = dspdVar.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String a = wds.a(this.f);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(Integer.toString(this.g - 1));
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = a.length();
        int length5 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 94 + length2 + length3 + length4 + length5 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Data{origin=");
        sb.append(valueOf);
        sb.append(", destination=");
        sb.append(valueOf2);
        sb.append(", travelMode=");
        sb.append(valueOf3);
        sb.append(", source=");
        sb.append(a);
        sb.append(", routeToken=");
        sb.append(valueOf4);
        sb.append(", legTokens=");
        sb.append(valueOf5);
        sb.append(", generatingFeature=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
