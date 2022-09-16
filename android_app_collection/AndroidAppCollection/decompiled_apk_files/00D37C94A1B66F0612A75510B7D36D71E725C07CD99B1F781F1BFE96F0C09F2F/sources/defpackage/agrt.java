package defpackage;
/* compiled from: PG */
/* renamed from: agrt  reason: default package */
/* loaded from: classes.dex */
public final class agrt {
    public int a;
    private Boolean b;
    private amuk c;

    public final void b(amuk amukVar) {
        if (amukVar != null) {
            this.c = amukVar;
            return;
        }
        throw new NullPointerException("Null additionalActions");
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final agru a() {
        Boolean bool;
        int i = this.a;
        if (i == 0 || (bool = this.b) == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == 0) {
                sb.append(" orchestrationActionResult");
            }
            if (this.b == null) {
                sb.append(" retryable");
            }
            if (this.c == null) {
                sb.append(" additionalActions");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        agru agruVar = new agru(i, bool.booleanValue(), this.c);
        boolean z = true;
        if (agruVar.f == 1) {
            z = false;
        }
        aqxo.p(z);
        return agruVar;
    }
}
