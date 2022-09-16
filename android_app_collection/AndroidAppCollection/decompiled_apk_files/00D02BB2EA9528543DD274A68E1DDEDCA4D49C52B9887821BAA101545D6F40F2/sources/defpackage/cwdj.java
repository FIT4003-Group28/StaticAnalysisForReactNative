package defpackage;
/* compiled from: PG */
/* renamed from: cwdj  reason: default package */
/* loaded from: classes.dex */
final class cwdj extends cwdr {
    private final boolean a;
    private final boolean b;

    public cwdj(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.cwdr
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.cwdr
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwdr) {
            cwdr cwdrVar = (cwdr) obj;
            if (this.a == cwdrVar.a() && this.b == cwdrVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return i2 ^ i;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(69);
        sb.append("RestrictedConfiguration{hideRecentAccounts=");
        sb.append(z);
        sb.append(", enableSuperG=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
