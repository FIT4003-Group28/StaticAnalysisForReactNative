package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: dev  reason: default package */
/* loaded from: classes6.dex */
public abstract class dev extends ry implements cjsf {
    @dzsi
    private cjqp ad;
    private final dbty<cjsz> ae = dbud.a(new dbty(this) { // from class: deu
        private final dev a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            return new cjsz(this.a.aR());
        }
    });
    public cjqy ak;
    public cjqq al;

    @Override // defpackage.ex, defpackage.fd
    public final void Qe() {
        View view = this.P;
        if (view != null) {
            this.al.h(view);
        }
        super.Qe();
    }

    @Override // defpackage.ex, defpackage.fd
    public final void Qi(Context context) {
        dxix.a(this);
        super.Qi(context);
    }

    protected void aJ(@dzsi Bundle bundle) {
    }

    @Override // defpackage.cjsf
    public final cjtg aP() {
        return this.ae.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @dzsi
    public final cjql aQ(cjtd cjtdVar) {
        cjqp cjqpVar = this.ad;
        if (cjqpVar != null) {
            return cjqpVar.d(cjtdVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ddho aR();

    @Override // defpackage.fd
    public final void aj(@dzsi Bundle bundle) {
        super.aj(bundle);
        View view = this.P;
        cjqp cjqpVar = this.ad;
        if (view == null || cjqpVar == null) {
            return;
        }
        this.al.i(cjqpVar, view);
    }

    @Override // defpackage.fd
    public final void am() {
        cjqp cjqpVar = this.ad;
        if (cjqpVar != null) {
            this.al.l(cjqpVar);
        }
        super.am();
    }

    @Override // defpackage.ex, defpackage.fd
    public void l(@dzsi Bundle bundle) {
        this.ak.h();
        super.l(bundle);
        aJ(bundle);
        if (aR() != null) {
            this.ad = this.al.j(aP());
        }
    }

    @Override // defpackage.ex, defpackage.fd
    public void u() {
        super.u();
        cjqp cjqpVar = this.ad;
        if (cjqpVar != null) {
            cjqpVar.f();
        }
        this.ak.h();
    }
}
