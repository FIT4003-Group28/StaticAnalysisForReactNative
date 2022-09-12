package defpackage;
/* compiled from: PG */
/* renamed from: atsm  reason: default package */
/* loaded from: classes2.dex */
public final class atsm {
    public final atss<? extends crqw> a;
    public final cjqy b;
    @dzsi
    public cqsn c;
    @dzsi
    public cqsn d;
    @dzsi
    public String e;
    @dzsi
    public atxv f;
    @dzsi
    public atsn g;
    @dzsi
    public cjtd h;
    @dzsi
    public cjtd i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    @dzsi
    public izo n;

    public atsm(atso atsoVar) {
        this.a = atsoVar.i;
        this.b = atsoVar.j;
        this.c = atsoVar.k;
        this.d = atsoVar.l;
        this.e = atsoVar.m;
        this.f = atsoVar.n;
        this.g = atsoVar.o;
        this.h = atsoVar.p;
        this.i = atsoVar.q;
        this.j = atsoVar.r;
        this.k = atsoVar.s;
        boolean z = atsoVar.w;
        if (atsoVar instanceof atsl) {
            this.n = ((atsl) atsoVar).a;
        }
    }

    public final atso a() {
        if (this.n != null) {
            return new atsl(this);
        }
        return new atso(this);
    }

    public final void b() {
        this.l = true;
    }

    public atsm(atss<? extends crqw> atssVar, cjqy cjqyVar) {
        this.a = atssVar;
        dbsk.t(cjqyVar, "reporter");
        this.b = cjqyVar;
    }
}
