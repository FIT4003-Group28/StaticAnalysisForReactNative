package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: ccsh  reason: default package */
/* loaded from: classes4.dex */
public abstract class ccsh {
    public abstract ccwk a();

    public abstract dbsg<ccln> b();

    public abstract ccsi c();

    public abstract void d(List<bbtm> list);

    public abstract void e(ccwk ccwkVar);

    public abstract void f(boolean z);

    public abstract void g(int i);

    public abstract int h();

    public abstract void i(int i);

    public final ccsi j() {
        Object obj;
        int h = h();
        int i = h - 1;
        if (h == 0) {
            throw null;
        }
        boolean z = true;
        switch (i) {
            case 0:
            case 5:
                g(1);
                break;
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 8:
                g(2);
                break;
            case 4:
                g(3);
                break;
        }
        dbsg<V> h2 = b().h(ccsg.a);
        if ((a().a & 64) != 0) {
            obj = dbsg.i(a().j);
        } else {
            obj = dbpy.a;
        }
        dbsg d = h2.d(obj);
        if (d.a()) {
            if ((a().a & 64) == 0) {
                ccwk a = a();
                dsqp dsqpVar = (dsqp) a.cu(5);
                dsqpVar.bC(a);
                ccwj ccwjVar = (ccwj) dsqpVar;
                String str = (String) d.b();
                if (ccwjVar.c) {
                    ccwjVar.bF();
                    ccwjVar.c = false;
                }
                ccwk ccwkVar = (ccwk) ccwjVar.b;
                str.getClass();
                ccwkVar.a |= 64;
                ccwkVar.j = str;
                e(ccwjVar.bK());
            } else {
                dbsk.l(a().j.equals(d.b()));
            }
        }
        ccsi c = c();
        dbsk.g(!c.c().isEmpty() || !c.a().e.isEmpty() || !c.a().j.isEmpty(), "An offering submission must reference some media, either new or existing: %s", c);
        if (!c.c().isEmpty() && !c.a().e.isEmpty()) {
            z = false;
        }
        dbsk.g(z, "Cannot set both associated media and existing media on the same submission: %s", c);
        return c;
    }
}
