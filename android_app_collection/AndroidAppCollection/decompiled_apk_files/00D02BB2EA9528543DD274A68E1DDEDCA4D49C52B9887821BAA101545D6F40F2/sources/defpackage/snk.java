package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* renamed from: snk  reason: default package */
/* loaded from: classes7.dex */
final class snk extends sph {
    private final SavedTrip a;
    private final String b;

    public snk(SavedTrip savedTrip, String str) {
        if (savedTrip != null) {
            this.a = savedTrip;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null dataElementReference");
        }
        throw new NullPointerException("Null trip");
    }

    @Override // defpackage.sph
    public final SavedTrip a() {
        return this.a;
    }

    @Override // defpackage.sph
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sph) {
            sph sphVar = (sph) obj;
            if (this.a.equals(sphVar.a()) && this.b.equals(sphVar.b())) {
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
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45 + str.length());
        sb.append("LoggedSavedTrip{trip=");
        sb.append(valueOf);
        sb.append(", dataElementReference=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
