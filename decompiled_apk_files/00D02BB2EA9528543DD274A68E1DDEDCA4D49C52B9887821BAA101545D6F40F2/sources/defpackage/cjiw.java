package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjiw  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjiw implements cjio {
    public static cjiv p() {
        cjip cjipVar = new cjip();
        cjipVar.d = true;
        cjipVar.h = true;
        cjipVar.i = false;
        return cjipVar;
    }

    @Override // defpackage.cjio
    public cjin a() {
        return cjin.DUAL_ACTION;
    }

    @Override // defpackage.cjio
    public abstract CharSequence b();

    @Override // defpackage.cjio
    public View.OnClickListener c(final cjqm cjqmVar) {
        return new View.OnClickListener(this, cjqmVar) { // from class: cjir
            private final cjiw a;
            private final cjqm b;

            {
                this.a = this;
                this.b = cjqmVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjiw cjiwVar = this.a;
                cjiwVar.n().a(this.b);
            }
        };
    }

    @Override // defpackage.cjio
    @dzsi
    public abstract cjtd d();

    @Override // defpackage.cjio
    public abstract boolean e();

    @Override // defpackage.cjio
    public abstract CharSequence f();

    @Override // defpackage.cjio
    public View.OnClickListener g(final cjqm cjqmVar) {
        return new View.OnClickListener(this, cjqmVar) { // from class: cjis
            private final cjiw a;
            private final cjqm b;

            {
                this.a = this;
                this.b = cjqmVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjiw cjiwVar = this.a;
                cjiwVar.o().a(this.b);
            }
        };
    }

    @Override // defpackage.cjio
    @dzsi
    public abstract cjtd h();

    @Override // defpackage.cjio
    public abstract boolean i();

    @Override // defpackage.cjio
    public CharSequence j() {
        return "";
    }

    @Override // defpackage.cjio
    public CharSequence k() {
        return "";
    }

    @Override // defpackage.cjio
    public cqtd l() {
        return null;
    }

    @Override // defpackage.cjio
    public abstract boolean m();

    public abstract mw<cjqm> n();

    public abstract mw<cjqm> o();
}
