package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbsz  reason: default package */
/* loaded from: classes3.dex */
public final class bbsz extends bbvd {
    public final akqq a;
    public final boolean b;
    public final boolean c;

    public bbsz(@dzsi akqq akqqVar, boolean z, boolean z2) {
        this.a = akqqVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.bbvd
    @dzsi
    public final akqq a() {
        return this.a;
    }

    @Override // defpackage.bbvd
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bbvd
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bbvd
    public final bbvc d() {
        return new bbsy(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbvd) {
            bbvd bbvdVar = (bbvd) obj;
            akqq akqqVar = this.a;
            if (akqqVar != null ? akqqVar.equals(bbvdVar.a()) : bbvdVar.a() == null) {
                if (this.b == bbvdVar.b() && this.c == bbvdVar.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        akqq akqqVar = this.a;
        int i = 1237;
        int hashCode = ((((akqqVar == null ? 0 : akqqVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        if (true == this.c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
        sb.append("PlacePickerOptions{latLng=");
        sb.append(valueOf);
        sb.append(", shouldUseExifLocationFirst=");
        sb.append(z);
        sb.append(", showImmediately=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
