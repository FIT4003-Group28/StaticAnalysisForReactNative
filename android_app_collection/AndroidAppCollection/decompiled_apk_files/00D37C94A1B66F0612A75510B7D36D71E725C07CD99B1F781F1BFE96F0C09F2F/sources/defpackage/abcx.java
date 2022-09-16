package defpackage;
/* compiled from: PG */
/* renamed from: abcx  reason: default package */
/* loaded from: classes.dex */
public final class abcx extends aars implements aari {
    public final aarq a;
    private final afvn b;

    public abcx(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.b = afvnVar;
        this.a = new abcw(aaqjVar, yqwVar);
    }

    @Override // defpackage.aari
    public final aaqs a(ajfz ajfzVar) {
        abcv d = d();
        d.b = abcv.g(ajfzVar.b());
        d.k(ajfzVar.d());
        return d;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.a.j((abcv) aaqsVar, aarhVar, afzfVar);
    }

    public final abcv d() {
        return new abcv(this.e, this.b.c());
    }
}
