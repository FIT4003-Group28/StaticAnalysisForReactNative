package defpackage;

import android.app.Activity;
import android.widget.Toast;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdyv  reason: default package */
/* loaded from: classes3.dex */
public final class bdyv implements bzml {
    public izs a;
    public bwrs<ilo> b;
    private final Activity c;
    private final bvjj d;
    private final dxio<imb> e;
    private final axws f;
    private final Executor g;
    private final bzgj h = new bzgj();
    private final bzgf i = new bzgf(this) { // from class: bdyu
        private final bdyv a;

        {
            this.a = this;
        }

        @Override // defpackage.bzgf
        public final void a() {
            this.a.g();
        }
    };
    private axwt j = axwt.a;

    public bdyv(Activity activity, bvjj bvjjVar, dxio<imb> dxioVar, axws axwsVar, Executor executor) {
        this.c = activity;
        this.d = bvjjVar;
        this.e = dxioVar;
        this.f = axwsVar;
        this.g = executor;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.LABEL_FREQUENTLY_SEARCHED_PLACE;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        bwrs<ilo> bwrsVar;
        ilo c;
        if (this.a != null && (bwrsVar = this.b) != null && (c = bwrsVar.c()) != null && !dbsj.d(c.B()) && c.f && !c.bi()) {
            if (this.d.m(bvjk.gN, false)) {
                long c2 = this.e.a().c(c);
                Activity activity = this.c;
                StringBuilder sb = new StringBuilder(41);
                sb.append("Alias setting: count=");
                sb.append(c2);
                Toast.makeText(activity, sb.toString(), 0).show();
            }
            imb a = this.e.a();
            long c3 = a.c(c);
            if (c3 >= a.k.a().intValue() || (c3 >= 2 && a.i.m(bvjk.gN, false))) {
                if (!this.h.c()) {
                    return true;
                }
                bzgg.b(this.i, this.f, this.h, this.g);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        if (this.a == null || this.b == null || bzmkVar != bzmk.VISIBLE) {
            return false;
        }
        g();
        if (!this.j.b()) {
            return false;
        }
        ilo c = this.b.c();
        dbsk.s(c);
        this.a.I(c.B());
        izp N = this.a.N();
        dbsk.s(N);
        N.c(c.B());
        N.d(this.b);
        N.p(this.j.a());
        N.b(true);
        cqkx.p(this.a);
        return true;
    }

    public final void g() {
        axws axwsVar = this.f;
        dbsk.s(axwsVar);
        this.j = axwsVar.b();
    }
}
