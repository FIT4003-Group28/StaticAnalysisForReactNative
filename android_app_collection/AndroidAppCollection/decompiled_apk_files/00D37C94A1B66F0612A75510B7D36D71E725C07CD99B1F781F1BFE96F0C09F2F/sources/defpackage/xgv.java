package defpackage;
/* compiled from: PG */
/* renamed from: xgv  reason: default package */
/* loaded from: classes4.dex */
public final class xgv {
    private Integer a;
    private Boolean b;
    private wzr c;

    public final void b(wzr wzrVar) {
        if (wzrVar != null) {
            this.c = wzrVar;
            return;
        }
        throw new NullPointerException("Null adCountMetadata");
    }

    public final void c(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    public final xgw a() {
        Integer num = this.a;
        if (num == null || this.b == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" timeRemainingMillis");
            }
            if (this.b == null) {
                sb.append(" showAdChoices");
            }
            if (this.c == null) {
                sb.append(" adCountMetadata");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new xgw(num.intValue(), this.b.booleanValue(), this.c);
    }
}
