package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajof  reason: default package */
/* loaded from: classes2.dex */
public final class ajof {
    public final cztz a;
    public final Context b;
    public final Executor c;
    public final Executor d;
    public final dxio<ajpg> e;
    public final cqat f;
    public final aihe<ailn, aigt> g;
    private final bvcd h;
    private final aijc i;

    public ajof(bvcd bvcdVar, aijc aijcVar, cztz cztzVar, Activity activity, Executor executor, Executor executor2, dxio<ajpg> dxioVar, cqat cqatVar, aihe<ailn, aigt> aiheVar) {
        this.h = bvcdVar;
        this.i = aijcVar;
        this.a = cztzVar;
        this.b = activity;
        this.c = executor;
        this.d = executor2;
        this.e = dxioVar;
        this.f = cqatVar;
        this.g = aiheVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(btlu btluVar, PersonId personId, boolean z, boolean z2) {
        this.i.k(btluVar, personId, z, z2);
    }

    public final dehn<Boolean> a(btlu btluVar, PersonId personId) {
        String g = personId.g();
        disg bZ = disj.b.bZ();
        dish bZ2 = disi.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        disi disiVar = (disi) bZ2.b;
        g.getClass();
        disiVar.a = 1;
        disiVar.b = g;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        disj disjVar = (disj) bZ.b;
        disi bK = bZ2.bK();
        bK.getClass();
        dsrj<disi> dsrjVar = disjVar.a;
        if (!dsrjVar.a()) {
            disjVar.a = dsqw.cl(dsrjVar);
        }
        disjVar.a.add(bK);
        c(btluVar, personId, true, false);
        this.g.b(ailn.b, dbsg.i(btluVar));
        this.g.a(new aigt(ailp.RPC_IN_FLIGHT, new eapd(this.f.b()), personId), dbsg.i(btluVar));
        deig d = deig.d();
        this.h.a().e = btluVar;
        this.h.c().a(bZ.bK(), new ajoe(this, btluVar, personId, d), bvrj.UI_THREAD);
        return d;
    }
}
