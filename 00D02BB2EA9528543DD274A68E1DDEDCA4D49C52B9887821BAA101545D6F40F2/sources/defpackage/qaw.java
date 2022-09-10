package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qaw  reason: default package */
/* loaded from: classes7.dex */
public final class qaw extends qdf {
    public String a;
    public String b;
    public qdi c;
    public akqq d;
    public Long e;
    public dopk f;
    public String g;
    public dnqh h;
    private List<String> i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private int n;

    @Override // defpackage.qdf
    public final void b(List<String> list) {
        if (list != null) {
            this.i = list;
            return;
        }
        throw new NullPointerException("Null filteredDeparturesTokens");
    }

    @Override // defpackage.qdf
    public final void c(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.qdf
    public final void d(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.qdf
    public final void e(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.qdf
    public final void f(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.qdf
    public final void g(int i) {
        if (i != 0) {
            this.n = i;
            return;
        }
        throw new NullPointerException("Null departureTimeStrategy");
    }

    @Override // defpackage.qdf
    public final qdg a() {
        String str = this.i == null ? " filteredDeparturesTokens" : "";
        if (this.n == 0) {
            str = str.concat(" departureTimeStrategy");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" showMoreInfoButton");
        }
        if (this.k == null) {
            str = String.valueOf(str).concat(" isFromShortcut");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" isFromParent");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" replaceTopOfStack");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qax(this.a, this.b, this.c, this.d, this.i, this.n, this.e, this.f, this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.g, this.h);
    }
}
