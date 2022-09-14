package cl.json;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import cl.json.f.f;
import cl.json.f.g;
import cl.json.f.h;
import cl.json.f.i;
import cl.json.f.j;
import cl.json.f.k;
import cl.json.f.l;
import cl.json.f.n;
import cl.json.f.o;
import cl.json.f.p;
import cl.json.f.q;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class RNShareModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int SHARE_REQUEST_CODE = 16845;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4922a = new int[b.values().length];

        static {
            try {
                f4922a[b.generic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4922a[b.facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4922a[b.pagesmanager.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4922a[b.twitter.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4922a[b.whatsapp.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4922a[b.instagram.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4922a[b.instagramstories.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4922a[b.googleplus.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4922a[b.email.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4922a[b.pinterest.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4922a[b.sms.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4922a[b.snapchat.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4922a[b.messenger.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4922a[b.linkedin.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* loaded from: classes.dex */
    private enum b {
        facebook,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin;

        public static l a(String str, ReactApplicationContext reactApplicationContext) {
            switch (a.f4922a[valueOf(str).ordinal()]) {
                case 1:
                    return new cl.json.f.d(reactApplicationContext);
                case 2:
                    return new cl.json.f.c(reactApplicationContext);
                case 3:
                    return new cl.json.f.b(reactApplicationContext);
                case 4:
                    return new p(reactApplicationContext);
                case 5:
                    return new q(reactApplicationContext);
                case 6:
                    return new f(reactApplicationContext);
                case 7:
                    return new g(reactApplicationContext);
                case 8:
                    return new cl.json.f.e(reactApplicationContext);
                case 9:
                    return new cl.json.f.a(reactApplicationContext);
                case 10:
                    return new j(reactApplicationContext);
                case 11:
                    return new k(reactApplicationContext);
                case 12:
                    return new n(reactApplicationContext);
                case 13:
                    return new i(reactApplicationContext);
                case 14:
                    return new h(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    public RNShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        b[] values;
        HashMap hashMap = new HashMap();
        for (b bVar : b.values()) {
            hashMap.put(bVar.toString().toUpperCase(), bVar.toString());
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNShare";
    }

    @ReactMethod
    public void isBase64File(String str, Callback callback, Callback callback2) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals("data")) {
                callback2.invoke(false);
            } else {
                callback2.invoke(true);
            }
        } catch (Exception e2) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e2.getMessage());
            e2.printStackTrace(System.out);
            callback.invoke(e2.getMessage());
        }
    }

    @ReactMethod
    public void isPackageInstalled(String str, Callback callback, Callback callback2) {
        try {
            callback2.invoke(Boolean.valueOf(l.a(str, this.reactContext)));
        } catch (Exception e2) {
            PrintStream printStream = System.out;
            printStream.println("Error: " + e2.getMessage());
            callback.invoke(e2.getMessage());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 16845 && i2 == 0) {
            o.a(true, false, "CANCELED");
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) {
        o.a(callback2, callback);
        try {
            new cl.json.f.d(this.reactContext).c(readableMap);
        } catch (ActivityNotFoundException e2) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e2.getMessage());
            e2.printStackTrace(System.out);
            o.a(false, "not_available");
        } catch (Exception e3) {
            PrintStream printStream2 = System.out;
            printStream2.println("ERROR " + e3.getMessage());
            e3.printStackTrace(System.out);
            o.a(false, e3.getMessage());
        }
    }

    @ReactMethod
    public void shareSingle(ReadableMap readableMap, Callback callback, Callback callback2) {
        System.out.println("SHARE SINGLE METHOD");
        o.a(callback2, callback);
        if (!l.a("social", readableMap)) {
            o.a(false, "key 'social' missing in options");
            return;
        }
        try {
            l a2 = b.a(readableMap.getString("social"), this.reactContext);
            if (a2 == null || !(a2 instanceof l)) {
                throw new ActivityNotFoundException("Invalid share activity");
            }
            a2.c(readableMap);
        } catch (ActivityNotFoundException e2) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e2.getMessage());
            e2.printStackTrace(System.out);
            o.a(false, e2.getMessage());
        } catch (Exception e3) {
            PrintStream printStream2 = System.out;
            printStream2.println("ERROR " + e3.getMessage());
            e3.printStackTrace(System.out);
            o.a(false, e3.getMessage());
        }
    }
}
