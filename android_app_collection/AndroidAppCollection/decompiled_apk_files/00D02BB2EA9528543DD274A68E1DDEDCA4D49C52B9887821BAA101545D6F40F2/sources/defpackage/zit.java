package defpackage;

import android.app.Activity;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zit  reason: default package */
/* loaded from: classes7.dex */
public class zit implements jkh, zbu {
    public final vmw a;
    public znw b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private final Activity f;

    public zit(vmw vmwVar, znw znwVar, Activity activity) {
        this.a = vmwVar;
        this.b = znwVar;
        this.f = activity;
    }

    @Override // defpackage.jkh
    public void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        zqj d;
        znw znwVar = this.b;
        znwVar.b.a(jjnVar, jjnVar2, jkgVar, znwVar.e);
        if (znwVar.d().booleanValue()) {
            d = znwVar.h;
        } else if (znwVar.f().booleanValue()) {
            zla zlaVar = znwVar.i;
            dbsk.s(zlaVar);
            d = zlaVar.a();
        } else {
            zkz zkzVar = znwVar.j;
            d = zkzVar != null ? zkzVar.d() : null;
        }
        if (d != null) {
            d.n(ziv.u(jjnVar2), true);
        }
    }

    @Override // defpackage.jkh
    public void M(jkj jkjVar, jjn jjnVar) {
        zkz zkzVar = this.b.j;
        if (zkzVar != null) {
            zkzVar.d = true;
        }
    }

    @Override // defpackage.jkh
    public void N(jkj jkjVar, jjn jjnVar) {
        zkz zkzVar = this.b.j;
        if (zkzVar != null) {
            zkzVar.d = false;
        }
    }

    @Override // defpackage.jkh
    public void O() {
    }

    @Override // defpackage.jkh
    public void P(jkj jkjVar, jjn jjnVar, float f) {
        View j;
        View a;
        View a2;
        znw znwVar = this.b;
        znwVar.a.a(jkjVar, jjnVar, f);
        int U = jkjVar.U() - jkjVar.C(jjn.COLLAPSED);
        zqj zqjVar = znwVar.h;
        if (zqjVar != null) {
            zqjVar.o(U, true);
            return;
        }
        zkz zkzVar = znwVar.j;
        if (zkzVar != null) {
            View j2 = jkjVar.j();
            if (j2 == null || (a2 = cqhu.a(j2, zkz.a)) == null) {
                return;
            }
            if (zkzVar.d || jkjVar.L().c(jjn.COLLAPSED)) {
                a2.setY(0.0f);
            } else {
                a2.setY(U);
            }
        } else if (znwVar.k == null || (j = jkjVar.j()) == null || (a = cqhu.a(j, znz.b)) == null) {
        } else {
            a.setY(U);
        }
    }

    @Override // defpackage.zbu
    public Boolean a() {
        boolean z = false;
        if (this.b.c().booleanValue()) {
            zbz i = this.b.i();
            if (i != null && !i.e().booleanValue()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.zbu
    public Boolean b() {
        return Boolean.valueOf(this.c);
    }

    @Override // defpackage.zbu
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.zbu
    public zbv d() {
        return this.b;
    }

    @Override // defpackage.zbu
    public Boolean e() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.zbu
    public awz f() {
        return new awz(this) { // from class: zis
            private final zit a;

            {
                this.a = this;
            }

            @Override // defpackage.awz
            public final void a() {
                this.a.a.b(null);
            }
        };
    }

    @Override // defpackage.zbu
    public Boolean g() {
        zbq zbqVar = this.b.c.e;
        boolean z = false;
        if ((zbqVar == null || !zbqVar.r().booleanValue()) && this.b.f != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbu
    @dzsi
    public zbs h() {
        return this.b.f;
    }

    @Override // defpackage.zbu
    public Boolean i() {
        return Boolean.valueOf(btpf.c(this.f).f);
    }

    @Override // defpackage.zxn
    public Boolean j() {
        return Boolean.valueOf(this.b.d);
    }

    @Override // defpackage.zxn
    public jkh k() {
        return this;
    }

    public void l(boolean z) {
        this.d = z;
    }

    public void m(boolean z) {
        this.c = z;
    }

    public void n(boolean z) {
        this.e = z;
    }

    public vnu o() {
        return this.b.s();
    }
}
