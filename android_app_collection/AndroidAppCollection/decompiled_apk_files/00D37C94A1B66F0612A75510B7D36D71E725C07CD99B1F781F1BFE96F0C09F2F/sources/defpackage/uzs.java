package defpackage;
/* compiled from: PG */
/* renamed from: uzs  reason: default package */
/* loaded from: classes4.dex */
public final class uzs {
    public Float a;
    public int b;

    public final void b(boolean z) {
        this.b = true != z ? 2 : 3;
    }

    public final uzt a() {
        Float f;
        int i = this.b;
        if (i == 0 || (f = this.a) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == 0) {
                sb.append(" enablement");
            }
            if (this.a == null) {
                sb.append(" samplingProbability");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        uzt uztVar = new uzt(i, f.floatValue());
        float f2 = uztVar.a;
        boolean z = false;
        if (f2 >= 0.0f && f2 <= 1.0f) {
            z = true;
        }
        aqxo.z(z, "Probability shall be between 0 and 1.");
        return uztVar;
    }
}
