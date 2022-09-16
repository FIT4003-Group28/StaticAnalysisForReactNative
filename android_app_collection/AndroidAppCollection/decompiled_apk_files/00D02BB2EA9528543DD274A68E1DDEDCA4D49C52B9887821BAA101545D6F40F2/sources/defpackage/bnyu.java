package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: bnyu  reason: default package */
/* loaded from: classes3.dex */
public abstract class bnyu extends ggo {
    public bnyo al;
    public bpsq am;
    public dxio<akzh> an;
    public bomz ao;
    protected bomy ap;
    private final bomx aq = new bnyt();

    @Override // defpackage.ggo
    protected final boolean aJ() {
        return true;
    }

    @Override // defpackage.ggo, defpackage.ges, defpackage.fd
    public void am() {
        super.am();
        this.ap.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void bD(@dzsi akqq akqqVar, float f) {
        alad p = this.an.a().p();
        float max = Math.max(p.k, f);
        View view = this.P;
        int height = view == null ? 0 : view.getHeight();
        int y = this.an.a().y();
        int z = this.an.a().z();
        alaa a = alad.a();
        a.b(p);
        a.c = max;
        if (akqqVar == null) {
            akqqVar = p.i;
        }
        a.c(akqqVar);
        float f2 = y;
        a.f = alae.a(f2 / 2.0f, (height + z) / 2.0f, f2, z);
        alad a2 = a.a();
        if (!a2.equals(p)) {
            this.ad.a().p(akyt.e(a2));
        }
    }

    @Override // defpackage.ges
    public final achc bk() {
        return achc.RMI_FEATURE_PICKER;
    }

    @Override // defpackage.ggo, defpackage.ges, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        super.l(bundle);
        this.ap = this.ao.a(this.aq);
        this.am.d(bundle);
    }

    @Override // defpackage.ggo
    protected final int q() {
        return 2;
    }

    @Override // defpackage.ggo, defpackage.ges, defpackage.fd
    public void s() {
        super.s();
        this.am.f();
    }

    @Override // defpackage.ggo, defpackage.ges, defpackage.fd
    public void t(Bundle bundle) {
        super.t(bundle);
        this.am.c(bundle);
    }

    @Override // defpackage.ggo, defpackage.ges, defpackage.fd
    public void u() {
        this.am.b();
        super.u();
    }
}
