package defpackage;

import android.app.Application;
import android.widget.Toast;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajtc  reason: default package */
/* loaded from: classes2.dex */
public final class ajtc {
    public static final dcqe a = dcqe.c("ajtc");
    public final bvcp b;
    public final aiki c;
    public final Executor d;
    public final cqat e;
    public final aigj f;
    public final ajmq g;
    public final aihe<ailz, aihs> h;
    public final btvo i;
    public final LinkedList<ajta> j = new LinkedList<>();
    public final dcba<ajtb> k = dcba.a(10);
    private final Application l;
    private final aihe<aimj, aiig> m;

    public ajtc(aiki aikiVar, bvcp bvcpVar, Executor executor, cqat cqatVar, Application application, aigj aigjVar, aihe<ailz, aihs> aiheVar, ajmq ajmqVar, aihe<aimj, aiig> aiheVar2, btvo btvoVar) {
        this.c = aikiVar;
        this.b = bvcpVar;
        this.d = executor;
        this.e = cqatVar;
        this.l = application;
        this.f = aigjVar;
        this.g = ajmqVar;
        this.h = aiheVar;
        this.m = aiheVar2;
        this.i = btvoVar;
    }

    public final void a(int i, List<disy> list, ajsz ajszVar) {
        if (i != 0) {
            list = null;
        }
        boolean a2 = ajszVar.a(i, list);
        if (i == 0 || a2) {
            return;
        }
        if (!this.j.isEmpty()) {
            this.j.getLast().a();
        } else {
            d();
        }
    }

    public final void b(btlu btluVar, dqzv dqzvVar) {
        eapd eapdVar = new eapd(this.e.b());
        dbsg<Profile> h = aiij.h(dqzvVar);
        if (h.a()) {
            this.m.a(aiij.g(h.b(), eapdVar), dbsg.i(btluVar));
        }
        this.h.a(new aihq(eapdVar, dqzvVar, false), dbsg.i(btluVar));
        this.c.s(dqzvVar, btluVar);
    }

    public final void c(btlu btluVar, List<dqzv> list) {
        for (dqzv dqzvVar : list) {
            PersonId b = PersonId.b(dqzvVar);
            dbsk.s(b);
            this.h.a(new aiht(new eapd(this.e.b()), dqzvVar), dbsg.i(btluVar));
            ahwl e = this.c.e(btluVar, b);
            if (e == null || !e.i()) {
                this.c.u(btluVar);
            } else {
                this.c.p(btluVar, b);
            }
        }
    }

    public final void d() {
        Toast.makeText(this.l, (int) R.string.UPDATE_SHARES_OPERATION_FAILED, 0).show();
    }
}
