package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: glf  reason: default package */
/* loaded from: classes3.dex */
public final class glf implements aafl {
    public final aafo a;
    public final fvf b;
    private final Activity c;

    public glf(Activity activity, aafo aafoVar, fvf fvfVar) {
        this.c = activity;
        this.a = aafoVar;
        this.b = fvfVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        String string;
        final aumb aumbVar = (aumb) apzgVar.qm(aumb.b);
        String str = aumbVar.e;
        if (!amps.e(str)) {
            string = this.c.getString(R.string.reel_upload_snackbar_text, new Object[]{str});
        } else {
            string = this.c.getString(R.string.reel_upload_default_snackbar_text);
        }
        final fvg d = fvl.d();
        d.k(string);
        if ((aumbVar.c & 1) != 0) {
            d.m(this.c.getText(R.string.reel_upload_snackbar_action_button_text), new View.OnClickListener() { // from class: gld
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    glf glfVar = glf.this;
                    aumb aumbVar2 = aumbVar;
                    aafo aafoVar = glfVar.a;
                    apzg apzgVar2 = aumbVar2.d;
                    if (apzgVar2 == null) {
                        apzgVar2 = apzg.a;
                    }
                    aafoVar.c(apzgVar2, null);
                }
            });
        }
        this.c.runOnUiThread(new Runnable() { // from class: gle
            @Override // java.lang.Runnable
            public final void run() {
                glf.this.b.i(d.b());
            }
        });
    }
}
