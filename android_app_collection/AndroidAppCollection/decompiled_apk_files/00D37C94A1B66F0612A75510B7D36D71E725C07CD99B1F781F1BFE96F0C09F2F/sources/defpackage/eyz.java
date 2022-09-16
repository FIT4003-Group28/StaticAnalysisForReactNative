package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
/* compiled from: PG */
/* renamed from: eyz  reason: default package */
/* loaded from: classes3.dex */
public abstract class eyz {
    public final snc a;
    public Object b;
    public long c;
    public cff d;
    public afzf e;
    private final azqb f;
    private aapd g;
    private String h;

    /* JADX INFO: Access modifiers changed from: protected */
    public eyz(azqb azqbVar, snc sncVar) {
        azqbVar.getClass();
        this.f = azqbVar;
        sncVar.getClass();
        this.a = sncVar;
        aqxo.p(true);
    }

    private final boolean n() {
        return this.b != null && this.c + 60000 >= this.a.d();
    }

    public final eyy a(final aapd aapdVar) {
        aapdVar.getClass();
        return new eyy(ayos.n(new ayou() { // from class: eyt
            @Override // defpackage.ayou
            public final void a(azkm azkmVar) {
                eyz.this.h(aapdVar, new eyx(azkmVar));
            }
        }).H(new ayqe() { // from class: eyv
            @Override // defpackage.ayqe
            public final Object a(Object obj) {
                final eyz eyzVar = eyz.this;
                Throwable th = (Throwable) obj;
                return eyzVar.c(aapdVar, th).m(new ayqb() { // from class: eyu
                    @Override // defpackage.ayqb
                    public final void a(Object obj2) {
                        Log.e(eyz.this.getClass().getSimpleName(), "Failed to generate fallback response", (Throwable) obj2);
                    }
                }).z().Q(ayos.x(th));
            }
        }).l(), d(aapdVar));
    }

    public final afzf b() {
        afzf afzfVar = this.e;
        this.e = null;
        return afzfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ayoc c(aapd aapdVar, Throwable th) {
        return ayoc.p();
    }

    protected ayoc d(aapd aapdVar) {
        return ayoc.p();
    }

    public final void e(aapd aapdVar) {
        aapdVar.getClass();
        if (!n()) {
            this.b = null;
            this.c = 0L;
        }
        if (m(aapdVar)) {
            return;
        }
        if (this.g != null) {
            j();
        }
        this.g = aapdVar;
        this.h = aapdVar.b();
        i((aars) this.f.get(), this.g, new eyw(this, aapdVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(cff cffVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g(Object obj) {
        throw null;
    }

    public final void h(aapd aapdVar, afzf afzfVar) {
        afzfVar.getClass();
        if (m(aapdVar)) {
            if (n()) {
                afzfVar.lG(this.b);
                j();
                return;
            } else if (this.b != null) {
                i((aars) this.f.get(), aapdVar, afzfVar);
                j();
                return;
            } else {
                if (this.e != afzfVar) {
                    k(new cff(new CancellationException()));
                }
                this.e = afzfVar;
                cff cffVar = this.d;
                if (cffVar == null) {
                    return;
                }
                k(cffVar);
                j();
                return;
            }
        }
        i((aars) this.f.get(), aapdVar, afzfVar);
    }

    protected abstract void i(aars aarsVar, aapd aapdVar, afzf afzfVar);

    public final void j() {
        this.g = null;
        this.h = null;
        this.b = null;
        this.c = 0L;
        k(new cff(new CancellationException()));
        this.d = null;
    }

    public final void k(cff cffVar) {
        afzf b = b();
        if (b != null) {
            b.kV(cffVar);
        }
    }

    @Deprecated
    public final boolean l() {
        return this.g != null;
    }

    public final boolean m(aapd aapdVar) {
        String b = aapdVar.b();
        b.getClass();
        return b.equals(this.h);
    }
}
