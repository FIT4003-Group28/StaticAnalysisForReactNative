package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
/* compiled from: PG */
/* renamed from: mbt  reason: default package */
/* loaded from: classes3.dex */
public final class mbt extends gev implements fmw, fsu {
    private final InlinePlaybackController L;
    private final fyq M;
    private final LinearLayoutManager N;
    private final ActiveStateScrollSelectionController O;
    private Parcelable P;
    private boolean Q;
    private final mbp R;
    public aqgr b;
    public final ajrj c;
    public ajqm d;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Object, ajsa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mbt(android.content.Context r28, defpackage.ajyx r29, defpackage.yni r30, defpackage.yzj r31, defpackage.ajyi r32, com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController r33, defpackage.mcq r34, defpackage.fmx r35, defpackage.ajsg r36, defpackage.aadd r37, defpackage.swq r38, defpackage.teb r39, defpackage.ajjr r40, defpackage.azqb r41, defpackage.ajpa r42, defpackage.aynx r43, defpackage.eci r44, defpackage.akam r45, defpackage.acti r46, android.support.v7.widget.RecyclerView r47, defpackage.aari r48, defpackage.ajyk r49, defpackage.akai r50, defpackage.ajzs r51, int r52, defpackage.ajkb r53, defpackage.tdu r54, defpackage.ajkj r55, com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController r56) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbt.<init>(android.content.Context, ajyx, yni, yzj, ajyi, com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController, mcq, fmx, ajsg, aadd, swq, teb, ajjr, azqb, ajpa, aynx, eci, akam, acti, android.support.v7.widget.RecyclerView, aari, ajyk, akai, ajzs, int, ajkb, tdu, ajkj, com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController):void");
    }

    @Override // defpackage.fmw
    public final void a(int i) {
        this.R.f(i);
    }

    @Override // defpackage.fsu
    public final void b(int i, boolean z) {
    }

    @Override // defpackage.ajwb, defpackage.akaf
    public final void c() {
        super.c();
        if (!this.Q) {
            return;
        }
        Parcelable parcelable = this.P;
        if (parcelable != null) {
            this.N.Y(parcelable);
            this.P = null;
        }
        this.L.t(this.M);
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.O;
        if (activeStateScrollSelectionController != null) {
            activeStateScrollSelectionController.h(this.M);
        }
        this.Q = false;
    }

    @Override // defpackage.fsu
    public final boolean d(int i) {
        return false;
    }

    @Override // defpackage.fsu
    public final void e(float f) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gev, defpackage.ajwb
    public final void f(auqh auqhVar) {
        aqgr aqgrVar;
        super.f(auqhVar);
        if ((auqhVar.c & 16) != 0) {
            auqf auqfVar = auqhVar.j;
            if (auqfVar == null) {
                auqfVar = auqf.a;
            }
            aqgrVar = auqfVar.b;
            if (aqgrVar == null) {
                aqgrVar = aqgr.a;
            }
        } else {
            aqgrVar = null;
        }
        this.b = aqgrVar;
    }

    @Override // defpackage.gev, defpackage.ajzq, defpackage.ajwb
    public final void h() {
        super.h();
        this.b = null;
    }

    @Override // defpackage.gev, defpackage.ajzq, defpackage.ajwb, defpackage.ajxh, defpackage.zdx
    public final void j() {
        super.j();
        this.L.v(this.M);
        ActiveStateScrollSelectionController activeStateScrollSelectionController = this.O;
        if (activeStateScrollSelectionController != null) {
            activeStateScrollSelectionController.h(null);
        }
    }

    @Override // defpackage.ajwb
    public final void l() {
        super.l();
        this.Q = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajzq
    public final void m() {
        if (this.M.g()) {
            return;
        }
        super.m();
    }

    public final boolean n() {
        return this.M.g();
    }

    @Override // defpackage.fsu
    public final void oB(int i) {
        if (i == 0) {
            this.L.t(this.M);
            ActiveStateScrollSelectionController activeStateScrollSelectionController = this.O;
            if (activeStateScrollSelectionController == null) {
                return;
            }
            activeStateScrollSelectionController.h(this.M);
        }
    }

    @Override // defpackage.ajwb, defpackage.ajxh, defpackage.ajzh
    public final akam pn() {
        return new mbq(super.pn(), this.N.P());
    }
}
