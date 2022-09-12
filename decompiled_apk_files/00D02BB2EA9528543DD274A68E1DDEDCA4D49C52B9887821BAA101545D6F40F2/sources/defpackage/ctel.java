package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: ctel  reason: default package */
/* loaded from: classes5.dex */
public final class ctel extends ctfj {
    private final long a;
    private final int b;

    public ctel(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.ctfj
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ctfj
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctfj) {
            ctfj ctfjVar = (ctfj) obj;
            if (this.a == ctfjVar.a() && this.b == ctfjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.b ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_toolbarStyle);
        sb.append("LighterCheckBootstrapRequiredResult{earliestCloudMessageTimestampUs=");
        sb.append(j);
        sb.append(", resultType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
