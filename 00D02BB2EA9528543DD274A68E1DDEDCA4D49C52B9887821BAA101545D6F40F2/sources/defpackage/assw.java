package defpackage;
/* compiled from: PG */
/* renamed from: assw  reason: default package */
/* loaded from: classes2.dex */
public final class assw extends astd {
    public String a;
    public String b;
    public dpvf c;
    public String d;
    public String e;
    public bvrt<dhjx> f;
    public Boolean g;
    public int h;
    private String i;
    private ddhp j;
    private Boolean k;
    private Boolean n;
    private bvrt<drph> o;
    private bvrt<dwir> q;
    private final dbsg<amte> l = dbpy.a;
    private final dbsg<Integer> m = dbpy.a;
    private dbsg<Long> p = dbpy.a;

    @Override // defpackage.astd
    public final void b(dbsg<Long> dbsgVar) {
        if (dbsgVar != null) {
            this.p = dbsgVar;
            return;
        }
        throw new NullPointerException("Null assistantSessionId");
    }

    @Override // defpackage.astd
    public final void c(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.astd
    public final void d(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    @Override // defpackage.astd
    public final void e(@dzsi bvrt<drph> bvrtVar) {
        this.o = bvrtVar;
    }

    @Override // defpackage.astd
    public final void f(ddhp ddhpVar) {
        if (ddhpVar != null) {
            this.j = ddhpVar;
            return;
        }
        throw new NullPointerException("Null parentVeType");
    }

    @Override // defpackage.astd
    public final void g(@dzsi bvrt<dwir> bvrtVar) {
        this.q = bvrtVar;
    }

    @Override // defpackage.astd
    public final void h(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.astd
    public final aste a() {
        String str = this.i == null ? " displayText" : "";
        if (this.d == null) {
            str = str.concat(" titleOverride");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" parentVeType");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" shouldPlayTts");
        }
        if (this.h == 0) {
            str = String.valueOf(str).concat(" voiceActionType");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" autoNavigateIfOnlyOneResult");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" forceApplyEvConnectorRefinement");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new assx(this.a, this.b, this.c, this.i, this.d, this.e, this.f, this.j, this.k.booleanValue(), this.h, this.l, this.m, this.n.booleanValue(), this.g.booleanValue(), this.o, this.p, this.q);
    }
}
