package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: aceb  reason: default package */
/* loaded from: classes2.dex */
public final class aceb extends acei {
    private final boolean a;
    private final int b;
    private final dcdc<acej> c;
    private final boolean d;
    private final btzy e;

    public aceb(boolean z, int i, dcdc<acej> dcdcVar, boolean z2, @dzsi btzy btzyVar) {
        this.a = z;
        this.b = i;
        if (dcdcVar != null) {
            this.c = dcdcVar;
            this.d = z2;
            this.e = btzyVar;
            return;
        }
        throw new NullPointerException("Null photos");
    }

    @Override // defpackage.acei
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.acei
    public final int b() {
        return this.b;
    }

    @Override // defpackage.acei
    public final dcdc<acej> c() {
        return this.c;
    }

    @Override // defpackage.acei
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.acei
    @dzsi
    public final btzy e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        btzy btzyVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof acei) {
            acei aceiVar = (acei) obj;
            if (this.a == aceiVar.a() && this.b == aceiVar.b() && dchl.m(this.c, aceiVar.c()) && this.d == aceiVar.d() && ((btzyVar = this.e) != null ? btzyVar.equals(aceiVar.e()) : aceiVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (true == this.d) {
            i = 1231;
        }
        int i2 = (hashCode ^ i) * 1000003;
        btzy btzyVar = this.e;
        return i2 ^ (btzyVar == null ? 0 : btzyVar.hashCode());
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowMinWidthMajor + String.valueOf(valueOf2).length());
        sb.append("PhotosCollection{isTotalNumberOfPhotosReliable=");
        sb.append(z);
        sb.append(", totalNumberOfPhotos=");
        sb.append(i);
        sb.append(", photos=");
        sb.append(valueOf);
        sb.append(", hasMorePhotos=");
        sb.append(z2);
        sb.append(", error=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
