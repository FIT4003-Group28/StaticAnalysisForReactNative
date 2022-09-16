package defpackage;

import com.google.protos.youtube.api.innertube.WebviewAuthCommand$WebViewAuthCommand;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ygf  reason: default package */
/* loaded from: classes4.dex */
public final class ygf implements aafl {
    private final yfv a;

    public ygf(yfv yfvVar) {
        this.a = yfvVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (!apzgVar.qn(WebviewAuthCommand$WebViewAuthCommand.webViewAuthCommand)) {
            return;
        }
        WebviewAuthCommand$WebViewAuthCommand webviewAuthCommand$WebViewAuthCommand = (WebviewAuthCommand$WebViewAuthCommand) apzgVar.qm(WebviewAuthCommand$WebViewAuthCommand.webViewAuthCommand);
        int N = awwc.N(webviewAuthCommand$WebViewAuthCommand.c);
        if (N == 0) {
            N = 1;
        }
        int i = N - 1;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.a.a();
        } else if ((webviewAuthCommand$WebViewAuthCommand.b & 2) == 0) {
        } else {
            this.a.b(webviewAuthCommand$WebViewAuthCommand.d, null);
        }
    }
}
