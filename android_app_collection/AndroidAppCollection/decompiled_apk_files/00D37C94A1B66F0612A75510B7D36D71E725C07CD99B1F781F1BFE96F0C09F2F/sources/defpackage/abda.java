package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abda  reason: default package */
/* loaded from: classes.dex */
public final class abda extends aars {
    private final afvn a;
    private final aarl b;

    public abda(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        this.b = c(arue.a, aaqjVar, abcj.d, abbc.l);
    }

    public final ankt a(apzg apzgVar, Executor executor) {
        aqxo.p(apzgVar.qn(ardq.b));
        ardq ardqVar = (ardq) apzgVar.qm(ardq.b);
        abcz abczVar = new abcz(this.e, this.a.c());
        abczVar.a = ardqVar.c;
        abczVar.b = ardqVar.d;
        abczVar.j(apzgVar.c);
        abczVar.j(aoob.b);
        return this.b.b(abczVar, executor);
    }
}
