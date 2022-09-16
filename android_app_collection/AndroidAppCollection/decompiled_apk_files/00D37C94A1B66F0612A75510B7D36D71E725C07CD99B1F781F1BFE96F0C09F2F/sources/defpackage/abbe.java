package defpackage;
/* compiled from: PG */
/* renamed from: abbe  reason: default package */
/* loaded from: classes.dex */
public final class abbe extends aars {
    public final yni a;
    public final aagi b;
    private final afvn c;
    private final abbd g;

    public abbe(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar, yni yniVar, aagi aagiVar) {
        super(aaqfVar, yqwVar);
        this.c = afvnVar;
        this.a = yniVar;
        this.b = aagiVar;
        this.g = new abbd(this, aaqjVar);
    }

    public final abbb a() {
        return new abbb(this.e, this.c.c());
    }

    public final void b(aaqs aaqsVar, afzf afzfVar) {
        this.g.i(aaqsVar, afzfVar);
    }
}
