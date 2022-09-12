package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aqcg  reason: default package */
/* loaded from: classes2.dex */
public abstract class aqcg implements aqcc {
    public final gga a;
    public final ges b;
    protected final bvrb c;
    protected final dxio<aqbo> d;
    @dzsi
    @Deprecated
    protected dehn<dbsg<ctyy>> e;
    private boolean f = false;
    @dzsi
    private aqcb g;

    public aqcg(gga ggaVar, ges gesVar, bvrb bvrbVar, dxio<aqbo> dxioVar) {
        this.a = ggaVar;
        this.b = gesVar;
        this.c = bvrbVar;
        this.d = dxioVar;
    }

    @Deprecated
    public void PD() {
        this.f = false;
        dehn<dbsg<ctyy>> g = this.d.a().g(1);
        this.e = g;
        deha.q(g, new aqce(this), this.c.h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void PE(dcdc<Integer> dcdcVar) {
        this.f = false;
        aqcb aqcbVar = new aqcb(this.d, this.c, dcdcVar);
        this.g = aqcbVar;
        deha.q(aqcbVar.a(), new aqcf(this), this.c.h());
    }

    public dehn<dcdc<ctyy>> PF() {
        aqcb aqcbVar = this.g;
        if (aqcbVar != null) {
            dehn<dcdc<ctyy>> dehnVar = aqcbVar.a;
            return dehnVar == null ? deha.b(new RuntimeException("Registration was not started")) : dehnVar;
        }
        dehn<dbsg<ctyy>> dehnVar2 = this.e;
        if (dehnVar2 != null) {
            return deew.h(dehnVar2, aqcd.a, this.c.h());
        }
        return deha.b(new IllegalStateException("Registration was not started"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void PG() {
        dehn<dbsg<ctyy>> dehnVar = this.e;
        if (dehnVar != null && !dehnVar.isDone()) {
            this.e.cancel(true);
        }
        aqcb aqcbVar = this.g;
        if (aqcbVar != null) {
            aqcbVar.b();
        }
    }

    public final void PI() {
        h();
    }

    @Override // defpackage.aqcc
    public Boolean a() {
        return Boolean.valueOf(!this.f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        gga ggaVar = this.a;
        Toast.makeText(ggaVar, ggaVar.getString(R.string.MESSAGING_FAIL_TO_RETRIEVE_CONVERSATION), 1).show();
        if (!dbsd.a(this.a.K(), this.b) || this.a.g() == null) {
            return;
        }
        gn g = this.a.g();
        dbsk.s(g);
        if (g.J()) {
            return;
        }
        this.a.g().f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public abstract void i(ctyy ctyyVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void j(dcdc<ctyy> dcdcVar);
}
