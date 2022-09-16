package defpackage;
/* compiled from: PG */
/* renamed from: aasc  reason: default package */
/* loaded from: classes.dex */
public final class aasc extends aars {
    private final aasb a;
    private final boolean b;
    private final boolean c;

    public aasc(aaqj aaqjVar, aaqf aaqfVar, yqw yqwVar, aacz aaczVar) {
        super(aaqfVar, yqwVar);
        this.a = new aasb(this, aaqjVar);
        this.b = aadf.b(aaczVar);
        aovy aovyVar = aaczVar.b().i;
        this.c = (aovyVar == null ? aovy.a : aovyVar).e;
    }

    public final void a(afvm afvmVar, afzf afzfVar, String str, int i) {
        this.a.i(new aasa(this.e, afvmVar, str, i, this.b, this.c), afzfVar);
    }
}
