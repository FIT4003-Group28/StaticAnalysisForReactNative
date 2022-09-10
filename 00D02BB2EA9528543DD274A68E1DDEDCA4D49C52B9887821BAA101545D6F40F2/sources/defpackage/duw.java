package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: duw  reason: default package */
/* loaded from: classes6.dex */
public abstract class duw implements dtw {
    public final ArrayList<dtu> b = new ArrayList<>();

    @Override // defpackage.dtw
    public final dtu B(dtx dtxVar) {
        dvd C = C();
        dbsk.s(C);
        dbsk.a(C() == C);
        duv duvVar = C.a;
        duv.a(duvVar.a.a(), 1);
        duz a = duvVar.b.a();
        duv.a(a, 2);
        duv.a(duvVar.c.a(), 3);
        Executor a2 = duvVar.d.a();
        duv.a(a2, 4);
        duv.a(duvVar.e.a(), 5);
        duv.a(C, 6);
        duv.a(this, 7);
        duv.a(dtxVar, 8);
        duu duuVar = new duu(a, a2, C, this, dtxVar);
        dtxVar.a(duuVar);
        this.b.add(duuVar);
        return duuVar;
    }

    @dzsi
    public abstract dvd C();

    public abstract dbcn D();

    public final List<dtu> F() {
        return dcdc.r(this.b);
    }
}
