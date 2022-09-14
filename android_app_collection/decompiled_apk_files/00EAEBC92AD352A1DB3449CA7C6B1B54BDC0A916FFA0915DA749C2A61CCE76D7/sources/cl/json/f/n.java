package cl.json.f;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class n extends m {
    public n(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.f.l
    protected String a() {
        return "com.snapchat.android.LandingPageActivity";
    }

    @Override // cl.json.f.l
    protected String b() {
        return null;
    }

    @Override // cl.json.f.m, cl.json.f.l
    public void c(ReadableMap readableMap) {
        super.c(readableMap);
        f();
    }

    @Override // cl.json.f.l
    protected String d() {
        return "com.snapchat.android";
    }

    @Override // cl.json.f.l
    protected String e() {
        return "market://details?id=com.snapchat.android";
    }
}
