package defpackage;

import com.google.android.libraries.youtube.mdx.model.ScreenId;
import j$.time.Duration;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: adkk  reason: default package */
/* loaded from: classes.dex */
final class adkk implements adwb {
    public adib a = null;
    private final String b;
    private final int c;

    public adkk(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // defpackage.adwb
    public final void a(IOException iOException) {
        String str = adkl.a;
        String str2 = this.b;
        zep.f(str, str2.length() != 0 ? "Failed getting response from ".concat(str2) : new String("Failed getting response from "), iOException);
    }

    @Override // defpackage.adwb
    public final void i(yrb yrbVar) {
        int i = yrbVar.a;
        if (i != 200) {
            String str = adkl.a;
            String str2 = this.b;
            StringBuilder sb = new StringBuilder(str2.length() + 31);
            sb.append("Got status of ");
            sb.append(i);
            sb.append(" from ");
            sb.append(str2);
            zep.c(str, sb.toString());
            return;
        }
        yqz yqzVar = yrbVar.d;
        if (yqzVar == null) {
            zep.c(adkl.a, "Body from response is null");
            return;
        }
        try {
            try {
                adkn adknVar = new adkn(new JSONObject(yqzVar.c()).getJSONObject("screen"), this.c);
                adib adibVar = null;
                try {
                    JSONObject jSONObject = adknVar.b;
                    if (jSONObject != null) {
                        if (!jSONObject.has("accessType")) {
                            String str3 = adkn.a;
                            String valueOf = String.valueOf(adknVar.b);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 45);
                            sb2.append("We don't have an access type for MDx screen: ");
                            sb2.append(valueOf);
                            zep.c(str3, sb2.toString());
                        } else {
                            if (adknVar.b.has("screenId") && adknVar.b.has("deviceId")) {
                                String optString = adknVar.b.optString("name", null);
                                ScreenId screenId = new ScreenId(adknVar.b.getString("screenId"));
                                adit aditVar = new adit(adknVar.b.getString("deviceId"));
                                adhy adhyVar = adknVar.b.has("loungeToken") ? new adhy(adknVar.b.getString("loungeToken"), adknVar.c) : null;
                                String optString2 = adknVar.b.optString("clientName", null);
                                adit aditVar2 = optString2 != null ? new adit(optString2) : null;
                                ampq ampqVar = amon.a;
                                if (adknVar.b.has("dialAdditionalDataSupportLevel") && adknVar.b.getString("dialAdditionalDataSupportLevel").equals("full") && adknVar.b.has("shortLivedLoungeToken")) {
                                    JSONObject jSONObject2 = adknVar.b.getJSONObject("shortLivedLoungeToken");
                                    if (!jSONObject2.has("value") || !jSONObject2.has("refreshIntervalMs")) {
                                        zep.m(adkn.a, "Ill-formed short lived lounge token. Not using.");
                                    } else {
                                        ampqVar = ampq.j(new adis(jSONObject2.getString("value"), adknVar.c, Duration.ofMillis(jSONObject2.getLong("refreshIntervalMs"))));
                                    }
                                }
                                adia e = adib.e();
                                e.f(adim.MANUAL);
                                e.b(screenId);
                                e.e(optString);
                                e.d = aditVar2;
                                e.a = adhyVar;
                                e.d(aditVar);
                                if (ampqVar.h()) {
                                    e.c((adis) ampqVar.c());
                                }
                                adibVar = e.a();
                            }
                            String str4 = adkn.a;
                            String valueOf2 = String.valueOf(adknVar.b);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 47);
                            sb3.append("We got a permanent screen without a screen id: ");
                            sb3.append(valueOf2);
                            zep.c(str4, sb3.toString());
                        }
                    }
                } catch (JSONException e2) {
                    zep.f(adkn.a, "Error parsing screen ", e2);
                }
                this.a = adibVar;
            } catch (JSONException e3) {
                String str5 = adkl.a;
                String str6 = this.b;
                zep.f(str5, str6.length() != 0 ? "Error loading screen info from ".concat(str6) : new String("Error loading screen info from "), e3);
            }
        } catch (IOException | JSONException e4) {
            String str7 = adkl.a;
            String str8 = this.b;
            zep.f(str7, str8.length() != 0 ? "Error loading from ".concat(str8) : new String("Error loading from "), e4);
        }
    }
}
