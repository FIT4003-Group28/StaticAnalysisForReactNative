package defpackage;
/* compiled from: PG */
/* renamed from: adfe  reason: default package */
/* loaded from: classes.dex */
public final class adfe {
    private Boolean a;
    private aifh b;

    public final void b(boolean z) {
        this.a = Boolean.valueOf(z);
    }

    public final void c(aifh aifhVar) {
        if (aifhVar != null) {
            this.b = aifhVar;
            return;
        }
        throw new NullPointerException("Null queueTransferType");
    }

    public final adff a() {
        Boolean bool = this.a;
        if (bool == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" isUnselectUserInitiated");
            }
            if (this.b == null) {
                sb.append(" queueTransferType");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adff(bool.booleanValue(), this.b);
    }
}
