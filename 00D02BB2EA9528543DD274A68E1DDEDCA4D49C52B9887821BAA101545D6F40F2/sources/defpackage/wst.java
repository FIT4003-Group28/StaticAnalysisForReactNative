package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wst  reason: default package */
/* loaded from: classes7.dex */
public final class wst {
    public final dxio<qbt> a;
    @dzsi
    public dopf b;
    public final Set<dopf> c = dcnm.c();
    private final hwe d;
    private final vtn e;
    private final xdk f;

    public wst(hwe hweVar, vtn vtnVar, xdk xdkVar, dxio<qbt> dxioVar) {
        this.d = hweVar;
        this.e = vtnVar;
        this.f = xdkVar;
        this.a = dxioVar;
    }

    public final void a() {
        cqtd e;
        dopf dopfVar = this.b;
        if (dopfVar != null) {
            dnoh dnohVar = dopfVar.d;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            this.d.a(akqi.b(this.b.e), akra.f(akqq.e(dnohVar)));
        } else {
            this.d.c();
        }
        if (this.c.isEmpty()) {
            this.f.b();
            return;
        }
        ArrayList a = dchl.a();
        for (final dopf dopfVar2 : this.c) {
            int a2 = dope.a(dopfVar2.b);
            if (a2 != 0 && a2 == 2) {
                if (dopfVar2.f.size() != 1 || dopfVar2.f.get(0).d.isEmpty()) {
                    e = iup.e(R.raw.ic_mod_transit);
                } else {
                    e = this.e.f(dopfVar2.f.get(0).d.get(0).b, bvlw.a, new vtk(this) { // from class: wsr
                        private final wst a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.vtk
                        public final void a(cqtd cqtdVar) {
                            this.a.a();
                        }
                    });
                }
                if (e != null) {
                    akqi b = akqi.b(dopfVar2.e);
                    dnoh dnohVar2 = dopfVar2.d;
                    if (dnohVar2 == null) {
                        dnohVar2 = dnoh.d;
                    }
                    a.add(xdj.g(b, akqq.e(dnohVar2), e, dopfVar2.c, new Runnable(this, dopfVar2) { // from class: wss
                        private final wst a;
                        private final dopf b;

                        {
                            this.a = this;
                            this.b = dopfVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            wst wstVar = this.a;
                            dopf dopfVar3 = this.b;
                            qdf o = qdg.o();
                            qaw qawVar = (qaw) o;
                            qawVar.b = dopfVar3.e;
                            qawVar.a = dopfVar3.c;
                            o.c(true);
                            wstVar.a.a().t(o.h());
                        }
                    }));
                }
            }
        }
        this.f.a(a, true);
    }
}
