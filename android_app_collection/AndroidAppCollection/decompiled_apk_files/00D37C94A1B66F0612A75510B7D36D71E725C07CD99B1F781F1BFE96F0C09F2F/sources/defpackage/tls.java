package defpackage;
/* compiled from: PG */
/* renamed from: tls  reason: default package */
/* loaded from: classes4.dex */
public final class tls {
    public String a;
    public anew b;
    public int[] c;
    public int[] d;
    private aoqu e;
    private int f;

    public final void b(aoqu aoquVar) {
        if (aoquVar != null) {
            this.e = aoquVar;
            return;
        }
        throw new NullPointerException("Null message");
    }

    public final void c() {
        this.f = 1;
    }

    public final tlt a() {
        aoqu aoquVar;
        String str = this.a;
        if (str == null || (aoquVar = this.e) == null || this.f == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" logSource");
            }
            if (this.e == null) {
                sb.append(" message");
            }
            if (this.f == 0) {
                sb.append(" qosTier");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new tlt(str, aoquVar, this.b, this.c, this.d);
    }
}
