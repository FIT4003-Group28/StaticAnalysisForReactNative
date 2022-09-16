package cl.json.f;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class p extends m {
    public p(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.f.l
    protected String b() {
        return "https://twitter.com/intent/tweet?text={message}&url={url}";
    }

    @Override // cl.json.f.m, cl.json.f.l
    public void c(ReadableMap readableMap) {
        super.c(readableMap);
        f();
    }

    @Override // cl.json.f.l
    protected String d() {
        return "com.twitter.android";
    }

    @Override // cl.json.f.l
    protected String e() {
        return null;
    }
}
