package defpackage;
/* compiled from: PG */
/* renamed from: abaz  reason: default package */
/* loaded from: classes.dex */
public final class abaz extends aars implements aari {
    public final afvn a;
    public final aarl b;
    public final aarl c;
    public final aarl g;
    private final aarl h;
    private final aarl i;
    private final abay j;

    public abaz(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.h = c(asay.a, aaqjVar, abaa.j, aazt.r);
        this.b = c(asba.a, aaqjVar, abaa.k, aazt.s);
        this.c = c(asbc.a, aaqjVar, abaa.l, aazt.t);
        this.i = c(asbf.a, aaqjVar, abaa.m, aazt.u);
        this.g = c(aruh.a, aaqjVar, abaa.i, aazt.q);
        this.j = new abay(aaqjVar, yqwVar);
    }

    @Override // defpackage.aari
    public final /* bridge */ /* synthetic */ aaqs a(ajfz ajfzVar) {
        abax f = f();
        f.a = abax.g(ajfzVar.b());
        f.i();
        return f;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.j.j((abax) aaqsVar, aarhVar, afzfVar);
    }

    public final abat d() {
        return new abat(this.e, this.a.c());
    }

    public final abaw e() {
        return new abaw(this.e, this.a.c());
    }

    public final abax f() {
        return new abax(this.e, this.a.c());
    }

    public final void g(abat abatVar, afzf afzfVar) {
        this.h.e(abatVar, afzfVar);
    }

    public final void h(aaqs aaqsVar, afzf afzfVar) {
        this.i.e(aaqsVar, afzfVar);
    }
}
