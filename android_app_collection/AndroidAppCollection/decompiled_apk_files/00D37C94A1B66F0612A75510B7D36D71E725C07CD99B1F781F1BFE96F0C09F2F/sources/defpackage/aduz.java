package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: aduz */
/* loaded from: classes.dex */
public final class aduz implements adux {
    private static final String b = zep.a("MDX.ProgressApi");
    public final yqh a;
    private final Context c;
    private final ankw d;

    public aduz(yqh yqhVar, Context context, ankw ankwVar) {
        this.a = yqhVar;
        this.c = context;
        this.d = ankwVar;
    }

    public static /* synthetic */ void b() {
        zep.c(b, "IOException while calling the TV Sign-in progress API");
        afus.b(2, 21, "IOException while calling the TV Sign-in progress API");
    }

    @Override // defpackage.adux
    public final void a(String str, String str2) {
        String string = Settings.Secure.getString(this.c.getContentResolver(), "android_id");
        String str3 = Build.MODEL;
        final yqu c = yqv.c("https://www.youtube.com/api/lounge/screens/em");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", string);
            jSONObject.put("deviceDescription", str3);
            jSONObject.put("event", str2);
            HashMap hashMap = new HashMap();
            str.getClass();
            hashMap.put("screenId", str);
            hashMap.put("method", "updateSignInStatus");
            hashMap.put("params", jSONObject.toString());
            c.b = yqt.d(hashMap, "ISO-8859-1");
            ylx.m(this.d.qp(new Callable() { // from class: aduy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aduz.this.a.a(c.a());
                    return null;
                }
            }), adkd.l);
        } catch (UnsupportedEncodingException | JSONException unused) {
            zep.c(b, "Error while creating the POST payload for the TV Sign-in progress API");
            afus.b(2, 21, "Error while creating the POST payload for the TV Sign-in progress API");
        }
    }
}
