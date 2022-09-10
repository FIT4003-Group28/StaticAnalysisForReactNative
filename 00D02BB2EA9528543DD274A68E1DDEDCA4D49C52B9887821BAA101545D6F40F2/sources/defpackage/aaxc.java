package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aaxc  reason: default package */
/* loaded from: classes2.dex */
public class aaxc implements aawm {
    private final Activity a;
    private final cqat b;
    private final bydq c;
    private boolean d;
    private String e = "";
    private String f = "";
    private CharSequence g = "";
    private boolean h;
    private boolean i;
    private List<aawl> j;

    public aaxc(Activity activity, cqat cqatVar, cqhn cqhnVar) {
        this.a = activity;
        this.b = cqatVar;
        bydl g = bydm.g(activity.getBaseContext());
        g.b(cqrt.c(R.color.quantum_orange800).b(activity));
        this.c = new byds(activity, cqatVar, g.a());
        this.j = dcdc.e();
    }

    @Override // defpackage.aawm
    public String a() {
        return this.e;
    }

    @Override // defpackage.aawm
    public CharSequence b() {
        return this.g;
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.aawm
    public Boolean d() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.aawm
    public Boolean e() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.aawm
    public List<aawl> f() {
        return this.j;
    }

    @Override // defpackage.aawm
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxo.bH;
        if (this.h) {
            ddzy bZ = deab.c.bZ();
            deaa deaaVar = this.i ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deab deabVar = (deab) bZ.b;
            deabVar.b = deaaVar.d;
            deabVar.a |= 1;
            b.a = bZ.bK();
        }
        if (!dbsj.d(this.f)) {
            b.g(this.f);
        }
        return b.a();
    }

    @Override // defpackage.aawm
    public cqkl h() {
        if (this.h) {
            this.i = !this.i;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    public void i(diwb diwbVar) {
        this.d = false;
        this.e = "";
        this.g = "";
        this.h = false;
        this.i = false;
        this.j = dcdc.e();
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        this.f = dittVar.b;
        if ((diwbVar.a & 8388608) != 0) {
            diwl diwlVar = diwbVar.t;
            if (diwlVar == null) {
                diwlVar = diwl.f;
            }
            int i = diwlVar.a;
            if ((i & 1) != 0) {
                this.e = diwlVar.b;
                this.d = true;
            }
            if ((i & 2) != 0) {
                this.g = diwlVar.c;
                this.d = true;
            }
            if (diwlVar.d.size() > 0) {
                this.d = true;
                this.h = true;
                dsrj<diwg> dsrjVar = diwlVar.d;
                dccx F = dcdc.F();
                for (diwg diwgVar : dsrjVar) {
                    F.g(new aaxb(diwgVar));
                }
                this.j = F.f();
            }
            if ((diwlVar.a & 8) == 0) {
                return;
            }
            this.d = true;
            this.h = true;
            dgfs dgfsVar = diwlVar.e;
            if (dgfsVar == null) {
                dgfsVar = dgfs.f;
            }
            ditt dittVar2 = diwbVar.e;
            if (dittVar2 == null) {
                dittVar2 = ditt.n;
            }
            byee byeeVar = new byee(dgfsVar, dittVar2.i, false, false);
            List<bydp> h = byeeVar.h(this.b);
            if (h.isEmpty()) {
                return;
            }
            dccx F2 = dcdc.F();
            this.g = this.c.a(byeeVar);
            F2.g(new aaxb(this.a, h.get(0), true));
            for (int i2 = 1; i2 < h.size(); i2++) {
                F2.g(new aaxb(this.a, h.get(i2), false));
            }
            this.j = F2.f();
        }
    }
}
