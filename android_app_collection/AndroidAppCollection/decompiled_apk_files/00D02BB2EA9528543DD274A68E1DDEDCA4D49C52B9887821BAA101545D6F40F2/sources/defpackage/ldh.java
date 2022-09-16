package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ldh  reason: default package */
/* loaded from: classes7.dex */
public final class ldh implements lcx {
    public boolean a;
    @dzsi
    public ldg b;
    private final btrm c;
    private final boolean d;
    private boolean e;
    private final ldf f = new ldf(this);
    private final kqm g;
    @dzsi
    private View.OnFocusChangeListener h;

    public ldh(btrm btrmVar, cqhn cqhnVar, kqm kqmVar, boolean z) {
        this.c = btrmVar;
        this.g = kqmVar;
        this.d = z;
    }

    @Override // defpackage.lcx
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.lcx
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.lcx
    public cqtd c() {
        if (this.a) {
            return nqu.aL(R.raw.car_only_ic_my_location_36dp, nql.a, nql.b, nqo.z, nqo.A);
        }
        return nqu.aE(R.raw.car_only_ic_my_location_36dp, nql.c);
    }

    @Override // defpackage.lcx
    public cqkl d() {
        ldg ldgVar = this.b;
        if (ldgVar != null) {
            ((kzg) ldgVar).a.a();
        }
        this.g.a();
        return cqkl.a;
    }

    @Override // defpackage.lcx
    @dzsi
    public View.OnFocusChangeListener e() {
        return this.h;
    }

    public void f(@dzsi View.OnFocusChangeListener onFocusChangeListener) {
        if (this.h != onFocusChangeListener) {
            this.h = onFocusChangeListener;
            cqkx.p(this);
        }
    }

    public void g(@dzsi ldg ldgVar) {
        boolean z = true;
        boolean z2 = this.b == null;
        if (ldgVar != null) {
            z = false;
        }
        dbsk.a(z2 ^ z);
        this.b = ldgVar;
    }

    public boolean h() {
        return this.a;
    }

    public void i() {
        btrm btrmVar = this.c;
        ldf ldfVar = this.f;
        dceq a = dcet.a();
        a.b(amwe.class, new ldi(amwe.class, ldfVar, bvrj.UI_THREAD));
        btrmVar.g(ldfVar, a.a());
    }

    public void j() {
        this.c.a(this.f);
    }

    public void k(boolean z) {
        if (this.e != z) {
            this.e = z;
            cqkx.p(this);
        }
    }
}
