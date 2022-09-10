package defpackage;

import defpackage.cgvq;
import defpackage.cgwg;
/* compiled from: PG */
/* renamed from: chbk  reason: default package */
/* loaded from: classes4.dex */
final class chbk<T extends cgwg & cgvq> implements chbj {
    final T a;
    boolean b;
    final /* synthetic */ chbl c;

    public chbk(chbl chblVar, T t) {
        this.c = chblVar;
        this.a = t;
    }

    @Override // defpackage.chbj
    public final cgwg a() {
        return this.a;
    }

    @Override // defpackage.chbj
    public final void b() {
        if (this.b) {
            return;
        }
        this.a.RE(true);
        this.c.R(this.a);
    }

    @Override // defpackage.chbj
    public final void c() {
        this.b = true;
        this.a.u(cgwf.EDITABLE);
        this.a.RE(false);
    }

    @Override // defpackage.chbj
    public final cjtd d() {
        cjta b = cjtd.b();
        b.d = dtyd.aO;
        b.g(this.a.V());
        return b.a();
    }
}
