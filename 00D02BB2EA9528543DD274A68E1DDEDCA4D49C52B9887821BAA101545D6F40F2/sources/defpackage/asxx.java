package defpackage;

import android.app.Activity;
import java.util.Set;
/* compiled from: PG */
/* renamed from: asxx  reason: default package */
/* loaded from: classes2.dex */
public final class asxx implements nxe {
    private final ges a;
    private final asya b;
    private final Activity c;

    public asxx(Activity activity, ges gesVar, asya asyaVar) {
        this.c = activity;
        this.a = gesVar;
        this.b = asyaVar;
    }

    @Override // defpackage.nxe
    public final boolean a(dthb dthbVar) {
        int i = dthbVar.a;
        if ((1048576 & i) == 0) {
            if ((i & 1) == 0) {
                return false;
            }
            dtov dtovVar = dthbVar.c;
            if (dtovVar == null) {
                dtovVar = dtov.o;
            }
            if ((dtovVar.a & 1) == 0) {
                dtov dtovVar2 = dthbVar.c;
                if (dtovVar2 == null) {
                    dtovVar2 = dtov.o;
                }
                if ((dtovVar2.a & 64) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.nxe
    public final void c(Set<dthd> set) {
        set.add(dthd.DIRECTIONS);
    }

    @Override // defpackage.nxe
    public final void b(nvi nviVar) {
        dthb dthbVar = nviVar.a;
        int i = dthbVar.a;
        if ((1048576 & i) != 0) {
            dtqw dtqwVar = dthbVar.r;
            if (dtqwVar == null) {
                dtqwVar = dtqw.h;
            }
            asya asyaVar = this.b;
            ges gesVar = this.a;
            dpjx dpjxVar = dtqwVar.b;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            asyaVar.a(gesVar, dpjxVar);
        } else if ((i & 1) == 0) {
        } else {
            dtov dtovVar = dthbVar.c;
            if (dtovVar == null) {
                dtovVar = dtov.o;
            }
            int i2 = dtovVar.a;
            if ((i2 & 64) == 0) {
                if ((i2 & 1) == 0) {
                    return;
                }
                this.b.b(dtovVar.b);
                return;
            }
            amvh a = oxd.a(dtovVar, this.c);
            amvg amvgVar = new amvg(a);
            if ((dtovVar.a & 1024) != 0) {
                int a2 = dtnx.a(dtovVar.i);
                if (a2 == 0) {
                    a2 = 1;
                }
                int i3 = a2 - 2;
                if (i3 == 0) {
                    amvgVar.a = dpjs.ENTITY_TYPE_HOME;
                } else if (i3 != 1) {
                    if (i3 == 3 && !dbsj.d(a.k)) {
                        amvgVar.a = dpjs.ENTITY_TYPE_NICKNAME;
                    }
                } else {
                    amvgVar.a = dpjs.ENTITY_TYPE_WORK;
                }
            }
            this.b.c(this.a, amvgVar.a());
        }
    }
}
