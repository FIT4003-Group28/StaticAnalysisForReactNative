package defpackage;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: pnj  reason: default package */
/* loaded from: classes4.dex */
public final class pnj {
    public final int a;
    public final CopyOnWriteArrayList b;
    public final ppz c;

    public pnj() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private pnj(CopyOnWriteArrayList copyOnWriteArrayList, int i, ppz ppzVar) {
        this.b = copyOnWriteArrayList;
        this.a = i;
        this.c = ppzVar;
    }

    public final void a(Handler handler, pnk pnkVar) {
        ptx.a(pnkVar);
        this.b.add(new pni(handler, pnkVar));
    }

    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pni pniVar = (pni) it.next();
            pxi.al(pniVar.a, new pnf(this, pniVar.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pni pniVar = (pni) it.next();
            pxi.al(pniVar.a, new pnf(this, pniVar.b));
        }
    }

    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pni pniVar = (pni) it.next();
            pxi.al(pniVar.a, new pnf(this, pniVar.b, 2));
        }
    }

    public final void e(final int i) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pni pniVar = (pni) it.next();
            final pnk pnkVar = pniVar.b;
            pxi.al(pniVar.a, new Runnable() { // from class: png
                @Override // java.lang.Runnable
                public final void run() {
                    pnj pnjVar = pnj.this;
                    pnk pnkVar2 = pnkVar;
                    int i2 = i;
                    pnkVar2.Z();
                    pnkVar2.N(pnjVar.a, pnjVar.c, i2);
                }
            });
        }
    }

    public final void f(final Exception exc) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pni pniVar = (pni) it.next();
            final pnk pnkVar = pniVar.b;
            pxi.al(pniVar.a, new Runnable() { // from class: pnh
                @Override // java.lang.Runnable
                public final void run() {
                    pnj pnjVar = pnj.this;
                    pnkVar.O(pnjVar.a, pnjVar.c, exc);
                }
            });
        }
    }

    public final void g() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            pni pniVar = (pni) it.next();
            pxi.al(pniVar.a, new pnf(this, pniVar.b, 3));
        }
    }

    public final pnj h(int i, ppz ppzVar) {
        return new pnj(this.b, i, ppzVar);
    }
}
