package defpackage;
/* compiled from: PG */
/* renamed from: aoan  reason: default package */
/* loaded from: classes.dex */
final class aoan implements aoas {
    private final aoat a;
    private final rvh b;

    public aoan(aoat aoatVar, rvh rvhVar) {
        this.a = aoatVar;
        this.b = rvhVar;
    }

    @Override // defpackage.aoas
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.aoas
    public final boolean b(aoay aoayVar) {
        Long l;
        if (!aoayVar.d() || this.a.c(aoayVar)) {
            return false;
        }
        rvh rvhVar = this.b;
        aoap aoapVar = new aoap();
        String str = aoayVar.b;
        if (str != null) {
            aoapVar.a = str;
            aoapVar.b = Long.valueOf(aoayVar.d);
            aoapVar.c = Long.valueOf(aoayVar.e);
            String str2 = aoapVar.a;
            if (str2 == null || (l = aoapVar.b) == null || aoapVar.c == null) {
                StringBuilder sb = new StringBuilder();
                if (aoapVar.a == null) {
                    sb.append(" token");
                }
                if (aoapVar.b == null) {
                    sb.append(" tokenExpirationTimestamp");
                }
                if (aoapVar.c == null) {
                    sb.append(" tokenCreationTimestamp");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            rvhVar.b(new aoaq(str2, l.longValue(), aoapVar.c.longValue()));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
