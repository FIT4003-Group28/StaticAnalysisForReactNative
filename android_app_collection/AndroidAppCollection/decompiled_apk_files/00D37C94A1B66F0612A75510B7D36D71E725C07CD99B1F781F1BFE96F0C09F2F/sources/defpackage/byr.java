package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
/* compiled from: PG */
/* renamed from: byr  reason: default package */
/* loaded from: classes2.dex */
public final class byr extends byb {
    private final cbd c;
    private final String d;
    private final boolean e;
    private final byy f;
    private byy g;

    public byr(bxn bxnVar, cbd cbdVar, cba cbaVar) {
        super(bxnVar, cbdVar, lf.g(cbaVar.i), lf.e(cbaVar.j), cbaVar.g, cbaVar.e, cbaVar.f, cbaVar.c, cbaVar.b);
        this.c = cbdVar;
        this.d = cbaVar.a;
        this.e = cbaVar.h;
        byy a = cbaVar.d.a();
        this.f = a;
        a.g(this);
        cbdVar.h(a);
    }

    @Override // defpackage.byb, defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        super.a(obj, cdjVar);
        if (obj == bxs.b) {
            this.f.d = cdjVar;
        } else if (obj != bxs.E) {
        } else {
            byy byyVar = this.g;
            if (byyVar != null) {
                this.c.j(byyVar);
            }
            bzn bznVar = new bzn(cdjVar);
            this.g = bznVar;
            bznVar.g(this);
            this.c.h(this.f);
        }
    }

    @Override // defpackage.byb, defpackage.bye
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((byz) this.f).k());
        byy byyVar = this.g;
        if (byyVar != null) {
            this.b.setColorFilter((ColorFilter) byyVar.e());
        }
        super.b(canvas, matrix, i);
    }

    @Override // defpackage.byc
    public final String g() {
        return this.d;
    }
}
