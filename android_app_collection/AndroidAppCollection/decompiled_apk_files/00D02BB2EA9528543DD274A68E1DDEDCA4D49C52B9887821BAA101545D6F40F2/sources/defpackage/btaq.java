package defpackage;
/* compiled from: PG */
/* renamed from: btaq  reason: default package */
/* loaded from: classes4.dex */
final class btaq extends btav {
    private final boolean a;
    private final boolean b;

    public btaq(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.btav
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.btav
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btav) {
            btav btavVar = (btav) obj;
            if (this.a == btavVar.a() && this.b == btavVar.b()) {
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
        StringBuilder sb = new StringBuilder(95);
        sb.append("UserPrefsWrittenToServerEvent{privatePhotosOptOutChanged=");
        sb.append(z);
        sb.append(", optInPromoDismissUpdated=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
