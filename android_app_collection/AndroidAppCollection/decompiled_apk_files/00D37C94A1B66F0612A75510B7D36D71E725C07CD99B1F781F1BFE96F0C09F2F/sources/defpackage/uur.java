package defpackage;
/* compiled from: PG */
/* renamed from: uur  reason: default package */
/* loaded from: classes4.dex */
public final class uur {
    public int a;
    public uuq b;

    public final void b(boolean z) {
        this.a = true != z ? 2 : 3;
    }

    public final uus a() {
        uuq uuqVar;
        int i = this.a;
        if (i == 0 || (uuqVar = this.b) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" enablement");
            }
            if (this.b == null) {
                sb.append(" metricExtensionProvider");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new uus(i, uuqVar);
    }
}
