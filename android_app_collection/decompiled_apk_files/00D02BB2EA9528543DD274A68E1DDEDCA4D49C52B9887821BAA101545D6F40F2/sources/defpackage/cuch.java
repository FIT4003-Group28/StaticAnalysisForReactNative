package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cuch  reason: default package */
/* loaded from: classes5.dex */
public final class cuch extends ctze {
    private dbsg<String> a = dbpy.a;
    private dbsg<String> b = dbpy.a;
    private dbsg<String> c = dbpy.a;
    private dbsg<ctzf> d = dbpy.a;
    private Long e;
    private ctzc f;
    private ctzc g;

    @Override // defpackage.ctze
    public final void b(ctzc ctzcVar) {
        this.f = ctzcVar;
    }

    @Override // defpackage.ctze
    public final void c(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.ctze
    public final void f(ctzf ctzfVar) {
        this.d = dbsg.i(ctzfVar);
    }

    @Override // defpackage.ctze
    public final void g(ctzc ctzcVar) {
        this.g = ctzcVar;
    }

    @Override // defpackage.ctze
    public final void i(String str) {
        this.c = dbsg.i(str);
    }

    @Override // defpackage.ctze
    public final void j(String str) {
        this.b = dbsg.i(str);
    }

    @Override // defpackage.ctze
    public final void n(String str) {
        this.a = dbsg.i(str);
    }

    @Override // defpackage.ctze
    public final ctzl a() {
        String str = this.e == null ? " actionTriggeredLogId" : "";
        if (this.f == null) {
            str = str.concat(" actionPayload");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" eventCallbackFailureActionPayload");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuci(this.a, this.b, this.c, this.d, this.e.longValue(), this.f, this.g);
    }
}
