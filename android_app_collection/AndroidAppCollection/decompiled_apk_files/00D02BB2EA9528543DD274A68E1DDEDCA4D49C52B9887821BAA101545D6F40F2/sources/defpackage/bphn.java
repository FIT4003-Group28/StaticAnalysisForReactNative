package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bphn  reason: default package */
/* loaded from: classes3.dex */
public class bphn implements bpwq {
    public final bpvb a;
    public final bpsr b;
    public final dcdc<bphm> c;
    private final ff e;
    private final List<drkz> g;
    private final cqkn<bpwp> f = new bphl(this);
    public int d = -1;

    public bphn(ff ffVar, List<drkz> list, bpvb bpvbVar, bpsr bpsrVar) {
        this.e = ffVar;
        this.g = list;
        this.a = bpvbVar;
        this.b = bpsrVar;
        dccx F = dcdc.F();
        for (int i = 0; i < list.size(); i++) {
            dpyn dpynVar = list.get(i).c;
            if (dpynVar == null) {
                dpynVar = dpyn.d;
            }
            String str = dpynVar.b;
            cqkn<bpwp> cqknVar = this.f;
            cjta b = cjtd.b();
            b.d = dtya.bE;
            b.i(i);
            F.g(new bphm(str, cqknVar, b.a()));
        }
        this.c = F.f();
        g(-1, this.d);
    }

    @Override // defpackage.jbk
    public jib NC() {
        jhz aS = bpdz.aS(this.e.getString(R.string.RAP_ROAD_ROUTE_DISAMBIGUATION_TITLE));
        aS.o = cjtd.a(dtya.bB);
        aS.f(new View.OnClickListener(this) { // from class: bphj
            private final bphn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.b();
            }
        });
        String string = this.e.getString(R.string.NEXT);
        jhm a = jhm.a();
        a.a = string;
        a.f = cjtd.a(dtya.bC);
        a.b = string;
        a.h = 2;
        a.d(new View.OnClickListener(this) { // from class: bphk
            private final bphn a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.a();
            }
        });
        a.n = d().a();
        aS.c(a.c());
        return aS.b();
    }

    @Override // defpackage.bpwq
    public CharSequence b() {
        return this.e.getString(R.string.RAP_ROAD_ROUTE_DISAMBIGUATION_HELP_TEXT);
    }

    @Override // defpackage.bpwq
    public List<? extends bpwp> c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dbsg<drkz> d() {
        int i = this.d;
        if (i < 0 || i >= this.g.size()) {
            return dbpy.a;
        }
        return dbsg.i(this.g.get(this.d));
    }

    public void e(Bundle bundle) {
        int i = this.d;
        int i2 = bundle.getInt("route_checked_position", i);
        this.d = i2;
        g(i, i2);
    }

    public void f(Bundle bundle) {
        bundle.putInt("route_checked_position", this.d);
    }

    public final void g(int i, int i2) {
        if (i >= 0 && i < this.c.size()) {
            this.c.get(i).d(false);
        }
        if (i2 >= 0 && i2 < this.c.size()) {
            this.c.get(i2).d(true);
        }
        this.d = i2;
    }
}
