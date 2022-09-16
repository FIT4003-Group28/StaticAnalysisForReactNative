package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ywf  reason: default package */
/* loaded from: classes7.dex */
class ywf implements yvo {
    final /* synthetic */ ywh a;
    private int b;

    public ywf(ywh ywhVar) {
        this.a = ywhVar;
    }

    private static final int k(yvp yvpVar, yvp yvpVar2) {
        yvx yvxVar = (yvx) yvpVar2;
        dpum dpumVar = ((yvx) yvpVar).c().d;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        return yvxVar.z(dpumVar);
    }

    @Override // defpackage.jad
    public Boolean a() {
        int i;
        yvx C = this.a.C();
        boolean z = false;
        if (C == null) {
            i = -1;
        } else {
            int intValue = this.a.Os().intValue();
            i = -1;
            for (int i2 = 0; i2 < this.a.D().size(); i2++) {
                if (i2 != intValue && !C.y().containsAll(((yvx) this.a.D().get(i2)).y()) && (i == -1 || k(C, this.a.D().get(i2)) < k(C, this.a.D().get(i)))) {
                    i = i2;
                }
            }
        }
        this.b = i;
        if (i != -1 && !b().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.yvo
    public String b() {
        return this.b == -1 ? "" : dbrz.e(this.a.b.getString(R.string.TRANSIT_LINE_HEADSIGN_DELIMITER)).g(((yvx) this.a.D().get(this.b)).y());
    }

    @Override // defpackage.jad
    public cqkl c() {
        int i = this.b;
        if (i >= 0) {
            this.a.Z(i);
            cqkx.p(this.a);
            this.a.e.b();
            ywh ywhVar = this.a;
            ywhVar.f.a(ywhVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(this.a.g.d());
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.b.getString(R.string.TRANSIT_LINE_CARD_STATION_CHANGE_DIRECTION_BUTTON);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }

    @Override // defpackage.yvo
    public Boolean j() {
        return Boolean.valueOf(this.a.M() != null);
    }
}
