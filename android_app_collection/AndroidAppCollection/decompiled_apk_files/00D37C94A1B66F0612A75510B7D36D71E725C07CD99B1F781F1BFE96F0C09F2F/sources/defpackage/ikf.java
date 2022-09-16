package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ikf  reason: default package */
/* loaded from: classes3.dex */
public final class ikf extends akrg {
    private View a;
    private View b;
    private View c;
    private int d;
    private boolean e;

    public ikf(dt dtVar) {
        super(dtVar);
        this.d = 0;
        this.e = false;
    }

    private final void h(ampq ampqVar) {
        if (ampqVar.h()) {
            super.c((augo) ampqVar.c());
        } else {
            super.b();
        }
        int i = this.d;
        if (i > 0) {
            this.d = i - 1;
            i();
        }
    }

    private final void i() {
        if (this.d == 0) {
            View view = this.a;
            view.getClass();
            view.setVisibility(0);
            View view2 = this.b;
            view2.getClass();
            view2.setVisibility(0);
            View view3 = this.c;
            view3.getClass();
            view3.setVisibility(8);
            return;
        }
        View view4 = this.a;
        view4.getClass();
        view4.setVisibility(8);
        View view5 = this.b;
        view5.getClass();
        view5.setVisibility(8);
        View view6 = this.c;
        view6.getClass();
        view6.setVisibility(0);
    }

    private final void j(awnn awnnVar, tee teeVar, ampq ampqVar) {
        if (ampqVar.h()) {
            super.g(awnnVar, teeVar, (augo) ampqVar.c());
        } else {
            super.f(awnnVar, teeVar);
        }
        this.d++;
        i();
    }

    public final void a() {
        while (this.d > 0) {
            b();
        }
    }

    @Override // defpackage.akrg, defpackage.akri
    public final void b() {
        aqxo.y(this.e);
        h(amon.a);
    }

    @Override // defpackage.akrg, defpackage.akri
    public final void c(augo augoVar) {
        aqxo.y(this.e);
        h(ampq.j(augoVar));
    }

    public final void d(View view, View view2, View view3) {
        this.a = view;
        this.b = view2;
        this.c = view3;
        i();
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return this.d > 0;
    }

    @Override // defpackage.akrg, defpackage.akri
    public final void f(awnn awnnVar, tee teeVar) {
        aqxo.y(this.e);
        j(awnnVar, teeVar, amon.a);
    }

    @Override // defpackage.akrg, defpackage.akri
    public final void g(awnn awnnVar, tee teeVar, augo augoVar) {
        aqxo.y(this.e);
        j(awnnVar, teeVar, ampq.j(augoVar));
    }
}
