package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: bxmd  reason: default package */
/* loaded from: classes4.dex */
public class bxmd extends ges implements bxlx, bxma {
    public bxmc a;
    public bxmb b;
    private boolean c = false;

    @Override // defpackage.bxlx
    public final void a(akqq akqqVar) {
        bxmb bxmbVar = this.b;
        bxmbVar.a(bxmbVar.c.a(akqqVar));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ae(Activity activity) {
        super.ae(activity);
        bxmc bxmcVar = this.a;
        bxmc.a(this, 1);
        dxio a = ((dxjh) bxmcVar.a).a();
        bxmc.a(a, 2);
        this.b = new bxmb(this, a);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void ak() {
        this.c = false;
        super.ak();
    }

    @Override // defpackage.bxlx
    public final void b() {
        bxmb bxmbVar = this.b;
        if (bxmbVar.b.aY() == null || !bxmbVar.b.aY().aZ) {
            return;
        }
        gn R = bxmbVar.b.R();
        gz b = R.b();
        int[] b2 = bxlv.b();
        for (int i = 0; i < 3; i++) {
            int i2 = b2[i];
            String a = bxlv.a(i2);
            if (i2 != 0) {
                fd H = R.H(a);
                if (H != null && H.I) {
                    b.u(H);
                }
            } else {
                throw null;
            }
        }
        b.f();
    }

    @Override // defpackage.bxma
    public final boolean bw(String str, cjqm cjqmVar) {
        bxmb bxmbVar = this.b;
        gn R = bxmbVar.b.R();
        int i = bxmbVar.f;
        String a = bxlv.a(i);
        if (i != 0) {
            fd H = R.H(a);
            if (!(H instanceof bxma)) {
                return false;
            }
            return ((bxma) H).bw(str, cjqmVar);
        }
        throw null;
    }

    @Override // defpackage.bxlx
    public final void c(int i) {
        this.b.c(i);
    }

    @Override // defpackage.bxlx
    public final boolean d() {
        return this.b.b();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (this.b.b() || this.c) {
            return true;
        }
        J().g().f();
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        int i;
        super.l(bundle);
        bxmb bxmbVar = this.b;
        int i2 = 0;
        if (bundle != null) {
            int i3 = bundle.getInt("current_mode");
            int[] b = bxlv.b();
            while (true) {
                if (i2 >= 3) {
                    i = 1;
                    break;
                }
                i = b[i2];
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                }
                if (i3 == i4) {
                    break;
                }
                i2++;
            }
            if (i != 1) {
                bxmbVar.f = i;
            }
            bxmbVar.a = true;
            return;
        }
        bxmbVar.a = false;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        this.c = true;
        super.t(bundle);
        int[] b = bxlv.b();
        for (int i = 0; i < 3; i++) {
            int i2 = b[i];
            gn R = R();
            String a = bxlv.a(i2);
            if (i2 == 0) {
                throw null;
            }
            fd H = R.H(a);
            if (H != null && H.I) {
                H.t(bundle);
            }
        }
        int i3 = this.b.f;
        int i4 = i3 - 1;
        if (i3 != 0) {
            bundle.putInt("current_mode", i4);
            return;
        }
        throw null;
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        bxmb bxmbVar = this.b;
        if (!bxmbVar.a) {
            int i = bxmbVar.f;
            if (i == 1) {
                i = bxmbVar.d.a();
            }
            bxmbVar.c(i);
        }
        View ag = super.ag(layoutInflater, viewGroup, bundle);
        return ag != null ? ag : new FrameLayout(H());
    }
}
