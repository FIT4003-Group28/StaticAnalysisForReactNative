package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gnu  reason: default package */
/* loaded from: classes3.dex */
public final class gnu implements aafl {
    public final aafo a;
    public final niz b;
    public final niy c;
    private final dt d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private final acti f;
    private final airr g;
    private final oet h;
    private final gbh i;

    public gnu(dt dtVar, aafo aafoVar, niz nizVar, niy niyVar, acti actiVar, airr airrVar, oet oetVar, gbh gbhVar) {
        this.d = dtVar;
        this.a = aafoVar;
        this.b = nizVar;
        this.c = niyVar;
        this.f = actiVar;
        this.g = airrVar;
        this.h = oetVar;
        this.i = gbhVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        oeu oeuVar;
        nwa nwaVar;
        if (!apzgVar.qn(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand)) {
            return;
        }
        ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) apzgVar.qm(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
        this.f.n(new acte(showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.j));
        int O = awwc.O(showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.i);
        if (O == 0 || O != 3) {
            boolean z = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.g;
            if (z) {
                this.e.post(new Runnable() { // from class: gnt
                    @Override // java.lang.Runnable
                    public final void run() {
                        gnu.this.b.r(1, 1);
                    }
                });
            } else {
                this.e.post(new gdb(this.g, 5));
            }
            int i = 0;
            if (z && (oeuVar = this.h.a) != null && (nwaVar = ((DefaultWatchPanelViewController) oeuVar).i) != null) {
                i = ((nvp) nwaVar).f;
            }
            Bundle bundle = new Bundle();
            ygh yghVar = new ygh();
            bundle.putByteArray("show_webview_dialog_command", apzgVar.toByteArray());
            bundle.putInt("mini_player_size", i);
            yghVar.ae(bundle);
            yghVar.ae.add(new gns(this, showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand, map, z));
            yghVar.qv(this.d.getSupportFragmentManager(), "web_view_dialog");
            return;
        }
        gbh gbhVar = this.i;
        Bundle bundle2 = new Bundle();
        bundle2.putByteArray("show_webview_dialog_command", apzgVar.toByteArray());
        gbhVar.d(PaneDescriptor.c(gnw.class, apzgVar, bundle2));
    }
}
