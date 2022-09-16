package cl.json.f;

import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public class g extends m {
    public g(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a(new Intent("com.instagram.share.ADD_TO_STORY"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cl.json.f.l
    public String b() {
        return null;
    }

    @Override // cl.json.f.m, cl.json.f.l
    public void c(ReadableMap readableMap) {
        super.c(readableMap);
        d(readableMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cl.json.f.l
    public String d() {
        return "com.instagram.android";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cl.json.f.l
    public String e() {
        return "https://play.google.com/store/apps/details?id=com.instagram.android";
    }
}
