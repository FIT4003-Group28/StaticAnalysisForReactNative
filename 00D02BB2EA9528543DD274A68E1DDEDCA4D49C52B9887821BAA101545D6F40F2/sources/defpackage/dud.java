package defpackage;

import com.google.ar.core.Frame;
/* compiled from: PG */
/* renamed from: dud  reason: default package */
/* loaded from: classes6.dex */
public final class dud implements dtv {
    @dzsi
    public dtu a;
    private final dgb b;
    @dzsi
    private dua h;
    private final bnvs c = new bnvs();
    private final bnvs d = new bnvs();
    private final bnvs e = new bnvs();
    private final bnvs f = new bnvs();
    private final akse g = new akse();
    private boolean i = false;
    private boolean j = false;

    public dud(dgb dgbVar) {
        this.b = dgbVar;
    }

    private final void b() {
        dgb dgbVar = this.b;
        boolean z = false;
        if (this.i && this.j) {
            z = true;
        }
        dgbVar.b(z);
    }

    public final void a(boolean z) {
        this.i = z;
        b();
    }

    @Override // defpackage.dtv
    public final void e(dua duaVar) {
        this.h = duaVar;
    }

    @Override // defpackage.dtv
    public final void f() {
        this.h = null;
        this.j = false;
        this.i = false;
        this.b.a();
    }

    @Override // defpackage.dtv
    public final void g(Frame frame, @dzsi dad dadVar, dfgv dfgvVar, float f) {
        dfgu b = dfgu.b(dfgvVar.b);
        if (b == null) {
            b = dfgu.NONE;
        }
        this.j = b == dfgu.LOCALIZED;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    @Override // defpackage.dtv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(float r12) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dud.h(float):void");
    }
}
