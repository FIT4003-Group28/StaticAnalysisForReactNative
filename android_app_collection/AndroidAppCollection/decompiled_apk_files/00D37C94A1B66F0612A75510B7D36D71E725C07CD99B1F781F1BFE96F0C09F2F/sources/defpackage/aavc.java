package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aavc  reason: default package */
/* loaded from: classes.dex */
public final class aavc extends aars implements aari {
    public final afvn a;
    public final aaqj b;
    public final aarl c;
    public final aarl g;
    public final aarl h;
    public final aarl i;
    private final aarl j;

    public aavc(aaqj aaqjVar, aaqf aaqfVar, afvn afvnVar, yqw yqwVar) {
        super(aaqfVar, yqwVar);
        this.a = afvnVar;
        aaqjVar.getClass();
        this.b = aaqjVar;
        c(arnu.a, aaqjVar, aaul.f, aauh.l);
        this.c = c(arnr.a, aaqjVar, aaul.e, aauh.k);
        this.j = c(arnz.a, aaqjVar, aaul.h, aauh.n);
        this.g = c(arnw.a, aaqjVar, aaul.g, aauh.m);
        this.h = c(arog.a, aaqjVar, aaul.d, aauh.p);
        this.i = c(arod.a, aaqjVar, aaul.c, aauh.o);
    }

    @Override // defpackage.aari
    public final /* bridge */ /* synthetic */ aaqs a(ajfz ajfzVar) {
        aavg aavgVar = new aavg(this.e, this.a.c());
        aavgVar.a = aavg.g(ajfzVar.b());
        aavgVar.k(ajfzVar.d());
        return aavgVar;
    }

    @Override // defpackage.aari
    public final void b(aaqs aaqsVar, aarh aarhVar, afzf afzfVar) {
        aavg aavgVar = (aavg) aaqsVar;
        this.f.a(this.b.a(aavgVar, arnu.a, new aava(aarhVar, afzfVar), aaul.f, aauh.l));
    }

    public final ankt d(aave aaveVar, Executor executor) {
        return this.j.b(aaveVar, executor);
    }
}
