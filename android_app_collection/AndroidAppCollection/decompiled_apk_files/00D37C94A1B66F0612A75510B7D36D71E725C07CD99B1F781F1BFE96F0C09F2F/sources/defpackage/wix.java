package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.widget.Button;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: wix  reason: default package */
/* loaded from: classes4.dex */
public final class wix {
    public final Context a;
    public final aqft b;
    public final aafo c;
    public AlertDialog d;
    public ContentLoadingProgressBar e;
    public YouTubeTextView f;
    public Button g;
    public Button h;
    public final acgy i;
    private final Object j;

    public wix(Context context, aqft aqftVar, aafo aafoVar, acgy acgyVar, Object obj) {
        this.a = new ack(context, (int) R.style.VerificationDialogStyle);
        aqftVar.getClass();
        this.b = aqftVar;
        this.c = aafoVar;
        this.i = acgyVar;
        this.j = obj;
    }

    private final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.j);
        hashMap.put(actk.b, Boolean.TRUE);
        return hashMap;
    }

    public final void a() {
        AlertDialog alertDialog = this.d;
        alertDialog.getClass();
        alertDialog.dismiss();
    }

    public final void b(apoj apojVar) {
        if (apojVar != null) {
            int i = apojVar.b;
            if ((32768 & i) != 0) {
                aafo aafoVar = this.c;
                apzg apzgVar = apojVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, c());
            } else if ((i & 16384) != 0) {
                aafo aafoVar2 = this.c;
                apzg apzgVar2 = apojVar.o;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.c(apzgVar2, c());
            } else if ((i & 8192) == 0) {
            } else {
                aafo aafoVar3 = this.c;
                apzg apzgVar3 = apojVar.n;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                aafoVar3.c(apzgVar3, c());
            }
        }
    }
}
