package defpackage;
/* compiled from: PG */
/* renamed from: adcs  reason: default package */
/* loaded from: classes.dex */
public final class adcs {
    public final azpq a = azpq.e();

    static {
        zep.a("Handoff.MarkActionTerminal");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        b(str, 3);
    }

    public final void b(String str, int i) {
        String.format("Marking action[%s] as %s", str, akel.ad(i));
        azpq azpqVar = this.a;
        adcu adcuVar = new adcu();
        if (str != null) {
            adcuVar.a = str;
            adcuVar.b = i;
            adcuVar.c = 6;
            String str2 = adcuVar.a;
            if (str2 == null) {
                StringBuilder sb = new StringBuilder();
                if (adcuVar.b == 0) {
                    sb.append(" actionState");
                }
                if (adcuVar.c == 0) {
                    sb.append(" featureType");
                }
                if (adcuVar.a == null) {
                    sb.append(" actionId");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            azpqVar.c(new adcv(i, str2));
            return;
        }
        throw new NullPointerException("Null actionId");
    }
}
