package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: srl  reason: default package */
/* loaded from: classes7.dex */
public final class srl extends srx {
    public int a;
    private Boolean b;
    private Boolean c;
    private dnqh d;
    private vun e;
    private dwaw f;
    private amte g;
    private Boolean h;
    private Integer i;
    private btzy j;

    public srl() {
    }

    public srl(sry sryVar) {
        srm srmVar = (srm) sryVar;
        this.a = srmVar.j;
        this.b = Boolean.valueOf(srmVar.a);
        this.c = Boolean.valueOf(srmVar.b);
        this.d = srmVar.c;
        this.e = srmVar.d;
        this.f = srmVar.e;
        this.g = srmVar.f;
        this.h = Boolean.valueOf(srmVar.g);
        this.i = Integer.valueOf(srmVar.h);
        this.j = srmVar.i;
    }

    @Override // defpackage.srx
    public final void b(int i) {
        this.i = Integer.valueOf(i);
    }

    @Override // defpackage.srx
    public final void c(@dzsi vun vunVar) {
        this.e = vunVar;
    }

    @Override // defpackage.srx
    public final void d(btzy btzyVar) {
        this.j = btzyVar;
    }

    @Override // defpackage.srx
    public final void e(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    @Override // defpackage.srx
    public final void f(int i) {
        this.a = i;
    }

    @Override // defpackage.srx
    public final void g(@dzsi dnqh dnqhVar) {
        this.d = dnqhVar;
    }

    @Override // defpackage.srx
    public final void h(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.srx
    public final void i(dwaw dwawVar) {
        this.f = dwawVar;
    }

    @Override // defpackage.srx
    public final void j(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.srx
    public final void k(@dzsi amte amteVar) {
        this.g = amteVar;
    }

    @Override // defpackage.srx
    public final sry a() {
        String str = this.a == 0 ? " onlineState" : "";
        if (this.b == null) {
            str = str.concat(" offlineLoading");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" solicitedByUser");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" receivedOfflineResponse");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" activeTripIndex");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new srm(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d, this.e, this.f, this.g, this.h.booleanValue(), this.i.intValue(), this.j);
    }
}
