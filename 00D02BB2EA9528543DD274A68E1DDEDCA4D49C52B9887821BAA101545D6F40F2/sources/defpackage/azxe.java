package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: azxe  reason: default package */
/* loaded from: classes3.dex */
public final class azxe extends azwm<azxe> {
    private final bvrt<drjs> a;

    public azxe(azxd azxdVar) {
        super(azxdVar);
        this.a = bvrt.b(azxdVar.a);
    }

    @Override // defpackage.azwm
    public final String e(@dzsi Context context) {
        drjj drjjVar;
        drjl drjlVar;
        drke drkeVar;
        drjr drjrVar = drjr.FLIGHT_RESERVATION;
        int ordinal = drjr.a(g().a).ordinal();
        if (ordinal == 0) {
            drjs g = g();
            if (g.a == 3) {
                drjjVar = (drjj) g.b;
            } else {
                drjjVar = drjj.c;
            }
            drjh drjhVar = drjjVar.a;
            if (drjhVar == null) {
                drjhVar = drjh.j;
            }
            drjf drjfVar = drjhVar.f;
            if (drjfVar == null) {
                drjfVar = drjf.d;
            }
            return drjfVar.b;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                return "";
            }
            drjs g2 = g();
            if (g2.a == 5) {
                drkeVar = (drke) g2.b;
            } else {
                drkeVar = drke.k;
            }
            return drkeVar.c;
        } else {
            drjs g3 = g();
            if (g3.a == 4) {
                drjlVar = (drjl) g3.b;
            } else {
                drjlVar = drjl.f;
            }
            drdg drdgVar = drjlVar.b;
            if (drdgVar == null) {
                drdgVar = drdg.q;
            }
            return drdgVar.g;
        }
    }

    public final drjs g() {
        return this.a.e((dssr) drjs.h.cu(7), drjs.h);
    }

    @Override // defpackage.azwm
    @dzsi
    public final azxm<azxe> h() {
        return azxm.m;
    }

    @Override // defpackage.azwm
    public final /* bridge */ /* synthetic */ azwh<azxe> i() {
        return new azxd(this);
    }
}
