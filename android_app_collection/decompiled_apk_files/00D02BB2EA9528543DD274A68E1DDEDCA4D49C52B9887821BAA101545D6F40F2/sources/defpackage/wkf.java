package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wkf  reason: default package */
/* loaded from: classes7.dex */
public final class wkf {
    private static final dcdc<doos> b = dcdc.g(doos.PNG, doos.JPG);
    @dzsi
    public degu<dopk> a;
    private final dooj c;
    private final qds d;
    private final akqi e;
    private final List<String> f;
    private final DisplayMetrics g;

    public wkf(qds qdsVar, Resources resources, btvo btvoVar, akqi akqiVar, List<String> list) {
        dooj doojVar;
        this.d = qdsVar;
        this.e = akqiVar;
        this.g = resources.getDisplayMetrics();
        this.f = list;
        if (btvoVar.getTransitPagesParameters().D) {
            doojVar = dooj.MERGED_ALL;
        } else {
            doojVar = dooj.LOCAL;
        }
        this.c = doojVar;
    }

    public final void a(@dzsi dnqh dnqhVar, boolean z, boolean z2, degu<dopk> deguVar) {
        c(b(null, dnqhVar, true, z, z2), deguVar);
    }

    public final qdq b(@dzsi Set<akqi> set, @dzsi dnqh dnqhVar, boolean z, boolean z2, boolean z3) {
        qdp p = qdq.p();
        p.f(this.e);
        p.d(this.f);
        p.j(4);
        p.b(Collections.singletonList(this.c));
        qba qbaVar = (qba) p;
        qbaVar.d = 32;
        qbaVar.b = dnqhVar;
        if (set != null) {
            p.c(new ArrayList(set));
        }
        if (z) {
            dhkc bZ = dhkd.d.bZ();
            int i = this.g.widthPixels;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhkd dhkdVar = (dhkd) bZ.b;
            dhkdVar.a |= 1;
            dhkdVar.b = i;
            int i2 = this.g.heightPixels;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dhkd dhkdVar2 = (dhkd) bZ.b;
            dhkdVar2.a |= 2;
            dhkdVar2.c = i2;
            qbaVar.c = bZ.bK();
            p.e(b);
        }
        if (z2) {
            p.g(3);
            p.k(3);
            p.i(2);
        }
        qbaVar.a = Boolean.valueOf(z3);
        return p.a();
    }

    public final void c(qdq qdqVar, degu<dopk> deguVar) {
        degu<dopk> e = e(deguVar);
        bvrj.UI_THREAD.c();
        if (d()) {
            this.d.b();
        }
        this.a = e;
        this.d.a(qdqVar, true, e(e));
    }

    public final boolean d() {
        bvrj.UI_THREAD.c();
        return this.a != null;
    }

    protected final degu<dopk> e(degu<dopk> deguVar) {
        return new wke(this, deguVar);
    }
}
