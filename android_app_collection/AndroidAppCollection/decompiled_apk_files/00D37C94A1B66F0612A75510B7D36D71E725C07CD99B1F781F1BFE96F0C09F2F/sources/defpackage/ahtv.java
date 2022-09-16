package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahtv  reason: default package */
/* loaded from: classes.dex */
public final class ahtv implements acti {
    private static final String e = "ahtv";
    public final acti a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public ahty d = ahty.NEW;
    private final ahty f;
    private final Executor g;

    public ahtv(acti actiVar, Executor executor, ahty ahtyVar) {
        this.a = actiVar;
        this.g = executor;
        this.f = ahtyVar;
    }

    private final void K(Runnable runnable) {
        if (ylr.e()) {
            this.b.add(runnable);
        } else {
            this.g.execute(new ahto(this, runnable, 1));
        }
    }

    private final void L(Runnable runnable) {
        if (ylr.e()) {
            this.c.add(runnable);
        } else {
            this.g.execute(new ahto(this, runnable));
        }
    }

    public final void A(ahub ahubVar) {
        ahubVar.c(new ahtz() { // from class: ahtk
            @Override // defpackage.ahtz
            public final void a(ahty ahtyVar) {
                ahtv ahtvVar = ahtv.this;
                ahtvVar.d = ahtyVar;
                ahtvVar.I();
            }
        });
    }

    @Override // defpackage.acti
    public final void B(InteractionLoggingScreen interactionLoggingScreen) {
        this.a.B(interactionLoggingScreen);
    }

    public final void C() {
        this.b.clear();
        this.c.clear();
        this.a.y();
    }

    @Override // defpackage.acti
    public final /* bridge */ /* synthetic */ void D(acum acumVar) {
        K(new ahts(this, acumVar, 1));
        I();
    }

    @Override // defpackage.acti
    public final /* bridge */ /* synthetic */ void E(acum acumVar, acum acumVar2) {
        K(new ahtt(this, acumVar, acumVar2, 1));
        I();
    }

    @Override // defpackage.acti
    public final InteractionLoggingScreen F(acup acupVar, acuc acucVar, apzg apzgVar) {
        return this.a.F(acupVar, acucVar, apzgVar);
    }

    @Override // defpackage.acti
    public final void G(final aoqu aoquVar, final aoob aoobVar, final View view) {
        L(new Runnable() { // from class: ahtm
            @Override // java.lang.Runnable
            public final void run() {
                ahtv ahtvVar = ahtv.this;
                ahtvVar.a.G(aoquVar, aoobVar, view);
            }
        });
        I();
    }

    @Override // defpackage.acti
    public final void H(final int i, final acum acumVar, final asjj asjjVar) {
        L(new Runnable() { // from class: ahtn
            @Override // java.lang.Runnable
            public final void run() {
                ahtv ahtvVar = ahtv.this;
                ahtvVar.a.H(i, acumVar, asjjVar);
            }
        });
        I();
    }

    public final void I() {
        if (ylr.e()) {
            J();
            return;
        }
        Log.e(e, "Tried to perform interaction logging outside of application's main thread");
        this.g.execute(new ahtr(this));
    }

    public final void J() {
        if (this.d.a(this.f)) {
            for (Runnable runnable : this.b) {
                runnable.run();
            }
            this.b.clear();
            for (Runnable runnable2 : this.c) {
                runnable2.run();
            }
            this.c.clear();
        }
    }

    @Override // defpackage.acti
    public final actg a() {
        return null;
    }

    @Override // defpackage.acti
    public final acti b(acul aculVar) {
        return this.a.b(aculVar);
    }

    @Override // defpackage.acti, defpackage.actz
    public final InteractionLoggingScreen c() {
        return this.a.c();
    }

    @Override // defpackage.acti
    public final InteractionLoggingScreen d(acup acupVar, apzg apzgVar, asjj asjjVar) {
        return this.a.d(acupVar, apzgVar, asjjVar);
    }

    @Override // defpackage.acti
    public final InteractionLoggingScreen e(acup acupVar, acuc acucVar, apzg apzgVar, asjj asjjVar, asjj asjjVar2) {
        return this.a.e(acupVar, acucVar, apzgVar, asjjVar, asjjVar2);
    }

    @Override // defpackage.acti
    public final apzg f(apzg apzgVar) {
        return this.a.f(apzgVar);
    }

    @Override // defpackage.acti
    public final awbs g(Object obj, actj actjVar) {
        return this.a.g(obj, actjVar);
    }

    @Override // defpackage.acti
    public final awbs h(Object obj, acup acupVar) {
        return this.a.h(obj, acupVar);
    }

    @Override // defpackage.acti
    public final awbs i(Object obj, actj actjVar, int i) {
        return this.a.i(obj, actjVar, i);
    }

    @Override // defpackage.acti
    public final awbs j(Object obj, acup acupVar, int i) {
        return this.a.j(obj, acupVar, i);
    }

    @Override // defpackage.acti
    public final String k() {
        return this.a.k();
    }

    @Override // defpackage.acti
    public final void l(Object obj, acup acupVar, int i) {
    }

    @Override // defpackage.acti
    public final void m(final List list) {
        K(new Runnable() { // from class: ahtq
            @Override // java.lang.Runnable
            public final void run() {
                ahtv ahtvVar = ahtv.this;
                ahtvVar.a.m(list);
            }
        });
        I();
    }

    @Override // defpackage.acti
    public final void n(acum acumVar) {
        K(new ahts(this, acumVar));
        I();
    }

    @Override // defpackage.acti
    public final void o(acum acumVar, acum acumVar2) {
        K(new ahtt(this, acumVar, acumVar2));
        I();
    }

    @Override // defpackage.acti
    public final void p(acuc acucVar) {
        this.a.p(acucVar);
    }

    @Override // defpackage.acti
    public final void q(acum acumVar, asjj asjjVar) {
        L(new ahtu(this, acumVar, asjjVar, 1));
        I();
    }

    @Override // defpackage.acti
    public final void r(String str) {
        this.a.r(str);
    }

    @Override // defpackage.acti
    public final void s(acum acumVar, String str) {
        this.a.s(acumVar, str);
    }

    @Override // defpackage.acti
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.acti
    public final void u(acum acumVar, asjj asjjVar) {
        L(new ahtu(this, acumVar, asjjVar));
        I();
    }

    @Override // defpackage.acti
    public final void v(final aoqu aoquVar, final aoob aoobVar, final asjj asjjVar) {
        L(new Runnable() { // from class: ahtl
            @Override // java.lang.Runnable
            public final void run() {
                ahtv ahtvVar = ahtv.this;
                ahtvVar.a.v(aoquVar, aoobVar, asjjVar);
            }
        });
        I();
    }

    @Override // defpackage.acti
    public final void w(acum acumVar, asjj asjjVar) {
        L(new ahtu(this, acumVar, asjjVar, 2));
        I();
    }

    @Override // defpackage.acti
    public final void x(final String str, final acum acumVar, final asjj asjjVar) {
        L(new Runnable() { // from class: ahtp
            @Override // java.lang.Runnable
            public final void run() {
                ahtv ahtvVar = ahtv.this;
                ahtvVar.a.x(str, acumVar, asjjVar);
            }
        });
        I();
    }

    @Override // defpackage.acti
    public final void y() {
        if (ylr.e()) {
            C();
        } else {
            this.g.execute(new ahtr(this, 1));
        }
    }

    @Override // defpackage.acti
    public final void z(acuc acucVar, InteractionLoggingScreen interactionLoggingScreen) {
        this.a.z(acucVar, interactionLoggingScreen);
    }
}
