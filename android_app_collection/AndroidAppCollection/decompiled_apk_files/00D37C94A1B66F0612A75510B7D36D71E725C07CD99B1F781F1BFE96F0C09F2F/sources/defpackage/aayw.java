package defpackage;
/* compiled from: PG */
/* renamed from: aayw  reason: default package */
/* loaded from: classes.dex */
public final class aayw extends aars implements aari {
    private final afvn a;
    private final aayv b;

    public aayw(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.b = new aayv(aaqjVar, yqwVar);
    }

    @Override // defpackage.aari
    public final aaqs a(ajfz ajfzVar) {
        aayq d = d();
        d.t(ajfzVar);
        return d;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        this.b.j((aayq) aaqsVar, aarhVar, afzfVar);
    }

    public final aayq d() {
        return new aayq(this.e, this.a.c());
    }
}
