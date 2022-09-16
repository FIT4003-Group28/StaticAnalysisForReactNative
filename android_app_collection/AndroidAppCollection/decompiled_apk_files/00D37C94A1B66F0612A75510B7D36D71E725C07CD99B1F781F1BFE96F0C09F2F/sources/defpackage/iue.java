package defpackage;
/* compiled from: PG */
/* renamed from: iue  reason: default package */
/* loaded from: classes3.dex */
public final class iue implements aari {
    public final iug a;
    public final aafo b;
    public ampq c;
    private final abeb e;

    public iue(abeb abebVar, iug iugVar, aafo aafoVar) {
        abebVar.getClass();
        this.e = abebVar;
        this.a = iugVar;
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = amon.a;
    }

    @Override // defpackage.aari
    public final aaqs a(ajfz ajfzVar) {
        return this.e.a(ajfzVar);
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.e.b(aaqsVar, aarhVar, new iud(this, afzfVar));
    }
}
