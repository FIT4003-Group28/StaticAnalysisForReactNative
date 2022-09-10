package defpackage;

import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: nqa  reason: default package */
/* loaded from: classes7.dex */
final class nqa extends nrb {
    public cqvj a;
    private cqtv b;
    private cqtv c;
    private Float d;
    private dbsg<cqss> e = dbpy.a;
    private dbsg<cqjb<? extends cqkp, cqss>> f = dbpy.a;
    private dbsg<cqlc<? extends cqkp, cqss>> g = dbpy.a;
    private dbsg<? extends cqtv> h = dbpy.a;
    private dbsg<? extends cqtv> i = dbpy.a;
    private TextUtils.TruncateAt j;

    @Override // defpackage.nrb
    public final void b(cqss cqssVar) {
        this.e = dbsg.i(cqssVar);
    }

    @Override // defpackage.nrb
    public final void c(cqjb<? extends cqkp, cqss> cqjbVar) {
        this.f = dbsg.i(cqjbVar);
    }

    @Override // defpackage.nrb
    public final void d(cqlc<? extends cqkp, cqss> cqlcVar) {
        this.g = dbsg.i(cqlcVar);
    }

    @Override // defpackage.nrb
    protected final void e(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.c = cqtvVar;
            return;
        }
        throw new NullPointerException("Null extraPaddingOnly");
    }

    @Override // defpackage.nrb
    public final void f(float f) {
        this.d = Float.valueOf(f);
    }

    @Override // defpackage.nrb
    public final void g(cqtv cqtvVar) {
        this.i = dbsg.i(cqtvVar);
    }

    @Override // defpackage.nrb
    public final void h(dbsg<? extends cqtv> dbsgVar) {
        this.i = dbsgVar;
    }

    @Override // defpackage.nrb
    public final void i(cqtv cqtvVar) {
        this.h = dbsg.i(cqtvVar);
    }

    @Override // defpackage.nrb
    public final void j(dbsg<? extends cqtv> dbsgVar) {
        this.h = dbsgVar;
    }

    @Override // defpackage.nrb
    protected final void k(cqtv cqtvVar) {
        if (cqtvVar != null) {
            this.b = cqtvVar;
            return;
        }
        throw new NullPointerException("Null sizeOnly");
    }

    @Override // defpackage.nrb
    public final void l(TextUtils.TruncateAt truncateAt) {
        if (truncateAt != null) {
            this.j = truncateAt;
            return;
        }
        throw new NullPointerException("Null truncation");
    }

    @Override // defpackage.nrb
    protected final nrc a() {
        String str = this.a == null ? " typeface" : "";
        if (this.b == null) {
            str = str.concat(" sizeOnly");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" extraPaddingOnly");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" letterSpacingEm");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" truncation");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new nqb(this.a, this.b, this.c, this.d.floatValue(), this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
