package defpackage;

import android.app.Activity;
import defpackage.dssj;
/* compiled from: PG */
/* renamed from: ceve  reason: default package */
/* loaded from: classes4.dex */
public abstract class ceve<Q extends dssj, S extends dssj> extends cevg<Q, S> implements ceso {
    protected final nvh d;
    protected final ceuo e;

    public ceve(Activity activity, cqhn cqhnVar, ceez<Q, S> ceezVar, nvh nvhVar, ceuo ceuoVar, String str) {
        super(activity, cqhnVar, ceezVar, str);
        this.e = ceuoVar;
        this.d = nvhVar;
    }

    @Override // defpackage.ceso
    public Boolean Rx() {
        return Boolean.valueOf(this.e.a());
    }

    @Override // defpackage.ceso
    public cjyo e() {
        return this.e.c;
    }

    protected abstract nvg j();

    @Override // defpackage.cevg
    public void n() {
        super.n();
        nvg j = j();
        j.j = new cqkq(this) { // from class: cevd
            private final ceve a;

            {
                this.a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.cqkq
            public final void a(Object obj) {
                ceve ceveVar = this.a;
                if (obj == 0) {
                    return;
                }
                ceveVar.e.c = obj;
                cqkx.p(ceveVar);
            }
        };
        ceuo ceuoVar = this.e;
        if (ceuoVar.a != null) {
            return;
        }
        ceuoVar.a = j;
        ceuoVar.b = j.g;
    }

    @Override // defpackage.cevg
    public void o() {
        nvg nvgVar = this.e.a;
        if (nvgVar == null) {
            return;
        }
        nvgVar.f();
    }

    @Override // defpackage.cevg
    public void p() {
        nvg nvgVar = this.e.a;
        if (nvgVar == null) {
            return;
        }
        nvgVar.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean q() {
        return !this.f.i() && (this.e.c.b().booleanValue() || this.e.a());
    }
}
