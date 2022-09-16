package defpackage;
/* compiled from: PG */
/* renamed from: afdp  reason: default package */
/* loaded from: classes2.dex */
final class afdp extends afdt {
    private final int b;
    private final int c;
    private final boolean d;
    private final int e;
    private final int f;
    private final afds g;
    private final dktk h;
    private final boolean i;

    public afdp(int i, int i2, boolean z, int i3, int i4, afds afdsVar, @dzsi dktk dktkVar, boolean z2) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = i4;
        this.g = afdsVar;
        this.h = dktkVar;
        this.i = z2;
    }

    @Override // defpackage.afdt
    public final int a() {
        return this.b;
    }

    @Override // defpackage.afdt
    public final int b() {
        return this.c;
    }

    @Override // defpackage.afdt
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.afdt
    public final int d() {
        return this.e;
    }

    @Override // defpackage.afdt
    public final int e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        dktk dktkVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof afdt) {
            afdt afdtVar = (afdt) obj;
            if (this.b == afdtVar.a() && this.c == afdtVar.b() && this.d == afdtVar.c() && this.e == afdtVar.d() && this.f == afdtVar.e() && this.g.equals(afdtVar.f()) && ((dktkVar = this.h) != null ? dktkVar.equals(afdtVar.g()) : afdtVar.g() == null) && this.i == afdtVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.afdt
    public final afds f() {
        return this.g;
    }

    @Override // defpackage.afdt
    @dzsi
    public final dktk g() {
        return this.h;
    }

    @Override // defpackage.afdt
    public final boolean h() {
        return this.i;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003;
        dktk dktkVar = this.h;
        int hashCode2 = (hashCode ^ (dktkVar == null ? 0 : dktkVar.hashCode())) * 1000003;
        if (true == this.i) {
            i = 1231;
        }
        return hashCode2 ^ i;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        int i3 = this.e;
        int i4 = this.f;
        String valueOf = String.valueOf(this.g);
        String valueOf2 = String.valueOf(this.h);
        boolean z2 = this.i;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 245 + String.valueOf(valueOf2).length());
        sb.append("DisableIncognitoOptions{titleResId=");
        sb.append(i);
        sb.append(", titleContentDescriptionResId=");
        sb.append(i2);
        sb.append(", showToolbarNavigationButton=");
        sb.append(z);
        sb.append(", bodyResId=");
        sb.append(i3);
        sb.append(", buttonTextResId=");
        sb.append(i4);
        sb.append(", onDisableIncognitoCallback=");
        sb.append(valueOf);
        sb.append(", bottomTabType=");
        sb.append(valueOf2);
        sb.append(", searchboxEnabled=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
