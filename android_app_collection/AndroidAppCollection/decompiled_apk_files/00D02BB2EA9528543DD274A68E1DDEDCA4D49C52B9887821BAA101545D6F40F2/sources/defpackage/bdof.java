package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: bdof  reason: default package */
/* loaded from: classes3.dex */
public final class bdof implements apc<List<bbtj>> {
    public final AtomicInteger a = new AtomicInteger(0);
    public int b;
    private final bdmb c;
    private final dbsg<bdmb> d;
    private final bdoe e;
    private final boolean f;
    private final bdgd g;
    private final fd h;
    private final ckcw i;
    private final int j;

    public bdof(bdmb bdmbVar, dbsg<bdmb> dbsgVar, bdoe bdoeVar, int i, int i2, boolean z, fd fdVar, ckcw ckcwVar, bdgd bdgdVar) {
        this.c = bdmbVar;
        this.d = dbsgVar;
        this.e = bdoeVar;
        this.f = z;
        this.g = bdgdVar;
        this.b = i;
        this.j = i2;
        this.h = fdVar;
        this.i = ckcwVar;
    }

    @Override // defpackage.apc
    public final apl<List<bbtj>> a(Bundle bundle) {
        bdgd bdgdVar = this.g;
        ckcq a = ((ckcr) this.i.a(ckdz.ap)).a();
        int i = bundle.getInt("load_limit");
        boolean z = this.f;
        Application a2 = bdgdVar.a.a();
        bdgd.a(a2, 1);
        bbtk a3 = bdgdVar.b.a();
        bdgd.a(a3, 2);
        dxio a4 = ((dxjh) bdgdVar.c).a();
        bdgd.a(a4, 3);
        bdgd.a(bdgdVar.d.a(), 4);
        bdgd.a(a, 5);
        return new bdgc(a2, a3, a4, a, i, z);
    }

    @Override // defpackage.apc
    public final /* bridge */ /* synthetic */ void b(List<bbtj> list) {
        List<bbtj> list2 = list;
        bvrj.UI_THREAD.c();
        this.a.set(list2.size());
        this.e.a(list2);
    }

    @Override // defpackage.apc
    public final void c() {
    }

    public final void d() {
        if (f() && g()) {
            e();
        }
    }

    public final void e() {
        apf<D> apfVar;
        bvrj.UI_THREAD.c();
        int i = this.b;
        Bundle bundle = new Bundle();
        bundle.putInt("load_limit", i);
        apd a = apd.a(this.h);
        api apiVar = (api) a;
        aph aphVar = apiVar.a;
        int f = aphVar.d.f();
        for (int i2 = 0; i2 < f; i2++) {
            ape h = aphVar.d.h(i2);
            if (h.k() && (apfVar = h.j) != 0 && !apfVar.c) {
                return;
            }
        }
        int i3 = this.j;
        if (!apiVar.a.e) {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                throw new IllegalStateException("restartLoader must be called on the main thread");
            }
            if (api.d(2)) {
                String str = "restartLoader in " + a + ": args=" + bundle;
            }
            ape d = apiVar.a.d(i3);
            apiVar.e(i3, bundle, this, d != null ? d.o(false) : null);
            return;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final boolean f() {
        return this.h.Z.a.a(j.CREATED);
    }

    public final boolean g() {
        if (this.d.a()) {
            return this.c.b() && this.d.b().b();
        }
        return this.c.b();
    }
}
