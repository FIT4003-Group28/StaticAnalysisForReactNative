package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bxyt  reason: default package */
/* loaded from: classes4.dex */
public final class bxyt {
    public final Activity a;
    public final cqat b;
    public final bxym c;
    public final bxzr d;

    public bxyt(cqat cqatVar, Activity activity, bxzr bxzrVar, bxym bxymVar) {
        this.b = cqatVar;
        this.a = activity;
        this.d = bxzrVar;
        this.c = bxymVar;
    }

    public static cqiw<bxxq> b() {
        return new bxvl();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(dpte dpteVar, eapg eapgVar) {
        return eaov.c(bvtb.s(TimeUnit.MICROSECONDS.toMillis(dpteVar.e)), eapgVar).p;
    }

    public final List<cqix<?>> a(@dzsi cqix<?> cqixVar, List<dpte> list, @dzsi dbsz<dpte> dbszVar, @dzsi cqix<bxxp> cqixVar2) {
        ArrayList arrayList = new ArrayList();
        for (dpte dpteVar : list) {
            bxzr bxzrVar = this.d;
            bxyl e = bxyn.e();
            e.c(arrayList.size());
            e.b(dpteVar);
            ((bxxv) e).a = dbszVar;
            e.d(this.c);
            dbsg<bxxq> a = bxzrVar.a(e.a());
            if (a.a()) {
                arrayList.add(a.b());
            }
        }
        if (arrayList.isEmpty()) {
            return dcdc.e();
        }
        cqiv cqivVar = new cqiv();
        if (cqixVar != null) {
            cqivVar.e(cqixVar);
        }
        cqivVar.f(b(), arrayList);
        if (cqixVar2 != null) {
            cqivVar.e(cqixVar2);
        }
        return cqivVar.a;
    }
}
