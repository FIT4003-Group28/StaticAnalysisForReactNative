package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aslx  reason: default package */
/* loaded from: classes2.dex */
public class aslx implements asmo {
    @dzsi
    public crqw a;
    private final asmp b;
    private final btrm c;
    private boolean d;
    private boolean e;
    private final aslw f = new aslw(this);
    private final aslv g = new aslv(this);

    public aslx(asmp asmpVar, btrm btrmVar) {
        dbsk.t(asmpVar, "stateController");
        this.b = asmpVar;
        this.c = btrmVar;
    }

    private final void g() {
        if (!this.d) {
            return;
        }
        this.d = false;
        this.c.a(this.g);
    }

    private static aslo k(amub amubVar, dpfg dpfgVar) {
        int i = dpfgVar.b;
        return new aslo(amubVar, i, dpfgVar.c + i);
    }

    @Override // defpackage.asmo
    public final void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public final void b() {
        this.e = true;
        btrm btrmVar = this.c;
        aslw aslwVar = this.f;
        dceq a = dcet.a();
        a.b(ascc.class, new aslz(ascc.class, aslwVar, bvrj.UI_THREAD));
        btrmVar.g(aslwVar, a.a());
    }

    @Override // defpackage.asmo
    public final void c() {
        g();
        this.c.a(this.f);
        this.e = false;
    }

    public final void h(@dzsi crqw crqwVar) {
        crqw crqwVar2 = this.a;
        if (crqwVar2 == null && crqwVar == null) {
            return;
        }
        if (crqwVar2 instanceof crqj) {
            this.b.B();
        } else if (crqwVar2 instanceof crqi) {
            this.b.s();
        }
        this.b.C(crqwVar);
        this.a = crqwVar;
        i(crqwVar);
    }

    public final void i(@dzsi crqw crqwVar) {
        akra a;
        if (crqwVar == null || !crqwVar.g()) {
            if (crqwVar instanceof crqj) {
                crqj crqjVar = (crqj) crqwVar;
                dpfa d = crqjVar.d();
                ArrayList arrayList = new ArrayList();
                if (d.d) {
                    amuh j = crqjVar.j();
                    if (j != null) {
                        Iterator<amub> it = j.iterator();
                        while (it.hasNext()) {
                            amub next = it.next();
                            arrayList.add(new aslo(next, 0, next.D));
                        }
                    }
                } else {
                    amub k = crqjVar.k();
                    if (k != null && (d.a & 1) != 0) {
                        dpfg dpfgVar = d.b;
                        if (dpfgVar == null) {
                            dpfgVar = dpfg.d;
                        }
                        arrayList.add(k(k, dpfgVar));
                    }
                    amub l = crqjVar.l();
                    if (l != null && (d.a & 2) != 0) {
                        dpfg dpfgVar2 = d.c;
                        if (dpfgVar2 == null) {
                            dpfgVar2 = dpfg.d;
                        }
                        arrayList.add(k(l, dpfgVar2));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                this.b.A(crqjVar.i(), (aslo[]) arrayList.toArray(new aslo[0]));
            } else if (!(crqwVar instanceof crqi) || (a = ((crqi) crqwVar).a()) == null) {
            } else {
                this.b.r(a);
            }
        }
    }

    public final void j(boolean z) {
        if (z) {
            g();
            h(null);
        } else if (this.d || !this.e) {
        } else {
            this.d = true;
            btrm btrmVar = this.c;
            aslv aslvVar = this.g;
            dceq a = dcet.a();
            a.b(cria.class, new asly(0, cria.class, aslvVar, bvrj.UI_THREAD));
            a.b(crht.class, new asly(1, crht.class, aslvVar, bvrj.UI_THREAD));
            btrmVar.g(aslvVar, a.a());
        }
    }
}
