package defpackage;

import android.widget.FrameLayout;
import java.util.ArrayDeque;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: nng  reason: default package */
/* loaded from: classes3.dex */
public final class nng implements nnv {
    public final ArrayDeque a = new ArrayDeque();
    public final nmh b;
    public final bame c;
    private final aacz d;

    public nng(nmh nmhVar, npt nptVar, aacz aaczVar) {
        this.b = nmhVar;
        this.c = nptVar.a;
        this.d = aaczVar;
    }

    public static int g(nmx nmxVar) {
        if (nmxVar.b.l() == null || (nmxVar.b.l().c & 64) == 0) {
            return 1;
        }
        aqvn aqvnVar = nmxVar.b.l().i;
        if (aqvnVar == null) {
            aqvnVar = aqvn.a;
        }
        int x = amnt.x(aqvnVar.c);
        if (x == 0) {
            x = 1;
        }
        return x + (-1) != 2 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((nnf) it.next()).a();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ampq b() {
        return ampq.i((nnf) this.a.peek()).b(meo.l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ampq c() {
        ampq d = d();
        return d.h() ? ampq.j((nnf) d.c()).b(meo.l) : amon.a;
    }

    public final ampq d() {
        if (this.a.isEmpty()) {
            return amon.a;
        }
        this.a.push((nnf) this.a.pop());
        return ampq.i((nnf) this.a.peek());
    }

    @Override // defpackage.nnv
    public final boolean e() {
        nnf nnfVar = (nnf) this.a.peek();
        return nnfVar != null && nnfVar.a() > 1 && eog.al(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        nnf nnfVar = (nnf) this.a.peek();
        return nnfVar != null && nnfVar.a() > 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(int i) {
        nmc nmcVar;
        if (this.a.size() <= 1) {
            return false;
        }
        nnf nnfVar = (nnf) this.a.pop();
        nnf nnfVar2 = (nnf) this.a.peek();
        if (nnfVar2 != null) {
            this.b.c();
            if (i == 1) {
                this.b.j(nnfVar.b(), nnfVar2.b(), g(nnfVar.c));
            } else {
                nmh nmhVar = this.b;
                nmx b = nnfVar2.b();
                nmhVar.i();
                if (((FrameLayout) nmhVar.o.b).indexOfChild(b.b.oX()) >= 0) {
                    nmhVar.d(false);
                } else if (((FrameLayout) nmhVar.m.b).indexOfChild(b.b.oX()) >= 0) {
                    nmhVar.g(false);
                } else {
                    nmhVar.h(b);
                }
            }
            nmx nmxVar = (nmx) nnfVar2.b.peek();
            if (nmxVar != null) {
                nmxVar.a(2);
            }
            nnfVar.d();
            nmcVar = nnfVar2.c.b;
        } else {
            nmcVar = null;
        }
        this.c.c(ampq.i(nmcVar));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        nnf nnfVar = (nnf) this.a.peek();
        if (nnfVar != null) {
            if (this.a.size() == 1 && nnfVar.a() <= 1) {
                return false;
            }
            if (nnfVar.a() == 0) {
                this.a.pop();
                return i();
            } else if (nnfVar.a() == 1) {
                return h(1);
            } else {
                ampq c = nnfVar.c();
                nmx b = nnfVar.b();
                this.b.c();
                if (!c.h()) {
                    this.b.h(b);
                } else {
                    this.b.j((nmx) c.c(), b, 3);
                }
                b.a(2);
                return true;
            }
        }
        return false;
    }
}
