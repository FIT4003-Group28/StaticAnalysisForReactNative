package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crjz  reason: default package */
/* loaded from: classes5.dex */
public final class crjz<T> extends btrh<T> {
    private final int d;

    public crjz(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            crkf crkfVar = (crkf) obj;
            crjv remove = ((crjy) this.a).c.remove(crkfVar.a);
            if (remove == null) {
                return;
            }
            if (crkfVar.c != null) {
                remove.a.m();
                remove.b.d.b(new crht(remove.a));
                return;
            }
            crke crkeVar = crkfVar.b;
            amuh amuhVar = crkeVar.b;
            if (!crkeVar.a() || amuhVar.n()) {
                remove.a(null);
                return;
            }
            if (!amuhVar.j()) {
                amuhVar = amuhVar.i(0);
            }
            amsy amsyVar = crkeVar.c;
            if (amsyVar != null && amsyVar.D()) {
                amsyVar.E();
            }
            remove.a(amuhVar);
            return;
        }
        crjy crjyVar = (crjy) this.a;
        crjr crjrVar = (crjr) obj;
        crjv crjvVar = crjrVar.d;
        crkv remove2 = crjyVar.c.i().remove(crjvVar);
        if (remove2 != null) {
            remove2.b();
        }
        GmmLocation a = crjyVar.a.a().a();
        if (a == null) {
            crlr crlrVar = crjyVar.b;
            bvrj.NAVIGATION_INTERNAL.c();
            crlrVar.b.put(crjvVar, crjrVar);
            crlrVar.c = crjyVar;
            if (crlrVar.d) {
                return;
            }
            crlrVar.d = true;
            btrm btrmVar = crlrVar.a;
            dceq a2 = dcet.a();
            a2.b(amqo.class, new crls(amqo.class, crlrVar, bvrj.NAVIGATION_INTERNAL));
            btrmVar.g(crlrVar, a2.a());
            return;
        }
        crjyVar.b.c(crjyVar, a, crjvVar);
        crjyVar.c(crjvVar, crjrVar, a);
    }
}
