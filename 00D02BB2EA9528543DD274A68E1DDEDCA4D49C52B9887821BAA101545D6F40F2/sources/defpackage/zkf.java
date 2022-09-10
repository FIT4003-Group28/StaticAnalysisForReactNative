package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zkf  reason: default package */
/* loaded from: classes7.dex */
public class zkf extends zqo implements zcf {
    private static final dcqe a = dcqe.c("zkf");
    private final Context b;
    private final zfo c;
    private final qhy d;
    private final dcdc<zdu> e;
    private final dcdc<zdu> f;

    public zkf(Context context, amve amveVar, int i, qhy qhyVar, zfo zfoVar, long j, @dzsi vou vouVar, @dzsi izl izlVar) {
        super(context, amveVar, i, zfoVar, vouVar, j, izlVar);
        this.b = context;
        this.c = zfoVar;
        this.d = qhyVar;
        this.e = zsa.a(amveVar, vtj.TRANSIT_AUTO);
        this.f = p(amveVar);
    }

    public static dcdc<zdu> p(amve amveVar) {
        amtr[] amtrVarArr;
        dccx F = dcdc.F();
        for (amtr amtrVar : amveVar.b) {
            int e = amtrVar.e();
            for (int i = 0; i < e; i++) {
                amuq d = amtrVar.d(i);
                if (d.b()) {
                    F.i(d.a().n);
                    if (i < e - 1) {
                        dpcb bZ = dpce.f.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dpce dpceVar = (dpce) bZ.b;
                        dpceVar.b = 9;
                        dpceVar.a |= 1;
                        F.g(bZ.bK());
                    }
                }
            }
        }
        return zsa.b(F.f(), vtj.TRANSIT_AUTO);
    }

    @Override // defpackage.zqo, defpackage.zfp
    public cqkl T() {
        super.T();
        return cqkl.a;
    }

    @Override // defpackage.zbg
    public dcdc<zdu> a() {
        return this.e;
    }

    @Override // defpackage.zqo, defpackage.zfp
    public cjtd ab() {
        return cjtd.a(dtxn.dI);
    }

    @Override // defpackage.zbg
    public dcdc<zdu> b() {
        return this.f;
    }

    @Override // defpackage.zbg
    public CharSequence c() {
        int c = this.d.d().c();
        return this.b.getResources().getQuantityString(R.plurals.BIKESHARING_BIKES_AVAILABLE_AT_DOCK, c, Integer.valueOf(c)).trim();
    }

    @Override // defpackage.zbg
    @dzsi
    public CharSequence d() {
        String e = e();
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        return null;
    }

    @Override // defpackage.zcf, defpackage.zbg
    public CharSequence f() {
        return null;
    }

    @Override // defpackage.zcf, defpackage.zbg
    public CharSequence g() {
        return null;
    }

    @Override // defpackage.zbg
    public CharSequence h() {
        return null;
    }

    @Override // defpackage.zbg
    public CharSequence i() {
        return null;
    }

    @Override // defpackage.zbg
    public Boolean j() {
        boolean z = true;
        if (h() == null && TextUtils.isEmpty(i())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zqo, defpackage.zca
    @dzsi
    public CharSequence k() {
        if (M() == zfn.DIRECTIONS_RESULT_TRIPCARD) {
            return null;
        }
        bvsi bvsiVar = new bvsi(this.b);
        bvsiVar.d(O());
        bvsiVar.c(S());
        bvsiVar.c(e());
        bvsiVar.e();
        dcdc<zdu> dcdcVar = this.f;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            zdu zduVar = dcdcVar.get(i);
            if (zduVar instanceof zdt) {
                bvsiVar.c(((zdt) zduVar).a());
            }
            jhk b = zduVar.b();
            if (b != null) {
                bvsiVar.c(b.c.f());
            }
            zvb c = zduVar.c();
            if (c != null) {
                bvsiVar.c(alcf.d(c.c()));
            }
        }
        bvsiVar.d(g());
        int ordinal = M().ordinal();
        if (ordinal == 1) {
            bvsiVar.d(this.b.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_OPEN_STEP_LIST));
        } else if (ordinal == 2 || ordinal == 3) {
            bvsiVar.d(this.b.getString(R.string.ACCESSIBILITY_ACTIVATE_TO_CLOSE_STEP_LIST));
        }
        return bvsiVar.toString();
    }

    @Override // defpackage.zbg
    /* renamed from: q */
    public String e() {
        String d = this.c.d();
        if (d != null) {
            return d;
        }
        bvoo.h("failed to format distance text", new Object[0]);
        return "";
    }
}
