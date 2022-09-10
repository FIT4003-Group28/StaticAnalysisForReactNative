package defpackage;

import android.app.Activity;
import android.os.Bundle;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: cevg  reason: default package */
/* loaded from: classes4.dex */
public abstract class cevg<Q extends dssj, S extends dssj> implements cesp, ceey {
    private final jib a;
    protected final ceez<Q, S> f;
    protected boolean g = false;

    public cevg(Activity activity, cqhn cqhnVar, ceez<Q, S> ceezVar, String str) {
        jhz e = jib.g(activity, str).e();
        e.F = 1;
        this.a = e.b();
        this.f = ceezVar;
    }

    @Override // defpackage.jbk
    public jib NC() {
        return this.a;
    }

    @Override // defpackage.cesp
    public Boolean Ry() {
        return Boolean.valueOf(this.f.i());
    }

    @Override // defpackage.cqrh
    public void Rz(cqiw<?> cqiwVar, cqkp cqkpVar) {
        if (cqiwVar instanceof oag) {
            this.f.g();
        }
    }

    public abstract void k(Bundle bundle);

    public abstract void l(Bundle bundle);

    public void n() {
        this.f.d = this;
    }

    public void o() {
    }

    public void p() {
    }

    public void r() {
        this.f.d();
    }

    public void s() {
    }

    public Boolean t() {
        return Boolean.valueOf(this.g);
    }
}
