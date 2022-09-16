package defpackage;

import android.graphics.Path;
import java.util.List;
/* compiled from: PG */
/* renamed from: byq  reason: default package */
/* loaded from: classes2.dex */
public final class byq implements bym, byt {
    private final boolean b;
    private final bxn c;
    private final byy d;
    private boolean e;
    private final Path a = new Path();
    private final aaoa f = new aaoa();

    public byq(bxn bxnVar, cbd cbdVar, caz cazVar) {
        this.b = cazVar.b;
        this.c = bxnVar;
        byy a = cazVar.a.a();
        this.d = a;
        cbdVar.h(a);
        a.g(this);
    }

    @Override // defpackage.byt
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.byc
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            byc bycVar = (byc) list.get(i);
            if (bycVar instanceof bys) {
                bys bysVar = (bys) bycVar;
                if (bysVar.e == 1) {
                    this.f.b(bysVar);
                    bysVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.byc
    public final String g() {
        throw null;
    }

    @Override // defpackage.bym
    public final Path i() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        this.a.set((Path) this.d.e());
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.f.c(this.a);
        this.e = true;
        return this.a;
    }
}
