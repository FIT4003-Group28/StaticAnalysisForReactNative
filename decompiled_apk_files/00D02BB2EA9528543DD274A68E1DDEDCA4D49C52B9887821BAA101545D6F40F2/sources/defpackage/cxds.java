package defpackage;

import com.google.android.filament.R;
/* compiled from: PG */
/* renamed from: cxds  reason: default package */
/* loaded from: classes5.dex */
public final class cxds extends cxec {
    private final int a;
    private final boolean b;
    private final int c;
    private final cxeb d;

    public cxds(int i, int i2, cxeb cxebVar, boolean z) {
        this.c = i;
        this.a = i2;
        this.d = cxebVar;
        this.b = z;
    }

    @Override // defpackage.cxec, defpackage.cwuw
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cxec, defpackage.cwuw
    public final int b() {
        return this.c;
    }

    @Override // defpackage.cxec
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.cxec
    public final cxeb d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cxec)) {
            return false;
        }
        cxec cxecVar = (cxec) obj;
        int i = this.c;
        int b = cxecVar.b();
        if (i == 0) {
            throw null;
        }
        return i == b && this.a == cxecVar.a() && this.d.equals(cxecVar.d()) && this.b == cxecVar.c();
    }

    public final int hashCode() {
        int i = this.c;
        cwux.b(i);
        return ((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String a = cwux.a(this.c);
        int i = this.a;
        String valueOf = String.valueOf(this.d);
        boolean z = this.b;
        int length = a.length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_tooltipForegroundColor + String.valueOf(valueOf).length());
        sb.append("TikTokTraceConfigurations{enablement=");
        sb.append(a);
        sb.append(", rateLimitPerSecond=");
        sb.append(i);
        sb.append(", dynamicSampler=");
        sb.append(valueOf);
        sb.append(", recordTimerDuration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
