package defpackage;

import android.content.DialogInterface;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zkn  reason: default package */
/* loaded from: classes7.dex */
public class zkn implements zbj {
    public final bvjj a;
    @dzsi
    public final qbq b;
    @dzsi
    public vnk c;
    private final gga d;
    private final gdc e;
    private final Runnable f;
    private boolean g;

    public zkn(gga ggaVar, cqhn cqhnVar, bvjj bvjjVar, gdc gdcVar, Runnable runnable, @dzsi qbq qbqVar) {
        this.d = ggaVar;
        this.a = bvjjVar;
        this.e = gdcVar;
        this.f = runnable;
        this.b = qbqVar;
    }

    @Override // defpackage.zbj
    public cqkl a() {
        gcz a = this.e.a();
        a.i = cjtd.a(dtxn.bq);
        a.d = this.d.getString(R.string.EYES_FREE_MODE_ONE_DIRECTION_CONFIRMATION_TITLE);
        a.e = this.d.getString(R.string.EYES_FREE_MODE_ONE_DIRECTION_CONFIRMATION_TEXT);
        a.h(R.string.OK_BUTTON, cjtd.a(dtxn.br), new gdd(this) { // from class: zkl
            private final zkn a;

            {
                this.a = this;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                zkn zknVar = this.a;
                zknVar.a.S(bvjk.jP, true);
                zknVar.g(zknVar.c, false);
                vnk vnkVar = zknVar.c;
                if (vnkVar == null) {
                    return;
                }
                dwao h = vnkVar.h();
                dsqp dsqpVar = (dsqp) h.cu(5);
                dsqpVar.bC(h);
                dwal dwalVar = (dwal) dsqpVar;
                if (dwalVar.c) {
                    dwalVar.bF();
                    dwalVar.c = false;
                }
                dwao.e((dwao) dwalVar.b);
                dwao bK = dwalVar.bK();
                int f = vxi.f(vnkVar.h(), bK);
                vnkVar.R(bK);
                qbq qbqVar = zknVar.b;
                if (qbqVar == null) {
                    return;
                }
                qbqVar.bO(f, null);
            }
        });
        a.e(R.string.CANCEL_BUTTON, cjtd.a(dtxn.bs), new gdd(this) { // from class: zkm
            private final zkn a;

            {
                this.a = this;
            }

            @Override // defpackage.gdd
            public final void a(DialogInterface dialogInterface) {
                this.a.f();
            }
        });
        a.b();
        return cqkl.a;
    }

    @Override // defpackage.zbj
    public cqkl b() {
        this.f.run();
        f();
        return cqkl.a;
    }

    @Override // defpackage.zbj
    public cjtd c() {
        return cjtd.a(dtxn.bp);
    }

    @Override // defpackage.zbj
    public cjtd d() {
        return cjtd.a(dtxn.bo);
    }

    @Override // defpackage.zbj
    public Integer e() {
        return Integer.valueOf((int) R.string.EYES_FREE_MODE_ONE_DIRECTION_BANNER_TEXT);
    }

    public final void f() {
        this.a.S(bvjk.jR, true);
        g(this.c, false);
    }

    public void g(@dzsi vnk vnkVar, boolean z) {
        this.c = vnkVar;
        this.g = z;
        cqkx.p(this);
    }

    @Override // defpackage.zbq
    public Boolean r() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.zbq
    public cjtd s() {
        return cjtd.a(dtxn.bn);
    }
}
