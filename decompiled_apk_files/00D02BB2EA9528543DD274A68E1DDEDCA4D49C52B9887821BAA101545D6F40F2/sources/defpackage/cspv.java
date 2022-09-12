package defpackage;

import com.google.android.filament.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cspv  reason: default package */
/* loaded from: classes5.dex */
final class cspv extends cspx {
    private final int a;
    private final long b;
    private final TimeUnit c;

    public cspv(int i, long j, TimeUnit timeUnit) {
        this.a = i;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // defpackage.cspx
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cspx
    public final long b() {
        return this.b;
    }

    @Override // defpackage.cspx
    public final TimeUnit c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cspx) {
            cspx cspxVar = (cspx) obj;
            if (this.a == cspxVar.a() && this.b == cspxVar.b() && this.c.equals(cspxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        long j = this.b;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_tooltipFrameBackground);
        sb.append("InMemoryCacheConfig{inMemoryCacheMaxSize=");
        sb.append(i);
        sb.append(", inMemoryCacheTtl=");
        sb.append(j);
        sb.append(", inMemoryCacheTtlUnit=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
