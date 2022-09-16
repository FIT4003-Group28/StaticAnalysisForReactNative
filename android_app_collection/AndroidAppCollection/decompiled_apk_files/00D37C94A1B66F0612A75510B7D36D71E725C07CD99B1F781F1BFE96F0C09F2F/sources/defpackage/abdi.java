package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: abdi  reason: default package */
/* loaded from: classes.dex */
public final class abdi extends aars {
    private final afvn a;
    private final aarl b;
    private final aarl c;
    private final abdh g;

    protected abdi() {
        this.b = null;
        this.c = null;
        this.g = null;
        afvn afvnVar = afvp.a;
        throw null;
    }

    public final abdf a() {
        return new abdf(this.e, this.a.c());
    }

    public final abdj b() {
        return new abdj(this.e, this.a.c());
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.g.a(((aswg) it.next()).c);
        }
    }

    public final void e(abdf abdfVar, afzf afzfVar) {
        this.b.e(abdfVar, new abdg(this, afzfVar, 1));
    }

    public final void f(abdj abdjVar, afzf afzfVar) {
        this.c.e(abdjVar, new abdg(this, afzfVar));
    }

    public abdi(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar, abdh abdhVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        aaqjVar.getClass();
        this.b = c(asdg.a, aaqjVar, abcj.g, abbc.o);
        this.c = c(asdi.a, aaqjVar, abcj.h, abbc.p);
        abdhVar.getClass();
        this.g = abdhVar;
    }
}
