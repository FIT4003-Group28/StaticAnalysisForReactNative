package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: kgt  reason: default package */
/* loaded from: classes3.dex */
public final class kgt implements kbk {
    public Optional a = Optional.empty();
    private final kgk b;
    private boolean c;
    private boolean d;

    public kgt(kgk kgkVar) {
        this.b = kgkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1.d < r2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r1.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
        if ((r1.d % r2) == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0024, code lost:
        if (r0 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r5.d = r0
            if (r6 == 0) goto L28
            kgk r1 = r5.b
            boolean r2 = r1.a
            if (r2 == 0) goto Lc
            goto L27
        Lc:
            int r2 = r1.b
            r3 = 1
            if (r2 == 0) goto L1a
            int r4 = r1.d
            if (r4 >= r2) goto L16
        L15:
            r0 = 1
        L16:
            r1.a()
            goto L24
        L1a:
            int r2 = r1.c
            if (r2 == 0) goto L28
            int r4 = r1.d
            int r4 = r4 % r2
            if (r4 != 0) goto L16
            goto L15
        L24:
            if (r0 == 0) goto L27
            goto L28
        L27:
            return
        L28:
            j$.util.Optional r0 = r5.a
            kgs r1 = new kgs
            r1.<init>(r6)
            r0.ifPresent(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kgt.c(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!z || !this.c) {
            c(z);
        } else {
            this.d = true;
        }
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void b(boolean z) {
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
    public final /* synthetic */ void nL(boolean z) {
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
    public final void og(boolean z) {
        if (z == this.c) {
            return;
        }
        this.c = z;
        if (!this.d || z) {
            return;
        }
        c(true);
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kbk
    public final /* synthetic */ void q(boolean z) {
    }
}
