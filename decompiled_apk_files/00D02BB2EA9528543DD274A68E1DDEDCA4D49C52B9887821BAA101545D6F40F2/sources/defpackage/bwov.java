package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bwov  reason: default package */
/* loaded from: classes4.dex */
public class bwov implements bwoa {
    public static final dcdn<dpvf, bwoo> d;
    private static final cjtd j = cjtd.a(dtxu.cI);
    public final dzsj<brba> a;
    public final dzsj<ascb> b;
    public final bwou c;
    private final bwnz e;
    private final dcdc<bwnz> f;
    private final Context g;
    private boolean h = true;
    private final dzsj<glj> i;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dpvf.GAS_STATIONS, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_GAS_STATIONS), 2131232324));
        dcdgVar.f(dpvf.PARKING, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_PARKING), 2131232331));
        dcdgVar.f(dpvf.RESTAURANTS, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_RESTAURANTS), 2131232403));
        dcdgVar.f(dpvf.COFFEE, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_COFFEE), 2131232320));
        dcdgVar.f(dpvf.TAKEOUT, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_FAST_FOOD), 2131231650));
        dcdgVar.f(dpvf.GROCERIES, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_GROCERY_STORES), 2131232325));
        dcdgVar.f(dpvf.ATMS, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_ATM), 2131232157));
        dcdgVar.f(dpvf.HOSPITALS, bwoo.c(Integer.valueOf((int) R.string.LOCAL_ZERO_EMERGENCY), 2131232326));
        d = dcdgVar.b();
    }

    public bwov(bwou bwouVar, eeu eeuVar, Activity activity, dzsj<glj> dzsjVar, dzsj<brba> dzsjVar2, dzsj<ascb> dzsjVar3, dcdc<bwop> dcdcVar) {
        this.c = bwouVar;
        this.i = dzsjVar;
        this.a = dzsjVar2;
        this.g = activity;
        this.b = dzsjVar3;
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        dccx F3 = dcdc.F();
        int size = dcdcVar.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bwoq bwoqVar = new bwoq(this, eeuVar, dcdcVar.get(i2));
            i++;
            if (i < 4 || dcdcVar.size() <= 4) {
                F.g(bwoqVar);
            }
            F2.g(bwoqVar);
            if (i % 4 == 0) {
                F3.g(new bwot(F2.f()));
                F2 = dcdc.F();
            }
        }
        if (dcdcVar.size() > 4) {
            F.g(new bwos(this, eeuVar, this.g));
        }
        this.e = new bwot(F.f());
        if (bwouVar != bwou.FREE_NAV && dcdcVar.size() > 4) {
            F2.g(new bwor(this, eeuVar, this.g));
        }
        dcdc f = F2.f();
        if (!f.isEmpty()) {
            F3.g(new bwot(f));
        }
        this.f = F3.f();
    }

    public static dcdc<bwop> e(Context context, dcdn<dpvf, bwoo> dcdnVar) {
        dccx F = dcdc.F();
        dcdc<Map.Entry<dpvf, bwoo>> v = dcdnVar.entrySet().v();
        int size = v.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<dpvf, bwoo> entry = v.get(i);
            F.g(new bwop(context, entry.getKey(), entry.getValue().a().intValue(), entry.getValue().b().intValue(), dtxu.cJ));
        }
        return F.f();
    }

    @Override // defpackage.bwoa
    public boolean a() {
        return this.h;
    }

    @Override // defpackage.bwoa
    public bwnz b() {
        return this.e;
    }

    @Override // defpackage.bwoa
    public List<bwnz> c() {
        return this.f;
    }

    @Override // defpackage.bwoa
    public cjtd d() {
        return j;
    }

    public void f() {
        this.h = !this.h;
        this.i.a().b();
        cqkx.p(this);
    }
}
