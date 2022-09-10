package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blgp  reason: default package */
/* loaded from: classes3.dex */
public final class blgp extends blhv {
    public String a;
    public String b;
    private akqi c;
    private Boolean d;
    private blif e;
    private dbsg<djck> f;
    private String g;

    public blgp() {
        this.f = dbpy.a;
    }

    public blgp(blhw blhwVar) {
        this.f = dbpy.a;
        blgq blgqVar = (blgq) blhwVar;
        this.c = blgqVar.a;
        this.a = blgqVar.b;
        this.d = Boolean.valueOf(blgqVar.c);
        this.e = blgqVar.d;
        this.b = blgqVar.e;
        this.f = blgqVar.f;
        this.g = blgqVar.g;
    }

    @Override // defpackage.blhv
    protected final String a() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"filterText\" has not been set");
    }

    @Override // defpackage.blhv
    protected final dbsg<djck> b() {
        return this.f;
    }

    @Override // defpackage.blhv
    public final void d(akqi akqiVar) {
        if (akqiVar != null) {
            this.c = akqiVar;
            return;
        }
        throw new NullPointerException("Null featureId");
    }

    @Override // defpackage.blhv
    public final void e(String str) {
        this.a = str;
    }

    @Override // defpackage.blhv
    public final void f(String str) {
        this.b = str;
    }

    @Override // defpackage.blhv
    protected final void g(String str) {
        if (str != null) {
            this.g = str;
            return;
        }
        throw new NullPointerException("Null normalizedFilterText");
    }

    @Override // defpackage.blhv
    public final void h(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.blhv
    public final void i(blif blifVar) {
        if (blifVar != null) {
            this.e = blifVar;
            return;
        }
        throw new NullPointerException("Null sortCriterion");
    }

    @Override // defpackage.blhv
    protected final void j(dbsg<djck> dbsgVar) {
        this.f = dbsgVar;
    }

    @Override // defpackage.blhv
    public final void k(djck djckVar) {
        this.f = dbsg.i(djckVar);
    }

    @Override // defpackage.blhv
    protected final blhw c() {
        String str = this.c == null ? " featureId" : "";
        if (this.a == null) {
            str = str.concat(" filterText");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" selfPostsOnly");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" sortCriterion");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" firstPostId");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" normalizedFilterText");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new blgq(this.c, this.a, this.d.booleanValue(), this.e, this.b, this.f, this.g);
    }
}
