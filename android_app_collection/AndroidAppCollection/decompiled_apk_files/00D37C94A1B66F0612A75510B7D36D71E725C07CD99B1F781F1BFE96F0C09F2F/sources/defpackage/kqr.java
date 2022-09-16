package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kqr  reason: default package */
/* loaded from: classes3.dex */
public final class kqr extends kqo implements kpy, acth {
    public zhf ae;
    public kqa af;
    public acti ag;
    private kpz ah;

    @Override // defpackage.dp
    public final void R(Bundle bundle) {
        super.R(bundle);
        kpz kpzVar = this.ah;
        kpzVar.a();
        kpzVar.n.g(kpzVar);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(2, this.ae.a);
        this.ag.d(acuo.a(67374), null, null);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mR() {
        super.mR();
        kpz kpzVar = this.ah;
        kpzVar.n.m(kpzVar);
        kpzVar.l.j();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) layoutInflater.inflate(R.layout.suggested_playlist_videos_fragment, viewGroup, false);
        kqa kqaVar = this.af;
        azqb azqbVar = kqaVar.a;
        yzj yzjVar = (yzj) kqaVar.b.get();
        yzjVar.getClass();
        Context context = (Context) kqaVar.c.get();
        context.getClass();
        Executor executor = (Executor) kqaVar.d.get();
        executor.getClass();
        akbn akbnVar = (akbn) kqaVar.e.get();
        akbnVar.getClass();
        ajyi ajyiVar = (ajyi) kqaVar.f.get();
        ajyiVar.getClass();
        akar akarVar = (akar) kqaVar.g.get();
        akarVar.getClass();
        gew gewVar = (gew) kqaVar.h.get();
        gewVar.getClass();
        yni yniVar = (yni) kqaVar.i.get();
        yniVar.getClass();
        tdu tduVar = (tdu) kqaVar.j.get();
        tduVar.getClass();
        loadingFrameLayout.getClass();
        aadd aaddVar = (aadd) kqaVar.k.get();
        aaddVar.getClass();
        this.ah = new kpz(azqbVar, yzjVar, context, executor, akbnVar, ajyiVar, akarVar, gewVar, yniVar, tduVar, this, loadingFrameLayout, this, aaddVar);
        return loadingFrameLayout;
    }

    @Override // defpackage.acth
    public final acti oi() {
        return this.ag;
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        Window window = oy.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.SlideDownAnimation);
        }
        return oy;
    }
}
