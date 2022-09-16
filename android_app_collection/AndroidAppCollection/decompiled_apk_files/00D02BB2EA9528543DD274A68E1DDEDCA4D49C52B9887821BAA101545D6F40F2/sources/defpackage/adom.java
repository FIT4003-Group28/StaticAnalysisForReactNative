package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adom  reason: default package */
/* loaded from: classes2.dex */
public final class adom extends adae<advs> {
    public static final /* synthetic */ int c = 0;
    public final dxio<adyv> b;
    private final abfa d;

    public adom(abfa abfaVar, final acyr acyrVar, final adyw adywVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adok
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adom.c;
                dktp dktpVar = acyrVar2.a().P;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.d = abfaVar;
        btsp b = btsp.b(new dbty(adywVar, absgVar) { // from class: adol
            private final adyw a;
            private final absg b;

            {
                this.a = adywVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adyw adywVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adom.c;
                Activity activity = (Activity) ((dxjd) adywVar2.a).a;
                adyw.a(activity, 1);
                fd fdVar = (fd) ((dxjd) adywVar2.b).a;
                adyw.a(fdVar, 2);
                adyw.a(adywVar2.c.a(), 3);
                akfa a = adywVar2.d.a();
                adyw.a(a, 4);
                abfa a2 = adywVar2.e.a();
                adyw.a(a2, 5);
                adyw.a(adywVar2.f.a(), 6);
                akpm a3 = adywVar2.g.a();
                adyw.a(a3, 7);
                agal a4 = adywVar2.h.a();
                adyw.a(a4, 8);
                agaw a5 = adywVar2.i.a();
                adyw.a(a5, 9);
                axjh a6 = adywVar2.j.a();
                adyw.a(a6, 10);
                btvo a7 = adywVar2.k.a();
                adyw.a(a7, 11);
                advx a8 = adywVar2.l.a();
                adyw.a(a8, 12);
                advz a9 = adywVar2.m.a();
                adyw.a(a9, 13);
                advv a10 = adywVar2.n.a();
                adyw.a(a10, 14);
                adxu a11 = adywVar2.o.a();
                adyw.a(a11, 15);
                adxz a12 = adywVar2.p.a();
                adyw.a(a12, 16);
                adwb a13 = adywVar2.q.a();
                adyw.a(a13, 17);
                adwj a14 = adywVar2.r.a();
                adyw.a(a14, 18);
                adyw.a(absgVar2, 19);
                return new adyv(activity, fdVar, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, absgVar2);
            }
        });
        this.b = b;
        if (abfaVar.a.getPassiveAssistParameters().a().Q) {
            b.a();
        }
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return this.d.v();
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.b.a().a(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        this.b.a().a(awwbVar);
    }

    @Override // defpackage.adae
    protected final List<cqix<advs>> k(List<cqix<?>> list) {
        if (this.d.v()) {
            return this.b.a().c;
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> l() {
        return dcep.B(awvv.J);
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
