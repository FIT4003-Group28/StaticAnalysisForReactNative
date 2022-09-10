package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwjh  reason: default package */
/* loaded from: classes4.dex */
public final class bwjh implements btph {
    public final bwjr a;
    public final bwne b;
    public final Executor c;
    public final Application d;
    private final btrm e;

    public bwjh(btrm btrmVar, bwjr bwjrVar, Executor executor, Application application) {
        bwne bwneVar = new bwne();
        this.e = btrmVar;
        this.b = bwneVar;
        this.a = bwjrVar;
        this.c = executor;
        this.d = application;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bwiz a() {
        return this.a.g;
    }

    public final boolean b(@dzsi btlu btluVar) {
        boolean f = this.a.g.f(btluVar);
        if (f) {
            d();
        }
        return f;
    }

    public final void d() {
        this.a.g.d();
        this.b.l();
    }

    public final void e() {
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(bwka.class, new bwji(bwka.class, this));
        btrmVar.g(this, a.a());
    }

    public final void f() {
        HashMap hashMap;
        bwjl bwjlVar = this.a.j;
        synchronized (bwjlVar) {
            hashMap = new HashMap(bwjlVar.f);
        }
        for (bwno bwnoVar : hashMap.keySet()) {
            bwnoVar.i();
        }
        this.e.a(this);
    }

    public final void g() {
        a().h();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0367 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x043b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x03b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.bwno r46, @defpackage.dzsi defpackage.bwjw r47, defpackage.btys r48) {
        /*
            Method dump skipped, instructions count: 1708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwjh.h(bwno, bwjw, btys):void");
    }

    public final void i() {
        bwjr bwjrVar = this.a;
        ahjq a = bwjrVar.d.a();
        cqat cqatVar = bwjrVar.c;
        akox a2 = bwjrVar.a.a();
        dtaq dtaqVar = null;
        akqs b = a2 == null ? null : alao.b(a2);
        alts g = a2 == null ? null : a2.s.g();
        akqh akqhVar = g == null ? null : g.a;
        float f = (a2 == null || a2.k() == null) ? 15.0f : a2.k().p().k;
        GmmLocation a3 = a.a();
        if (a3 != null) {
            dtaqVar = a3.a();
        }
        bwjrVar.k = new bwiw(new bwiv(cqatVar.e(), b, akqhVar, f, dtaqVar));
        a().g();
    }
}
