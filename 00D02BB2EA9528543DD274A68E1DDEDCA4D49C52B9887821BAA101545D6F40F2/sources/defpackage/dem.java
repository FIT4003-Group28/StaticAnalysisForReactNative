package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dem  reason: default package */
/* loaded from: classes6.dex */
public final class dem {
    public final dbty<dhlb> a;
    private final ahjq b;
    private final dgw c;
    private final auew d;
    private final Executor e;
    private final deg f;
    private final dbty<dehn<Boolean>> g;

    public dem(ahjq ahjqVar, dgw dgwVar, ff ffVar, final btvo btvoVar, Executor executor, deh dehVar, final czh czhVar, dbty<dehn<Boolean>> dbtyVar) {
        auew auewVar = new auew();
        o oVar = ffVar.g;
        dxio a = ((dxjh) dehVar.a).a();
        deh.a(a, 1);
        Executor a2 = dehVar.b.a();
        deh.a(a2, 2);
        Executor a3 = dehVar.c.a();
        deh.a(a3, 3);
        deh.a(oVar, 4);
        deh.a(czhVar, 5);
        deg degVar = new deg(a, a2, a3, oVar, czhVar);
        dbty<dhlb> dbtyVar2 = new dbty(btvoVar, czhVar) { // from class: dei
            private final btvo a;
            private final czh b;

            {
                this.a = btvoVar;
                this.b = czhVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                btvo btvoVar2 = this.a;
                int ordinal = this.b.ordinal();
                if (ordinal == 0) {
                    dhlz dhlzVar = btvoVar2.getNavigationParametersProto().aJ;
                    if (dhlzVar == null) {
                        dhlzVar = dhlz.n;
                    }
                    dhlb dhlbVar = dhlzVar.l;
                    return dhlbVar == null ? dhlb.e : dhlbVar;
                } else if (ordinal == 1) {
                    dknv dknvVar = btvoVar2.getAugmentedRealityParameters().a;
                    if (dknvVar == null) {
                        dknvVar = dknv.v;
                    }
                    dhlb dhlbVar2 = dknvVar.m;
                    return dhlbVar2 == null ? dhlb.e : dhlbVar2;
                } else if (ordinal == 3) {
                    dkhv dkhvVar = btvoVar2.getAugmentedRealityParameters().b;
                    if (dkhvVar == null) {
                        dkhvVar = dkhv.g;
                    }
                    dhlb dhlbVar3 = dkhvVar.e;
                    return dhlbVar3 == null ? dhlb.e : dhlbVar3;
                } else {
                    return dhlb.e;
                }
            }
        };
        this.b = ahjqVar;
        this.c = dgwVar;
        this.d = auewVar;
        this.e = executor;
        this.f = degVar;
        this.g = dbtyVar;
        this.a = dbtyVar2;
    }

    private static boolean c(int i, boolean z, boolean z2) {
        if (i == 1 || i == 2 || !z2) {
            return true;
        }
        return i == 3 && !z;
    }

    public final <T> dehn<T> a(final del<T> delVar, T t) {
        final dehn g;
        final GmmLocation a = this.b.a();
        if (a == null) {
            return deha.a(t);
        }
        final deg degVar = this.f;
        dbsg<czo> a2 = degVar.a.a();
        if (!a2.a()) {
            g = deha.a(dbpy.a);
        } else {
            g = deew.g(deew.h(degp.q(a2.b().a(degVar.e)), new dbrn(a) { // from class: ded
                private final Location a;

                {
                    this.a = a;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    Location location = this.a;
                    dbsg dbsgVar = (dbsg) obj;
                    if (!dbsgVar.a()) {
                        return dbpy.a;
                    }
                    dbsg<czm> b = ((diz) dbsgVar.b()).b(location);
                    return !b.a() ? dbpy.a : b;
                }
            }, degVar.c), new defg(degVar) { // from class: dee
                private final deg a;

                {
                    this.a = degVar;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    deg degVar2 = this.a;
                    dbsg dbsgVar = (dbsg) obj;
                    if (!dbsgVar.a()) {
                        return deha.a(dbpy.a);
                    }
                    return deew.h(degp.q(((czm) dbsgVar.b()).a(degVar2.d)), def.a, dege.a);
                }
            }, degVar.b);
        }
        final dehn<Boolean> a3 = this.g.a();
        return deha.m(g, a3).b(new Callable(g, a3, delVar) { // from class: dek
            private final dehn a;
            private final dehn b;
            private final del c;

            {
                this.a = g;
                this.b = a3;
                this.c = delVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.c.a((dbsg) deha.r(this.a), ((Boolean) deha.r(this.b)).booleanValue());
            }
        }, this.e);
    }

    public final boolean b(dhlb dhlbVar, boolean z) {
        int a = dhla.a(dhlbVar.b);
        int i = 2;
        if (a == 0) {
            a = 2;
        }
        GmmLocation a2 = this.b.a();
        if (c(a, z, a2 != null && this.d.a(a2) == 1)) {
            int a3 = dhla.a(dhlbVar.c);
            if (a3 != 0) {
                i = a3;
            }
            if (c(i, z, this.c.a(dhlbVar.d))) {
                return true;
            }
        }
        return false;
    }
}
