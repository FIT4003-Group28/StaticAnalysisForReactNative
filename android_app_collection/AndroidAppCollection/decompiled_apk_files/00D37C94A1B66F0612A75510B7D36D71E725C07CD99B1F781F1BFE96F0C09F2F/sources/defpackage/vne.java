package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vne  reason: default package */
/* loaded from: classes4.dex */
public final class vne {
    public final String a;
    public final vnf b;
    public final amfb c;
    public final amlc e;
    private final ankt g;
    private final anju h;
    private final amfb i = new amfb(new vnb(this), anjk.a);
    public final Object d = new Object();
    public List f = new ArrayList();

    public vne(vnf vnfVar, ankt anktVar, boolean z, boolean z2) {
        this.b = vnfVar;
        this.g = anktVar;
        this.a = vnfVar.g();
        this.c = new amfb(vnfVar.a(), anjk.a);
        if (z2) {
            this.e = amlc.d();
        } else {
            this.e = amlc.c();
        }
        c(new vmx(this));
        this.h = z ? anju.a() : null;
    }

    public final ankt a() {
        return d(null);
    }

    public final ankt b(ampg ampgVar, final Executor executor) {
        ankt b;
        final anir c = ammo.c(new yvb(ampgVar, 1));
        amlc amlcVar = this.e;
        String valueOf = String.valueOf(this.a);
        amlp b2 = amlcVar.b(valueOf.length() != 0 ? "Update ".concat(valueOf) : new String("Update "));
        try {
            final ankt c2 = this.i.c();
            anju anjuVar = this.h;
            if (anjuVar != null) {
                anjuVar.b(new zcc(c2, 1), anjk.a);
                b = this.h.b(ammo.b(new aniq() { // from class: vmw
                    @Override // defpackage.aniq
                    public final ankt a() {
                        return anii.i(c2, ammo.c(new vmz(vne.this, c, executor)), anjk.a);
                    }
                }), anjk.a);
                b.getClass();
                if (!c2.isDone()) {
                    if (b.isDone()) {
                        anlz.B(b, c2);
                    } else {
                        ankf ankfVar = new ankf(b, c2);
                        b.qY(ankfVar, anjk.a);
                        c2.qY(ankfVar, anjk.a);
                    }
                }
            } else {
                b = anii.i(c2, ammo.c(new vmz(this, c, executor, 1)), anjk.a);
            }
            anlz.r(this.g);
            b2.a(b);
            b2.close();
            return b;
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void c(anir anirVar) {
        synchronized (this.d) {
            this.f.add(anirVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt d(final vwl vwlVar) {
        ankt i;
        this.e.a();
        if (this.i.e()) {
            i = this.b.k(vwlVar);
        } else {
            amlc amlcVar = this.e;
            String valueOf = String.valueOf(this.a);
            amlp b = amlcVar.b(valueOf.length() != 0 ? "Get ".concat(valueOf) : new String("Get "));
            try {
                i = anii.i(this.i.c(), ammo.c(new anir(vwlVar, null) { // from class: vmy
                    public final /* synthetic */ vwl b;

                    @Override // defpackage.anir
                    public final ankt a(Object obj) {
                        vne vneVar = vne.this;
                        return vneVar.b.k(this.b);
                    }
                }), anjk.a);
                b.a(i);
                b.close();
            } catch (Throwable th) {
                try {
                    b.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        anlz.r(this.g);
        return anlz.r(i);
    }
}
