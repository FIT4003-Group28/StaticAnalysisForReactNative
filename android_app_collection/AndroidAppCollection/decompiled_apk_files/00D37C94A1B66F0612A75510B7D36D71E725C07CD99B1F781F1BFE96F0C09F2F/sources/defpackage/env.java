package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import j$.time.Duration;
/* compiled from: PG */
/* renamed from: env  reason: default package */
/* loaded from: classes3.dex */
public final class env extends fdm implements ynl {
    public static final Duration a = Duration.ofSeconds(30);
    public final Activity b;
    public final enw c;
    public final fvf d;
    public final ahat e;
    public final snc f;
    public final aadd g;
    public long h;
    public boolean i;
    public avvh j;
    public apzj k;
    public aqmu l;
    public atpl m;
    public acti n;
    public AlertDialog o;
    public AlertDialog p;
    public apka q;
    public final akcn r;
    public int s;
    public final aacz t;
    public final mdu u;
    private final yni v;
    private final aafo w;

    public env(feh fehVar, Activity activity, yni yniVar, enw enwVar, fvf fvfVar, ahat ahatVar, acti actiVar, snc sncVar, aadd aaddVar, aacz aaczVar, aafo aafoVar, akcn akcnVar, mdu mduVar) {
        super(fehVar);
        this.b = activity;
        this.v = yniVar;
        this.c = enwVar;
        this.d = fvfVar;
        this.e = ahatVar;
        this.n = actiVar;
        this.f = sncVar;
        this.g = aaddVar;
        this.t = aaczVar;
        this.w = aafoVar;
        this.r = akcnVar;
        this.u = mduVar;
        this.s = 1;
    }

    public final Intent a() {
        return etk.b(this.b).putExtra(":android:no_headers", true);
    }

    public final void d() {
        ylx.m(this.c.a(), dzl.g);
    }

    public final void g() {
        this.j = null;
        this.l = null;
        this.m = null;
        this.i = false;
        this.k = null;
    }

    public final void h() {
        this.s = 1;
        this.h = 0L;
        g();
    }

    public final boolean j() {
        if (!akg.c()) {
            return false;
        }
        return this.b.isInPictureInPictureMode();
    }

    public final void k(int i, boolean z, acti actiVar) {
        this.s = i;
        this.h = this.f.c();
        this.n = actiVar;
        if (z) {
            g();
        } else {
            this.i = true;
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        this.v.m(this);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwd afwdVar = (afwd) obj;
                AlertDialog alertDialog = this.o;
                if (alertDialog != null && alertDialog.isShowing()) {
                    this.o.dismiss();
                }
                AlertDialog alertDialog2 = this.p;
                if (alertDialog2 == null || !alertDialog2.isShowing()) {
                    return null;
                }
                this.p.dismiss();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwd.class};
    }

    @Override // defpackage.feg
    public final void nr() {
        this.v.g(this);
    }

    public final void i() {
        apzj apzjVar = this.k;
        if (apzjVar == null) {
            return;
        }
        int i = apzjVar.b;
        if ((i & 1) != 0) {
            aafo aafoVar = this.w;
            apzg apzgVar = apzjVar.c;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.a(apzgVar);
        } else if ((i & 2) == 0) {
        } else {
            aafo aafoVar2 = this.w;
            apzg apzgVar2 = apzjVar.d;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.a(apzgVar2);
            acti actiVar = this.n;
            if (actiVar == null) {
                return;
            }
            actiVar.u(new acte(this.k.f), null);
        }
    }
}
