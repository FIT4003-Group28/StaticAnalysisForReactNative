package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aczh  reason: default package */
/* loaded from: classes2.dex */
public class aczh implements jbm {
    private static final dcqe a = dcqe.c("aczh");
    private final Activity b;
    private final dxio<qbt> c;
    private final cqtd d;
    private final String e;
    private final cjtd f;
    private final amvh g;

    public aczh(Activity activity, dxio<qbt> dxioVar, dndr dndrVar, amvh amvhVar, String str) {
        if (dndrVar != dndr.HOME && dndrVar != dndr.WORK) {
            bvoo.h("The aliasType has to be either home or work.", new Object[0]);
        }
        this.b = activity;
        this.c = dxioVar;
        if (dndrVar == dndr.HOME) {
            this.d = cqrt.g(2131231654, ibm.p());
            this.e = activity.getString(R.string.ADDRESS_TYPE_HOME);
            cjta b = cjtd.b();
            b.g(str);
            b.d = dtxr.x;
            this.f = b.a();
        } else {
            this.d = cqrt.g(2131231777, ibm.p());
            this.e = activity.getString(R.string.ADDRESS_TYPE_WORK);
            cjta b2 = cjtd.b();
            b2.g(str);
            b2.d = dtxr.y;
            this.f = b2.a();
        }
        this.g = amvhVar;
    }

    @Override // defpackage.jbm
    public cqtd a() {
        return this.d;
    }

    @Override // defpackage.jbm
    public String b() {
        return this.e;
    }

    @Override // defpackage.jbm
    public cjtd c() {
        return this.f;
    }

    @Override // defpackage.jbm
    public cqkl d(cjqm cjqmVar) {
        if (this.g != null) {
            qcw x = qcx.x();
            x.u(this.g);
            x.r(amvh.i(this.b));
            x.k(qbs.DEFAULT);
            this.c.a().m(x.a());
        }
        return cqkl.a;
    }
}
