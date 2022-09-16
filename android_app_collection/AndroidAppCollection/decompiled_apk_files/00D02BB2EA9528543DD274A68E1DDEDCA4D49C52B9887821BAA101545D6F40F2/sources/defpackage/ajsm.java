package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import com.google.android.apps.gmm.locationsharing.api.Profile;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ajsm  reason: default package */
/* loaded from: classes2.dex */
public final class ajsm {
    public final cztz a;
    public final aijc b;
    public final aihe<aimj, aiig> c;
    public final cqat d;
    private final dzsj<gga> e;
    private final Executor f;
    private final bvnt g;
    private final alp h = alp.a();

    public ajsm(dzsj<gga> dzsjVar, Executor executor, cztz cztzVar, aijc aijcVar, bvnt bvntVar, aihe<aimj, aiig> aiheVar, cqat cqatVar) {
        this.e = dzsjVar;
        this.f = executor;
        this.a = cztzVar;
        this.b = aijcVar;
        this.g = bvntVar;
        this.c = aiheVar;
        this.d = cqatVar;
    }

    public final dehn<bvns> a(final btlu btluVar, final Profile profile) {
        bvnt bvntVar = this.g;
        dbsk.s(btluVar);
        final dehn<bvns> f = bvntVar.f(btluVar, profile.a().g(), profile.b().c(""), ajsb.a(this.e.a().getResources(), this.h, R.string.BLOCK_PERSON_CONFIRM_MESSAGE, profile.c().c("")), dtxu.dl);
        f.Pk(new Runnable(this, f, btluVar, profile) { // from class: ajsl
            private final ajsm a;
            private final dehn b;
            private final btlu c;
            private final Profile d;

            {
                this.a = this;
                this.b = f;
                this.c = btluVar;
                this.d = profile;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ajsm ajsmVar = this.a;
                dehn dehnVar = this.b;
                btlu btluVar2 = this.c;
                Profile profile2 = this.d;
                bvns bvnsVar = bvns.BLOCK_ACTION_SUCCESS;
                int ordinal = ((bvns) deha.s(dehnVar)).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        return;
                    }
                    cztq a = cztt.a(ajsmVar.a);
                    a.e(R.string.UPDATE_SHARES_OPERATION_FAILED, new Object[0]);
                    a.c();
                    return;
                }
                aijc aijcVar = ajsmVar.b;
                PersonId a2 = profile2.a();
                aijp aijpVar = (aijp) aijcVar;
                aijpVar.B(btluVar2).e.put(a2.g(), Long.valueOf(aijpVar.h.b() + aijp.e));
                aijpVar.D(btluVar2, a2, true);
                ajsmVar.c.a(new aiif(new eapd(ajsmVar.d.b()), profile2), dbsg.i(btluVar2));
            }
        }, this.f);
        return f;
    }
}
