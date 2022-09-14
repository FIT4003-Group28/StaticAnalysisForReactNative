package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: dap  reason: default package */
/* loaded from: classes5.dex */
public final class dap implements czc {
    public final czt a;
    public final czy b;
    public final dcs c;
    private final dno d;

    public dap(czt cztVar, czy czyVar, dcs dcsVar, dno dnoVar) {
        this.a = cztVar;
        this.b = czyVar;
        this.c = dcsVar;
        this.d = dnoVar;
    }

    @Override // defpackage.czc
    public final czf a() {
        return new czf(this) { // from class: dao
            private final dap a;

            {
                this.a = this;
            }

            @Override // defpackage.czf
            public final cze a(Application application) {
                return this.a.c;
            }
        };
    }

    @Override // defpackage.czc
    public final czt b() {
        return this.a;
    }

    @Override // defpackage.czc
    public final czy c() {
        return this.b;
    }

    @Override // defpackage.czc
    public final void d(gga ggaVar, czo czoVar, czh czhVar) {
        this.d.a(ggaVar, czoVar, czhVar);
    }
}
