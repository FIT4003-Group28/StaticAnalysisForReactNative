package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: ahuz  reason: default package */
/* loaded from: classes2.dex */
public final class ahuz extends ahvg {
    public final Profile a;
    private final doep b;
    private final dbsg<ahvj> c;

    public ahuz(Profile profile, doep doepVar, dbsg<ahvj> dbsgVar) {
        if (profile != null) {
            this.a = profile;
            if (doepVar != null) {
                this.b = doepVar;
                this.c = dbsgVar;
                return;
            }
            throw new NullPointerException("Null location");
        }
        throw new NullPointerException("Null profile");
    }

    @Override // defpackage.ahvg
    public final Profile a() {
        return this.a;
    }

    @Override // defpackage.ahvg
    public final doep b() {
        return this.b;
    }

    @Override // defpackage.ahvg
    public final dbsg<ahvj> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahvg) {
            ahvg ahvgVar = (ahvg) obj;
            if (this.a.equals(ahvgVar.a()) && this.b.equals(ahvgVar.b()) && this.c.equals(ahvgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        doep doepVar = this.b;
        int i = doepVar.bC;
        if (i == 0) {
            i = dsst.a.b(doepVar).c(doepVar);
            doepVar.bC = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("IncomingShareInfo{profile=");
        sb.append(valueOf);
        sb.append(", location=");
        sb.append(valueOf2);
        sb.append(", journey=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
