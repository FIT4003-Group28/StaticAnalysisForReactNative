package cl.json.f;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class j extends m {
    public j(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.f.l
    protected String b() {
        return "https://pinterest.com/pin/create/button/?url={url}&media=$media&description={message}";
    }

    @Override // cl.json.f.m, cl.json.f.l
    public void c(ReadableMap readableMap) {
        super.c(readableMap);
        f();
    }

    @Override // cl.json.f.l
    protected String d() {
        return "com.pinterest";
    }

    @Override // cl.json.f.l
    protected String e() {
        return "market://details?id=com.pinterest";
    }
}
