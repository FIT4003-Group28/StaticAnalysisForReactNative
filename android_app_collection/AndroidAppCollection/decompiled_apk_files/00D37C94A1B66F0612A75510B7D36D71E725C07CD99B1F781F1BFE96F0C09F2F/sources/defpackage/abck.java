package defpackage;
/* compiled from: PG */
/* renamed from: abck  reason: default package */
/* loaded from: classes.dex */
public final class abck extends aars implements abcu {
    private final afvn a;
    private final aarl b;
    private final aarl c;
    private final yrj g;
    private final ywa h;
    private final azqb i;

    public abck(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar, yrj yrjVar, ywa ywaVar, azqb azqbVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.b = c(ascs.a, aaqjVar, abcj.a, abbc.j);
        this.c = c(ascp.a, aaqjVar, abcj.b, abbc.i);
        yrjVar.getClass();
        this.g = yrjVar;
        ywaVar.getClass();
        this.h = ywaVar;
        this.i = azqbVar;
    }

    @Override // defpackage.abcu
    public final abcl a(String str) {
        abcl abclVar = new abcl(this.e, this.a.c(), str, this.g, this.h);
        abclVar.k = (String) this.i.get();
        return abclVar;
    }

    @Override // defpackage.abcu
    public final abct b() {
        abct abctVar = new abct(this.e, this.a.c());
        abctVar.k = (String) this.i.get();
        return abctVar;
    }

    @Override // defpackage.abcu
    public final ankt d(abcl abclVar) {
        return anii.h(this.c.a(abclVar), aapz.h, anjk.a);
    }

    @Override // defpackage.abcu
    public final ankt e(aaqs aaqsVar) {
        return this.b.a(aaqsVar);
    }
}
