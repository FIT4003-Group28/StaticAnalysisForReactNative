package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: tho  reason: default package */
/* loaded from: classes4.dex */
public final class tho {
    public String a;
    public Integer b;
    public Status c;
    public String d;
    public String e;
    public Integer f;
    public Boolean g;
    public akvy h;
    private amvn i;
    private Integer j;

    public final void b(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void c(amvn amvnVar) {
        if (amvnVar != null) {
            this.i = amvnVar;
            return;
        }
        throw new NullPointerException("Null templateUris");
    }

    public final thp a() {
        Integer num;
        amvn amvnVar = this.i;
        if (amvnVar == null || (num = this.j) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.i == null) {
                sb.append(" templateUris");
            }
            if (this.j == null) {
                sb.append(" materializationCount");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new thp(amvnVar, this.h, this.a, this.b, this.c, this.d, this.e, this.f, this.g, num.intValue(), null);
    }
}
