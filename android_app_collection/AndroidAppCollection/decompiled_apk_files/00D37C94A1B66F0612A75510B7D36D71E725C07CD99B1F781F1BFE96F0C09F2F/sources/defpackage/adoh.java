package defpackage;
/* compiled from: PG */
/* renamed from: adoh  reason: default package */
/* loaded from: classes.dex */
public final class adoh {
    private Integer a;
    private String b;

    public final void b(int i) {
        this.a = Integer.valueOf(i);
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null screenName");
    }

    public final adoi a() {
        Integer num = this.a;
        if (num == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" recoveryState");
            }
            if (this.b == null) {
                sb.append(" screenName");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adoi(num.intValue(), this.b);
    }
}
