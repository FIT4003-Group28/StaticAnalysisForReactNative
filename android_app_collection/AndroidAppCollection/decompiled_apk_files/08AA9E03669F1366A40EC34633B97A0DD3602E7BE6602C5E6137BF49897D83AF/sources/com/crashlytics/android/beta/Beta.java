package com.crashlytics.android.beta;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import b.a.a.a.a.a.b;
import b.a.a.a.a.b.m;
import b.a.a.a.a.b.p;
import b.a.a.a.a.b.t;
import b.a.a.a.a.f.d;
import b.a.a.a.a.g.f;
import b.a.a.a.a.g.q;
import b.a.a.a.c;
import b.a.a.a.i;
import b.a.a.a.l;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class Beta extends i<Boolean> implements m {
    private static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    private static final String CRASHLYTICS_BUILD_PROPERTIES = "crashlytics-build.properties";
    static final String NO_DEVICE_TOKEN = "";
    public static final String TAG = "Beta";
    private final b<String> deviceTokenCache = new b<>();
    private final DeviceTokenLoader deviceTokenLoader = new DeviceTokenLoader();
    private UpdatesController updatesController;

    @Override // b.a.a.a.i
    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    @Override // b.a.a.a.i
    public String getVersion() {
        return "1.2.8.25";
    }

    public static Beta getInstance() {
        return (Beta) c.a(Beta.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b.a.a.a.i
    @TargetApi(14)
    public boolean onPreExecute() {
        this.updatesController = createUpdatesController(Build.VERSION.SDK_INT, (Application) getContext().getApplicationContext());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // b.a.a.a.i
    /* renamed from: doInBackground */
    public Boolean mo24doInBackground() {
        c.h().a(TAG, "Beta kit initializing...");
        Context context = getContext();
        p idManager = getIdManager();
        if (TextUtils.isEmpty(getBetaDeviceToken(context, idManager.i()))) {
            c.h().a(TAG, "A Beta device token was not found for this app");
            return false;
        }
        c.h().a(TAG, "Beta device token is present, checking for app updates.");
        f betaSettingsData = getBetaSettingsData();
        BuildProperties loadBuildProperties = loadBuildProperties(context);
        if (canCheckForUpdates(betaSettingsData, loadBuildProperties)) {
            this.updatesController.initialize(context, this, idManager, betaSettingsData, loadBuildProperties, new d(this), new t(), new b.a.a.a.a.e.b(c.h()));
        }
        return true;
    }

    @TargetApi(14)
    UpdatesController createUpdatesController(int i, Application application) {
        if (i >= 14) {
            return new ActivityLifecycleCheckForUpdatesController(getFabric().e(), getFabric().f());
        }
        return new ImmediateCheckForUpdatesController();
    }

    @Override // b.a.a.a.a.b.m
    public Map<p.a, String> getDeviceIdentifiers() {
        String betaDeviceToken = getBetaDeviceToken(getContext(), getIdManager().i());
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(betaDeviceToken)) {
            hashMap.put(p.a.FONT_TOKEN, betaDeviceToken);
        }
        return hashMap;
    }

    boolean canCheckForUpdates(f fVar, BuildProperties buildProperties) {
        return (fVar == null || TextUtils.isEmpty(fVar.f1209a) || buildProperties == null) ? false : true;
    }

    private String getBetaDeviceToken(Context context, String str) {
        String str2 = null;
        try {
            String a2 = this.deviceTokenCache.a(context, this.deviceTokenLoader);
            if (!"".equals(a2)) {
                str2 = a2;
            }
        } catch (Exception e) {
            c.h().e(TAG, "Failed to load the Beta device token", e);
        }
        l h = c.h();
        StringBuilder sb = new StringBuilder();
        sb.append("Beta device token present: ");
        sb.append(!TextUtils.isEmpty(str2));
        h.a(TAG, sb.toString());
        return str2;
    }

    private f getBetaSettingsData() {
        b.a.a.a.a.g.t b2 = q.a().b();
        if (b2 != null) {
            return b2.f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.crashlytics.android.beta.BuildProperties loadBuildProperties(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 0
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L67
            java.lang.String r1 = "crashlytics-build.properties"
            java.io.InputStream r7 = r7.open(r1)     // Catch: java.lang.Throwable -> L62 java.lang.Exception -> L67
            if (r7 == 0) goto L4f
            com.crashlytics.android.beta.BuildProperties r1 = com.crashlytics.android.beta.BuildProperties.fromPropertiesStream(r7)     // Catch: java.lang.Exception -> L4a java.lang.Throwable -> L8a
            b.a.a.a.l r0 = b.a.a.a.c.h()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r2 = "Beta"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            r3.<init>()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r4 = r1.packageName     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            r3.append(r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r4 = " build properties: "
            r3.append(r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r4 = r1.versionName     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            r3.append(r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r4 = " ("
            r3.append(r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r4 = r1.versionCode     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            r3.append(r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r4 = ") - "
            r3.append(r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r4 = r1.buildId     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            r3.append(r4)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            r0.a(r2, r3)     // Catch: java.lang.Exception -> L48 java.lang.Throwable -> L8a
            r0 = r1
            goto L4f
        L48:
            r0 = move-exception
            goto L6b
        L4a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L6b
        L4f:
            if (r7 == 0) goto L89
            r7.close()     // Catch: java.io.IOException -> L55
            goto L89
        L55:
            r7 = move-exception
            b.a.a.a.l r1 = b.a.a.a.c.h()
            java.lang.String r2 = "Beta"
            java.lang.String r3 = "Error closing Beta build properties asset"
            r1.e(r2, r3, r7)
            goto L89
        L62:
            r7 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
            goto L8b
        L67:
            r7 = move-exception
            r1 = r0
            r0 = r7
            r7 = r1
        L6b:
            b.a.a.a.l r2 = b.a.a.a.c.h()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = "Beta"
            java.lang.String r4 = "Error reading Beta build properties"
            r2.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L88
            r7.close()     // Catch: java.io.IOException -> L7c
            goto L88
        L7c:
            r7 = move-exception
            b.a.a.a.l r0 = b.a.a.a.c.h()
            java.lang.String r2 = "Beta"
            java.lang.String r3 = "Error closing Beta build properties asset"
            r0.e(r2, r3, r7)
        L88:
            r0 = r1
        L89:
            return r0
        L8a:
            r0 = move-exception
        L8b:
            if (r7 == 0) goto L9d
            r7.close()     // Catch: java.io.IOException -> L91
            goto L9d
        L91:
            r7 = move-exception
            b.a.a.a.l r1 = b.a.a.a.c.h()
            java.lang.String r2 = "Beta"
            java.lang.String r3 = "Error closing Beta build properties asset"
            r1.e(r2, r3, r7)
        L9d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.beta.Beta.loadBuildProperties(android.content.Context):com.crashlytics.android.beta.BuildProperties");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getOverridenSpiEndpoint() {
        return b.a.a.a.a.b.i.b(getContext(), CRASHLYTICS_API_ENDPOINT);
    }
}
