package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cevi  reason: default package */
/* loaded from: classes4.dex */
public class cevi implements cesr {
    static final cqtd a = iup.e(R.raw.own_list);
    private final axwy b;
    private dhsp c;
    private jic d;

    public cevi(axwy axwyVar, dhsp dhspVar) {
        this.b = axwyVar;
        this.c = dhspVar;
        this.d = new jic(dhspVar.e, ckqc.FULLY_QUALIFIED, a, 0);
    }

    @Override // defpackage.cesr
    public jic a() {
        return this.d;
    }

    @Override // defpackage.cesr
    public String b() {
        return this.c.c;
    }

    @Override // defpackage.cesr
    public String c() {
        return this.c.d;
    }

    @Override // defpackage.cesr
    public cqkl d() {
        axwy axwyVar = this.b;
        drco drcoVar = this.c.b;
        if (drcoVar == null) {
            drcoVar = drco.d;
        }
        axwyVar.E(drcoVar.c);
        return cqkl.a;
    }

    @Override // defpackage.cesr
    public cjtd e() {
        return cjtd.a(dtxl.fd);
    }

    public String f() {
        drco drcoVar = this.c.b;
        if (drcoVar == null) {
            drcoVar = drco.d;
        }
        return drcoVar.c;
    }

    public void g(dhsp dhspVar) {
        this.c = dhspVar;
        this.d = new jic(this.c.e, ckqc.FULLY_QUALIFIED, a, 0);
    }
}
