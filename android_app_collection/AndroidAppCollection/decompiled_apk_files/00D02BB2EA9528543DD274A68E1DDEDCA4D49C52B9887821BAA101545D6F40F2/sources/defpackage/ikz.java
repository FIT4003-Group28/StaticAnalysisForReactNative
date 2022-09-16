package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: ikz  reason: default package */
/* loaded from: classes6.dex */
public final class ikz implements Serializable {
    @dzsi
    public alvj a;
    @dzsi
    public transient String b;
    @dzsi
    public transient String c;
    @dzsi
    public transient String d;
    @dzsi
    public transient String e;
    @dzsi
    public transient String f;
    @dzsi
    public transient String g;
    public transient boolean h;
    @dzsi
    public transient String i;
    @dzsi
    public transient cjtd j;
    @dzsi
    public transient dvuy k;
    @dzsi
    public transient dqmr l;
    @dzsi
    public transient String m;
    @dzsi
    public transient String n;
    @dzsi
    public transient String o;
    @dzsi
    private final bvrt<dvuy> p;
    private transient int q = 0;

    public ikz(@dzsi alap alapVar, @dzsi dvuy dvuyVar) {
        alvj alvjVar;
        this.p = bvrt.a(dvuyVar);
        if (alapVar != null && (alvjVar = alapVar.b) != null) {
            this.a = alvjVar;
        }
        e();
    }

    public static List<dvuy> b(dvus dvusVar) {
        dvva dvvaVar = dvusVar.a;
        if (dvvaVar == null) {
            dvvaVar = dvva.b;
        }
        return dvvaVar.a;
    }

    private final void e() {
        dqmr dqmrVar;
        dvuy dvuyVar = (dvuy) bvrt.f(this.p, (dssr) dvuy.s.cu(7), dvuy.s);
        if (dvuyVar == null) {
            return;
        }
        this.k = dvuyVar;
        this.b = dvuyVar.c;
        this.c = dvuyVar.d;
        this.d = dvuyVar.e;
        this.e = dvuyVar.f;
        this.f = dvuyVar.g;
        String str = dvuyVar.h;
        if (str.startsWith("/aclk")) {
            String valueOf = String.valueOf(str);
            str = valueOf.length() != 0 ? "https://www.google.com".concat(valueOf) : new String("https://www.google.com");
        }
        this.g = str;
        this.m = dvuyVar.q;
        this.n = dvuyVar.r;
        this.o = dvuyVar.i;
        this.h = dvuyVar.k;
        this.q = dvuyVar.j.size();
        if ((dvuyVar.a & 32768) != 0) {
            dqmrVar = dvuyVar.p;
            if (dqmrVar == null) {
                dqmrVar = dqmr.h;
            }
        } else {
            dqmrVar = null;
        }
        this.l = dqmrVar;
        if (this.q > 0) {
            dvuq dvuqVar = dvuyVar.j.get(0);
            dndc dndcVar = dvuqVar.e;
            if (dndcVar == null) {
                dndcVar = dndc.f;
            }
            this.a = alvj.a(dndcVar);
            if ((dvuqVar.a & 4) != 0) {
                this.i = dvuqVar.c;
            }
        }
        cjta b = cjtd.b();
        dvxb dvxbVar = dvuyVar.b;
        if (dvxbVar == null) {
            dvxbVar = dvxb.d;
        }
        if ((dvxbVar.a & 2) != 0) {
            b.g(dvxbVar.c);
        }
        if ((dvxbVar.a & 1) != 0) {
            b.b = dvxbVar.b;
        }
        String str2 = this.g;
        if (str2 != null) {
            ddji bZ = ddjj.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddjj ddjjVar = (ddjj) bZ.b;
            str2.getClass();
            ddjjVar.a |= 1;
            ddjjVar.b = str2;
            b.k(bZ.bK());
        }
        this.j = b.d();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        e();
    }

    @dzsi
    public final String a() {
        dvuy dvuyVar = this.k;
        if (dvuyVar != null) {
            return dvuyVar.n;
        }
        return null;
    }

    @dzsi
    public final int c() {
        dvuy dvuyVar = this.k;
        if (dvuyVar != null) {
            int a = dndf.a(dvuyVar.l);
            if (a != 0) {
                return a;
            }
            return 1;
        }
        alvj alvjVar = this.a;
        if (alvjVar == null) {
            return 0;
        }
        return dndf.a(alvjVar.a);
    }

    @dzsi
    public final int d() {
        dvuy dvuyVar = this.k;
        if (dvuyVar != null) {
            int a = dpln.a(dvuyVar.m);
            if (a != 0) {
                return a;
            }
            return 1;
        }
        return 0;
    }
}
