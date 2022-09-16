package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cwyw  reason: default package */
/* loaded from: classes5.dex */
public final class cwyw extends cwza {
    private final long a;
    private final dcep<String> b;
    private final int c;

    public cwyw(int i, long j, dcep<String> dcepVar) {
        this.c = i;
        this.a = j;
        this.b = dcepVar;
    }

    @Override // defpackage.cwza, defpackage.cwuw
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cwza
    public final long c() {
        return this.a;
    }

    @Override // defpackage.cwza
    public final dcep<String> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cwza)) {
            return false;
        }
        cwza cwzaVar = (cwza) obj;
        int i = this.c;
        int b = cwzaVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cwzaVar.c() && this.b.equals(cwzaVar.d());
    }

    public final int hashCode() {
        int i = this.c;
        cwux.b(i);
        long j = this.a;
        return ((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((dcmr) this.b).d;
    }

    public final String toString() {
        String a = cwux.a(this.c);
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionBar + String.valueOf(valueOf).length());
        sb.append("DebugMemoryConfigurations{enablement=");
        sb.append(a);
        sb.append(", debugMemoryServiceThrottleMs=");
        sb.append(j);
        sb.append(", debugMemoryEventsToSample=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
