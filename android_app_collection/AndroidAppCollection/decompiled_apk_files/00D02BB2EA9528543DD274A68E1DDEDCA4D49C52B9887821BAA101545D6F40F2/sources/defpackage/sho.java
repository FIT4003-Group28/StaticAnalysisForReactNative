package defpackage;
/* compiled from: PG */
/* renamed from: sho  reason: default package */
/* loaded from: classes7.dex */
final class sho extends sih {
    public final dspd a;
    public final CharSequence b;

    public sho(dspd dspdVar, CharSequence charSequence) {
        if (dspdVar != null) {
            this.a = dspdVar;
            if (charSequence != null) {
                this.b = charSequence;
                return;
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null routeToken");
    }

    @Override // defpackage.sih
    public final dspd a() {
        return this.a;
    }

    @Override // defpackage.sih
    public final CharSequence b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sih) {
            sih sihVar = (sih) obj;
            if (this.a.equals(sihVar.a()) && this.b.equals(sihVar.b())) {
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
        CharSequence charSequence = this.b;
        String str = (String) charSequence;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + str.length());
        sb.append("CachedRouteDescription{routeToken=");
        sb.append(valueOf);
        sb.append(", description=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
