package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ygh  reason: default package */
/* loaded from: classes4.dex */
public final class ygh extends yge implements View.OnClickListener {
    public final Set ae = amyv.e();
    public aafo af;
    public ygd ag;

    @Override // defpackage.dp
    public final void Z(View view, Bundle bundle) {
        Dialog dialog;
        final int i = this.m.getInt("mini_player_size");
        if (i <= 0 || (dialog = this.d) == null) {
            return;
        }
        final Window window = dialog.getWindow();
        View view2 = this.O;
        if (view2 != null) {
            view2.post(new Runnable() { // from class: ygg
                @Override // java.lang.Runnable
                public final void run() {
                    ygh yghVar = ygh.this;
                    int i2 = i;
                    Window window2 = window;
                    int height = yghVar.O.getHeight();
                    int dimensionPixelSize = yghVar.O.getResources().getDimensionPixelSize(R.dimen.pivot_bar_height);
                    window2.setLayout(yghVar.O.getWidth(), ((height - dimensionPixelSize) - i2) + vgu.b(yghVar.rb()));
                }
            });
        }
        window.setGravity(48);
        this.d.setCanceledOnTouchOutside(true);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        mN(0, 2132084108);
    }

    @Override // defpackage.dh, defpackage.dp
    public final void mR() {
        super.mR();
        this.ag.c();
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mc(layoutInflater, viewGroup, bundle);
        try {
            apzg apzgVar = (apzg) aopi.parseFrom(apzg.a, this.m.getByteArray("show_webview_dialog_command"), aoos.b());
            if (!apzgVar.qn(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand)) {
                return null;
            }
            ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) apzgVar.qm(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
            ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.webview_dialog_layout, viewGroup, false);
            Context rb = rb();
            final aafo aafoVar = this.af;
            View inflate = LayoutInflater.from(rb).inflate(R.layout.webview_dialog_header_layout, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            arag aragVar = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
            View findViewById = inflate.findViewById(R.id.information_button);
            aunb aunbVar = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.f;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            final apoj apojVar = (apoj) ajjh.k(aunbVar);
            if (apojVar != null) {
                aovs aovsVar = apojVar.s;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                if ((aovsVar.b & 1) != 0) {
                    aovs aovsVar2 = apojVar.s;
                    if (aovsVar2 == null) {
                        aovsVar2 = aovs.a;
                    }
                    aovr aovrVar = aovsVar2.c;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    if ((aovrVar.b & 2) != 0) {
                        findViewById.setContentDescription(aovrVar.c);
                    }
                }
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: ygi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        aafo aafoVar2 = aafo.this;
                        apzg apzgVar2 = apojVar.p;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar2.c(apzgVar2, null);
                    }
                });
                zag.o(findViewById, true);
            }
            View findViewById2 = inflate.findViewById(R.id.close_button);
            ((ViewGroup) viewGroup2.findViewById(R.id.dialog_header)).addView(inflate);
            findViewById2.setOnClickListener(this);
            this.ag.b((LoadingFrameLayout) viewGroup2.findViewById(R.id.web_view_loading_layout), showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.b, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.c, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.h);
            ((ViewGroup) viewGroup2.findViewById(R.id.webview_container)).addView(this.ag.a());
            return viewGroup2;
        } catch (aopx e) {
            zep.f("WebViewDialog", "Failed to deserialize show command.", e);
            return null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        dismiss();
    }

    @Override // defpackage.dh, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        for (gns gnsVar : this.ae) {
            gnu gnuVar = gnsVar.a;
            ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = gnsVar.b;
            Map map = gnsVar.c;
            boolean z = gnsVar.d;
            for (apzg apzgVar : showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.d) {
                gnuVar.a.c(apzgVar, map);
            }
            if (z) {
                gnuVar.c.q();
            }
        }
    }
}
