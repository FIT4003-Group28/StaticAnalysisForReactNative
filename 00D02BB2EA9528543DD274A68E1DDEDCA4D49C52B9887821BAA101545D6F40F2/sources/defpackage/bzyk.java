package defpackage;

import android.accounts.Account;
import android.app.Application;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: bzyk  reason: default package */
/* loaded from: classes4.dex */
public final class bzyk {
    public final x<cqeo> a;
    private final Application b;
    private final dgyd c;
    private final z<cqeo> d;
    private btlu e;

    public bzyk(final Application application, dgyd dgydVar) {
        final x<cqeo> xVar = new x<>();
        this.a = xVar;
        z<cqeo> zVar = new z<>();
        this.d = zVar;
        this.b = application;
        this.c = dgydVar;
        xVar.m(zVar, new aa(xVar) { // from class: bzye
            private final x a;

            {
                this.a = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.g((cqeo) obj);
            }
        });
        cqdk.c = new cqdi(application) { // from class: bzyg
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.cqdi
            public final dyhi a(String str, int i) {
                return dyjw.a(str, i, new ExperimentalCronetEngine.Builder(this.a).mo32build()).c();
            }
        };
    }

    public final void a(btlu btluVar) {
        this.e = btluVar;
        cqdk cqdkVar = new cqdk();
        Application application = this.b;
        btlu btluVar2 = this.e;
        dbsk.s(btluVar2);
        Account s = btluVar2.s();
        dgyd dgydVar = this.c;
        final z<cqeo> zVar = this.d;
        zVar.getClass();
        cqdkVar.a(application, s, dgydVar, new cqdj(zVar) { // from class: bzyh
            private final z a;

            {
                this.a = zVar;
            }

            @Override // defpackage.cqdj
            public final void a(cqeo cqeoVar) {
                this.a.g(cqeoVar);
            }
        });
    }

    public final void b(gga ggaVar) {
        btlu btluVar = this.e;
        dbsk.s(btluVar);
        dgyd dgydVar = this.c;
        bzyj bzyjVar = new bzyj();
        bzyjVar.aM(btluVar.s(), dgydVar);
        ggaVar.C(bzyjVar, gfu.DIALOG_FRAGMENT, new gfs[0]);
        final x<cqeo> xVar = this.a;
        z<cqeo> zVar = ((bzyi) av.a(bzyjVar).a(bzyi.class)).d;
        xVar.getClass();
        xVar.m(zVar, new aa(xVar) { // from class: bzyf
            private final x a;

            {
                this.a = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.g((cqeo) obj);
            }
        });
    }
}
