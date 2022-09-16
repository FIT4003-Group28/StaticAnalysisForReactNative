package defpackage;

import android.graphics.Color;
import android.graphics.Rect;
import java.util.List;
/* compiled from: PG */
/* renamed from: nxn  reason: default package */
/* loaded from: classes3.dex */
public final class nxn extends nwq {
    public final List a;
    public final nxl b;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private ampq n;
    private float o;
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    public float c = Float.NaN;

    public nxn(List list, nxl nxlVar) {
        this.a = list;
        this.b = nxlVar;
    }

    private final void c() {
        int i;
        float f = this.c;
        int i2 = 1;
        while (true) {
            if (i2 >= this.a.size()) {
                i = 0;
                break;
            } else if (f <= ((nxm) this.a.get(i2)).b) {
                i = i2 - 1;
                break;
            } else {
                i2++;
            }
        }
        nxm nxmVar = (nxm) this.a.get(i);
        nxm nxmVar2 = (nxm) this.a.get(i + 1);
        nxe nxeVar = nxmVar.a;
        nxe nxeVar2 = nxmVar2.a;
        float f2 = this.c;
        float f3 = nxmVar.b;
        float f4 = (f2 - f3) / (nxmVar2.b - f3);
        ezv.o(this.d, nxeVar.v(), nxeVar2.v(), f4);
        ezv.o(this.e, nxeVar.t(), nxeVar2.t(), f4);
        ezv.o(this.f, nxeVar.r(), nxeVar2.r(), f4);
        ezv.o(this.g, nxeVar.s(), nxeVar2.s(), f4);
        ezv.o(this.h, nxeVar.u(), nxeVar2.u(), f4);
        float o = nxeVar.o();
        this.i = o + ((nxeVar2.o() - o) * f4);
        float l = nxeVar.l();
        this.j = l + ((nxeVar2.l() - l) * f4);
        float m = nxeVar.m();
        this.k = m + ((nxeVar2.m() - m) * f4);
        float n = nxeVar.n();
        this.l = n + ((nxeVar2.n() - n) * f4);
        float q = nxeVar.q();
        this.o = q + ((nxeVar2.q() - q) * f4);
        float p = nxeVar.p();
        this.m = p + ((nxeVar2.p() - p) * f4);
        if (nxeVar.I().h() && nxeVar2.I().h()) {
            int intValue = ((Integer) nxeVar.I().c()).intValue();
            int intValue2 = ((Integer) nxeVar2.I().c()).intValue();
            int j = ezv.j(Color.red(intValue), Color.red(intValue2), f4);
            this.n = ampq.j(Integer.valueOf(Color.argb(ezv.j(Color.alpha(intValue), Color.alpha(intValue2), f4), j, j, j)));
        } else {
            this.n = amon.a;
        }
        J();
    }

    @Override // defpackage.nwq, defpackage.nxe
    public final ampq I() {
        return this.n;
    }

    public final void a(float f) {
        if (this.c == f) {
            return;
        }
        this.c = f;
        c();
    }

    public final void b() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                int i2 = (size - i) - 1;
                this.a.add(i, (nxm) this.a.remove(i2));
                this.a.add(i2, (nxm) this.a.remove(i));
            }
            ((nxm) this.a.get(i)).b = 1.0f - ((nxm) this.a.get(i)).b;
        }
        float f = this.c;
        if (f != Float.NaN) {
            this.c = 1.0f - f;
        }
    }

    @Override // defpackage.nxe
    public final float l() {
        return this.j;
    }

    @Override // defpackage.nxe
    public final float m() {
        return this.k;
    }

    @Override // defpackage.nxe
    public final float n() {
        return this.l;
    }

    @Override // defpackage.nxe
    public final float o() {
        return this.i;
    }

    @Override // defpackage.nxe
    public final float p() {
        return this.m;
    }

    @Override // defpackage.nxe
    public final float q() {
        return this.o;
    }

    @Override // defpackage.nxe
    public final Rect r() {
        return this.f;
    }

    @Override // defpackage.nxe
    public final Rect s() {
        return this.g;
    }

    @Override // defpackage.nxe
    public final Rect t() {
        return this.e;
    }

    @Override // defpackage.nxe
    public final Rect u() {
        return this.h;
    }

    @Override // defpackage.nxe
    public final Rect v() {
        return this.d;
    }

    @Override // defpackage.nxe
    public final void x() {
        for (nxm nxmVar : this.a) {
            nxmVar.a.x();
        }
    }

    @Override // defpackage.nxe
    public final void y() {
        for (nxm nxmVar : this.a) {
            nxmVar.a.y();
        }
    }

    @Override // defpackage.nxe
    public final void z(int i, int i2) {
        for (nxm nxmVar : this.a) {
            nxmVar.a.z(i, i2);
        }
        c();
    }
}
