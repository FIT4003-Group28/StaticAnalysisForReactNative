package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
/* compiled from: PG */
/* renamed from: koa  reason: default package */
/* loaded from: classes3.dex */
public final class koa implements knh, kbk, ynl {
    public final yni a;
    public boolean b;
    public int c;
    public ayny d;
    public aynx e;
    private final avch f;
    private final avci g;
    private final kbl h;
    private boolean i;

    public koa(yni yniVar, kbl kblVar, avch avchVar) {
        this.a = yniVar;
        this.h = kblVar;
        this.f = avchVar;
        avcj avcjVar = avchVar.g;
        this.g = (avci) (avcjVar == null ? avcj.a : avcjVar).qm(avci.b);
    }

    public static int d(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) (d / 1000.0d);
    }

    @Override // defpackage.knh
    public final aynx a() {
        if (this.e == null) {
            this.e = aynx.k(new aynz() { // from class: kny
                @Override // defpackage.aynz
                public final void a(ayny aynyVar) {
                    final koa koaVar = koa.this;
                    koaVar.d = aynyVar;
                    koaVar.a.g(koaVar);
                    aynyVar.d(banl.n(new aypv() { // from class: knz
                        @Override // defpackage.aypv
                        public final void a() {
                            koa koaVar2 = koa.this;
                            koaVar2.a.m(koaVar2);
                            koaVar2.d = null;
                            koaVar2.e = null;
                        }
                    }));
                    koaVar.e();
                }
            }, aynq.BUFFER);
        }
        return this.e;
    }

    @Override // defpackage.kbk
    public final void b(boolean z) {
        if (this.i) {
            this.i = false;
            e();
        }
    }

    @Override // defpackage.knh
    public final void c() {
        this.h.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r7.b == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r4 == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r7 = this;
            ayny r0 = r7.d
            if (r0 == 0) goto L40
            avci r1 = r7.g
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lc
        La:
            r2 = 0
            goto L37
        Lc:
            boolean r4 = r1.f
            boolean r5 = r7.i
            if (r5 != 0) goto L15
            if (r4 != 0) goto L15
            goto La
        L15:
            int r4 = r7.c
            int r1 = r1.c
            long r5 = (long) r1
            int r1 = d(r5)
            if (r4 < r1) goto La
            int r1 = r7.c
            avci r4 = r7.g
            int r4 = r4.d
            long r4 = (long) r4
            int r4 = d(r4)
            if (r1 >= r4) goto La
            avci r1 = r7.g
            boolean r1 = r1.e
            if (r1 == 0) goto L37
            boolean r1 = r7.b
            if (r1 == 0) goto La
        L37:
            avch r1 = r7.f
            kmn r1 = defpackage.kmn.c(r2, r1, r3)
            r0.a(r1)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.koa.e():void");
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

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                int d = d(((ahhx) obj).e());
                if (d == this.c) {
                    return null;
                }
                this.c = d;
                e();
                return null;
            } else if (i == 1) {
                this.b = ((ahia) obj).e();
                e();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahhx.class, ahia.class};
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
        if (!this.i) {
            this.i = true;
            e();
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
