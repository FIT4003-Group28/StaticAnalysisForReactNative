package defpackage;
/* compiled from: PG */
/* renamed from: tdy  reason: default package */
/* loaded from: classes4.dex */
public final class tdy {
    public azqb a;
    public String b;
    public tdu c;
    public tee d;
    public Object e;
    public ten f;
    public Boolean g;
    private Boolean h;

    public final void b(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    public final tdz a() {
        String str;
        tdu tduVar;
        Boolean bool;
        azqb azqbVar = this.a;
        if (azqbVar == null || (str = this.b) == null || (tduVar = this.c) == null || (bool = this.h) == null || this.g == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" converterProvider");
            }
            if (this.b == null) {
                sb.append(" logTag");
            }
            if (this.c == null) {
                sb.append(" perfLoggerFactory");
            }
            if (this.h == null) {
                sb.append(" useIncrementalMount");
            }
            if (this.g == null) {
                sb.append(" nestedScrollingEnabled");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new tdz(azqbVar, str, tduVar, this.d, bool.booleanValue(), this.e, this.f, this.g.booleanValue());
    }
}
