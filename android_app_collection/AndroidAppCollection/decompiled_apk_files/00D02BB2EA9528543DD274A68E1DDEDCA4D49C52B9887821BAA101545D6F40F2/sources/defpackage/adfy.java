package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adfy  reason: default package */
/* loaded from: classes.dex */
public final class adfy extends adae<adge> {
    public static final /* synthetic */ int b = 0;
    private static final dcqe c = dcqe.c("adfy");
    private final dxio<adgg> d;

    public adfy(final acyr acyrVar, final adgh adghVar, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adfw
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adfy.b;
                dktp dktpVar = acyrVar2.a().s;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.d = btsp.b(new dbty(adghVar, absgVar) { // from class: adfx
            private final adgh a;
            private final absg b;

            {
                this.a = adghVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adgh adghVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adfy.b;
                abtx a = adghVar2.a.a();
                adgh.a(a, 1);
                bzqc a2 = adghVar2.b.a();
                adgh.a(a2, 2);
                cjxd a3 = adghVar2.c.a();
                adgh.a(a3, 3);
                adgh.a(absgVar2, 4);
                return new adgg(a, a2, a3, absgVar2);
            }
        });
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
    }

    @Override // defpackage.adae
    public final List<cqix<adge>> k(List<cqix<?>> list) {
        abpn a;
        adgg a2 = this.d.a();
        ArrayList arrayList = new ArrayList();
        for (cqix<?> cqixVar : list) {
            if ((cqixVar.b() instanceof adjq) && (a = ((adjq) cqixVar.b()).a()) != null) {
                if (a.c().isEmpty()) {
                    bvoo.h("Title of scavenger hunt module unexpectedly empty.", new Object[0]);
                } else {
                    arrayList.add(a.c());
                }
            }
        }
        a2.b(arrayList);
        if (this.d.a().c()) {
            return dcdc.f(cqgr.fT(new adgd(), this.d.a()));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcmr.a;
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
