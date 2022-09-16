package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: nnn  reason: default package */
/* loaded from: classes3.dex */
public final class nnn implements zas, nnv {
    public final nmh a;
    public final LinkedList b = new LinkedList();
    private final bame c;
    private nmx d;
    private final aacz e;

    public nnn(nmh nmhVar, npt nptVar, aacz aaczVar) {
        this.a = nmhVar;
        this.c = nptVar.a;
        this.e = aaczVar;
    }

    public final int b() {
        return this.b.size();
    }

    public final nmx c() {
        return (nmx) this.b.peekLast();
    }

    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nmx) it.next()).a(5);
        }
        this.b.clear();
        this.c.c(amon.a);
    }

    @Override // defpackage.nnv
    public final boolean e() {
        return this.b.size() > 1 && eog.al(this.e);
    }

    public final void f(nmx nmxVar, boolean z) {
        this.a.c();
        nmx nmxVar2 = (nmx) this.b.peekLast();
        this.b.addLast(nmxVar);
        if (!z || nmxVar2 == null) {
            this.a.h(nmxVar);
            if (nmxVar2 != null) {
                nmxVar2.a(3);
            }
        } else {
            this.a.k(nmxVar2, nmxVar, 3);
        }
        nmx nmxVar3 = (nmx) this.b.peekFirst();
        if (nmxVar3 != null) {
            this.c.c(ampq.i(nmxVar3.b));
        } else {
            this.c.c(amon.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(String str) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((nmx) it.next()).a.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(boolean z) {
        if (this.b.size() <= 1) {
            return false;
        }
        this.a.c();
        nmx nmxVar = (nmx) this.b.removeLast();
        nmx nmxVar2 = (nmx) this.b.getLast();
        if (z) {
            this.a.j(nmxVar, nmxVar2, 3);
            this.d = nmxVar;
        } else {
            this.a.h(nmxVar2);
            nmxVar.a(5);
        }
        return true;
    }

    @Override // defpackage.zas
    public final void nH(int i, yye yyeVar) {
        if (i == 0) {
            nmx nmxVar = this.d;
            if (nmxVar != null) {
                nmxVar.a(5);
            }
            this.d = null;
        } else if (i != 2 || this.b.size() <= 1) {
        } else {
            LinkedList linkedList = this.b;
            ((nmx) linkedList.get(linkedList.size() - 2)).a(3);
        }
    }
}
