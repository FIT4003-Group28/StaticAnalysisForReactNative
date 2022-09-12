package defpackage;
/* compiled from: PG */
/* renamed from: detj  reason: default package */
/* loaded from: classes6.dex */
final class detj extends detn {
    public String a;
    public String b;
    public String c;
    public String d;
    private Long e;
    private Long f;
    private int g;

    public detj() {
    }

    public detj(deto detoVar) {
        detk detkVar = (detk) detoVar;
        this.a = detkVar.a;
        this.g = detkVar.g;
        this.b = detkVar.b;
        this.c = detkVar.c;
        this.e = Long.valueOf(detkVar.d);
        this.f = Long.valueOf(detkVar.e);
        this.d = detkVar.f;
    }

    @Override // defpackage.detn
    public final void b(String str) {
        this.b = str;
    }

    @Override // defpackage.detn
    public final void c(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.detn
    public final void d(String str) {
        this.a = str;
    }

    @Override // defpackage.detn
    public final void e(String str) {
        this.d = "BAD CONFIG";
    }

    @Override // defpackage.detn
    public final void f(String str) {
        this.c = str;
    }

    @Override // defpackage.detn
    public final void g(int i) {
        if (i != 0) {
            this.g = i;
            return;
        }
        throw new NullPointerException("Null registrationStatus");
    }

    @Override // defpackage.detn
    public final void h(long j) {
        this.f = Long.valueOf(j);
    }

    @Override // defpackage.detn
    public final deto a() {
        String str = this.g == 0 ? " registrationStatus" : "";
        if (this.e == null) {
            str = str.concat(" expiresInSecs");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" tokenCreationEpochInSecs");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new detk(this.a, this.g, this.b, this.c, this.e.longValue(), this.f.longValue(), this.d);
    }
}
