package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: snj  reason: default package */
/* loaded from: classes7.dex */
public final class snj extends spi {
    private final amvh a;
    private final dcdc<sph> b;

    public snj(amvh amvhVar, dcdc<sph> dcdcVar) {
        if (amvhVar != null) {
            this.a = amvhVar;
            if (dcdcVar != null) {
                this.b = dcdcVar;
                return;
            }
            throw new NullPointerException("Null trips");
        }
        throw new NullPointerException("Null destination");
    }

    @Override // defpackage.spi
    public final amvh a() {
        return this.a;
    }

    @Override // defpackage.spi
    public final dcdc<sph> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spi) {
            spi spiVar = (spi) obj;
            if (this.a.equals(spiVar.a()) && dchl.m(this.b, spiVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("LoggedSavedDestination{destination=");
        sb.append(valueOf);
        sb.append(", trips=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
