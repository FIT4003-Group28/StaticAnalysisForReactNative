package cl.json.f;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import cl.json.RNShareModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    protected final ReactApplicationContext f4941a;

    /* renamed from: b  reason: collision with root package name */
    protected Intent f4942b;

    /* renamed from: c  reason: collision with root package name */
    protected String f4943c = "Share";

    /* renamed from: d  reason: collision with root package name */
    protected cl.json.d f4944d;

    /* renamed from: e  reason: collision with root package name */
    protected ReadableMap f4945e;

    /* renamed from: f  reason: collision with root package name */
    protected cl.json.d f4946f;

    /* renamed from: g  reason: collision with root package name */
    protected cl.json.d f4947g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<HashMap<String, String>> {
        a(l lVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
            return hashMap.get("simpleName").compareTo(hashMap2.get("simpleName"));
        }
    }

    public l(ReactApplicationContext reactApplicationContext) {
        this.f4941a = reactApplicationContext;
        a(new Intent("android.intent.action.SEND"));
        c().setType("text/plain");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    public static boolean a(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean a(String str, ReadableMap readableMap) {
        return readableMap != null && readableMap.hasKey(str) && !readableMap.isNull(str);
    }

    private ComponentName[] a(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(c().getAction());
        intent.setType(c().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = this.f4941a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    arrayList.add(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public Intent a(Intent intent, ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        ArrayList<HashMap> arrayList2 = new ArrayList();
        Intent intent2 = new Intent(intent.getAction());
        intent2.setType(intent.getType());
        List<ResolveInfo> queryIntentActivities = this.f4941a.getPackageManager().queryIntentActivities(intent2, 0);
        if (!queryIntentActivities.isEmpty()) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && !readableMap.getArray("excludedActivityTypes").toString().contains(resolveInfo.activityInfo.packageName)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("packageName", resolveInfo.activityInfo.packageName);
                    hashMap.put("className", resolveInfo.activityInfo.name);
                    hashMap.put("simpleName", String.valueOf(resolveInfo.activityInfo.loadLabel(this.f4941a.getPackageManager())));
                    arrayList2.add(hashMap);
                }
            }
            if (!arrayList2.isEmpty()) {
                Collections.sort(arrayList2, new a(this));
                for (HashMap hashMap2 : arrayList2) {
                    Intent intent3 = (Intent) intent.clone();
                    intent3.setPackage((String) hashMap2.get("packageName"));
                    intent3.setClassName((String) hashMap2.get("packageName"), (String) hashMap2.get("className"));
                    arrayList.add(intent3);
                }
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), "share");
                createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                return createChooser;
            }
        }
        return Intent.createChooser(intent, "Share");
    }

    protected cl.json.d a(ReadableMap readableMap) {
        String string = a("filename", readableMap) ? readableMap.getString("filename") : null;
        return a("type", readableMap) ? new cl.json.d(readableMap.getString("url"), readableMap.getString("type"), string, this.f4941a) : new cl.json.d(readableMap.getString("url"), string, this.f4941a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Intent intent) {
        this.f4942b = intent;
    }

    protected Intent[] a(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities = this.f4941a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[queryIntentActivities.size()];
        for (int i = 0; i < queryIntentActivities.size(); i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i] = new Intent(intent2);
        }
        return intentArr;
    }

    protected cl.json.e b(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (a("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i = 0; i < array.size(); i++) {
                arrayList.add(array.getString(i));
            }
        }
        return a("type", readableMap) ? new cl.json.e(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), this.f4941a) : new cl.json.e(readableMap.getArray("urls"), arrayList, this.f4941a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String b();

    /* JADX INFO: Access modifiers changed from: protected */
    public Intent c() {
        return this.f4942b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0159, code lost:
        if (a("attributionURL", r12) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021f, code lost:
        if (a("attributionURL", r12) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0221, code lost:
        r1 = c();
        r4 = r12.getString("attributionURL");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.facebook.react.bridge.ReadableMap r12) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.json.f.l.c(com.facebook.react.bridge.ReadableMap):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String d();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        Intent createChooser;
        Activity currentActivity = this.f4941a.getCurrentActivity();
        if (currentActivity == null) {
            o.a(false, "Something went wrong");
            return;
        }
        IntentSender intentSender = null;
        if (o.a()) {
            intentSender = o.a(this.f4941a);
            createChooser = Intent.createChooser(c(), this.f4943c, intentSender);
        } else {
            createChooser = Intent.createChooser(c(), this.f4943c);
        }
        createChooser.setFlags(1073741824);
        if (a("showAppsToView", this.f4945e) && a("url", this.f4945e)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.f4944d.a());
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", a(intent, this.f4944d.b()));
        }
        if (a("excludedActivityTypes", this.f4945e)) {
            if (Build.VERSION.SDK_INT >= 24) {
                createChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", a(this.f4945e.getArray("excludedActivityTypes")));
            } else {
                createChooser = a(c(), this.f4945e);
            }
        }
        currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
        if (intentSender != null) {
            return;
        }
        o.a(true, true, "OK");
    }
}
