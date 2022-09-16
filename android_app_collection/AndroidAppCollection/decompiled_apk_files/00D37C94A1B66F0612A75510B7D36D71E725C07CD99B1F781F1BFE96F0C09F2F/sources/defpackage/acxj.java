package defpackage;
/* compiled from: PG */
/* renamed from: acxj  reason: default package */
/* loaded from: classes.dex */
public final class acxj {
    public adnl a;
    private String b;
    private String c;
    private Integer d;
    private int e;

    public acxj() {
    }

    public acxj(acxk acxkVar) {
        this.b = acxkVar.a;
        this.e = acxkVar.e;
        this.c = acxkVar.b;
        this.d = Integer.valueOf(acxkVar.c);
        this.a = acxkVar.d;
    }

    public final void b(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null deviceName");
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null routeId");
    }

    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void e(int i) {
        if (i != 0) {
            this.e = i;
            return;
        }
        throw new NullPointerException("Null sessionType");
    }

    public final acxk a() {
        int i;
        String str;
        Integer num;
        String str2 = this.b;
        if (str2 == null || (i = this.e) == 0 || (str = this.c) == null || (num = this.d) == null || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" routeId");
            }
            if (this.e == 0) {
                sb.append(" sessionType");
            }
            if (this.c == null) {
                sb.append(" deviceName");
            }
            if (this.d == null) {
                sb.append(" timeoutSeconds");
            }
            if (this.a == null) {
                sb.append(" playbackDescriptor");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new acxk(str2, i, str, num.intValue(), this.a);
    }
}
