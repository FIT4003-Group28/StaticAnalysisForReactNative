package defpackage;

import android.widget.RadioGroup;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: yow  reason: default package */
/* loaded from: classes7.dex */
public class yow implements RadioGroup.OnCheckedChangeListener, Serializable, zeh {
    static final dcdn<zeg, you> a;
    private final List<you> b = new ArrayList();
    private transient yov c;
    private int d;

    static {
        dcdg p = dcdn.p();
        p.f(zeg.BEST_ROUTE, new you(R.id.transit_route_option_best_route, dqvb.TRANSIT_BEST, dtya.eR));
        p.f(zeg.FEWER_TRANSFERS, new you(R.id.transit_route_option_fewer_transfers, dqvb.TRANSIT_FEWER_TRANSFERS, dtya.eS));
        p.f(zeg.LESS_WALKING, new you(R.id.transit_route_option_less_walking, dqvb.TRANSIT_LESS_WALKING, dtya.eT));
        p.f(zeg.PREFER_ACCESSIBLE, new you(R.id.transit_route_option_prefer_accessible, dqvb.TRANSIT_PREFER_ACCESSIBLE, dtya.eV));
        p.f(zeg.LOWEST_COST, new you(R.id.transit_route_option_lowest_cost, dqvb.TRANSIT_PREFER_CHEAPER, dtya.eU));
        a = dcjz.c(p.b());
    }

    public yow(Set<zeg> set, dqvb dqvbVar, yov yovVar) {
        zeg[] values;
        this.c = yovVar;
        for (zeg zegVar : zeg.values()) {
            if (set.contains(zegVar)) {
                dcdn<zeg, you> dcdnVar = a;
                if (dcdnVar.containsKey(zegVar)) {
                    this.b.add(dcdnVar.get(zegVar));
                }
            }
        }
        for (you youVar : this.b) {
            if (youVar.b == dqvbVar) {
                this.d = youVar.a;
                return;
            }
        }
    }

    @Override // defpackage.jbb
    public Integer a(int i) {
        if (i < 0 || c().intValue() <= i) {
            return 0;
        }
        return Integer.valueOf(this.b.get(i).a);
    }

    @Override // defpackage.jbb
    public RadioGroup.OnCheckedChangeListener b() {
        return this;
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(this.b.size());
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        return Boolean.valueOf(a(i).intValue() == this.d);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        this.d = a(i).intValue();
        this.c.a();
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i < 0 || c().intValue() <= i) {
            return null;
        }
        return cjtd.a(this.b.get(i).c);
    }

    public void h(yov yovVar) {
        this.c = yovVar;
    }

    @Override // defpackage.zeh
    public Integer i(int i) {
        if (i < 0 || c().intValue() <= i) {
            return 0;
        }
        return Integer.valueOf(yng.a(this.b.get(i).b));
    }

    @Override // defpackage.zeh
    public Boolean j(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    @dzsi
    public dqvb k() {
        for (you youVar : this.b) {
            if (youVar.a == this.d) {
                return youVar.b;
            }
        }
        return null;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.d = i;
    }
}
