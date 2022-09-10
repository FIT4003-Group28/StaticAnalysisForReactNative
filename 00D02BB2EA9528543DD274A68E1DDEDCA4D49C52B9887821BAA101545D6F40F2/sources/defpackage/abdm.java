package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abdm  reason: default package */
/* loaded from: classes2.dex */
public class abdm implements abdu {
    public final Activity a;
    private final abdo c;
    private final abcx d;
    private final Map<String, dqpy> e;
    private final Runnable f;
    @dzsi
    private dqps i;
    private dbsg<List<abdt>> g = dbpy.a;
    private boolean h = true;
    private final dbty<jam> b = dbud.a(new dbty(this) { // from class: abdk
        private final abdm a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return new abdj(this.a.a);
        }
    });

    public abdm(abcx abcxVar, Runnable runnable, Activity activity, abdo abdoVar) {
        this.f = runnable;
        this.a = activity;
        this.c = abdoVar;
        this.d = abcxVar;
        this.e = Collections.unmodifiableMap(abcxVar.i);
    }

    public void a(dbsg<dqps> dbsgVar, boolean z) {
        this.h = z;
        if (!dbsgVar.a()) {
            this.g = dbpy.a;
        } else if (!dbsgVar.b().equals(this.i)) {
            this.i = dbsgVar.b();
            abdo abdoVar = this.c;
            Map<String, dqpy> map = this.e;
            dsrj<dqpu> dsrjVar = dbsgVar.b().b;
            dccx F = dcdc.F();
            for (int i = 0; i < dsrjVar.size(); i++) {
                dqpu dqpuVar = dsrjVar.get(i);
                String str = dqpuVar.a;
                String str2 = map.containsKey(str) ? map.get(str).a : null;
                dnpq dnpqVar = dqpuVar.b;
                if (dnpqVar == null) {
                    dnpqVar = dnpq.g;
                }
                String str3 = dnpqVar.c;
                abdo.a(str, 2);
                abdo.a(str3, 3);
                dxio a = ((dxjh) abdoVar.a).a();
                abdo.a(a, 4);
                F.g(new abdl(str2, str, str3, a));
            }
            this.g = dbsg.i(F.f());
        }
    }

    @Override // defpackage.abdu
    public String b() {
        return this.d.b;
    }

    @Override // defpackage.abdu
    public String c() {
        return this.d.c;
    }

    @Override // defpackage.abdu
    public String d() {
        return this.a.getString(R.string.SHOWTIMES_DATE, new Object[]{this.d.d});
    }

    @Override // defpackage.abdu
    public String e() {
        return this.a.getString(R.string.SHOWTIMES_TIME, new Object[]{this.d.e});
    }

    @Override // defpackage.abdu
    public Boolean f() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.abdu
    @dzsi
    public jam g() {
        if (this.g.a() || this.h) {
            return null;
        }
        return this.b.a();
    }

    @Override // defpackage.abdu
    public List<abdt> h() {
        return this.g.c(dcdc.e());
    }

    @Override // defpackage.abdu
    public cqkl i() {
        this.f.run();
        return cqkl.a;
    }
}
