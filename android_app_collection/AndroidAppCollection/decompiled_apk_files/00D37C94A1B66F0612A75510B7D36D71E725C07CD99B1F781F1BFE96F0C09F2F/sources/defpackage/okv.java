package defpackage;
/* compiled from: PG */
/* renamed from: okv  reason: default package */
/* loaded from: classes3.dex */
public final class okv {
    private String a;
    private Integer b;
    private Integer c;

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null pivotIdentifier");
    }

    public final void d(int i) {
        this.b = Integer.valueOf(i);
    }

    public final okw a() {
        Integer num;
        String str = this.a;
        if (str == null || (num = this.b) == null || this.c == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" pivotIdentifier");
            }
            if (this.b == null) {
                sb.append(" tabIndex");
            }
            if (this.c == null) {
                sb.append(" paneIndex");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new okw(str, num.intValue(), this.c.intValue());
    }
}
