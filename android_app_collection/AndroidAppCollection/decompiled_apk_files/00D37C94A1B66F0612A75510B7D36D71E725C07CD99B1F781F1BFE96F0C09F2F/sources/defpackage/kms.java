package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: kms  reason: default package */
/* loaded from: classes3.dex */
public final class kms implements knh, kbk {
    public final airw a;
    public final aypf b = new aypf();
    public ayny c;
    public aynx d;
    public boolean e;
    public boolean f;
    private final avch g;
    private final avcf h;
    private final ayor i;
    private final kbl j;
    private boolean k;
    private boolean l;
    private boolean m;
    private aypg n;

    public kms(airw airwVar, kbl kblVar, ayor ayorVar, avch avchVar) {
        this.a = airwVar;
        this.j = kblVar;
        this.g = avchVar;
        this.i = ayorVar;
        avcj avcjVar = avchVar.g;
        this.h = (avcf) (avcjVar == null ? avcj.a : avcjVar).qm(avcf.b);
    }

    private final void s() {
        aypg aypgVar = this.n;
        if (aypgVar == null) {
            return;
        }
        azof.f((AtomicReference) aypgVar);
        this.e = true;
    }

    @Override // defpackage.knh
    public final aynx a() {
        if (this.d == null) {
            this.d = aynx.k(new aynz() { // from class: kmp
                @Override // defpackage.aynz
                public final void a(ayny aynyVar) {
                    final kms kmsVar = kms.this;
                    kmsVar.c = aynyVar;
                    kmsVar.b.d(kmsVar.a.ao().I().G(aypa.a()).aa(new kmr(kmsVar, 1), kjt.e));
                    kmsVar.d();
                    aynyVar.d(banl.n(new aypv() { // from class: kmq
                        @Override // defpackage.aypv
                        public final void a() {
                            kms kmsVar2 = kms.this;
                            kmsVar2.b.c();
                            kmsVar2.d = null;
                            kmsVar2.c = null;
                        }
                    }));
                }
            }, aynq.BUFFER);
        }
        return this.d;
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (this.k) {
            this.k = false;
            d();
        }
    }

    @Override // defpackage.knh
    public final void c() {
        this.j.a(this);
    }

    public final void d() {
        ayny aynyVar = this.c;
        if (aynyVar == null) {
            return;
        }
        boolean z = this.h.d;
        int i = 1;
        boolean z2 = (!z && !this.e) || this.k;
        if (!this.m) {
            this.m = z2;
        }
        avch avchVar = this.g;
        if (z || this.e) {
            i = 0;
        } else if (!this.k) {
            i = 2;
        }
        aynyVar.a(kmn.c(z2, avchVar, i));
    }

    public final void e() {
        avcf avcfVar = this.h;
        if (avcfVar.d || this.e || !this.f || this.l) {
            return;
        }
        aypg aa = aynx.T(avcfVar.c, TimeUnit.MILLISECONDS, this.i).aa(new kmr(this), kjt.e);
        this.n = aa;
        this.b.d(aa);
    }

    @Override // defpackage.kbk
    public final void i(ControlsOverlayStyle controlsOverlayStyle) {
        if (this.l == ControlsOverlayStyle.a(controlsOverlayStyle)) {
            return;
        }
        boolean a = ControlsOverlayStyle.a(controlsOverlayStyle);
        this.l = a;
        if (!this.m || !a) {
            e();
            return;
        }
        s();
        d();
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void j(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void k(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void l(ezx ezxVar) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void m(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void nG(zbb zbbVar) {
    }

    @Override // defpackage.kbk
    public final void nL(boolean z) {
        if (!this.k) {
            this.k = true;
            d();
            if (!this.m) {
                return;
            }
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
}
