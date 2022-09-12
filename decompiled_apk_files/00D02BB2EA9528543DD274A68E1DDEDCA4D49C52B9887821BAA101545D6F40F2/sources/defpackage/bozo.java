package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bozo  reason: default package */
/* loaded from: classes3.dex */
public class bozo implements bpwi {
    public final dcdc<cflw> a;
    public final dcdc<bozn> b;
    public final bozs c;
    public final boyt d;
    public int e;
    private final cqkn<bpwp> f = new bozm(this);
    private final bpvf g;
    private final Resources h;
    private final bozg i;

    public bozo(bozs bozsVar, Resources resources, bozg bozgVar, bpvf bpvfVar, cflq cflqVar, boyt boytVar) {
        this.e = -1;
        this.c = bozsVar;
        this.h = resources;
        this.i = bozgVar;
        this.g = bpvfVar;
        this.d = boytVar;
        ArrayList arrayList = new ArrayList();
        dcpd<Long> it = boytVar.e.iterator();
        while (it.hasNext()) {
            dbsg<cflw> c = cflqVar.c(it.next().longValue());
            if (c.a()) {
                arrayList.add(c.b());
            }
        }
        this.a = dcdc.r(arrayList);
        dccx F = dcdc.F();
        for (int i = 0; i < this.a.size(); i++) {
            cflw cflwVar = this.a.get(i);
            if (cflwVar.a() == boytVar.h) {
                this.e = i;
            }
            String b = cflwVar.b();
            cqkn<bpwp> cqknVar = this.f;
            cjta b2 = cjtd.b();
            b2.d = dtya.bn;
            b2.i(i);
            F.g(new bozn(b, cqknVar, b2.a()));
        }
        this.b = F.f();
        f(-1, this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c.h();
    }

    @Override // defpackage.bpwi
    public CharSequence b() {
        return this.h.getString(R.string.EXTENT_PICKER_WHOLE_ROAD_HINT);
    }

    @Override // defpackage.bpwi
    public List<? extends bpwp> c() {
        return this.b;
    }

    @Override // defpackage.bpwi
    public CharSequence d() {
        return this.h.getString(R.string.EXTENT_PICKER_NEXT_BUTTON);
    }

    @Override // defpackage.bpwi
    public cqkl e() {
        if (this.d.h != 0) {
            this.i.a.i();
        }
        return cqkl.a;
    }

    public final void f(int i, int i2) {
        if (i >= 0 && i < this.b.size()) {
            this.b.get(i).d(false);
        }
        if (i2 >= 0 && i2 < this.b.size()) {
            this.b.get(i2).d(true);
        }
        this.e = i2;
    }

    public final void g(final boolean z) {
        this.g.a(new akqi(this.d.h), new bpus(this, z) { // from class: bozl
            private final bozo a;
            private final boolean b;

            {
                this.a = this;
                this.b = z;
            }

            @Override // defpackage.bpus
            public final void a(digi digiVar) {
                bozo bozoVar = this.a;
                boolean z2 = this.b;
                digh dighVar = digiVar.a;
                if (dighVar == null) {
                    dighVar = digh.k;
                }
                long j = bozoVar.d.h;
                dpsn dpsnVar = dighVar.b;
                if (dpsnVar == null) {
                    dpsnVar = dpsn.d;
                }
                if (j == dpsnVar.c) {
                    akqr akqrVar = new akqr();
                    dpuq dpuqVar = dighVar.i;
                    if (dpuqVar == null) {
                        dpuqVar = dpuq.d;
                    }
                    dpum dpumVar = dpuqVar.c;
                    if (dpumVar == null) {
                        dpumVar = dpum.d;
                    }
                    akqrVar.d(akqq.f(dpumVar));
                    dpuq dpuqVar2 = dighVar.i;
                    if (dpuqVar2 == null) {
                        dpuqVar2 = dpuq.d;
                    }
                    dpum dpumVar2 = dpuqVar2.b;
                    if (dpumVar2 == null) {
                        dpumVar2 = dpum.d;
                    }
                    akqrVar.d(akqq.f(dpumVar2));
                    bozoVar.c.g(Long.valueOf(bozoVar.d.h), akqrVar.b(), z2);
                }
            }
        });
    }
}
