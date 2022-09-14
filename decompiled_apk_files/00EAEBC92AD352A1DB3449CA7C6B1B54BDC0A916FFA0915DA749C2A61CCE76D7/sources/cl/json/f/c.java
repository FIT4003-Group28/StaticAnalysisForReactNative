package cl.json.f;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class c extends m {
    public c(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.f.l
    protected String b() {
        return "https://www.facebook.com/sharer/sharer.php?u={url}";
    }

    @Override // cl.json.f.m, cl.json.f.l
    public void c(ReadableMap readableMap) {
        super.c(readableMap);
        f();
    }

    @Override // cl.json.f.l
    protected String d() {
        return "com.facebook.katana";
    }

    @Override // cl.json.f.l
    protected String e() {
        return null;
    }
}
