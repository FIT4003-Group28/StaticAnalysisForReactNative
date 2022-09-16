package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mkl  reason: default package */
/* loaded from: classes3.dex */
public final class mkl implements ajru, fzq, geq, mln {
    public final Context a;
    public final FrameLayout b;
    mkk c;
    private final ajrx d;
    private final InlinePlaybackLifecycleController e;
    private final boolean f;
    private final mkn g;
    private mkk h;
    private mkk i;
    private Object j;
    private ggz k;
    private boolean l;

    public mkl(Context context, gem gemVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mkn mknVar, boolean z) {
        this.a = context;
        this.d = gemVar;
        inlinePlaybackLifecycleController.getClass();
        this.e = inlinePlaybackLifecycleController;
        this.g = mknVar;
        this.f = z;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        h(ggz.a);
        frameLayout.addView(this.c.a());
    }

    private final int d() {
        return this.a.getResources().getConfiguration().orientation;
    }

    private final View e(int i, int i2) {
        View inflate = View.inflate(this.a, i, null);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.inline_metadata_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(i2);
            viewStub.inflate();
        }
        return inflate;
    }

    private final mkk f(ajrx ajrxVar, View view) {
        mkn mknVar = this.g;
        boolean z = this.f;
        Context context = (Context) mknVar.a.get();
        context.getClass();
        ajmy ajmyVar = (ajmy) mknVar.b.get();
        ajmyVar.getClass();
        ajxz ajxzVar = (ajxz) mknVar.c.get();
        ajxzVar.getClass();
        aafo aafoVar = (aafo) mknVar.d.get();
        aafoVar.getClass();
        ajyc ajycVar = (ajyc) mknVar.e.get();
        ajycVar.getClass();
        mbw mbwVar = (mbw) mknVar.f.get();
        mbwVar.getClass();
        fyy fyyVar = (fyy) mknVar.g.get();
        fyyVar.getClass();
        mcj mcjVar = (mcj) mknVar.h.get();
        mcjVar.getClass();
        emg emgVar = (emg) mknVar.i.get();
        emgVar.getClass();
        ajrb ajrbVar = (ajrb) mknVar.j.get();
        ajrbVar.getClass();
        jkv jkvVar = (jkv) mknVar.k.get();
        jkvVar.getClass();
        aacz aaczVar = (aacz) mknVar.l.get();
        aaczVar.getClass();
        lmu lmuVar = (lmu) mknVar.m.get();
        lmuVar.getClass();
        mlp mlpVar = (mlp) mknVar.n.get();
        mlpVar.getClass();
        kua kuaVar = (kua) mknVar.o.get();
        kuaVar.getClass();
        view.getClass();
        return new mkk(context, ajmyVar, ajxzVar, aafoVar, ajycVar, mbwVar, fyyVar, mcjVar, emgVar, ajrbVar, jkvVar, aaczVar, lmuVar, mlpVar, kuaVar, ajrxVar, view, this, z);
    }

    private final boolean h(ggz ggzVar) {
        mkk mkkVar;
        boolean g = mkk.g(ggzVar);
        int d = d();
        int i = R.layout.inline_muted_metadata;
        if (d == 2 && ggzVar != null && !ggs.b(ggzVar)) {
            if (k(this.i, g)) {
                if (this.f) {
                    this.i = f(this.d, e(R.layout.promoted_video_item_land, R.layout.inline_muted_metadata));
                } else {
                    mkk f = f(this.d, e(true != g ? R.layout.video_feed_entry : R.layout.video_feed_entry_swap, R.layout.inline_muted_metadata));
                    this.i = f;
                    View a = f.a();
                    zag.o(a.findViewById(R.id.post_author), false);
                    zag.o(a.findViewById(R.id.post_text), false);
                }
            }
            mkkVar = this.i;
        } else {
            if (k(this.h, g)) {
                ajrx ajrxVar = this.d;
                if (true == g) {
                    i = R.layout.inline_muted_metadata_swap;
                }
                this.h = f(ajrxVar, e(R.layout.inline_muted_video_full_bleed, i));
            }
            mkkVar = this.h;
        }
        if (this.c != mkkVar) {
            this.c = mkkVar;
            return true;
        }
        return false;
    }

    private static boolean k(mkk mkkVar, boolean z) {
        if (mkkVar != null) {
            if ((mkkVar.f != null) == z) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.fzq
    public final View g() {
        ggz ggzVar;
        if (this.c == null) {
            return null;
        }
        if (d() == 2 && (ggzVar = this.k) != null && !ggs.b(ggzVar)) {
            return null;
        }
        return this.c.d;
    }

    @Override // defpackage.fzq
    public final void i(boolean z) {
        Bitmap bitmap;
        this.l = z;
        mkk mkkVar = this.h;
        if (mkkVar == null || mkkVar.F == z) {
            return;
        }
        mkkVar.F = z;
        if (!z || (bitmap = mkkVar.E) == null) {
            return;
        }
        mkkVar.e.b(mkkVar.C, bitmap);
    }

    @Override // defpackage.fzq
    public final /* synthetic */ mct j() {
        return null;
    }

    @Override // defpackage.geq
    public final boolean oJ(geq geqVar) {
        return (geqVar instanceof mkl) && ((mkl) geqVar).j == this.j;
    }

    @Override // defpackage.ajru
    public final void oK(ajrs ajrsVar, Object obj) {
        this.j = obj;
        ggz bm = eog.bm(obj);
        this.k = bm == null ? ggz.a : bm;
        if (h(bm)) {
            this.b.removeAllViews();
            this.b.addView(this.c.a());
        }
        i(this.l);
        this.c.oK(ajrsVar, this.k);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        mkk mkkVar = this.i;
        if (mkkVar != null) {
            mkkVar.qZ(ajsaVar);
        }
        mkk mkkVar2 = this.h;
        if (mkkVar2 != null) {
            mkkVar2.qZ(ajsaVar);
        }
        this.l = false;
        this.k = null;
        this.j = null;
    }

    @Override // defpackage.geq
    public final aynr oI(int i) {
        mkk mkkVar = this.c;
        int i2 = 2;
        if (mkkVar.f != null) {
            if ((i == 1 || i == 2) && mkk.g(mkkVar.D)) {
                mkkVar.f.c();
            } else if (i == 0 && mkk.g(mkkVar.D)) {
                mkkVar.f.b();
            }
        }
        if (i == 0) {
            return this.e.i(this.k);
        }
        InlinePlaybackLifecycleController inlinePlaybackLifecycleController = this.e;
        ggz ggzVar = this.k;
        if (i != 2) {
            i2 = 0;
        }
        return inlinePlaybackLifecycleController.j(ggzVar, this, i2);
    }
}
