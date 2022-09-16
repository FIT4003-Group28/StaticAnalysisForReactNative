package defpackage;

import android.app.Dialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zlo  reason: default package */
/* loaded from: classes7.dex */
public class zlo implements zbj, zrz {
    private final vpd a;
    private final Runnable b;
    @dzsi
    private Dialog c;
    @dzsi
    private vnk d;
    private boolean e = false;
    private final qbq f;
    private final ziq g;

    public zlo(vpd vpdVar, ziq ziqVar, Runnable runnable, qbq qbqVar) {
        this.a = vpdVar;
        this.b = runnable;
        this.f = qbqVar;
        this.g = ziqVar;
    }

    private final void g() {
        Dialog dialog = this.c;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.c.dismiss();
    }

    @Override // defpackage.zbj
    public cqkl a() {
        this.a.k();
        cqkx.p(this);
        vnk vnkVar = this.d;
        if (vnkVar != null) {
            this.c = this.g.a(vnkVar.g(), vnkVar.h(), this);
        }
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.zbj
    public cqkl b() {
        this.a.k();
        this.b.run();
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.zbj
    public cjtd c() {
        return cjtd.a(dtxn.bP);
    }

    @Override // defpackage.zbj
    public cjtd d() {
        return cjtd.a(dtxn.bO);
    }

    @Override // defpackage.zbj
    public Integer e() {
        amte p;
        vnk vnkVar = this.d;
        vpc vpcVar = null;
        if (vnkVar != null && (p = vnkVar.l().d().p()) != null) {
            int i = 0;
            while (true) {
                if (i >= p.a.n()) {
                    break;
                }
                if (vnkVar.g() == p.c(i)) {
                    dphv b = dphv.b(p.a.m(i).a.z);
                    if (b == null) {
                        b = dphv.UNKNOWN_LICENSE_PLATE_RESTRICTION;
                    }
                    vpc g = vph.g(b);
                    if (g != null && this.a.c(g)) {
                        vpcVar = g;
                        break;
                    }
                }
                i++;
            }
        }
        if (vpcVar == null || !this.a.c(vpcVar)) {
            return Integer.valueOf((int) R.string.ELLIPSIS);
        }
        int ordinal = vpcVar.ordinal();
        if (ordinal == 0) {
            return Integer.valueOf((int) R.string.LICENSE_PLATE_RESTRICTION_ONE_DIRECTION_BANNER_TEXT);
        }
        if (ordinal == 1) {
            return Integer.valueOf((int) R.string.RODIZIO_PLATE_RESTRICTION_ONE_DIRECTION_BANNER_TEXT);
        }
        if (ordinal == 2) {
            return Integer.valueOf((int) R.string.MANILA_NUMBER_CODING_PLATE_RESTRICTION_ONE_DIRECTION_BANNER_TEXT);
        }
        if (ordinal == 3) {
            return Integer.valueOf(pxo.SANTIAGO_PLATE_RESTRICTION_ONE_DIRECTION_BANNER_TEXT);
        }
        return 0;
    }

    public void f(vnk vnkVar, boolean z) {
        this.d = vnkVar;
        this.e = z;
        cqkx.p(this);
    }

    @Override // defpackage.zbq
    public Boolean r() {
        boolean z = false;
        if (this.d != null && this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbq
    public cjtd s() {
        return cjtd.a(dtxn.bN);
    }

    @Override // defpackage.zrz
    public void x() {
        g();
    }

    @Override // defpackage.zrz
    public void w(dwao dwaoVar) {
        int f;
        int i;
        vnk vnkVar = this.d;
        if (vnkVar == null) {
            i = 0;
        } else {
            synchronized (vnkVar) {
                f = vxi.f(vnkVar.h(), dwaoVar);
                vnkVar.R(dwaoVar);
            }
            i = f;
        }
        if (i != 0) {
            this.f.bO(i, null);
        }
        g();
    }
}
