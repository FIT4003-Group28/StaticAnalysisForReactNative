package defpackage;

import android.os.Handler;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adbk  reason: default package */
/* loaded from: classes.dex */
final class adbk implements adtj {
    private final Handler a;
    private final String b;
    private final adqe c;

    public adbk(adqe adqeVar, Handler handler, String str) {
        this.c = adqeVar;
        this.a = handler;
        this.b = str;
    }

    @Override // defpackage.adtj
    public final void a(adtd adtdVar) {
        if (this.a.hasMessages(1)) {
            try {
                JSONObject jSONObject = adtdVar.b;
                adia e = adib.e();
                e.b(new ScreenId(jSONObject.getString("screenId")));
                e.d(new adit(jSONObject.getString("deviceId")));
                e.e(this.b);
                e.f(adim.DIAL);
                adib a = e.a();
                this.a.removeMessages(1);
                this.c.a(a, -1);
                return;
            } catch (JSONException unused) {
                String str = adbl.a;
                String.format("No screen ID on %s: %s", adil.MDX_SESSION_STATUS.al, adtdVar);
                return;
            }
        }
        String str2 = adbl.a;
    }
}
