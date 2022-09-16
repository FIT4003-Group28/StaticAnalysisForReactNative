package com.crashlytics.android.beta;

import b.a.a.a.a.b.a;
import b.a.a.a.a.e.c;
import b.a.a.a.a.e.d;
import b.a.a.a.a.e.e;
import b.a.a.a.i;
import b.a.a.a.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
class CheckForUpdatesRequest extends a {
    static final String BETA_SOURCE = "3";
    static final String BUILD_VERSION = "build_version";
    static final String DISPLAY_VERSION = "display_version";
    static final String HEADER_BETA_TOKEN = "X-CRASHLYTICS-BETA-TOKEN";
    static final String INSTANCE = "instance";
    static final String SDK_ANDROID_DIR_TOKEN_TYPE = "3";
    static final String SOURCE = "source";
    private final CheckForUpdatesResponseTransform responseTransform;

    static String createBetaTokenHeaderValueFor(String str) {
        return "3:" + str;
    }

    public CheckForUpdatesRequest(i iVar, String str, String str2, e eVar, CheckForUpdatesResponseTransform checkForUpdatesResponseTransform) {
        super(iVar, str, str2, eVar, c.GET);
        this.responseTransform = checkForUpdatesResponseTransform;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    public CheckForUpdatesResponse invoke(String str, String str2, BuildProperties buildProperties) {
        d dVar;
        String b2;
        l h;
        String str3;
        StringBuilder sb;
        Map<String, String> queryParamsFor;
        d httpRequest;
        try {
            try {
                queryParamsFor = getQueryParamsFor(buildProperties);
                httpRequest = getHttpRequest(queryParamsFor);
            } catch (Throwable th) {
                th = th;
            }
            try {
                dVar = applyHeadersTo(httpRequest, str, str2);
                try {
                    b.a.a.a.c.h().a(Beta.TAG, "Checking for updates from " + getUrl());
                    b.a.a.a.c.h().a(Beta.TAG, "Checking for updates query params are: " + queryParamsFor);
                } catch (Exception e) {
                    e = e;
                    b.a.a.a.c.h().e(Beta.TAG, "Error while checking for updates from " + getUrl(), e);
                    if (dVar != null) {
                        b2 = dVar.b(a.HEADER_REQUEST_ID);
                        h = b.a.a.a.c.h();
                        str3 = "Fabric";
                        sb = new StringBuilder();
                        sb.append("Checking for updates request ID: ");
                        sb.append(b2);
                        h.a(str3, sb.toString());
                    }
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                dVar = httpRequest;
            } catch (Throwable th2) {
                th = th2;
                str = httpRequest;
                if (str != 0) {
                    String b3 = str.b(a.HEADER_REQUEST_ID);
                    b.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + b3);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            dVar = null;
        } catch (Throwable th3) {
            th = th3;
            str = 0;
        }
        if (dVar.c()) {
            b.a.a.a.c.h().a(Beta.TAG, "Checking for updates was successful");
            CheckForUpdatesResponse fromJson = this.responseTransform.fromJson(new JSONObject(dVar.e()));
            if (dVar != null) {
                String b4 = dVar.b(a.HEADER_REQUEST_ID);
                b.a.a.a.c.h().a("Fabric", "Checking for updates request ID: " + b4);
            }
            return fromJson;
        }
        b.a.a.a.c.h().e(Beta.TAG, "Checking for updates failed. Response code: " + dVar.b());
        if (dVar != null) {
            b2 = dVar.b(a.HEADER_REQUEST_ID);
            h = b.a.a.a.c.h();
            str3 = "Fabric";
            sb = new StringBuilder();
            sb.append("Checking for updates request ID: ");
            sb.append(b2);
            h.a(str3, sb.toString());
        }
        return null;
    }

    private d applyHeadersTo(d dVar, String str, String str2) {
        d a2 = dVar.a(a.HEADER_ACCEPT, a.ACCEPT_JSON_VALUE);
        return a2.a(a.HEADER_USER_AGENT, a.CRASHLYTICS_USER_AGENT + this.kit.getVersion()).a(a.HEADER_DEVELOPER_TOKEN, a.CLS_ANDROID_SDK_DEVELOPER_TOKEN).a(a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE).a(a.HEADER_CLIENT_VERSION, this.kit.getVersion()).a(a.HEADER_API_KEY, str).a(HEADER_BETA_TOKEN, createBetaTokenHeaderValueFor(str2));
    }

    private Map<String, String> getQueryParamsFor(BuildProperties buildProperties) {
        HashMap hashMap = new HashMap();
        hashMap.put(BUILD_VERSION, buildProperties.versionCode);
        hashMap.put(DISPLAY_VERSION, buildProperties.versionName);
        hashMap.put(INSTANCE, buildProperties.buildId);
        hashMap.put(SOURCE, "3");
        return hashMap;
    }
}
