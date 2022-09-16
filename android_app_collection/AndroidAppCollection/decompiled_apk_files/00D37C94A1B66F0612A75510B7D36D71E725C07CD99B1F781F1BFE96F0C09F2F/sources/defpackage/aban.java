package defpackage;
/* compiled from: PG */
/* renamed from: aban  reason: default package */
/* loaded from: classes.dex */
public final class aban extends aars implements aari {
    public final aarq a;
    private final afvn b;
    private final boolean c;

    public aban(aaqf aaqfVar, yqw yqwVar, afvn afvnVar, aacz aaczVar, aaqj aaqjVar) {
        super(aaqfVar, yqwVar);
        this.b = afvnVar;
        this.c = aadf.b(aaczVar);
        this.a = new abak(aaqjVar, yqwVar, atut.a, abaa.f, aazt.n);
    }

    @Override // defpackage.aari
    public final /* bridge */ /* synthetic */ aaqs a(ajfz ajfzVar) {
        abam d = d();
        d.b = abam.g(ajfzVar.b());
        d.k(ajfzVar.d());
        return d;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.a.j((abam) aaqsVar, aarhVar, afzfVar);
    }

    public final abam d() {
        return new abam(this.e, this.b.c(), this.c);
    }
}
