package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cjta  reason: default package */
/* loaded from: classes.dex */
public class cjta {
    @dzsi
    public deab a;
    @dzsi
    public String b;
    @dzsi
    public String c;
    @dzsi
    public ddho d;
    @dzsi
    public dvnp f;
    @dzsi
    public decs g;
    @dzsi
    public String h;
    @dzsi
    public cjsa i;
    @dzsi
    private String j;
    public ddeu e = ddev.u.bZ();
    private final cjtb k = cjtc.g();

    public final cjtd a() {
        return c(this.d, this.a);
    }

    public final cjtd b(ddho ddhoVar) {
        return c(ddhoVar, this.a);
    }

    public final cjtd c(@dzsi ddho ddhoVar, @dzsi deab deabVar) {
        cjtd cjtdVar = new cjtd(deabVar, this.j, this.b, this.c, ddhoVar, this.e.bK(), this.f, this.g, false, this.i, this.k.a(), this.h);
        if (!cjtdVar.l()) {
            bvoo.h("Attempted to build invalid UE3 params.", new Object[0]);
        }
        return cjtdVar;
    }

    @Deprecated
    public final cjtd d() {
        return new cjtd(this.a, this.j, this.b, this.c, this.d, this.e.bK(), this.f, this.g, false, this.i, this.k.a(), this.h);
    }

    @dzsi
    public final ddet e() {
        return (ddet) bvrt.f(((cjrv) this.k).d, (dssr) ddet.D.cu(7), ddet.D);
    }

    public final void f(ddit dditVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        dditVar.getClass();
        dsrf dsrfVar = ddevVar.q;
        if (!dsrfVar.a()) {
            ddevVar.q = dsqw.cg(dsrfVar);
        }
        ddevVar.q.h(dditVar.e);
    }

    public final void g(@dzsi String str) {
        if (dbsj.d(str)) {
            this.j = null;
        } else {
            this.j = str;
        }
    }

    public final void h(ddmc ddmcVar) {
        ddet e = e();
        if (e == null) {
            e = ddet.D;
        }
        dsqp dsqpVar = (dsqp) e.cu(5);
        dsqpVar.bC(e);
        ddes ddesVar = (ddes) dsqpVar;
        if (ddesVar.c) {
            ddesVar.bF();
            ddesVar.c = false;
        }
        ddet ddetVar = (ddet) ddesVar.b;
        ddmcVar.getClass();
        ddetVar.A = ddmcVar;
        ddetVar.b |= 4;
        s(ddesVar.bK());
    }

    public final void i(int i) {
        this.k.b(i);
    }

    public final void j(@dzsi dddg dddgVar) {
        ((cjrv) this.k).a = bvrt.a(dddgVar);
    }

    public final void k(ddjj ddjjVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddjjVar.getClass();
        ddevVar.c = ddjjVar;
        ddevVar.a |= 2;
    }

    public final void l(ddmq ddmqVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddmqVar.getClass();
        ddevVar.h = ddmqVar;
        ddevVar.a |= 128;
    }

    public final void m(ddow ddowVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddowVar.getClass();
        ddevVar.n = ddowVar;
        ddevVar.a |= 131072;
    }

    public final void n(ddqk ddqkVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddqkVar.getClass();
        ddevVar.b = ddqkVar;
        ddevVar.a |= 1;
    }

    public final void o(ddqo ddqoVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddqoVar.getClass();
        ddevVar.g = ddqoVar;
        ddevVar.a |= 64;
    }

    public final void p(ddjl ddjlVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddjlVar.getClass();
        ddevVar.f = ddjlVar;
        ddevVar.a |= 32;
    }

    public final void q(ddnd ddndVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddndVar.getClass();
        ddevVar.e = ddndVar;
        ddevVar.a |= 8;
    }

    public final void r(@dzsi ddzg ddzgVar) {
        ((cjrv) this.k).b = bvrt.a(ddzgVar);
    }

    public final void s(@dzsi ddet ddetVar) {
        ((cjrv) this.k).d = bvrt.a(ddetVar);
    }

    public final void t(ddpa ddpaVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        ddpaVar.getClass();
        ddevVar.i = ddpaVar;
        ddevVar.a |= 512;
    }

    public final void u(deap deapVar) {
        ddeu ddeuVar = this.e;
        if (ddeuVar.c) {
            ddeuVar.bF();
            ddeuVar.c = false;
        }
        ddev ddevVar = (ddev) ddeuVar.b;
        ddev ddevVar2 = ddev.u;
        deapVar.getClass();
        ddevVar.o = deapVar;
        ddevVar.a |= ImageMetadata.LENS_APERTURE;
    }

    public final void v(@dzsi ddgy ddgyVar) {
        ((cjrv) this.k).c = bvrt.a(ddgyVar);
    }

    public final void w(ddhj ddhjVar) {
        this.k.c(ddhjVar);
    }
}
