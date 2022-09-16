package cl.json.f;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class e extends m {
    public e(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.f.l
    protected String b() {
        return "https://plus.google.com/share?url={url}";
    }

    @Override // cl.json.f.m, cl.json.f.l
    public void c(ReadableMap readableMap) {
        super.c(readableMap);
        f();
    }

    @Override // cl.json.f.l
    protected String d() {
        return "com.google.android.apps.plus";
    }

    @Override // cl.json.f.l
    protected String e() {
        return "market://details?id=com.google.android.apps.plus";
    }
}
