package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: dess  reason: default package */
/* loaded from: classes6.dex */
final class dess extends detf {
    private final String a;
    private final long b;
    private final long c;

    public dess(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.detf
    public final String a() {
        return this.a;
    }

    @Override // defpackage.detf
    public final long b() {
        return this.b;
    }

    @Override // defpackage.detf
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof detf) {
            detf detfVar = (detf) obj;
            if (this.a.equals(detfVar.a()) && this.b == detfVar.b() && this.c == detfVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + R.styleable.AppCompatTheme_windowFixedWidthMinor);
        sb.append("InstallationTokenResult{token=");
        sb.append(str);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(j);
        sb.append(", tokenCreationTimestamp=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
