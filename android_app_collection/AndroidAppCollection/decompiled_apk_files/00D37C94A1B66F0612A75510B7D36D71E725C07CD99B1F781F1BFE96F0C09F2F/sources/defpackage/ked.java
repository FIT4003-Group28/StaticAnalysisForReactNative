package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ked  reason: default package */
/* loaded from: classes3.dex */
public final class ked {
    public final kec a;
    private final TextView b;
    private final fev c;
    private final kej d;
    private boolean e = false;
    private int f;
    private ControlsState g;
    private boolean h;
    private boolean i;

    public ked(Context context, fev fevVar, kej kejVar, ProgressBar progressBar, TextView textView) {
        this.b = textView;
        this.c = fevVar;
        this.d = kejVar;
        this.a = new kec(progressBar);
        Resources resources = context.getResources();
        tpj tpjVar = new tpj(-1.0f, resources.getDimensionPixelSize(R.dimen.inline_muted_buffering_progress_thickness), resources.getDimensionPixelSize(R.dimen.buffering_progress_inset), new int[]{resources.getColor(R.color.buffering_progress_color)});
        tpjVar.setAlpha(resources.getInteger(R.integer.buffering_progress_transparency));
        progressBar.setIndeterminateDrawable(tpjVar);
        this.f = 0;
    }

    private final void g(int i, int i2) {
        if ((i & 4) != 0) {
            kec kecVar = this.a;
            if (!kecVar.b) {
                kecVar.b = true;
                kecVar.a.setVisibility(0);
            }
        }
        if ((i2 & 4) != 0) {
            kec kecVar2 = this.a;
            kecVar2.b = false;
            kecVar2.a.setVisibility(8);
        }
        if ((i & 1) != 0) {
            this.c.nX(true);
        }
        if ((i2 & 1) != 0) {
            this.c.nT(false);
        }
        if ((i & 2) != 0) {
            this.d.f(false);
        }
        if ((i2 & 2) != 0) {
            this.d.a(false);
        }
    }

    public final void a() {
        b();
        this.f = 0;
        this.g = ControlsState.b();
        h();
    }

    public final void b() {
        this.c.oa();
    }

    public final void c(kea keaVar) {
        this.f = keaVar.a;
        ggt ggtVar = keaVar.c;
        this.i = ((Boolean) (ggtVar == null ? amon.a : ampq.j(ggtVar.a().b)).b(jvb.h).e(false)).booleanValue();
        this.g = keaVar.b;
        this.e = ((Boolean) keaVar.d().b(jvb.g).e(false)).booleanValue();
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r8 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.arag r7, java.util.List r8) {
        /*
            r6 = this;
            avhe r0 = defpackage.hqs.l(r8)
            r1 = 2
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L35
            int r7 = r0.b
            r7 = r7 & 8
            if (r7 == 0) goto L1e
            int r7 = r0.f
            int r7 = defpackage.awwc.av(r7)
            if (r7 != 0) goto L18
            goto L1b
        L18:
            if (r7 == r3) goto L1b
            goto L1e
        L1b:
            r6.h = r3
            return
        L1e:
            android.widget.TextView r7 = r6.b
            defpackage.hqs.o(r7, r0)
            int r7 = r0.e
            int r7 = defpackage.awwc.au(r7)
            if (r7 != 0) goto L2c
            r7 = 1
        L2c:
            int r8 = r0.f
            int r8 = defpackage.awwc.av(r8)
            if (r8 != 0) goto L4a
            goto L49
        L35:
            android.widget.TextView r0 = r6.b
            android.text.Spanned r4 = defpackage.ajgl.b(r7)
            java.lang.CharSequence r7 = defpackage.ajgl.i(r7)
            r5 = 0
            boolean r7 = defpackage.hqs.n(r0, r4, r7, r8, r5)
            if (r3 == r7) goto L48
            r7 = 2
            goto L49
        L48:
            r7 = 3
        L49:
            r8 = 1
        L4a:
            r0 = 0
            r6.h = r0
            ahzb r4 = defpackage.ahzb.NEW
            int r7 = r7 + (-1)
            if (r7 == r1) goto L6c
            if (r7 == r2) goto L6c
            r7 = 5
            if (r8 != r7) goto L64
            kej r7 = r6.d
            android.widget.TextView r8 = r6.b
            java.lang.CharSequence r8 = r8.getText()
            r7.h(r8)
            return
        L64:
            kej r7 = r6.d
            r7.a = r0
            r7.d(r3)
            return
        L6c:
            kej r7 = r6.d
            android.widget.TextView r8 = r6.b
            java.lang.CharSequence r8 = r8.getText()
            r7.h(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ked.d(arag, java.util.List):void");
    }

    public final void e(ControlsOverlayStyle controlsOverlayStyle) {
        this.c.i(controlsOverlayStyle);
    }

    public final void f(long j, long j2, long j3, long j4) {
        this.c.nS(j, j2, j3, j4);
    }

    private final void h() {
        boolean z = this.g.a == ahzb.PLAYING && !this.g.b;
        if (this.h) {
            if (this.f != 3 || !z) {
                g(4, 1);
                return;
            } else {
                g(0, 5);
                return;
            }
        }
        int i = this.f;
        if (i == 0) {
            g(0, 7);
        } else if (i == 2) {
            ControlsState controlsState = this.g;
            if (this.e) {
                int ordinal = controlsState.a.ordinal();
                if (ordinal == 0) {
                    g(2, 0);
                    return;
                } else if ((ordinal != 1 && ordinal != 2) || !controlsState.b) {
                    return;
                } else {
                    g(4, 0);
                    return;
                }
            }
            g(6, 0);
        } else if (i != 3) {
        } else {
            ControlsState controlsState2 = this.g;
            ahzb ahzbVar = controlsState2.a;
            ahzb ahzbVar2 = ahzb.PAUSED;
            ahzb ahzbVar3 = controlsState2.a;
            ahzb ahzbVar4 = ahzb.PLAYING;
            boolean z2 = ahzbVar3 == ahzbVar4 && controlsState2.b;
            boolean z3 = ahzbVar3 == ahzbVar4 && !controlsState2.b;
            if (this.e) {
                if (z2) {
                    g(4, 0);
                } else if (z3) {
                    g((this.i ? 1 : 0) | 2, 4);
                } else if (ahzbVar != ahzbVar2) {
                } else {
                    g(2, 5);
                }
            } else if (z2) {
                g(6, 0);
            } else if (z3) {
                g((this.i ? 1 : 0) | 2, 4);
            } else if (ahzbVar != ahzbVar2) {
            } else {
                g(2, 1);
            }
        }
    }
}
