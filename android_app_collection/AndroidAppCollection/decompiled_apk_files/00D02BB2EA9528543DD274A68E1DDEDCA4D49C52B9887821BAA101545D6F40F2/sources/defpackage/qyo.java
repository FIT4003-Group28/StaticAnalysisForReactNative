package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qyo  reason: default package */
/* loaded from: classes7.dex */
class qyo implements qyd {
    private final Application a;
    private final dxio<axwy> b;
    @dzsi
    private final quy c;
    private final Runnable d;
    private final dxio<bvjj> e;
    private final dxio<cqat> f;

    public qyo(Application application, dxio<axwy> dxioVar, dxio<bvjj> dxioVar2, dxio<cqat> dxioVar3, Runnable runnable, @dzsi quy quyVar) {
        this.a = application;
        this.b = dxioVar;
        this.e = dxioVar2;
        this.f = dxioVar3;
        this.c = quyVar;
        this.d = runnable;
    }

    private final void f(azva azvaVar) {
        axwy a = this.b.a();
        dndr dndrVar = qyp.a.get(azvaVar.a);
        dbsk.s(dndrVar);
        a.I(dndrVar, new qyn(), new qym(), false, azvaVar.d, azvaVar.c.o(), azvaVar.e, dtxl.aC, null);
    }

    @Override // defpackage.qyd
    public cqtd a() {
        return cqrt.g(2131232241, ibm.b());
    }

    @Override // defpackage.qyd
    public String b() {
        return this.a.getResources().getString(R.string.INFERRED_HOME_WORK_CONFIRM_BUTTON);
    }

    @Override // defpackage.qyd
    public cjtd c() {
        ddho ddhoVar = dtxl.aD;
        dcdn<dndr, dndr> dcdnVar = qyp.a;
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.qyd
    public cqkl d() {
        this.e.a().Z(bvjk.im, this.f.a().b());
        quy quyVar = this.c;
        azva azvaVar = null;
        azva d = quyVar == null ? null : quyVar.d();
        quy quyVar2 = this.c;
        if (quyVar2 != null) {
            azvaVar = quyVar2.e();
        }
        if (d != null && d.a == dndr.INFERRED_HOME) {
            f(d);
        }
        if (azvaVar != null && azvaVar.a == dndr.INFERRED_WORK) {
            f(azvaVar);
        }
        this.d.run();
        return cqkl.a;
    }

    @Override // defpackage.qyd
    public Boolean e() {
        return true;
    }
}
