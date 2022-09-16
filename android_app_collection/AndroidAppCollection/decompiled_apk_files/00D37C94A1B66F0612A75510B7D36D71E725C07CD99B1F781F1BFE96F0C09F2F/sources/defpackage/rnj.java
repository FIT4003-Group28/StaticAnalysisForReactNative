package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.net.URL;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rnj  reason: default package */
/* loaded from: classes4.dex */
public final class rnj implements Runnable {
    final /* synthetic */ rnk a;
    public final rlv b;
    private final URL c;

    public rnj(rnk rnkVar, String str, URL url, rlv rlvVar) {
        this.a = rnkVar;
        qnm.l(str);
        this.c = url;
        this.b = rlvVar;
    }

    private final void a(final int i, final Exception exc, final byte[] bArr) {
        this.a.aH().g(new Runnable() { // from class: rni
            @Override // java.lang.Runnable
            public final void run() {
                List<ResolveInfo> queryIntentActivities;
                rnj rnjVar = rnj.this;
                int i2 = i;
                Exception exc2 = exc;
                byte[] bArr2 = bArr;
                rlx rlxVar = rnjVar.b.a;
                if (i2 != 200 && i2 != 204) {
                    if (i2 == 304) {
                        i2 = 304;
                    }
                    rlxVar.aG().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc2);
                }
                if (exc2 == null) {
                    rlxVar.h().q.a(true);
                    if (bArr2 == null || bArr2.length == 0) {
                        rlxVar.aG().j.a("Deferred Deep Link response empty.");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(new String(bArr2));
                        String optString = jSONObject.optString("deeplink", "");
                        String optString2 = jSONObject.optString("gclid", "");
                        double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                        if (TextUtils.isEmpty(optString)) {
                            rlxVar.aG().j.a("Deferred Deep Link is empty.");
                            return;
                        }
                        rps q = rlxVar.q();
                        if (!TextUtils.isEmpty(optString) && (queryIntentActivities = q.I().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                            Bundle bundle = new Bundle();
                            bundle.putString("gclid", optString2);
                            bundle.putString("_cis", "ddp");
                            rlxVar.l.u("auto", "_cmp", bundle);
                            rps q2 = rlxVar.q();
                            if (TextUtils.isEmpty(optString)) {
                                return;
                            }
                            try {
                                SharedPreferences.Editor edit = q2.I().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (!edit.commit()) {
                                    return;
                                }
                                q2.I().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            } catch (RuntimeException e) {
                                q2.aG().c.b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        }
                        rlxVar.aG().f.c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                        return;
                    } catch (JSONException e2) {
                        rlxVar.aG().c.b("Failed to parse the Deferred Deep Link response. exception", e2);
                        return;
                    }
                }
                rlxVar.aG().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc2);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            rnk r0 = r8.a
            r0.O()
            r0 = 0
            r1 = 0
            rnk r2 = r8.a     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            java.net.URL r3 = r8.c     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            if (r4 == 0) goto L73
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            r2.J()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            r2.J()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L71
            r3.getHeaderFields()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L63
            r4.<init>()     // Catch: java.lang.Throwable -> L63
            java.io.InputStream r5 = r3.getInputStream()     // Catch: java.lang.Throwable -> L63
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L61
        L45:
            int r7 = r5.read(r6)     // Catch: java.lang.Throwable -> L61
            if (r7 <= 0) goto L4f
            r4.write(r6, r0, r7)     // Catch: java.lang.Throwable -> L61
            goto L45
        L4f:
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L61
            if (r5 == 0) goto L58
            r5.close()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
        L58:
            if (r3 == 0) goto L5d
            r3.disconnect()
        L5d:
            r8.a(r2, r1, r0)
            return
        L61:
            r0 = move-exception
            goto L65
        L63:
            r0 = move-exception
            r5 = r1
        L65:
            if (r5 == 0) goto L6a
            r5.close()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
        L6a:
            throw r0     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
        L6b:
            r0 = move-exception
            goto L7f
        L6d:
            r0 = move-exception
            goto L8c
        L6f:
            r2 = move-exception
            goto L7d
        L71:
            r2 = move-exception
            goto L8a
        L73:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
            throw r2     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L88
        L7b:
            r2 = move-exception
            r3 = r1
        L7d:
            r0 = r2
            r2 = 0
        L7f:
            if (r3 == 0) goto L84
            r3.disconnect()
        L84:
            r8.a(r2, r1, r1)
            throw r0
        L88:
            r2 = move-exception
            r3 = r1
        L8a:
            r0 = r2
            r2 = 0
        L8c:
            if (r3 == 0) goto L91
            r3.disconnect()
        L91:
            r8.a(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rnj.run():void");
    }
}
