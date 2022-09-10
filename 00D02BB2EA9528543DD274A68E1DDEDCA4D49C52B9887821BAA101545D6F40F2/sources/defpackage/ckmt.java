package defpackage;

import android.os.Handler;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: ckmt  reason: default package */
/* loaded from: classes4.dex */
public final class ckmt {
    public static final cwsv a = cwsv.a("Gmm.Jank.Slider.Placesheet");
    public static final cwsv b = cwsv.a("Gmm.Jank.Slider.SearchResultList");
    static final EnumMap<jjn, cwsv> i;
    public final Handler c;
    public final Runnable d;
    public final jkh e;
    public boolean f = false;
    public jjn g = jjn.HIDDEN;
    public long h;

    static {
        EnumMap<jjn, cwsv> enumMap = new EnumMap<>(jjn.class);
        i = enumMap;
        enumMap.put((EnumMap<jjn, cwsv>) jjn.HIDDEN, (jjn) cwsv.a("Hidden"));
        enumMap.put((EnumMap<jjn, cwsv>) jjn.COLLAPSED, (jjn) cwsv.a("Collapsed"));
        enumMap.put((EnumMap<jjn, cwsv>) jjn.EXPANDED, (jjn) cwsv.a("Expanded"));
        enumMap.put((EnumMap<jjn, cwsv>) jjn.FULLY_EXPANDED, (jjn) cwsv.a("FullyExpanded"));
    }

    public ckmt(ckmm ckmmVar, cqat cqatVar, Handler handler, cwsv cwsvVar, @dzsi ckms ckmsVar) {
        this.c = handler;
        this.d = new ckmq(this, cqatVar, cwsvVar, ckmsVar, ckmmVar);
        this.e = new ckmr(this, cqatVar, cwsvVar, ckmsVar, ckmmVar);
    }

    public static dbsg<cwsv> a(cwsv cwsvVar, jjn jjnVar, @dzsi ckms ckmsVar) {
        EnumMap<jjn, cwsv> enumMap = i;
        if (!enumMap.containsKey(jjnVar)) {
            return dbpy.a;
        }
        cwsv c = cwsv.c(cwsv.a("."), enumMap.get(jjnVar));
        if (ckmsVar == null) {
            return dbsg.i(cwsv.c(cwsvVar, c));
        }
        if (ckmsVar.a() == null) {
            return dbpy.a;
        }
        cwsv a2 = cwsv.a(".");
        cwsv a3 = ckmsVar.a();
        dbsk.s(a3);
        return dbsg.i(cwsv.c(cwsvVar, cwsv.c(cwsv.c(a2, a3), c)));
    }
}
