package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmdm  reason: default package */
/* loaded from: classes3.dex */
public final class bmdm extends bmds {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final dbsg<cjqm> g;

    public bmdm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, dbsg<cjqm> dbsgVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = dbsgVar;
    }

    @Override // defpackage.bmds
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.bmds
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.bmds
    public final boolean c() {
        return this.c;
    }

    @Override // defpackage.bmds
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bmds
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmds) {
            bmds bmdsVar = (bmds) obj;
            if (this.a == bmdsVar.a() && this.b == bmdsVar.b() && this.c == bmdsVar.c() && this.d == bmdsVar.d() && this.e == bmdsVar.e() && this.f == bmdsVar.f() && this.g.equals(bmdsVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bmds
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.bmds
    public final dbsg<cjqm> g() {
        return this.g;
    }

    @Override // defpackage.bmds
    public final bmdr h() {
        return new bmdl(this);
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        if (true == this.f) {
            i = 1231;
        }
        return ((i2 ^ i) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = this.f;
        String valueOf = String.valueOf(this.g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 198);
        sb.append("CallOptions{preferAdNumber=");
        sb.append(z);
        sb.append(", showRateDialogIfNeeded=");
        sb.append(z2);
        sb.append(", preferUserEditedNumber=");
        sb.append(z3);
        sb.append(", canUseProxyPhoneNumber=");
        sb.append(z4);
        sb.append(", canLogIAmHere=");
        sb.append(z5);
        sb.append(", canLogPersonalizationEvent=");
        sb.append(z6);
        sb.append(", loggedInteraction=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
