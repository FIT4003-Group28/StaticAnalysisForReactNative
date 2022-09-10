package defpackage;

import android.location.Address;
/* compiled from: PG */
/* renamed from: isk  reason: default package */
/* loaded from: classes6.dex */
public final class isk extends isq {
    public final akqq a;
    public final Address b;

    public isk(akqq akqqVar, @dzsi Address address) {
        this.a = akqqVar;
        this.b = address;
    }

    @Override // defpackage.isq
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.isq
    @dzsi
    public final Address b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Address address;
        if (obj == this) {
            return true;
        }
        if (obj instanceof isq) {
            isq isqVar = (isq) obj;
            if (this.a.equals(isqVar.a()) && ((address = this.b) != null ? address.equals(isqVar.b()) : isqVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Address address = this.b;
        return hashCode ^ (address == null ? 0 : address.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25 + String.valueOf(valueOf2).length());
        sb.append("Result{latLng=");
        sb.append(valueOf);
        sb.append(", address=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
