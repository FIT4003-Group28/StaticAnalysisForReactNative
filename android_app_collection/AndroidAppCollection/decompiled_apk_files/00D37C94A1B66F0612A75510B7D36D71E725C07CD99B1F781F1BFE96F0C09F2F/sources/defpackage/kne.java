package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.ui.PlayerView;
/* compiled from: PG */
/* renamed from: kne  reason: default package */
/* loaded from: classes3.dex */
public final class kne implements knh, kbk {
    public final ezh a;
    public final aizb b;
    public final PlayerView c;
    public final gca d;
    public final fdo e;
    public final aiza f;
    public final View.OnLayoutChangeListener g;
    public final ezg h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public aynx m;
    public ayny n;
    private final avch o;
    private final avce p;
    private final kbl q;
    private boolean r;

    public kne(ezh ezhVar, aizb aizbVar, jvo jvoVar, gca gcaVar, fdo fdoVar, kbl kblVar, avch avchVar) {
        this.o = avchVar;
        avcj avcjVar = avchVar.g;
        this.p = (avce) (avcjVar == null ? avcj.a : avcjVar).qm(avce.b);
        this.a = ezhVar;
        this.b = aizbVar;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((jwi) jvoVar.get()).aT;
        youTubePlayerViewNotForReflection.getClass();
        this.c = youTubePlayerViewNotForReflection;
        this.d = gcaVar;
        this.e = fdoVar;
        this.q = kblVar;
        this.f = new knb(this);
        this.g = new knd(this);
        this.h = new knc(this);
    }

    @Override // defpackage.knh
    public final aynx a() {
        if (this.m == null) {
            this.m = aynx.k(new aynz() { // from class: kmz
                @Override // defpackage.aynz
                public final void a(ayny aynyVar) {
                    final kne kneVar = kne.this;
                    kneVar.n = aynyVar;
                    kneVar.a.i(kneVar.h);
                    kneVar.b.a(kneVar.f);
                    kneVar.c.addOnLayoutChangeListener(kneVar.g);
                    kneVar.i = elk.k(kneVar.d.a());
                    kneVar.j = kneVar.b.d();
                    kneVar.k = kneVar.a.g().b();
                    kneVar.l = ggs.f(kneVar.e.a(), 1.0f);
                    kneVar.d();
                    aynyVar.d(banl.n(new aypv() { // from class: kna
                        @Override // defpackage.aypv
                        public final void a() {
                            kne kneVar2 = kne.this;
                            kneVar2.a.j(kneVar2.h);
                            kneVar2.b.c(kneVar2.f);
                            kneVar2.c.removeOnLayoutChangeListener(kneVar2.g);
                            kneVar2.m = null;
                            kneVar2.n = null;
                        }
                    }));
                }
            }, aynq.BUFFER);
        }
        return this.m;
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (this.r) {
            this.r = false;
            d();
        }
    }

    @Override // defpackage.knh
    public final void c() {
        this.q.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r4 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r6 = this;
            ayny r0 = r6.n
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            fdo r2 = r6.e
            float r2 = r2.a()
            boolean r1 = defpackage.ggs.g(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
        L14:
            r2 = 0
            goto L34
        L16:
            boolean r1 = r6.l
            if (r1 != 0) goto L23
            boolean r1 = r6.j
            boolean r4 = r6.i
            r1 = r1 ^ r4
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            avce r4 = r6.p
            boolean r4 = r4.c
            boolean r5 = r6.k
            if (r5 == 0) goto L14
            if (r1 == 0) goto L14
            boolean r1 = r6.r
            if (r1 != 0) goto L34
            if (r4 == 0) goto L14
        L34:
            avch r1 = r6.o
            kmn r1 = defpackage.kmn.b(r2, r1)
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kne.d():void");
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
        if (!this.r) {
            this.r = true;
            d();
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
