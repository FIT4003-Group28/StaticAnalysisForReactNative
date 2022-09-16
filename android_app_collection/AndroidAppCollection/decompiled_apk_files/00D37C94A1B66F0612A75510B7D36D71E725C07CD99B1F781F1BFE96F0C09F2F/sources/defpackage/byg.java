package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: byg  reason: default package */
/* loaded from: classes2.dex */
public final class byg implements bye, byt, byk {
    private final Path a;
    private final Paint b;
    private final cbd c;
    private final String d;
    private final boolean e;
    private final List f;
    private final byy g;
    private final byy h;
    private byy i;
    private final bxn j;

    public byg(bxn bxnVar, cbd cbdVar, cax caxVar) {
        Path path = new Path();
        this.a = path;
        this.b = new bxz(1);
        this.f = new ArrayList();
        this.c = cbdVar;
        this.d = caxVar.b;
        this.e = caxVar.e;
        this.j = bxnVar;
        if (caxVar.c == null) {
            this.g = null;
            this.h = null;
            return;
        }
        path.setFillType(caxVar.a);
        byy a = caxVar.c.a();
        this.g = a;
        a.g(this);
        cbdVar.h(a);
        byy a2 = caxVar.d.a();
        this.h = a2;
        a2.g(this);
        cbdVar.h(a2);
    }

    @Override // defpackage.bzv
    public final void a(Object obj, cdj cdjVar) {
        if (obj == bxs.a) {
            this.g.d = cdjVar;
        } else if (obj == bxs.d) {
            this.h.d = cdjVar;
        } else if (obj != bxs.E) {
        } else {
            byy byyVar = this.i;
            if (byyVar != null) {
                this.c.j(byyVar);
            }
            bzn bznVar = new bzn(cdjVar);
            this.i = bznVar;
            bznVar.g(this);
            this.c.h(this.i);
        }
    }

    @Override // defpackage.bye
    public final void b(Canvas canvas, Matrix matrix, int i) {
        if (this.e) {
            return;
        }
        this.b.setColor(((byz) this.g).k());
        this.b.setAlpha(cdc.k((int) ((((i / 255.0f) * ((Integer) this.h.e()).intValue()) / 100.0f) * 255.0f)));
        byy byyVar = this.i;
        if (byyVar != null) {
            this.b.setColorFilter((ColorFilter) byyVar.e());
        }
        this.a.reset();
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            this.a.addPath(((bym) this.f.get(i2)).i(), matrix);
        }
        canvas.drawPath(this.a, this.b);
        bwr.a();
    }

    @Override // defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(((bym) this.f.get(i)).i(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.byt
    public final void d() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.bzv
    public final void e(bzu bzuVar, int i, List list, bzu bzuVar2) {
        cdc.h(bzuVar, i, list, bzuVar2, this);
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            byc bycVar = (byc) list2.get(i);
            if (bycVar instanceof bym) {
                this.f.add((bym) bycVar);
            }
        }
    }

    @Override // defpackage.byc
    public final String g() {
        return this.d;
    }
}
