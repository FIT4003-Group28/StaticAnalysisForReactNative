package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: uld  reason: default package */
/* loaded from: classes4.dex */
public final class uld implements ule, uky {
    public boolean d;
    public ujt f;
    public unk g;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final Object b = new Object();
    public final Map c = new HashMap();
    public amuk e = amuk.q();

    public static Object e(ujt ujtVar) {
        if (ujtVar != null) {
            return ujtVar.a;
        }
        return null;
    }

    private final void h() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((uuo) it.next()).b(e(this.f));
        }
    }

    @Override // defpackage.uky
    public final Object a() {
        return e(this.f);
    }

    @Override // defpackage.uky
    public final void b(uuo uuoVar) {
        this.a.add(uuoVar);
    }

    @Override // defpackage.uky
    public final void c(uuo uuoVar) {
        this.a.remove(uuoVar);
    }

    public final amuk d() {
        amuk g;
        amuf amufVar = new amuf();
        synchronized (this.b) {
            amzt listIterator = this.e.listIterator();
            while (listIterator.hasNext()) {
                amufVar.h(((ujt) listIterator.next()).a);
            }
            g = amufVar.g();
        }
        return g;
    }

    public final void f() {
        if (!this.d) {
            this.d = true;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((uuo) it.next()).c();
            }
        }
    }

    public final void g(Object obj) {
        String str;
        ujt ujtVar;
        if (obj == null) {
            if (this.f == null) {
                return;
            }
            this.f = null;
            h();
            return;
        }
        ujt ujtVar2 = this.f;
        str = ((ulx) obj).c;
        synchronized (this.b) {
            ujtVar = (ujt) this.c.get(str);
        }
        aqxo.q(ujtVar != null, "Selected account must be an available account");
        this.f = ujtVar;
        if (ujtVar.equals(ujtVar2)) {
            return;
        }
        h();
    }
}
