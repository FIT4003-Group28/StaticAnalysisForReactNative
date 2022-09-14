package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: aizz  reason: default package */
/* loaded from: classes2.dex */
public final class aizz extends ajac {
    public final dbsg<btlu> a;
    public final Profile b;

    public aizz(dbsg<btlu> dbsgVar, Profile profile) {
        this.a = dbsgVar;
        if (profile != null) {
            this.b = profile;
            return;
        }
        throw new NullPointerException("Null interestedProfile");
    }

    @Override // defpackage.ajac
    public final dbsg<btlu> a() {
        return this.a;
    }

    @Override // defpackage.ajac
    public final Profile b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajac) {
            ajac ajacVar = (ajac) obj;
            if (this.a.equals(ajacVar.a()) && this.b.equals(ajacVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("Target{interestedAccount=");
        sb.append(valueOf);
        sb.append(", interestedProfile=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
