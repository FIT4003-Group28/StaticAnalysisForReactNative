package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyo  reason: default package */
/* loaded from: classes6.dex */
public final class dyo implements dms {
    private final ahjq a;
    private final dyq b;
    private final Executor c;
    private final daj d;
    private final Map<dmr, dyn> e = new HashMap();

    public dyo(ahjq ahjqVar, dyq dyqVar, Executor executor, czz czzVar) {
        this.a = ahjqVar;
        this.b = dyqVar;
        this.c = executor;
        this.d = czzVar.m();
    }

    @Override // defpackage.dms
    public final void a(dmv dmvVar) {
        float F;
        bvrj.UI_THREAD.c();
        dfmg b = dmvVar.e().b();
        dfmz dfmzVar = b.a;
        if (dfmzVar == null) {
            dfmzVar = dfmz.d;
        }
        dfgn bZ = dfgo.d.bZ();
        double d = dfmzVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dfgo dfgoVar = (dfgo) bZ.b;
        int i = dfgoVar.a | 1;
        dfgoVar.a = i;
        dfgoVar.b = d;
        double d2 = dfmzVar.b;
        dfgoVar.a = i | 2;
        dfgoVar.c = d2;
        dfgo bK = bZ.bK();
        daj dajVar = this.d;
        dfhh bZ2 = dfhj.d.bZ();
        dfhd bZ3 = dfhg.f.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dfhg dfhgVar = (dfhg) bZ3.b;
        bK.getClass();
        dfhgVar.b = bK;
        dfhgVar.a |= 1;
        dfhe bZ4 = dfhf.e.bZ();
        double d3 = dfmzVar.c;
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dfhf dfhfVar = (dfhf) bZ4.b;
        dfhfVar.a |= 4;
        dfhfVar.d = d3;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dfhg dfhgVar2 = (dfhg) bZ3.b;
        dfhf bK2 = bZ4.bK();
        bK2.getClass();
        dfhgVar2.e = bK2;
        dfhgVar2.a |= 8;
        dfhg bK3 = bZ3.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dfhj dfhjVar = (dfhj) bZ2.b;
        bK3.getClass();
        dfhjVar.b = bK3;
        dfhjVar.a |= 1;
        dfhj dfhjVar2 = (dfhj) bZ2.b;
        dfhjVar2.c = 3;
        dfhjVar2.a |= 8;
        dfer e = dajVar.e(bZ2.bK());
        dfmf b2 = dfmf.b(b.b);
        if (b2 == null) {
            b2 = dfmf.TYPE_UNSPECIFIED;
        }
        if (b2 != dfmf.TYPE_UNSPECIFIED) {
            dyq dyqVar = this.b;
            dfmf b3 = dfmf.b(b.b);
            if (b3 == null) {
                b3 = dfmf.TYPE_UNSPECIFIED;
            }
            GmmLocation a = this.a.a();
            if (a == null) {
                F = 0.0f;
            } else {
                dfmz dfmzVar2 = b.a;
                if (dfmzVar2 == null) {
                    dfmzVar2 = dfmz.d;
                }
                double d4 = dfmzVar2.a;
                dfmz dfmzVar3 = b.a;
                if (dfmzVar3 == null) {
                    dfmzVar3 = dfmz.d;
                }
                F = a.F(new akqq(d4, dfmzVar3.b));
            }
            e.f(dyqVar.c(b3, F));
            dyq dyqVar2 = this.b;
            dfmf b4 = dfmf.b(b.b);
            if (b4 == null) {
                b4 = dfmf.TYPE_UNSPECIFIED;
            }
            deha.q(dyqVar2.a(b4), new dyk(e), this.c);
        }
        Map<dmr, dyn> map = this.e;
        dmr a2 = dmvVar.a();
        dyq dyqVar3 = this.b;
        dfmf b5 = dfmf.b(b.b);
        if (b5 == null) {
            b5 = dfmf.TYPE_UNSPECIFIED;
        }
        map.put(a2, new dyn(e, dyqVar3, b5));
    }

    @Override // defpackage.dms
    public final void b(dmr dmrVar) {
        bvrj.UI_THREAD.c();
        dyn remove = this.e.remove(dmrVar);
        if (remove != null) {
            remove.a();
        }
    }

    @Override // defpackage.dms
    public final void c() {
        bvrj.UI_THREAD.c();
        for (dyn dynVar : this.e.values()) {
            dynVar.a();
        }
        this.e.clear();
    }
}
