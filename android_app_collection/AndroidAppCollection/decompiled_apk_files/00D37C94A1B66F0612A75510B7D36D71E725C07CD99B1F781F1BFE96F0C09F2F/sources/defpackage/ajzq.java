package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayDeque;
/* compiled from: PG */
/* renamed from: ajzq  reason: default package */
/* loaded from: classes.dex */
public class ajzq extends ajwb {
    public static final ajzn I = new ajzl();

    /* renamed from: J  reason: collision with root package name */
    public final RecyclerView f60J;
    public int K;
    private ajzm L;
    private ajzp M;
    private int N;
    private int O;
    private final ajsa a;
    private final ajzo b;
    private final ajzn c;
    private final boolean d;

    public ajzq(akam akamVar, RecyclerView recyclerView, ajsg ajsgVar, ajyx ajyxVar, aari aariVar, yni yniVar, ajyk ajykVar, yzj yzjVar, acti actiVar, ajsa ajsaVar, akai akaiVar, ajzs ajzsVar, aadd aaddVar, aynx aynxVar) {
        this(akamVar, recyclerView, ajsgVar, ajyxVar, aariVar, yniVar, ajykVar, yzjVar, actiVar, ajsaVar, akaiVar, ajzsVar, I, aaddVar, aynxVar, false, new ArrayDeque());
    }

    private final void n() {
        if (this.f60J.n == null || ((ajsf) this.f).b() <= 0) {
            return;
        }
        this.f60J.ab(0);
    }

    @Override // defpackage.ajwb
    public final void E(Configuration configuration) {
        for (ajyj ajyjVar : this.g) {
            ajyjVar.lC(configuration);
        }
        if (this.N != configuration.smallestScreenWidthDp) {
            this.N = configuration.smallestScreenWidthDp;
            RecyclerView recyclerView = this.f60J;
            xw xwVar = recyclerView.n;
            recyclerView.ag(null);
            this.f60J.g().d();
            this.f60J.ag(xwVar);
        }
        if (!this.d || this.L == null || configuration.orientation == this.O) {
            ((xo) this.f).mr();
        }
        m();
        ajzm ajzmVar = this.L;
        if (ajzmVar != null) {
            RecyclerView recyclerView2 = this.f60J;
            akdg akdgVar = (akdg) ajzmVar;
            if (configuration.orientation != akdgVar.b) {
                akdgVar.c = true;
                akdgVar.b = configuration.orientation;
            }
            if (!akdgVar.a) {
                akdgVar.c(recyclerView2);
            }
        }
        this.O = configuration.orientation;
    }

    @Override // defpackage.ajwb
    protected final void G(Bundle bundle) {
        if (bundle == null) {
            n();
            return;
        }
        int i = bundle.getInt("scroll_position", 0);
        if (i > 0) {
            this.f60J.post(new ajzj(this, i, 1));
        } else {
            n();
        }
    }

    @Override // defpackage.ajwb
    protected final void P(final int i, final int i2) {
        this.f60J.post(new Runnable() { // from class: ajzk
            @Override // java.lang.Runnable
            public final void run() {
                ajzq ajzqVar = ajzq.this;
                int i3 = i;
                int i4 = i2;
                RecyclerView recyclerView = ajzqVar.f60J;
                xw xwVar = recyclerView.n;
                if (xwVar instanceof akak) {
                    ((akak) xwVar).c(recyclerView, i3, i4);
                } else {
                    recyclerView.al(i3);
                }
            }
        });
    }

    @Override // defpackage.ajwb
    public final void T(aakw aakwVar) {
        RecyclerView recyclerView;
        xo xoVar;
        if (R(aakwVar, null, null) && (recyclerView = this.f60J) != null && (xoVar = recyclerView.m) != null) {
            xoVar.mr();
        }
        this.b.f();
    }

    public final void ai() {
        atof atofVar;
        RecyclerView recyclerView = this.f60J;
        if (recyclerView == null || !af(ajfy.NEXT) || !(recyclerView.n instanceof LinearLayoutManager) || (atofVar = (atof) ajna.h(U(ajfy.NEXT), atof.class)) == null || !atofVar.h) {
            return;
        }
        if (atofVar.c != 8 || !((Boolean) atofVar.d).booleanValue()) {
            if (atofVar.c != 9 || recyclerView.n == null) {
                return;
            }
            if (((LinearLayoutManager) recyclerView.n).K() < (((ajsf) this.f).b() - 1) - (atofVar.c == 9 ? ((Integer) atofVar.d).intValue() : 0)) {
                return;
            }
            C();
            return;
        }
        C();
    }

    @Override // defpackage.ajwb
    public void h() {
        super.B(false);
        this.b.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajwb
    public void i() {
        ajsa ajsaVar = this.a;
        if (ajsaVar instanceof ajsd) {
            this.f60J.ah(((ajsd) ajsaVar).g());
        }
        ajzm a = this.c.a(this.f60J, (ajsf) this.f);
        this.L = a;
        if (a != null) {
            a.a(this.f60J);
        } else {
            this.f60J.ad((xo) this.f);
            ((xo) this.f).mr();
        }
        if (this.M == null) {
            this.M = new ajzp(this);
        }
        this.f60J.aE(this.M);
    }

    @Override // defpackage.ajwb, defpackage.ajxh, defpackage.zdx
    public void j() {
        super.j();
        ajzm ajzmVar = this.L;
        if (ajzmVar != null) {
            ajzmVar.b(this.f60J);
            this.L = null;
        }
        ajzp ajzpVar = this.M;
        if (ajzpVar != null) {
            this.f60J.aG(ajzpVar);
        }
        this.f60J.ad(null);
        this.f60J.ah(null);
    }

    @Override // defpackage.ajxh
    protected final /* bridge */ /* synthetic */ void lz(Object obj, ajfy ajfyVar) {
        F((aakw) obj, ajfyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m() {
        this.f60J.post(new ajzj(this, this.K));
    }

    @Override // defpackage.ajwb
    public final Bundle p() {
        Bundle bundle = new Bundle();
        int K = ((LinearLayoutManager) this.f60J.n).K();
        if (this.b.a < K) {
            K = -1;
        }
        bundle.putInt("scroll_position", K);
        return bundle;
    }

    @Override // defpackage.ajwb
    public final /* bridge */ /* synthetic */ View q() {
        return this.f60J;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
        if ((r1 == null ? defpackage.aski.a : r1).i != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ajzq(defpackage.akam r17, android.support.v7.widget.RecyclerView r18, defpackage.ajsg r19, defpackage.ajyx r20, defpackage.aari r21, defpackage.yni r22, defpackage.ajyk r23, defpackage.yzj r24, defpackage.acti r25, defpackage.ajsa r26, defpackage.akai r27, defpackage.ajzs r28, defpackage.ajzn r29, defpackage.aadd r30, defpackage.aynx r31, boolean r32, java.util.Queue r33) {
        /*
            r16 = this;
            r14 = r16
            r15 = r18
            r13 = r25
            r12 = r26
            r11 = r30
            r26.getClass()
            r0 = r19
            ajsf r2 = r0.a(r12)
            r0 = r16
            r1 = r17
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r27
            r10 = r28
            r12 = r31
            r13 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r18.getClass()
            r14.f60J = r15
            r0 = r26
            r14.a = r0
            r0 = r29
            r14.c = r0
            android.content.res.Resources r0 = r18.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.smallestScreenWidthDp
            r14.N = r0
            android.content.res.Resources r0 = r18.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r14.O = r0
            r0 = r32
            r14.d = r0
            ajzo r0 = new ajzo
            ajrj r1 = r14.e
            r0.<init>(r1)
            r14.b = r0
            ajrj r1 = r14.e
            r1.lT(r0)
            r0 = r30
            if (r0 == 0) goto Laa
            arhd r1 = r30.a()
            if (r1 != 0) goto L70
            goto Laa
        L70:
            arhd r1 = r30.a()
            asvx r1 = r1.m
            if (r1 != 0) goto L7a
            asvx r1 = defpackage.asvx.a
        L7a:
            aski r1 = r1.c
            if (r1 != 0) goto L80
            aski r1 = defpackage.aski.a
        L80:
            boolean r1 = r1.h
            if (r1 != 0) goto L98
            arhd r1 = r30.a()
            asvx r1 = r1.m
            if (r1 != 0) goto L8e
            asvx r1 = defpackage.asvx.a
        L8e:
            aski r1 = r1.c
            if (r1 != 0) goto L94
            aski r1 = defpackage.aski.a
        L94:
            boolean r1 = r1.i
            if (r1 == 0) goto Laa
        L98:
            actx r1 = new actx
            r2 = r25
            r1.<init>(r2)
            zto r2 = defpackage.zto.t
            ajwr r3 = new ajwr
            r3.<init>(r1, r2)
            r15.setOnHierarchyChangeListener(r3)
            goto Lb4
        Laa:
            r2 = r25
            actx r1 = new actx
            r1.<init>(r2)
            r15.setOnHierarchyChangeListener(r1)
        Lb4:
            ajrw r1 = r14.f
            ajsf r1 = (defpackage.ajsf) r1
            r1.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajzq.<init>(akam, android.support.v7.widget.RecyclerView, ajsg, ajyx, aari, yni, ajyk, yzj, acti, ajsa, akai, ajzs, ajzn, aadd, aynx, boolean, java.util.Queue):void");
    }
}
