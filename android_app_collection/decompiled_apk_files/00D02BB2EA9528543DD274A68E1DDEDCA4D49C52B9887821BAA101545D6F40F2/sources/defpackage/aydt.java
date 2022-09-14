package defpackage;

import android.widget.RadioGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: aydt  reason: default package */
/* loaded from: classes3.dex */
public class aydt implements RadioGroup.OnCheckedChangeListener, aydh {
    public static final /* synthetic */ int a = 0;
    private final axwg b;
    private final aydr c;
    @dzsi
    private final aydg d;
    private int e = 0;
    @dzsi
    private dcdc<aydf> f;

    public aydt(axwg axwgVar, aydr aydrVar, @dzsi aydg aydgVar) {
        this.b = axwgVar;
        this.c = aydrVar;
        this.d = aydgVar;
    }

    public aydt(axwg axwgVar, aydr aydrVar, @dzsi aydg aydgVar, int i) {
        this.b = axwgVar;
        this.c = aydrVar;
        this.d = aydgVar;
    }

    private final dcdc<aydf> l() {
        if (this.f == null) {
            dccx F = dcdc.F();
            F.g(this.c.a(0, 0, this.e, this));
            F.g(this.c.a(4, 1, this.e, this));
            if (this.b.e()) {
                F.g(this.c.a(2, 2, this.e, this));
            }
            this.f = F.f();
        }
        dcdc<aydf> dcdcVar = this.f;
        dbsk.s(dcdcVar);
        return dcdcVar;
    }

    @Override // defpackage.jbb
    public Integer a(int i) {
        if (c().intValue() <= i) {
            return 0;
        }
        return l().get(i).d();
    }

    @Override // defpackage.jbb
    public RadioGroup.OnCheckedChangeListener b() {
        return this;
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(l().size());
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        return Boolean.valueOf(a(i).intValue() == this.e);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        dcdc<aydf> l = l();
        if (this.e != a(i).intValue()) {
            this.e = a(i).intValue();
            int size = l.size();
            for (int i2 = 0; i2 < size; i2++) {
                aydf aydfVar = l.get(i2);
                aydfVar.c(aydfVar.d().intValue() == this.e);
            }
            aydg aydgVar = this.d;
            if (aydgVar != null) {
                k();
                aydgVar.a();
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (c().intValue() <= i) {
            return null;
        }
        return cjtd.b;
    }

    @Override // defpackage.aydh
    public List<aydf> h() {
        return l();
    }

    @Override // defpackage.aydh
    public cqkl i(cjqm cjqmVar, final int i) {
        int n = dcft.n(l(), new dbsl(i) { // from class: ayds
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                int i3 = aydt.a;
                return ((aydf) obj).d().intValue() == i2;
            }
        });
        if (n >= 0) {
            f(cjqmVar, n);
        }
        return cqkl.a;
    }

    public void j() {
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.e = i;
    }

    public baac k() {
        int i = this.e;
        if (i != 0) {
            if (i == 2) {
                return baac.PUBLISHED;
            }
            if (i == 4) {
                return baac.SHARED;
            }
            return baac.UNKNOWN;
        }
        return baac.PRIVATE;
    }
}
