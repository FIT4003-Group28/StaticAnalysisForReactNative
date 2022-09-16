package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: klz  reason: default package */
/* loaded from: classes3.dex */
public final class klz implements aigm, ahus, aiby, kbk, ynl {
    private static final String i = aakj.f(168, "products_in_video");
    public final kly a;
    public final axnm b;
    public final ajhl c;
    public final acti d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    private final tdb j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public klz(kly klyVar, axnm axnmVar, ajhl ajhlVar, acti actiVar, tdb tdbVar, kbl kblVar) {
        this.a = klyVar;
        this.b = axnmVar;
        this.c = ajhlVar;
        this.d = actiVar;
        this.j = tdbVar;
        zag.o(klyVar, false);
        kblVar.a(this);
    }

    private final void t(boolean z) {
        if (this.o != z) {
            this.o = z;
            c();
        }
    }

    private final void u(boolean z) {
        if (this.k != z) {
            this.k = z;
            s();
        }
    }

    @Override // defpackage.ahus
    public final void a(boolean z) {
        if (this.l != z) {
            this.l = z;
            s();
        }
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        t(false);
    }

    public final void c() {
        if (this.n) {
            aopa createBuilder = auhb.a.createBuilder();
            boolean z = this.o;
            createBuilder.copyOnWrite();
            auhb auhbVar = (auhb) createBuilder.instance;
            auhbVar.b |= 4;
            auhbVar.d = z;
            boolean z2 = this.g;
            createBuilder.copyOnWrite();
            auhb auhbVar2 = (auhb) createBuilder.instance;
            auhbVar2.b |= 8;
            auhbVar2.e = z2;
            int i2 = this.h;
            createBuilder.copyOnWrite();
            auhb auhbVar3 = (auhb) createBuilder.instance;
            auhbVar3.b |= 2;
            auhbVar3.c = i2;
            this.j.b(i, ((auhb) createBuilder.mo39build()).toByteArray());
        }
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
        u(f > 0.0f);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ynl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class[] ky(java.lang.Class r6, java.lang.Object r7, int r8) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klz.ky(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.aigm
    public final void nF(int i2, int i3, int i4) {
        u(i3 == 2);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        t(true);
    }

    @Override // defpackage.aiby
    public final void nt(int i2, long j) {
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        if (this.m != z) {
            this.m = z;
            s();
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nx(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void od(ControlsState controlsState) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void oe(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void og(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }

    public final void s() {
        boolean z = false;
        if (this.e && this.f && !this.k && !this.l && !this.m) {
            z = true;
        }
        if (this.n != z) {
            this.n = z;
            zag.o(this.a, z);
            c();
        }
    }
}
