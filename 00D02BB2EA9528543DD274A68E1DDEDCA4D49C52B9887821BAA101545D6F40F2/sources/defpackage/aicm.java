package defpackage;

import com.google.android.apps.gmm.locationsharing.api.Profile;
/* compiled from: PG */
/* renamed from: aicm  reason: default package */
/* loaded from: classes2.dex */
final class aicm extends aicq {
    private final Profile a;
    private final eaow b;
    private final ahvf c;
    private final dbsg<dhjz> d;
    private final int e;
    private final dbsg<ahvj> f;
    private final dbsg<dqyh> g;

    public aicm(Profile profile, eaow eaowVar, ahvf ahvfVar, dbsg<dhjz> dbsgVar, int i, dbsg<ahvj> dbsgVar2, dbsg<dqyh> dbsgVar3) {
        if (profile != null) {
            this.a = profile;
            if (eaowVar != null) {
                this.b = eaowVar;
                if (ahvfVar != null) {
                    this.c = ahvfVar;
                    if (dbsgVar != null) {
                        this.d = dbsgVar;
                        this.e = i;
                        if (dbsgVar2 != null) {
                            this.f = dbsgVar2;
                            this.g = dbsgVar3;
                            return;
                        }
                        throw new NullPointerException("Null journey");
                    }
                    throw new NullPointerException("Null estimatedLocation");
                }
                throw new NullPointerException("Null freshness");
            }
            throw new NullPointerException("Null locationAge");
        }
        throw new NullPointerException("Null profile");
    }

    @Override // defpackage.aicq
    public final Profile a() {
        return this.a;
    }

    @Override // defpackage.aicq
    public final eaow b() {
        return this.b;
    }

    @Override // defpackage.aicq
    public final ahvf c() {
        return this.c;
    }

    @Override // defpackage.aicq
    public final dbsg<dhjz> d() {
        return this.d;
    }

    @Override // defpackage.aicq
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aicq) {
            aicq aicqVar = (aicq) obj;
            if (this.a.equals(aicqVar.a()) && this.b.equals(aicqVar.b()) && this.c.equals(aicqVar.c()) && this.d.equals(aicqVar.d()) && this.e == aicqVar.e() && this.f.equals(aicqVar.f()) && this.g.equals(aicqVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aicq
    public final dbsg<ahvj> f() {
        return this.f;
    }

    @Override // defpackage.aicq
    public final dbsg<dqyh> g() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int i = this.e;
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder sb = new StringBuilder(length + 131 + length2 + length3 + length4 + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("ClusterableProfile{profile=");
        sb.append(valueOf);
        sb.append(", locationAge=");
        sb.append(valueOf2);
        sb.append(", freshness=");
        sb.append(valueOf3);
        sb.append(", estimatedLocation=");
        sb.append(valueOf4);
        sb.append(", accuracyMeters=");
        sb.append(i);
        sb.append(", journey=");
        sb.append(valueOf5);
        sb.append(", detectedActivity=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
