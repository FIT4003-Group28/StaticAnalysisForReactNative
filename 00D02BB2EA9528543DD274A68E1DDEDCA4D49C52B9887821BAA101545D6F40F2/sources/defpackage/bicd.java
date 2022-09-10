package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bicd  reason: default package */
/* loaded from: classes3.dex */
public class bicd implements bibs {
    public static final dcdc<baab> a = dcdc.i(baab.CUSTOM, baab.WANT_TO_GO, baab.FAVORITES, baab.STARRED_PLACES);
    private final gga b;
    private final akfa c;
    private final bibv d;
    private final bicf e;
    private final dxio<axwp> f;
    private final List<bibp> g = new ArrayList();
    @dzsi
    private azxb h = null;
    private boolean i;
    private boolean j;

    public bicd(gga ggaVar, akfa akfaVar, bibv bibvVar, bicf bicfVar, dxio<axwp> dxioVar) {
        this.c = akfaVar;
        this.d = bibvVar;
        this.f = dxioVar;
        this.e = bicfVar;
        this.b = ggaVar;
    }

    @Override // defpackage.bibs
    public List<bibp> a() {
        return this.g;
    }

    @Override // defpackage.bibs
    public cqkl b() {
        this.i = !this.i;
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bibs
    public Boolean c() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.bibs
    public CharSequence d() {
        if (c().booleanValue() || this.g.isEmpty()) {
            return "";
        }
        String g = this.g.get(0).g();
        int size = this.g.size() - 1;
        if (size == 0) {
            bibp e = e();
            dbsk.s(e);
            return e.b();
        }
        return this.b.getResources().getQuantityString(true != this.j ? R.plurals.SAVED_IN_MULTIPLE_LISTS : R.plurals.YOU_ARE_FOLLOWING_MULTIPLE_LISTS, size, g, Integer.valueOf(size));
    }

    @Override // defpackage.bibs
    @dzsi
    public bibp e() {
        if (this.g.isEmpty()) {
            return null;
        }
        return this.g.get(0);
    }

    @Override // defpackage.bibs
    public cjtd f() {
        return cjtd.a(dtxy.jo);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        if (this.c.j().l() && bwrsVar.c() != null) {
            ilo c = bwrsVar.c();
            dbsk.s(c);
            azxb f = azxb.f(c.ai(), c.aj());
            azxb azxbVar = this.h;
            boolean z = false;
            if (azxbVar == null || !f.h(azxbVar)) {
                this.i = false;
            }
            this.h = f;
            azxb azxbVar2 = this.h;
            dbsk.s(azxbVar2);
            azwv a2 = this.f.a().a(azxbVar2);
            if (a2 == null) {
                return;
            }
            dcdc A = dcbg.b(a2.n()).o(bica.a).o(bicb.a).A(dcln.a.g(bicc.a).c());
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = A.size();
            for (int i = 0; i < size; i++) {
                azwu azwuVar = (azwu) A.get(i);
                if (azwuVar.f()) {
                    bibv bibvVar = this.d;
                    azxb azxbVar3 = this.h;
                    dbsk.s(azxbVar3);
                    arrayList2.add(bibvVar.a(azwuVar, azxbVar3));
                } else {
                    bibv bibvVar2 = this.d;
                    azxb azxbVar4 = this.h;
                    dbsk.s(azxbVar4);
                    arrayList.add(bibvVar2.a(azwuVar, azxbVar4));
                }
            }
            if (a2.f()) {
                bicf bicfVar = this.e;
                gga a3 = bicfVar.a.a();
                bicf.a(a3, 1);
                dxio a4 = ((dxjh) bicfVar.b).a();
                bicf.a(a4, 2);
                arrayList.add(new bice(a3, a4));
            }
            if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                z = true;
            }
            this.j = z;
            this.g.clear();
            this.g.addAll(arrayList);
            this.g.addAll(arrayList2);
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.g.clear();
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(!this.g.isEmpty());
    }
}
