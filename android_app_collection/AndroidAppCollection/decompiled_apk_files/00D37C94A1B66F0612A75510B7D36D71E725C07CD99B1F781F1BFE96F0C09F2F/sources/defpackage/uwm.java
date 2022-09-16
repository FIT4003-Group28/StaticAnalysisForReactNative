package defpackage;
/* compiled from: PG */
/* renamed from: uwm  reason: default package */
/* loaded from: classes4.dex */
public final class uwm implements uum {
    public final int a;

    public uwm() {
    }

    public uwm(byte[] bArr) {
        this.a = 1;
    }

    @Override // defpackage.uum
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.uum
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uwm)) {
            return false;
        }
        int i = this.a;
        if (i != ((uwm) obj).a) {
            z = false;
        }
        if (i == 0) {
            throw null;
        }
        return z;
    }

    public final int hashCode() {
        uun.b(this.a);
        return 1000002;
    }

    public final String toString() {
        String a = uun.a(this.a);
        StringBuilder sb = new StringBuilder(a.length() + 42);
        sb.append("ApplicationExitConfigurations{enablement=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
