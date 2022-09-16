package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
/* compiled from: PG */
/* renamed from: gnw  reason: default package */
/* loaded from: classes3.dex */
public final class gnw extends gnv implements fmw {
    public fmx a;
    public ygd b;
    public aafo c;
    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand d;

    private static final void q(View view, int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(view.getPaddingBottom(), i - view.getResources().getDimensionPixelSize(R.dimen.bottom_vertical_padding_monitor_superfluous_padding));
        ofInt.addUpdateListener(new jfo(view, 1));
        ofInt.setDuration(200L);
        ofInt.start();
    }

    @Override // defpackage.dp
    public final void U() {
        super.U();
        for (apzg apzgVar : this.d.d) {
            this.c.a(apzgVar);
        }
    }

    @Override // defpackage.fmw
    public final void a(int i) {
        View view = this.O;
        if (view != null) {
            q(view, i);
        }
    }

    @Override // defpackage.gbd
    public final CharSequence aP() {
        arag aragVar = this.d.e;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }

    @Override // defpackage.gbd, defpackage.dp
    public final void mR() {
        super.mR();
        this.a.b.remove(this);
        this.b.c();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = null;
        try {
            byte[] byteArray = this.m.getByteArray("show_webview_dialog_command");
            byteArray.getClass();
            aoos b = aoos.b();
            apzg apzgVar = (apzg) aopi.parseFrom(apzg.a, byteArray, b);
            if (apzgVar.qn(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand)) {
                showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) apzgVar.qm(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
            }
        } catch (aopx e) {
            zep.f("WebViewPaneFragment", "Failed to deserialize show command.", e);
        }
        showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.getClass();
        this.d = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
        fsw a = this.as.a();
        a.m(fuj.p);
        this.as = a.a();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.web_view_pane_fragment, viewGroup, false);
        q(viewGroup2, this.a.c);
        this.a.a(this);
        ygd ygdVar = this.b;
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2 = this.d;
        ygdVar.b((LoadingFrameLayout) viewGroup2.findViewById(R.id.web_view_loading_layout), showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.b, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.c, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand2.h);
        ((ViewGroup) viewGroup2.findViewById(R.id.webview_container)).addView(this.b.a());
        return viewGroup2;
    }
}
