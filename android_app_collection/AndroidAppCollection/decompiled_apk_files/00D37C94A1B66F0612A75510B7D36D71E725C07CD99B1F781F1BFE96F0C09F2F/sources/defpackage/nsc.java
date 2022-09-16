package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: nsc  reason: default package */
/* loaded from: classes3.dex */
public final class nsc implements zar {
    final /* synthetic */ nsd a;
    private final boolean b;
    private final boolean c;
    private final amvn d;

    public nsc(nsd nsdVar, boolean z, nmc nmcVar) {
        amvn k;
        this.a = nsdVar;
        this.b = z;
        boolean z2 = false;
        if (nmcVar != null && nmcVar.t()) {
            z2 = true;
        }
        this.c = z2;
        if (nmcVar == null) {
            k = ntp.a;
        } else {
            k = nmcVar.k();
        }
        this.d = k;
    }

    private final int e() {
        if (this.b) {
            return this.a.b.b().top - this.a.b.b().height();
        }
        return this.a.b.b().bottom;
    }

    private final void f(final View view, long j, zaq zaqVar, int i, nsr nsrVar) {
        int a;
        nsd nsdVar = this.a;
        nsr nsrVar2 = nsr.FULL_BLEED;
        int ordinal = nsrVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            a = nsj.a(this.a.b.b().bottom, this.a.b.a(), nsrVar);
        } else if (ordinal == 2) {
            a = e();
        } else {
            String valueOf = String.valueOf(nsrVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
            sb.append("Tried to find end offset for invalid size state: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        }
        aynx c = nsdVar.c(i, a, j, this.a.a(), zaqVar);
        if (this.b) {
            c.V(this.a.b.d(), this.a.b.c(), new img(6)).ap(ayrb.d, new nsa(this, view, 1)).ao(ayrb.d, ayrb.d, new nsa(this, view)).Z(new ayqb() { // from class: nsb
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    nsc nscVar = nsc.this;
                    View view2 = view;
                    view2.setClipBounds((Rect) obj);
                    view2.invalidate();
                    nscVar.a.f.c(true);
                }
            });
        }
        this.a.c.b(nsrVar, c);
    }

    @Override // defpackage.zar
    public final void a(View view, long j, zaq zaqVar) {
        f(view, j, zaqVar, this.a.h, nsr.HIDDEN);
    }

    @Override // defpackage.zar
    public final void b(View view, long j, zaq zaqVar) {
        f(view, j, zaqVar, e(), this.a.d.b(this.c, this.d));
    }

    @Override // defpackage.zar
    public final void c(View view) {
    }

    public final void d(View view) {
        view.setClipBounds(null);
        view.invalidate();
        this.a.f.c(false);
    }
}
