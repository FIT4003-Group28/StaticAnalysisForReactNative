package cl.json.f;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import cl.json.RNShareModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
/* loaded from: classes.dex */
public abstract class m extends l {
    public m(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // cl.json.f.l
    public void c(ReadableMap readableMap) {
        System.out.println(d());
        if (d() != null || b() != null || e() != null) {
            if (l.a(d(), this.f4941a)) {
                System.out.println("INSTALLED");
                if (a() != null) {
                    c().setComponent(new ComponentName(d(), a()));
                } else {
                    c().setPackage(d());
                }
                super.c(readableMap);
            } else {
                System.out.println("NOT INSTALLED");
                a(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(b() != null ? b().replace("{url}", l.a(readableMap.getString("url"))).replace("{message}", l.a(readableMap.getString("message"))) : e() != null ? e() : ""))));
            }
        }
        super.c(readableMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(ReadableMap readableMap) {
        if (!this.f4945e.hasKey("forceDialog") || !this.f4945e.getBoolean("forceDialog")) {
            c().setFlags(268435456);
            this.f4941a.startActivity(c());
            o.a(true, true, c().getPackage());
            return;
        }
        Activity currentActivity = this.f4941a.getCurrentActivity();
        if (currentActivity == null) {
            o.a(false, "Something went wrong");
            return;
        }
        if (readableMap != null) {
            if (!l.a("social", readableMap)) {
                throw new IllegalArgumentException("social is empty");
            }
            if (readableMap.getString("social").equals("instagramstories")) {
                if (!l.a("method", readableMap)) {
                    throw new IllegalArgumentException("instagram share mode is empty");
                }
                String string = readableMap.getString("method");
                if (string.equals("shareStickerImage") || string.equals("shareBackgroundAndStickerImage")) {
                    currentActivity.grantUriPermission("com.instagram.android", this.f4946f.b(), 1);
                }
            }
        }
        if (o.a()) {
            Intent createChooser = Intent.createChooser(c(), this.f4943c, o.a(this.f4941a));
            createChooser.setFlags(1073741824);
            currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
            return;
        }
        Intent createChooser2 = Intent.createChooser(c(), this.f4943c);
        createChooser2.setFlags(1073741824);
        currentActivity.startActivityForResult(createChooser2, RNShareModule.SHARE_REQUEST_CODE);
        o.a(true, true, "OK");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cl.json.f.l
    public void f() {
        d(null);
    }
}
