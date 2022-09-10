package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bpvc  reason: default package */
/* loaded from: classes4.dex */
public final class bpvc {
    public final dxio<hwe> a;
    public final ff b;
    private final dxio<akox> e;
    private final dxio<akzh> f;
    public dcdc<hwb> c = dcdc.e();
    public List<akqq> d = dcdc.e();
    private final Set<bpuz> g = dcnm.c();

    public bpvc(dxio<akox> dxioVar, dxio<hwe> dxioVar2, ff ffVar, dxio<akzh> dxioVar3) {
        this.e = dxioVar;
        this.a = dxioVar2;
        this.b = ffVar;
        this.f = dxioVar3;
    }

    private static String d(akqi akqiVar) {
        String valueOf = String.valueOf(akqiVar.o());
        return valueOf.length() != 0 ? "hl_rap_".concat(valueOf) : new String("hl_rap_");
    }

    public final void a(Set<bpuz> set) {
        dbsi a;
        if (set.equals(this.g)) {
            return;
        }
        b();
        if (set.isEmpty()) {
            return;
        }
        for (bpuz bpuzVar : set) {
            akqi a2 = bpuzVar.a();
            Resources resources = this.b.getResources();
            akrw e = akrw.e(a2);
            alyk q = alyl.q();
            ((alvg) q).b = a2;
            this.e.a().O(d(a2), this.e.a().M(resources, e, q.b()));
        }
        this.g.addAll(set);
        dbsk.a(!set.isEmpty());
        double d = 17.0d;
        if (!dcbg.b(set).q(bpva.a)) {
            akqq c = set.iterator().next().b().c(new akqq(dcyn.a, dcyn.a));
            int d2 = set.iterator().next().d();
            if (d2 == 0) {
                throw null;
            }
            if (d2 == 1) {
                d = 13.0d;
            }
            a = dbsi.a(c, Double.valueOf(d));
        } else {
            akqr a3 = akqs.a();
            for (bpuz bpuzVar2 : set) {
                a3.d(bpuzVar2.c().b().b);
                a3.d(bpuzVar2.c().b().a);
            }
            if (a3.a()) {
                a = dbsi.a(new akqq(dcyn.a, dcyn.a), Double.valueOf(4.0d));
            } else {
                Drawable drawable = this.b.getResources().getDrawable(2131233023);
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                akqs b = a3.b();
                akqq c2 = b.c();
                if (!this.f.a().A().d()) {
                    d = 0.0d;
                } else {
                    double l = akqo.l(b, ((this.f.a().A().b() - intrinsicHeight) * 9) / 10, ((this.f.a().A().a() - intrinsicWidth) * 9) / 10, this.f.a().B());
                    if (l != Double.POSITIVE_INFINITY) {
                        d = l;
                    }
                }
                a = dbsi.a(c2, Double.valueOf(d));
            }
        }
        alaa a4 = alad.a();
        a4.c((akqq) a.a);
        a4.c = ((Double) a.b).floatValue();
        a4.f = alae.a;
        a4.d = 0.0f;
        akyc e2 = akyt.e(a4.a());
        e2.b = 0;
        this.e.a().p(e2);
    }

    public final void b() {
        for (bpuz bpuzVar : this.g) {
            this.e.a().Q(d(bpuzVar.a()));
        }
        this.g.clear();
    }

    public final void c() {
        if (!this.c.isEmpty()) {
            this.a.a().g(this.c);
            this.c = dcdc.e();
            this.d = dcdc.e();
        }
    }
}
