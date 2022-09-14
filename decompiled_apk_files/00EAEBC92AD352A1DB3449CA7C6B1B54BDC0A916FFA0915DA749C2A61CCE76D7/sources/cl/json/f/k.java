package cl.json.f;

import android.os.Build;
import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class k extends m {

    /* renamed from: h  reason: collision with root package name */
    private ReactApplicationContext f4940h;

    public k(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f4940h = null;
        this.f4940h = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cl.json.f.l
    public String b() {
        return null;
    }

    @Override // cl.json.f.m, cl.json.f.l
    public void c(ReadableMap readableMap) {
        super.c(readableMap);
        f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cl.json.f.l
    public String d() {
        return Build.VERSION.SDK_INT >= 19 ? Telephony.Sms.getDefaultSmsPackage(this.f4940h) : "com.android.mms";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cl.json.f.l
    public String e() {
        return "market://details?id=com.android.mms";
    }
}
