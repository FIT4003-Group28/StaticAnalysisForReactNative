package defpackage;
/* compiled from: PG */
/* renamed from: uwd  reason: default package */
/* loaded from: classes4.dex */
public final class uwd {
    public int a;
    private Float b;

    public final void b(float f) {
        this.b = Float.valueOf(f);
    }

    public final void c(boolean z) {
        this.a = true != z ? 2 : 3;
    }

    public final uwe a() {
        Float f;
        int i = this.a;
        if (i == 0 || (f = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" enablement");
            }
            if (this.b == null) {
                sb.append(" startupSamplePercentage");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        uwe uweVar = new uwe(i, f.floatValue());
        float f2 = uweVar.a;
        boolean z = false;
        if (f2 > 0.0f && f2 <= 100.0f) {
            z = true;
        }
        aqxo.q(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return uweVar;
    }
}
