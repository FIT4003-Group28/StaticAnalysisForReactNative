package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: cjva  reason: default package */
/* loaded from: classes.dex */
public final class cjva extends cjuw {
    private static final dcqe f = dcqe.c("cjva");
    public final cjrc d;
    final LinkedHashMap<cjuu, cjsh> e;
    private final cjqy g;
    private final cqat h;
    private final dzsj<duxm> i;
    private final cjuy j;
    private final cjtg k;
    private final long l;
    private final boolean m;
    private List<cjuu> n;
    private cjrc o;
    private int p;
    private final cjsh q;
    @dzsi
    private ddlp r;
    private final cjuz s;

    public cjva(cjqq cjqqVar, cjtg cjtgVar, cjrc cjrcVar, cjqy cjqyVar, cqat cqatVar, cjuy cjuyVar, dzsj<duxm> dzsjVar, boolean z) {
        super(cjqqVar);
        this.e = dcjz.h();
        this.n = new ArrayList();
        this.k = cjtgVar;
        this.d = cjrcVar;
        this.l = cqatVar.e();
        this.g = cjqyVar;
        this.h = cqatVar;
        this.i = dzsjVar;
        this.o = cjrcVar.b(cjqyVar.e(cjqi.a));
        this.s = new cjuz(this);
        this.j = cjuyVar;
        this.q = cjsh.e(this.o, 0, dbpy.a);
        this.r = null;
        this.m = z;
    }

    private final cjql k(cjtd cjtdVar, dbsg<View> dbsgVar) {
        cjsh cjshVar;
        cjql e;
        cjsh cjshVar2;
        if (!cjtdVar.l()) {
            bvoo.f(new IllegalStateException(String.format("Invalid Ue3LoggingCommonParams: %s", cjtdVar)));
            return cjql.a;
        }
        cjtd a = this.c.a(cjtdVar);
        if (dbsgVar.a()) {
            cjqg.h(dbsgVar.b(), a);
        }
        ddzg i = a.i();
        if (i != null) {
            dsqp dsqpVar = (dsqp) i.cu(5);
            dsqpVar.bC(i);
            ddzf ddzfVar = (ddzf) dsqpVar;
            if (ddzfVar.c) {
                ddzfVar.bF();
                ddzfVar.c = false;
            }
            ddzg ddzgVar = (ddzg) ddzfVar.b;
            ddzgVar.f = null;
            int i2 = ddzgVar.a & (-16777217);
            ddzgVar.a = i2;
            ddzgVar.i = null;
            int i3 = i2 & (-536870913);
            ddzgVar.a = i3;
            ddzgVar.k = null;
            ddzgVar.b &= -2;
            ddzgVar.h = null;
            ddzgVar.a = i3 & (-268435457);
            ddzgVar.d = ddzg.ck();
            if (ddzfVar.c) {
                ddzfVar.bF();
                ddzfVar.c = false;
            }
            ddzg ddzgVar2 = (ddzg) ddzfVar.b;
            ddzgVar2.l = null;
            ddzgVar2.b &= -3;
            ddzgVar2.j = null;
            ddzgVar2.a &= -1073741825;
            if (!ddzfVar.bK().bR().u()) {
                bvoo.h("MapsData incorrectly attached to impression - this data will be dropped on the server-side. Only whitelisted fields are kept - all new data should be logged via either go/geo-metadata-logging or go/geo-impression-metadata-logging. Ue3LoggingCommonParams: %s", a);
            }
        }
        synchronized (this.e) {
            int size = this.n.size() + 1;
            long e2 = this.h.e();
            long j = this.l;
            if (!dbsgVar.a()) {
                cjshVar = this.q;
            } else {
                for (ViewParent parent = dbsgVar.b().getParent(); parent != null; parent = parent.getParent()) {
                    if ((parent instanceof View) && (e = cjqg.e((View) parent)) != null) {
                        if (!this.d.equals(e.c)) {
                            break;
                        }
                        cjsh cjshVar3 = e.b;
                        if (cjshVar3 != null) {
                            cjshVar2 = cjshVar3;
                            break;
                        }
                    }
                }
                cjshVar = this.q;
            }
            cjshVar2 = cjshVar;
            cjuu cjuuVar = new cjuu(a, e2, j, size, cjshVar2);
            cjsh cjshVar4 = this.e.get(cjuuVar);
            if (cjshVar4 != null) {
                return new cjql(cjqi.a, cjshVar4, this);
            }
            cjrc cjrcVar = this.o;
            ddho ddhoVar = a.g;
            cjsh e3 = cjsh.e(cjrcVar, size, ddhoVar == null ? dbpy.a : dbsg.i(Integer.valueOf(ddhoVar.b())));
            this.e.put(cjuuVar, e3);
            this.n.add(cjuuVar);
            this.g.f(cjqi.a, a);
            this.g.B(cjqi.a, a);
            return new cjql(cjqi.a, e3, this);
        }
    }

    private final boolean l() {
        return !this.q.h(this.o.a);
    }

    @Override // defpackage.cjqp
    public final cjtg b() {
        return this.k;
    }

    @Override // defpackage.cjqp
    public final cjql c(cjtd cjtdVar) {
        return k(cjtdVar, dbpy.a);
    }

    @Override // defpackage.cjqp
    public final cjql d(cjtd cjtdVar) {
        bvrj.UI_THREAD.c();
        return k(cjtdVar, dbpy.a);
    }

    @Override // defpackage.cjqp
    public final cjql e(View view) {
        bvrj.UI_THREAD.c();
        cjtd k = cjqg.k(view);
        dbsk.s(k);
        return k(k, dbsg.i(view));
    }

    @Override // defpackage.cjqp
    public final void f() {
        cjul cjulVar;
        dbsg dbsgVar;
        dbsg dbsgVar2;
        String str;
        synchronized (this.e) {
            if (this.n.isEmpty()) {
                return;
            }
            if (this.r == null) {
                this.r = cjqg.q(this.b.c(), this.d);
            }
            synchronized (this.e) {
                List<cjuu> list = this.n;
                dbsg j = dbsg.j(this.k.a());
                cqat cqatVar = this.h;
                long j2 = this.l;
                dzsj<duxm> dzsjVar = this.i;
                if (dzsjVar.a().C) {
                    ddlp ddlpVar = this.r;
                    dbsk.s(ddlpVar);
                    dbsgVar = dbsg.i(ddlpVar);
                } else {
                    dbsgVar = dbpy.a;
                }
                cjulVar = new cjul(list, j, cqatVar, j2, dzsjVar, dbsgVar, l());
                if (this.o.a.isEmpty()) {
                    bvoo.h("Error encoding event id during impression flushing", new Object[0]);
                } else {
                    cjulVar.n(this.o.a);
                }
                ddxz e = cjra.e(this.o.a);
                dbsk.s(e);
                if ((e.a & 2) != 0) {
                    dbsgVar2 = dbsg.i(Long.valueOf(e.c));
                } else {
                    dbsgVar2 = dbpy.a;
                }
                cjulVar.y(((Long) dbsgVar2.c(0L)).intValue());
                if (l() && this.i.a().F) {
                    str = ((cjrp) this.q).a.b().a;
                } else {
                    str = this.d.a;
                }
                cjsb cjsbVar = new cjsb(cjulVar.j());
                cjsbVar.f(str);
                cjulVar.i(cjsbVar.a());
                this.n = new ArrayList();
                if (this.m || !this.i.a().N) {
                    this.e.clear();
                }
            }
            this.o = this.d.b(this.g.e(cjqi.a));
            this.g.u(cjulVar);
        }
    }

    @Override // defpackage.cjuw, defpackage.cjqp
    public final void i() {
        bvrj.UI_THREAD.c();
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            this.g.H(this.s);
            this.j.a(this);
        }
    }

    @Override // defpackage.cjuw, defpackage.cjqp
    public final void j() {
        bvrj.UI_THREAD.c();
        int i = this.p - 1;
        this.p = i;
        if (i == 0) {
            this.g.I(this.s);
            Iterator<WeakReference<cjqp>> it = this.j.a.iterator();
            while (it.hasNext()) {
                if (equals(it.next().get())) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
