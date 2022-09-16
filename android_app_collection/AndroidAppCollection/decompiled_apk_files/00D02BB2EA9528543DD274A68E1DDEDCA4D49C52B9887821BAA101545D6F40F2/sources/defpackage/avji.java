package defpackage;
/* compiled from: PG */
/* renamed from: avji  reason: default package */
/* loaded from: classes3.dex */
public final class avji extends avkc {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;

    public avji(int i, int i2, boolean z, boolean z2) {
        this.c = i;
        this.d = i2;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.avkc
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.avkc
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.avkc
    public final int c() {
        return this.c;
    }

    @Override // defpackage.avkc
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avkc)) {
            return false;
        }
        avkc avkcVar = (avkc) obj;
        int i = this.c;
        int c = avkcVar.c();
        if (i == 0) {
            throw null;
        }
        if (i == c) {
            int i2 = this.d;
            int d = avkcVar.d();
            if (i2 == 0) {
                throw null;
            }
            if (i2 == d && this.a == avkcVar.a() && this.b == avkcVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int b = (((((avkb.b(this.c) ^ 1000003) * 1000003) ^ avkb.b(this.d)) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return b ^ i;
    }

    public final String toString() {
        String a = avkb.a(this.c);
        String a2 = avkb.a(this.d);
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 156 + String.valueOf(a2).length());
        sb.append("OfflineConnectivity{downloadConnectivity=");
        sb.append(a);
        sb.append(", downloadConnectivityIgnoringWifiOnlySetting=");
        sb.append(a2);
        sb.append(", connectivityForAutoUpdate=");
        sb.append(z);
        sb.append(", shouldConfirmManualDownload=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
