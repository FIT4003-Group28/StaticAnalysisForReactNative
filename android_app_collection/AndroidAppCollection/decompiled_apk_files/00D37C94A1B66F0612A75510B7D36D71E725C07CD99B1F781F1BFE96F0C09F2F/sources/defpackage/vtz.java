package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: vtz  reason: default package */
/* loaded from: classes4.dex */
public final class vtz implements vrr {
    public final CopyOnWriteArraySet a;
    public final vrt b;
    public final Queue c;
    public boolean d;
    public Surface e;
    public vtx f;
    public boolean g;
    public final vtt h;
    private final Handler i;
    private final vty j;
    private vtr k;
    private List l;
    private final Runnable m;

    public vtz(vrt vrtVar) {
        vtt vttVar = new vtt(this);
        this.h = vttVar;
        this.a = new CopyOnWriteArraySet();
        this.i = new Handler(Looper.getMainLooper());
        this.j = new vty(vttVar);
        this.c = new LinkedList();
        this.d = false;
        this.g = true;
        this.m = new vtu(this);
        this.b = vrtVar;
    }

    @Override // defpackage.vrr
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vtv) it.next()).d();
        }
        synchronized (this.c) {
            this.c.add(0);
        }
        d();
    }

    @Override // defpackage.vrr
    public final void b() {
        synchronized (this.c) {
            this.c.add(1);
        }
        d();
    }

    public final void c() {
        this.b.d(this);
        this.k = null;
        this.f = null;
        this.l = null;
    }

    public final void d() {
        this.i.post(this.m);
    }

    public final synchronized void e(vtr vtrVar, List list) {
        vtrVar.getClass();
        this.k = vtrVar;
        this.l = Collections.unmodifiableList(list);
        vtrVar.e(this.j);
        vtrVar.d.add(this.j);
        d();
        f();
    }

    public final void f() {
        vtr vtrVar = this.k;
        if (vtrVar != null) {
            int i = Integer.MAX_VALUE;
            if (!vtrVar.o() && !this.g) {
                i = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            }
            this.b.c(this, i);
        }
    }

    public final boolean g() {
        return this.b.f(this);
    }

    public final boolean h(boolean z) {
        List<Integer> list;
        vtx vtxVar;
        if (this.k == null || this.e == null || (list = this.l) == null || (vtxVar = this.f) == null || (!z && !vtxVar.i)) {
            return false;
        }
        for (Integer num : list) {
            this.k.m(num.intValue(), true != z ? -1 : 0);
        }
        return true;
    }

    public final String toString() {
        return "PLAYER";
    }
}
