package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: axqo  reason: default package */
/* loaded from: classes3.dex */
public class axqo implements axot {
    public final axgi a;
    public final List<axos> b = new ArrayList();
    public final axqa c;
    private final axqi d;

    public axqo(axqi axqiVar, final axgi axgiVar) {
        this.d = axqiVar;
        this.a = axgiVar;
        axgh h = axgiVar.e.h();
        dbsk.s(h);
        boolean z = true;
        if (h.a() != axgg.PARTIALLY_LOADED) {
            axgh h2 = axgiVar.e.h();
            dbsk.s(h2);
            if (h2.a() != axgg.SUBSEQUENT_LOAD_ERROR) {
                z = false;
            }
        }
        this.c = new axqa(z, new Runnable(axgiVar) { // from class: axqk
            private final axgi a;

            {
                this.a = axgiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d(axok.REQUESTS);
            }
        });
    }

    public axqj a(dqae dqaeVar) {
        axqi axqiVar = this.d;
        axoi a = axqiVar.a.a();
        dbsk.s(a);
        dzsj<gga> dzsjVar = axqiVar.b;
        Executor a2 = axqiVar.c.a();
        dbsk.s(a2);
        dbsk.s(axqiVar.d.a());
        dbsk.s(dqaeVar);
        axhs a3 = axqiVar.e.a();
        dbsk.s(a3);
        axqj axqjVar = new axqj(a, dzsjVar, a2, dqaeVar, this, a3);
        axqjVar.c = axqjVar.b.h(axqjVar);
        return axqjVar;
    }

    @Override // defpackage.axot
    public List<axos> b() {
        return this.b;
    }

    @Override // defpackage.axot
    public Boolean c() {
        return false;
    }

    @Override // defpackage.axot
    public String d() {
        return "";
    }

    @Override // defpackage.axot
    public axor e() {
        return null;
    }

    @Override // defpackage.axot
    public cqqw f() {
        return this.c;
    }

    @Override // defpackage.axot
    public Boolean g() {
        axgh h = this.a.e.h();
        dbsk.s(h);
        return Boolean.valueOf(h.a() == axgg.SUBSEQUENT_LOAD_IN_PROGRESS);
    }

    @Override // defpackage.axot
    public jht h(axos axosVar) {
        return null;
    }

    @Override // defpackage.axot
    public cjtd i() {
        return cjtd.a(dtxy.N);
    }
}
