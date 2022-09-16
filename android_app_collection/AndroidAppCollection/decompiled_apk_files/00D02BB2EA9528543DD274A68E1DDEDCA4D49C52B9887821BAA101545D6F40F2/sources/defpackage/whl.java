package defpackage;

import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: whl  reason: default package */
/* loaded from: classes7.dex */
public final class whl implements wgi {
    public final wdt a;
    public final dzsj<String> b;
    public final Executor c;
    public final SavedTrip.Data d;
    public final double e;

    public whl(btvo btvoVar, wdt wdtVar, dzsj<String> dzsjVar, Executor executor, SavedTrip.Data data) {
        this.a = wdtVar;
        this.b = dzsjVar;
        this.c = executor;
        this.d = data;
        this.e = btvoVar.getSavedTripsParameters().a;
    }

    @Override // defpackage.wgi
    public final dehn<wgj> a() {
        return deew.h(this.a.c(), new dbrn(this) { // from class: whe
            private final whl a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final whl whlVar = this.a;
                dbsg r = dcbg.b((dcdc) obj).t(whf.a).r(new dbsl(whlVar) { // from class: whg
                    private final whl a;

                    {
                        this.a = whlVar;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj2) {
                        whl whlVar2 = this.a;
                        SavedTrip.Data data = whlVar2.d;
                        SavedTrip.Data b = ((SavedTrip) obj2).b();
                        double d = whlVar2.e;
                        if (data.b().e(b.b(), d) && data.c() == b.c()) {
                            if (data.c() != dqvj.TRANSIT) {
                                return true;
                            }
                            amvh a = data.a();
                            amvh a2 = b.a();
                            if (a == null || a2 == null ? !(a != null || a2 != null) : a.e(a2, d)) {
                                if (data.d() == null && b.d() == null) {
                                    return true;
                                }
                                if (data.d() != null && b.d() != null && b.d().equals(data.d())) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                });
                dbsg h = r.h(whh.a);
                final dzsj<String> dzsjVar = whlVar.b;
                dzsjVar.getClass();
                return new whk(whlVar, (String) h.e(new dbty(dzsjVar) { // from class: whi
                    private final dzsj a;

                    {
                        this.a = dzsjVar;
                    }

                    @Override // defpackage.dbty
                    public final Object a() {
                        return this.a.a();
                    }
                }), r.a());
            }
        }, dege.a);
    }
}
