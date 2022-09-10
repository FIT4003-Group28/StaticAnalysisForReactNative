package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yba  reason: default package */
/* loaded from: classes7.dex */
public class yba extends acoi implements xzf {
    public final Activity a;
    public final byae b;
    public final xze c;
    public final dcdc<yaz> d;
    public final cjta e;
    @dzsi
    public final wuo f;
    @dzsi
    public xyz g;
    private final dcdc<List<yay>> h;
    private final boolean i;
    private boolean j;
    private boolean k;

    public yba(Activity activity, byae byaeVar, final xze xzeVar, Map<amuk, List<wuo>> map, @dzsi wuo wuoVar, vwh vwhVar, final boolean z, cjta cjtaVar) {
        this.a = activity;
        this.b = byaeVar;
        this.c = xzeVar;
        this.e = cjtaVar;
        this.j = z ? vwhVar.e : vwhVar.f;
        this.i = z;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        for (Map.Entry<amuk, List<wuo>> entry : map.entrySet()) {
            F.g(new yaz(this, entry.getKey()));
            ArrayList arrayList = new ArrayList();
            for (wuo wuoVar2 : entry.getValue()) {
                arrayList.add(new yay(this, wuoVar2));
            }
            F2.g(arrayList);
        }
        this.d = F.f();
        this.h = F2.f();
        this.f = wuoVar;
        Z(z ? vwhVar.g : vwhVar.h);
        Y(new acnw(xzeVar, z) { // from class: yaw
            private final xze a;
            private final boolean b;

            {
                this.a = xzeVar;
                this.b = z;
            }

            @Override // defpackage.acnw
            public final void a(int i, int i2, boolean z2, boolean z3) {
                this.a.r(i2, this.b);
            }
        });
    }

    private final int k() {
        int size = this.h.get(Os().intValue()).size();
        if (size == 4) {
            return 4;
        }
        return Math.min(size, 3);
    }

    @Override // defpackage.xzf
    public List<? extends zdr> a() {
        return this.d;
    }

    @Override // defpackage.xzf
    public List<? extends xzd> c() {
        List<yay> list = this.h.get(Os().intValue());
        return this.j ? list : list.subList(0, k());
    }

    @Override // defpackage.xzf
    @dzsi
    public CharSequence d() {
        if (k() >= this.h.get(Os().intValue()).size()) {
            return null;
        }
        if (this.j) {
            return this.a.getString(R.string.DIRECTIONS_DETAILS_RIDESHARE_SHOW_LESS);
        }
        return this.a.getString(R.string.DIRECTIONS_DETAILS_RIDESHARE_SHOW_MORE);
    }

    @Override // defpackage.xzf
    public Boolean e() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.xzf
    public Boolean f() {
        return Boolean.valueOf(this.k);
    }

    @Override // defpackage.xzf
    public cqkl g() {
        this.j = !this.j;
        h().q(this.j, this.i);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.xzf
    public xze h() {
        return this.c;
    }

    public void i(@dzsi xyz xyzVar) {
        this.g = xyzVar;
    }

    public void j(boolean z) {
        this.k = z;
    }
}
