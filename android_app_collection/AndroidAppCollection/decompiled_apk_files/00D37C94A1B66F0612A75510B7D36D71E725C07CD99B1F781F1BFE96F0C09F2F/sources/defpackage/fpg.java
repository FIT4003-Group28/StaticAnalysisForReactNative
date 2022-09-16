package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
@Deprecated
/* renamed from: fpg  reason: default package */
/* loaded from: classes3.dex */
public final class fpg {
    private static final Comparator b = new wd(10);
    final Runnable a;
    private final Handler c;
    private final List d;
    private final fpd e;
    private final Runnable f;
    private fpf g;

    public fpg(Handler handler, fpd fpdVar) {
        ArrayList arrayList = new ArrayList();
        this.c = handler;
        this.e = fpdVar;
        this.d = arrayList;
        this.f = new fpe(this, 1);
        this.a = new fpe(this);
    }

    private final void h(boolean z) {
        if (z) {
            this.c.post(this.f);
            return;
        }
        this.c.post(this.a);
        this.c.removeCallbacks(this.f);
        this.c.postDelayed(this.f, 500L);
    }

    public final synchronized void a() {
        fpf fpfVar = this.g;
        if (fpfVar == null || fpfVar.f()) {
            return;
        }
        this.e.a(this.g);
        this.g = null;
    }

    public final synchronized void b(fpf fpfVar) {
        if (!g(fpfVar.getClass())) {
            this.d.add(fpfVar);
            List list = this.d;
            Comparator comparator = b;
            Collections.sort(list, comparator);
            fpf fpfVar2 = this.g;
            if (fpfVar2 == null || comparator.compare(fpfVar2, fpfVar) > 0) {
                h(true);
            }
        }
    }

    public final void c() {
        h(false);
    }

    public final void d() {
        h(true);
    }

    public final synchronized void e() {
        a();
        for (fpf fpfVar : this.d) {
            if (fpfVar.f()) {
                fpf fpfVar2 = this.g;
                if (fpfVar2 != null && fpfVar2 != fpfVar) {
                    this.e.a(fpfVar2);
                }
                this.g = fpfVar;
                fpd fpdVar = this.e;
                if (fpdVar.a != null && fpfVar.c() < fpdVar.a.c()) {
                    return;
                }
                fpc fpcVar = fpdVar.a;
                if (fpfVar == fpcVar) {
                    fpcVar = null;
                }
                fpdVar.a(fpcVar);
                fpfVar.e();
                fpdVar.a = fpfVar;
                return;
            }
        }
    }

    public final synchronized void f(fpf fpfVar) {
        if (!this.d.remove(fpfVar) || this.g != fpfVar) {
            return;
        }
        this.e.a(fpfVar);
        this.g = null;
        h(true);
    }

    public final synchronized boolean g(Class cls) {
        boolean z;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (cls.isInstance((fpf) it.next())) {
                z = true;
                break;
            }
        }
        return z;
    }
}
